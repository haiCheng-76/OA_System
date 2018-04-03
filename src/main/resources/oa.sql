/*
Navicat MySQL Data Transfer

Source Server         : 腾讯云服务器_lhc
Source Server Version : 50720
Source Host           : 123.206.202.190:3306
Source Database       : oa

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-04-03 09:21:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for borrow_car
-- ----------------------------
DROP TABLE IF EXISTS `borrow_car`;
CREATE TABLE `borrow_car` (
  `borrow_car_id` int(11) NOT NULL AUTO_INCREMENT,
  `carid` int(11) NOT NULL,
  `borrow_date` datetime NOT NULL,
  `employeeid` int(11) NOT NULL,
  PRIMARY KEY (`borrow_car_id`),
  KEY `borrow_carid` (`carid`) USING BTREE,
  KEY `employeeid` (`employeeid`) USING BTREE,
  CONSTRAINT `borrow_car_ibfk_1` FOREIGN KEY (`carid`) REFERENCES `carinfo` (`carid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `borrow_car_ibfk_2` FOREIGN KEY (`employeeid`) REFERENCES `employee` (`employee_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='借车表';

-- ----------------------------
-- Records of borrow_car
-- ----------------------------
INSERT INTO `borrow_car` VALUES ('1', '3', '2018-02-26 17:35:27', '6');
INSERT INTO `borrow_car` VALUES ('3', '5', '2018-03-01 17:35:54', '3');
INSERT INTO `borrow_car` VALUES ('6', '1', '2018-03-19 09:50:37', '2');

-- ----------------------------
-- Table structure for borrow_device
-- ----------------------------
DROP TABLE IF EXISTS `borrow_device`;
CREATE TABLE `borrow_device` (
  `borrow_device_id` int(11) NOT NULL AUTO_INCREMENT,
  `borrow_device_deviceid` int(11) DEFAULT NULL,
  `employeeid` int(11) NOT NULL,
  `borrow_device_date` datetime NOT NULL,
  PRIMARY KEY (`borrow_device_id`),
  KEY `device_id` (`borrow_device_deviceid`) USING BTREE,
  KEY `employee_id` (`employeeid`) USING BTREE,
  CONSTRAINT `borrow_device_ibfk_1` FOREIGN KEY (`borrow_device_deviceid`) REFERENCES `device` (`deviceid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `borrow_device_ibfk_2` FOREIGN KEY (`employeeid`) REFERENCES `employee` (`employee_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='设备借阅表';

-- ----------------------------
-- Records of borrow_device
-- ----------------------------
INSERT INTO `borrow_device` VALUES ('4', '5', '3', '2018-03-17 22:11:06');
INSERT INTO `borrow_device` VALUES ('5', '1', '3', '2018-03-17 22:15:33');

-- ----------------------------
-- Table structure for carinfo
-- ----------------------------
DROP TABLE IF EXISTS `carinfo`;
CREATE TABLE `carinfo` (
  `carid` int(11) NOT NULL AUTO_INCREMENT,
  `carname` varchar(50) NOT NULL,
  `carnumber` varchar(50) NOT NULL,
  `carprice` double(10,0) NOT NULL,
  PRIMARY KEY (`carid`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COMMENT='车辆信息表';

-- ----------------------------
-- Records of carinfo
-- ----------------------------
INSERT INTO `carinfo` VALUES ('1', '梅赛德斯奔驰E级', '川A22563', '64');
INSERT INTO `carinfo` VALUES ('2', '福特撼路者', '川A36894', '25');
INSERT INTO `carinfo` VALUES ('3', '长城皮卡', '藏C45632', '5');
INSERT INTO `carinfo` VALUES ('4', '沃尔沃XC90', '青E56352', '60');
INSERT INTO `carinfo` VALUES ('5', '宝马3系', '苏E56315', '36');
INSERT INTO `carinfo` VALUES ('8', '测试一', '川A66666', '666');

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `departmentid` int(11) NOT NULL AUTO_INCREMENT,
  `departmentname` varchar(40) NOT NULL,
  `departmenttelephone` varchar(50) DEFAULT NULL,
  `departmentaddress` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`departmentid`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COMMENT='部门表';

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES ('1', '人力资源部', '11111111', '二楼414室');
INSERT INTO `department` VALUES ('2', '系统服务部', '42563647426', '二楼89是');
INSERT INTO `department` VALUES ('3', '安全监察部', '24636547324', '三楼42室');
INSERT INTO `department` VALUES ('4', '计划营销部', '52554525222', '四楼432室');
INSERT INTO `department` VALUES ('5', '生产技术部', '25254352554', '五楼423室');
INSERT INTO `department` VALUES ('6', '财务部', '64752665423', '四楼890室');
INSERT INTO `department` VALUES ('7', '广告部', '52542564451', '三楼342室');
INSERT INTO `department` VALUES ('9', '测试你一', '55555555555', '四川省成都市');

-- ----------------------------
-- Table structure for device
-- ----------------------------
DROP TABLE IF EXISTS `device`;
CREATE TABLE `device` (
  `deviceid` int(11) NOT NULL AUTO_INCREMENT,
  `devicename` varchar(59) NOT NULL,
  `deviceprice` double(10,0) DEFAULT NULL,
  `devicenumber` int(11) NOT NULL,
  `manufacture` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`deviceid`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8 COMMENT='设备表';

-- ----------------------------
-- Records of device
-- ----------------------------
INSERT INTO `device` VALUES ('1', '戴尔笔记本电脑', '5000', '5', '戴尔（中国）有限公司');
INSERT INTO `device` VALUES ('2', '华为手机', '2999', '10', '华为技术有限公司');
INSERT INTO `device` VALUES ('3', '森海塞尔耳塞式耳机', '400', '15', '森海塞尔电子（北京）有限公司');
INSERT INTO `device` VALUES ('5', '保温杯', '50', '100', '安徽省富光实业股份有限公司');
INSERT INTO `device` VALUES ('6', '纸巾', '5', '100', '浙江洁柔');
INSERT INTO `device` VALUES ('7', '鼠标', '200', '20', '德国樱桃');
INSERT INTO `device` VALUES ('8', '三星显示器', '2999', '16', '三星电子 中国');
INSERT INTO `device` VALUES ('12', '测试一', '6666', '22', '戴尔（中国）有限公司');

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `employee_id` int(11) NOT NULL AUTO_INCREMENT,
  `employee_account` varchar(255) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(100) NOT NULL,
  `age` int(11) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `departmentid` int(11) DEFAULT NULL,
  `role` int(3) NOT NULL,
  PRIMARY KEY (`employee_id`),
  KEY `departmentid` (`departmentid`) USING BTREE,
  CONSTRAINT `employee_ibfk_1` FOREIGN KEY (`departmentid`) REFERENCES `department` (`departmentid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8 COMMENT='员工表';

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES ('2', '456', '李四', '456', '23', '河南省郑州市人民路34号', '4', '0');
INSERT INTO `employee` VALUES ('3', '112', '赵武', '543', '89', '浙江省义乌市解放路89号', '6', '0');
INSERT INTO `employee` VALUES ('4', '897', '张红', '0989', '45', '河北省石家庄市公园路45号', '2', '0');
INSERT INTO `employee` VALUES ('6', '6767', '龙飞', '9889789', '24', '江苏省南京市人民路88号', '7', '0');
INSERT INTO `employee` VALUES ('10', '11111111', '测试一', '1111111', '11111', '四川成都市', '7', '0');
INSERT INTO `employee` VALUES ('11', '123', '龙海成', '456', '22', null, '4', '1');

-- ----------------------------
-- Table structure for file
-- ----------------------------
DROP TABLE IF EXISTS `file`;
CREATE TABLE `file` (
  `fileid` int(11) NOT NULL AUTO_INCREMENT,
  `filename` varchar(100) NOT NULL,
  `filesize` double NOT NULL,
  `fileuploadtime` datetime DEFAULT NULL,
  `employee_id` int(11) NOT NULL,
  `file_location` longtext NOT NULL,
  PRIMARY KEY (`fileid`),
  KEY `userid` (`employee_id`) USING BTREE,
  CONSTRAINT `file_ibfk_1` FOREIGN KEY (`employee_id`) REFERENCES `employee` (`employee_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=44 DEFAULT CHARSET=utf8 COMMENT='文件管理表';

-- ----------------------------
-- Records of file
-- ----------------------------
INSERT INTO `file` VALUES ('33', '大力士.png', '9178', '2018-04-01 15:42:55', '2', 'E:\\STSWorkspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\OA\\uploadfile\\大力士.png');
INSERT INTO `file` VALUES ('34', '人体炮弹.png', '10412', '2018-04-01 15:43:01', '3', 'E:\\STSWorkspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\OA\\uploadfile\\人体炮弹.png');
INSERT INTO `file` VALUES ('35', '悠闲.png', '17360', '2018-04-01 15:43:09', '4', 'E:\\STSWorkspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\OA\\uploadfile\\悠闲.png');
INSERT INTO `file` VALUES ('36', 'oa.sql', '9170', '2018-04-01 15:43:20', '6', 'E:\\STSWorkspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\OA\\uploadfile\\oa.sql');
INSERT INTO `file` VALUES ('42', 'magazine-unlock-01-2.3.936-_761cd72ccaa14891b70d560057dc2252.jpg', '508166', '2018-04-01 17:33:31', '3', 'E:\\STSWorkspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\OA\\uploadfile\\magazine-unlock-01-2.3.936-_761cd72ccaa14891b70d560057dc2252.jpg');
