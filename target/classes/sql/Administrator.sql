SET FOREIGN_KEY_CHECKS=0;

# 管理员表结构

DROP TABLE IF EXISTS `administrator`;
CREATE TABLE `administrator` (
                         `id` int(11) NOT NULL AUTO_INCREMENT,
                         `adminname` varchar(255) default NULL,
                         `password` varchar(255) default NULL,
                         `usetime` date not null,
                         PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
