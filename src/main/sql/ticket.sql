/*
 Navicat Premium Data Transfer

 Source Server         : localhost——Mycat
 Source Server Type    : MySQL
 Source Server Version : 50629
 Source Host           : localhost:8066
 Source Schema         : u_04_zcfg

 Target Server Type    : MySQL
 Target Server Version : 50629
 File Encoding         : 65001

 Date: 09/05/2020 15:43:19
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for ticket
-- ----------------------------
DROP TABLE IF EXISTS `ticket`;
CREATE TABLE `ticket`  (
  `ticket_id` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `startting` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '开车地点',
  `destination` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '到站地点',
  `price` decimal(10, 2) NULL DEFAULT NULL COMMENT '价钱',
  `beginTime` datetime(0) NULL DEFAULT NULL COMMENT '开车时间',
  PRIMARY KEY (`ticket_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '车票' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of ticket
-- ----------------------------

SET FOREIGN_KEY_CHECKS = 1;
