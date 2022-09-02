SET FOREIGN_KEY_CHECKS=0;

# 用户表结构

DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
                         `id` int(11) NOT NULL AUTO_INCREMENT,
                         `username` varchar(255) default NULL,
                         `password` varchar(255) default NULL,
                         `email` varchar(255) default NULL,
                         `phoneNum` int(20) default NULL,
                         `location` varchar(255) default NULL,
                         `regtime` date not null,
                         PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
