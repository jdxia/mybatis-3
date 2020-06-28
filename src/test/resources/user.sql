CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(32) NOT NULL COMMENT '用户名称',
  `address` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
BEGIN;
INSERT INTO `user` VALUES (1, '王五', '北京');
INSERT INTO `user` VALUES (2, '张三', '上海');
INSERT INTO `user` VALUES (3, '张小明', '杭州');
INSERT INTO `user` VALUES (4, '陈小明', '深圳');
INSERT INTO `user` VALUES (5, '张三丰', '南京');
INSERT INTO `user` VALUES (6, '陈小明', NULL);
INSERT INTO `user` VALUES (26, '王五', '武汉');
INSERT INTO `user` VALUES (28, 'user-e242', NULL);
INSERT INTO `user` VALUES (29, 'user-e242', '佛山');
INSERT INTO `user` VALUES (30, 'user-e242', '台州');
INSERT INTO `user` VALUES (36, 'asfsfs', '无锡');
INSERT INTO `user` VALUES (37, 'asfsfs', '苏州');
INSERT INTO `user` VALUES (40, 'xjd', '广州');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
