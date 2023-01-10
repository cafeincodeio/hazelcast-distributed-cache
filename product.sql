CREATE TABLE `product` (
        `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
        `name` varchar(50) DEFAULT NULL COMMENT 'id giao dịch',
        `code` varchar(20) DEFAULT NULL,
        `price` decimal(10,0) DEFAULT NULL,
        `created_date` datetime DEFAULT NULL,
        `last_updated` datetime DEFAULT NULL,
        `created_by` varchar(20) DEFAULT 'hungtv27',
        `status` int(11) DEFAULT '1',
        PRIMARY KEY (`id`)
        ) ENGINE=InnoDB DEFAULT CHARSET=utf8
        
INSERT INTO `product` (`name`, `code`, `price`, `created_date`, `last_updated`, `created_by`, `status`) VALUES ('AnSbdWLXtMS2', '1bMqEJjh', '1000', '2023-01-11 00:44:01', '2023-01-11 00:44:01', 'hungtv27', '1');
INSERT INTO `product` (`name`, `code`, `price`, `created_date`, `last_updated`, `created_by`, `status`) VALUES ('AALd2lkieVx7', '2a3v81zq', '1000', '2023-01-11 00:47:50', '2023-01-11 00:47:50', 'hungtv27', '1');
INSERT INTO `product` (`name`, `code`, `price`, `created_date`, `last_updated`, `created_by`, `status`) VALUES ('2yXgjpItmx05', '1QVt8H2C', '1000', '2023-01-11 00:47:52', '2023-01-11 00:47:52', 'hungtv27', '1');
INSERT INTO `product` (`name`, `code`, `price`, `created_date`, `last_updated`, `created_by`, `status`) VALUES ('dkDViYonl3Sy', 'N32pmZxh', '1000', '2023-01-11 00:47:53', '2023-01-11 00:47:53', 'hungtv27', '1');
INSERT INTO `product` (`name`, `code`, `price`, `created_date`, `last_updated`, `created_by`, `status`) VALUES ('tryiYMDXC3hd', 'POgUFkHq', '1000', '2023-01-11 00:47:54', '2023-01-11 00:47:54', 'hungtv27', '1');
INSERT INTO `product` (`name`, `code`, `price`, `created_date`, `last_updated`, `created_by`, `status`) VALUES ('LJ1UYtBX1jZ7', '5XjSEgcs', '1000', '2023-01-11 00:47:55', '2023-01-11 00:47:55', 'hungtv27', '1');
INSERT INTO `product` (`name`, `code`, `price`, `created_date`, `last_updated`, `created_by`, `status`) VALUES ('I17rw3i5J0F4', 'ACKjzgXS', '1000', '2023-01-11 00:47:56', '2023-01-11 00:47:56', 'hungtv27', '1');
INSERT INTO `product` (`name`, `code`, `price`, `created_date`, `last_updated`, `created_by`, `status`) VALUES ('Ayq7gaw1b64q', '1qXRSKPp', '1000', '2023-01-11 00:47:57', '2023-01-11 00:47:57', 'hungtv27', '1');
INSERT INTO `product` (`name`, `code`, `price`, `created_date`, `last_updated`, `created_by`, `status`) VALUES ('qpqWobUa404m', 'cJLOc84Z', '1000', '2023-01-11 00:47:58', '2023-01-11 00:47:58', 'hungtv27', '1');
INSERT INTO `product` (`name`, `code`, `price`, `created_date`, `last_updated`, `created_by`, `status`) VALUES ('V17fqI0Y736Y', 'zm0YUjzR', '1000', '2023-01-11 00:47:59', '2023-01-11 00:47:59', 'hungtv27', '1');
