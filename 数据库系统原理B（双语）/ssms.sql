/*
 Navicat Premium Data Transfer

 Source Server         : MySQL5.6
 Source Server Type    : MySQL
 Source Server Version : 50635
 Source Host           : localhost:3306
 Source Schema         : ssms

 Target Server Type    : MySQL
 Target Server Version : 50635
 File Encoding         : 65001

 Date: 13/12/2020 21:36:48
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for clazz
-- ----------------------------
DROP TABLE IF EXISTS `clazz`;
CREATE TABLE `clazz`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `gradeid` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `gid_clazz_FK`(`gradeid`) USING BTREE,
  CONSTRAINT `gradeid_clazz_FK` FOREIGN KEY (`gradeid`) REFERENCES `grade` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for clazz_course_teacher
-- ----------------------------
DROP TABLE IF EXISTS `clazz_course_teacher`;
CREATE TABLE `clazz_course_teacher`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `clazzid` int(11) NULL DEFAULT NULL,
  `gradeid` int(11) NULL DEFAULT NULL,
  `courseid` int(11) NULL DEFAULT NULL,
  `teacherid` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `clazzid_cct_FK`(`clazzid`) USING BTREE,
  INDEX `tid_cct_FK`(`teacherid`) USING BTREE,
  INDEX `courseid_cct_FK`(`courseid`) USING BTREE,
  INDEX `gradeid_cct_FK`(`gradeid`) USING BTREE,
  CONSTRAINT `clazzid_cct_FK` FOREIGN KEY (`clazzid`) REFERENCES `clazz` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `teacherid_cct_FK` FOREIGN KEY (`teacherid`) REFERENCES `teacher` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 23 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for escore
-- ----------------------------
DROP TABLE IF EXISTS `escore`;
CREATE TABLE `escore`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `examid` int(11) NULL DEFAULT NULL,
  `clazzid` int(11) NULL DEFAULT NULL,
  `studentid` int(11) NULL DEFAULT NULL,
  `gradeid` int(11) NULL DEFAULT NULL,
  `courseid` int(11) NULL DEFAULT NULL,
  `score` int(5) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `eid_escore_FK`(`examid`) USING BTREE,
  INDEX `sid_escore_FK`(`studentid`) USING BTREE,
  INDEX `clazzid_escore_FK`(`clazzid`) USING BTREE,
  INDEX `courseid_escore_FK`(`courseid`) USING BTREE,
  INDEX `gradeid_escore_FK`(`gradeid`) USING BTREE,
  CONSTRAINT `clazzid_escore_FK` FOREIGN KEY (`clazzid`) REFERENCES `clazz` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `courseid_escore_FK` FOREIGN KEY (`courseid`) REFERENCES `grade_course` (`courseid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `examid_escore_FK` FOREIGN KEY (`examid`) REFERENCES `exam` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `gradeid_escore_FK` FOREIGN KEY (`gradeid`) REFERENCES `grade_course` (`gradeid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `studentid_escore_FK` FOREIGN KEY (`studentid`) REFERENCES `student` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 464 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for exam
-- ----------------------------
DROP TABLE IF EXISTS `exam`;
CREATE TABLE `exam`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `time` date NULL DEFAULT NULL,
  `remark` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `type` tinyint(2) NULL DEFAULT 1,
  `gradeid` int(11) NULL DEFAULT NULL,
  `clazzid` int(11) NULL DEFAULT NULL,
  `courseid` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `gid_exam_FK`(`gradeid`) USING BTREE,
  INDEX `clazzid_exam_FK`(`clazzid`) USING BTREE,
  CONSTRAINT `gradeid_exam_FK` FOREIGN KEY (`gradeid`) REFERENCES `grade` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 23 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for grade
-- ----------------------------
DROP TABLE IF EXISTS `grade`;
CREATE TABLE `grade`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for grade_course
-- ----------------------------
DROP TABLE IF EXISTS `grade_course`;
CREATE TABLE `grade_course`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `gradeid` int(11) NULL DEFAULT NULL,
  `courseid` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `gid_gc_FK`(`gradeid`) USING BTREE,
  INDEX `cid_gc_FK`(`courseid`) USING BTREE,
  CONSTRAINT `courseid_gc_FK` FOREIGN KEY (`courseid`) REFERENCES `course` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `gradeid_gc_FK` FOREIGN KEY (`gradeid`) REFERENCES `grade` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `number` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `sex` varchar(4) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `qq` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `photo` mediumblob NULL,
  `clazzid` int(11) NULL DEFAULT NULL,
  `gradeid` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `number_student_FK`(`number`) USING BTREE,
  INDEX `cid_stu_FK`(`clazzid`) USING BTREE,
  INDEX `grade_student_FK`(`gradeid`) USING BTREE,
  CONSTRAINT `clazzid_student_FK` FOREIGN KEY (`clazzid`) REFERENCES `clazz` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `grade_student_FK` FOREIGN KEY (`gradeid`) REFERENCES `grade` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 71 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for system
-- ----------------------------
DROP TABLE IF EXISTS `system`;
CREATE TABLE `system`  (
  `id` int(11) NOT NULL,
  `schoolName` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `forbidTeacher` tinyint(2) NULL DEFAULT NULL,
  `forbidStudent` tinyint(2) NULL DEFAULT NULL,
  `noticeTeacher` varchar(500) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `noticeStudent` varchar(500) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `number` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `sex` varchar(4) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `qq` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `photo` mediumblob NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `number_teacher_FK`(`number`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 16 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `password` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT '111111',
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `type` tinyint(1) NULL DEFAULT 2,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `account_user_FK`(`account`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 87 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;
