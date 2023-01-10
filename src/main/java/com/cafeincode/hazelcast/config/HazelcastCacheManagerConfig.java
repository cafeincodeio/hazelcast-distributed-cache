package com.cafeincode.hazelcast.config;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.spring.cache.HazelcastCacheManager;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.PostConstruct;

/**
 * @author hungtv27
 */
@Configuration
@EnableTransactionManagement
@EnableCaching
public class HazelcastCacheManagerConfig extends CachingConfigurerSupport {

    @Value("#{'${hazelcast.cafeincode.address}'.split(',')}")
    protected String[] address;

    @Value("${hazelcast.cafeincode.cluster_name}")
    private String clusterName;

    @Bean(name = "hazelcastClient")
    @PostConstruct
    public HazelcastInstance hazelcastInstance() {
        ClientConfig clientConfig = new ClientConfig();
        clientConfig.setClusterName(clusterName);
        clientConfig.getNetworkConfig().addAddress(address);
        clientConfig.getNetworkConfig().setConnectionTimeout(50000);
        return HazelcastClient.newHazelcastClient(clientConfig);
    }

    @Override
    @Bean
    public CacheManager cacheManager() {
        return new HazelcastCacheManager(hazelcastInstance());
    }

    @Override
    public KeyGenerator keyGenerator() {
        return (target, method, params) -> {
            StringBuilder sb = new StringBuilder();
            sb.append(target.getClass().getName());
            sb.append(".");
            sb.append(method.getName());
            sb.append(":params:");
            for (Object obj : params) {
                sb.append(String.format("[%s]", obj));
            }
            return sb.toString();
        };
    }
}
