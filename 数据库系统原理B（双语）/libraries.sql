/*
 Navicat Premium Data Transfer

 Source Server         : MySQL5.6
 Source Server Type    : MySQL
 Source Server Version : 50635
 Source Host           : localhost:3306
 Source Schema         : library

 Target Server Type    : MySQL
 Target Server Version : 50635
 File Encoding         : 65001

 Date: 13/12/2020 20:36:40
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book`  (
  `bookNo` varchar(10) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `bookName` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `importDate` date NOT NULL,
  `inLibStatus` enum('available','unavailable','locked') CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT 'available',
  `bookPrice` float NOT NULL,
  `frequency` int(11) NOT NULL,
  `category` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`bookNo`) USING BTREE,
  INDEX `book_IND`(`bookNo`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for borrowbook
-- ----------------------------
DROP TABLE IF EXISTS `borrowbook`;
CREATE TABLE `borrowbook`  (
  `serialNumber` int(11) NOT NULL AUTO_INCREMENT,
  `readerNo` varchar(10) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `bookNo` varchar(10) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `borrowDate` date NOT NULL,
  PRIMARY KEY (`serialNumber`) USING BTREE,
  INDEX `readerNo`(`readerNo`) USING BTREE,
  INDEX `bookNo`(`bookNo`) USING BTREE,
  CONSTRAINT `borrowbook_ibfk_1` FOREIGN KEY (`readerNo`) REFERENCES `reader` (`readerNo`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `borrowbook_ibfk_2` FOREIGN KEY (`bookNo`) REFERENCES `book` (`bookNo`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for reader
-- ----------------------------
DROP TABLE IF EXISTS `reader`;
CREATE TABLE `reader`  (
  `readerNo` varchar(10) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `readerName` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`readerNo`) USING BTREE,
  INDEX `reader_IND`(`readerNo`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for returnbook
-- ----------------------------
DROP TABLE IF EXISTS `returnbook`;
CREATE TABLE `returnbook`  (
  `serialNumber` int(11) NOT NULL,
  `readerNo` varchar(10) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `bookNo` varchar(10) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `returnDate` date NOT NULL,
  PRIMARY KEY (`serialNumber`) USING BTREE,
  INDEX `readerNo`(`readerNo`) USING BTREE,
  INDEX `bookNo`(`bookNo`) USING BTREE,
  CONSTRAINT `returnbook_ibfk_1` FOREIGN KEY (`readerNo`) REFERENCES `reader` (`readerNo`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `returnbook_ibfk_2` FOREIGN KEY (`bookNo`) REFERENCES `book` (`bookNo`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `returnbook_ibfk_3` FOREIGN KEY (`serialNumber`) REFERENCES `borrowbook` (`serialNumber`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;
