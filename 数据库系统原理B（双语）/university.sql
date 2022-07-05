/*
 Navicat Premium Data Transfer

 Source Server         : MySQL5.6
 Source Server Type    : MySQL
 Source Server Version : 50635
 Source Host           : localhost:3306
 Source Schema         : university

 Target Server Type    : MySQL
 Target Server Version : 50635
 File Encoding         : 65001

 Date: 13/12/2020 19:45:02
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for advisor
-- ----------------------------
DROP TABLE IF EXISTS `advisor`;
CREATE TABLE `advisor`  (
  `s_ID` varchar(5) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL DEFAULT '',
  `i_ID` varchar(5) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  PRIMARY KEY (`s_ID`) USING BTREE,
  INDEX `i_ID`(`i_ID`) USING BTREE,
  CONSTRAINT `advisor_ibfk_1` FOREIGN KEY (`i_ID`) REFERENCES `instructor` (`ID`) ON DELETE SET NULL ON UPDATE RESTRICT,
  CONSTRAINT `advisor_ibfk_2` FOREIGN KEY (`s_ID`) REFERENCES `student` (`ID`) ON DELETE CASCADE ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for classroom
-- ----------------------------
DROP TABLE IF EXISTS `classroom`;
CREATE TABLE `classroom`  (
  `building` varchar(15) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL DEFAULT '',
  `room_number` varchar(7) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL DEFAULT '',
  `capacity` decimal(4, 0) NULL DEFAULT NULL,
  PRIMARY KEY (`building`, `room_number`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course`  (
  `course_id` varchar(8) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL DEFAULT '',
  `title` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `dept_name` varchar(20) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `credits` decimal(2, 0) NULL DEFAULT NULL,
  PRIMARY KEY (`course_id`) USING BTREE,
  INDEX `dept_name`(`dept_name`) USING BTREE,
  CONSTRAINT `course_ibfk_1` FOREIGN KEY (`dept_name`) REFERENCES `department` (`dept_name`) ON DELETE SET NULL ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department`  (
  `dept_name` varchar(20) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL DEFAULT '',
  `building` varchar(15) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `budget` decimal(12, 2) NULL DEFAULT NULL,
  PRIMARY KEY (`dept_name`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for grade_points
-- ----------------------------
DROP TABLE IF EXISTS `grade_points`;
CREATE TABLE `grade_points`  (
  `grade` varchar(2) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL DEFAULT '',
  `points` decimal(2, 1) NULL DEFAULT NULL,
  PRIMARY KEY (`grade`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for instructor
-- ----------------------------
DROP TABLE IF EXISTS `instructor`;
CREATE TABLE `instructor`  (
  `ID` varchar(5) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL DEFAULT '',
  `name` varchar(20) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `dept_name` varchar(20) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `salary` decimal(8, 2) NULL DEFAULT NULL,
  PRIMARY KEY (`ID`) USING BTREE,
  INDEX `dept_name`(`dept_name`) USING BTREE,
  CONSTRAINT `instructor_ibfk_1` FOREIGN KEY (`dept_name`) REFERENCES `department` (`dept_name`) ON DELETE SET NULL ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for marks
-- ----------------------------
DROP TABLE IF EXISTS `marks`;
CREATE TABLE `marks`  (
  `ID` varchar(5) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `score` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for prereq
-- ----------------------------
DROP TABLE IF EXISTS `prereq`;
CREATE TABLE `prereq`  (
  `course_id` varchar(8) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL DEFAULT '',
  `prereq_id` varchar(8) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL DEFAULT '',
  PRIMARY KEY (`course_id`, `prereq_id`) USING BTREE,
  INDEX `prereq_id`(`prereq_id`) USING BTREE,
  CONSTRAINT `prereq_ibfk_1` FOREIGN KEY (`course_id`) REFERENCES `course` (`course_id`) ON DELETE CASCADE ON UPDATE RESTRICT,
  CONSTRAINT `prereq_ibfk_2` FOREIGN KEY (`prereq_id`) REFERENCES `course` (`course_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for section
-- ----------------------------
DROP TABLE IF EXISTS `section`;
CREATE TABLE `section`  (
  `course_id` varchar(8) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL DEFAULT '',
  `sec_id` varchar(8) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL DEFAULT '',
  `semester` varchar(6) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL DEFAULT '',
  `year` decimal(4, 0) NOT NULL DEFAULT 0,
  `building` varchar(15) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `room_number` varchar(7) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `time_slot_id` varchar(4) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  PRIMARY KEY (`course_id`, `sec_id`, `semester`, `year`) USING BTREE,
  INDEX `building`(`building`, `room_number`) USING BTREE,
  CONSTRAINT `section_ibfk_1` FOREIGN KEY (`course_id`) REFERENCES `course` (`course_id`) ON DELETE CASCADE ON UPDATE RESTRICT,
  CONSTRAINT `section_ibfk_2` FOREIGN KEY (`building`, `room_number`) REFERENCES `classroom` (`building`, `room_number`) ON DELETE SET NULL ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `ID` varchar(5) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL DEFAULT '',
  `name` varchar(20) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `dept_name` varchar(20) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `tot_cred` decimal(3, 0) NULL DEFAULT NULL,
  PRIMARY KEY (`ID`) USING BTREE,
  INDEX `dept_name`(`dept_name`) USING BTREE,
  CONSTRAINT `student_ibfk_1` FOREIGN KEY (`dept_name`) REFERENCES `department` (`dept_name`) ON DELETE SET NULL ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for takes
-- ----------------------------
DROP TABLE IF EXISTS `takes`;
CREATE TABLE `takes`  (
  `ID` varchar(5) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL DEFAULT '',
  `course_id` varchar(8) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL DEFAULT '',
  `sec_id` varchar(8) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL DEFAULT '',
  `semester` varchar(6) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL DEFAULT '',
  `year` decimal(4, 0) NOT NULL DEFAULT 0,
  `grade` varchar(2) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  PRIMARY KEY (`ID`, `course_id`, `sec_id`, `semester`, `year`) USING BTREE,
  INDEX `course_id`(`course_id`, `sec_id`, `semester`, `year`) USING BTREE,
  CONSTRAINT `takes_ibfk_1` FOREIGN KEY (`course_id`, `sec_id`, `semester`, `year`) REFERENCES `section` (`course_id`, `sec_id`, `semester`, `year`) ON DELETE CASCADE ON UPDATE RESTRICT,
  CONSTRAINT `takes_ibfk_2` FOREIGN KEY (`ID`) REFERENCES `student` (`ID`) ON DELETE CASCADE ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for teaches
-- ----------------------------
DROP TABLE IF EXISTS `teaches`;
CREATE TABLE `teaches`  (
  `ID` varchar(5) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL DEFAULT '',
  `course_id` varchar(8) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL DEFAULT '',
  `sec_id` varchar(8) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL DEFAULT '',
  `semester` varchar(6) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL DEFAULT '',
  `year` decimal(4, 0) NOT NULL DEFAULT 0,
  PRIMARY KEY (`ID`, `course_id`, `sec_id`, `semester`, `year`) USING BTREE,
  INDEX `course_id`(`course_id`, `sec_id`, `semester`, `year`) USING BTREE,
  CONSTRAINT `teaches_ibfk_1` FOREIGN KEY (`course_id`, `sec_id`, `semester`, `year`) REFERENCES `section` (`course_id`, `sec_id`, `semester`, `year`) ON DELETE CASCADE ON UPDATE RESTRICT,
  CONSTRAINT `teaches_ibfk_2` FOREIGN KEY (`ID`) REFERENCES `instructor` (`ID`) ON DELETE CASCADE ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for time_slot
-- ----------------------------
DROP TABLE IF EXISTS `time_slot`;
CREATE TABLE `time_slot`  (
  `time_slot_id` varchar(4) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL DEFAULT '',
  `day` varchar(1) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL DEFAULT '',
  `start_hr` decimal(2, 0) NOT NULL DEFAULT 0,
  `start_min` decimal(2, 0) NOT NULL DEFAULT 0,
  `end_hr` decimal(2, 0) NULL DEFAULT NULL,
  `end_min` decimal(2, 0) NULL DEFAULT NULL,
  PRIMARY KEY (`time_slot_id`, `day`, `start_hr`, `start_min`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;
