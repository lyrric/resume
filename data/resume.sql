/*
Navicat MySQL Data Transfer

Source Server         : 47.97.215.50
Source Server Version : 50640
Source Host           : 47.97.215.50:3306
Source Database       : resume

Target Server Type    : MYSQL
Target Server Version : 50640
File Encoding         : 65001

Date: 2018-08-17 11:19:35
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `credential`
-- ----------------------------
DROP TABLE IF EXISTS `credential`;
CREATE TABLE `credential` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL COMMENT '内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of credential
-- ----------------------------
INSERT INTO `credential` VALUES ('1', '1', '英语四级证书');
INSERT INTO `credential` VALUES ('3', '1', '二级计算等级证书');

-- ----------------------------
-- Table structure for `education`
-- ----------------------------
DROP TABLE IF EXISTS `education`;
CREATE TABLE `education` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL COMMENT '用户ID',
  `start_date` date DEFAULT NULL COMMENT '开始时间',
  `end_date` date DEFAULT NULL COMMENT '结束时间',
  `college` varchar(255) DEFAULT NULL COMMENT '学校名',
  `specialty` varchar(255) DEFAULT NULL COMMENT '专业',
  `type` varchar(255) DEFAULT NULL COMMENT '本科/专科',
  `courses` varchar(255) DEFAULT NULL COMMENT '主修课程',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of education
-- ----------------------------
INSERT INTO `education` VALUES ('1', '1', '2014-09-05', '2018-06-05', 'XXXX学院', '软件工程', '本科', 'JAVA,计算机网络，操作系统');
INSERT INTO `education` VALUES ('2', '1', '2014-08-07', '2018-09-07', '四川科技大学', '软件工程', '硕士', 'JAVA，高等数学');

-- ----------------------------
-- Table structure for `job`
-- ----------------------------
DROP TABLE IF EXISTS `job`;
CREATE TABLE `job` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL COMMENT '用户ID',
  `start_date` date DEFAULT NULL COMMENT '开始时间',
  `end_date` date DEFAULT NULL COMMENT '结束时间',
  `company` varchar(255) DEFAULT NULL COMMENT '公司',
  `position` varchar(255) DEFAULT NULL COMMENT '职位',
  `description` mediumtext COMMENT '描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of job
-- ----------------------------
INSERT INTO `job` VALUES ('1', '1', '2017-07-05', '2018-03-05', 'XXX科技有限公司', 'JAVA工程师', '接口开发，用Spring boot开发');
INSERT INTO `job` VALUES ('2', '1', '2016-02-03', '2018-08-08', '阿里巴巴科技有限公司', 'JAVA工程师', '阿里巴巴软件部门，从事java开发');

-- ----------------------------
-- Table structure for `project`
-- ----------------------------
DROP TABLE IF EXISTS `project`;
CREATE TABLE `project` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL COMMENT '项目名称',
  `start_date` date DEFAULT NULL COMMENT '开始时间',
  `end_date` date DEFAULT NULL COMMENT '结束时间',
  `description` mediumtext COMMENT '介绍',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of project
-- ----------------------------
INSERT INTO `project` VALUES ('1', '1', 'xxx管理系统', '2017-02-01', '2017-07-28', '项目采用spring boot进行开发，mysql作为数据库');
INSERT INTO `project` VALUES ('2', '1', '图书馆管理系统', '2018-02-01', '2018-08-15', '图书馆管理系统，管理学校的图书借阅，图书管理等信息');

-- ----------------------------
-- Table structure for `resume_history`
-- ----------------------------
DROP TABLE IF EXISTS `resume_history`;
CREATE TABLE `resume_history` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL COMMENT '用户ID',
  `resume_tpl_id` int(11) NOT NULL COMMENT '模版ID',
  `path` varchar(255) NOT NULL COMMENT '简历生成路径',
  `create_time` datetime NOT NULL COMMENT '创建事件',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='简历生成记录';

-- ----------------------------
-- Records of resume_history
-- ----------------------------

-- ----------------------------
-- Table structure for `resume_tpl`
-- ----------------------------
DROP TABLE IF EXISTS `resume_tpl`;
CREATE TABLE `resume_tpl` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `thumb` varchar(255) DEFAULT NULL COMMENT '封面',
  `path` varchar(255) DEFAULT NULL COMMENT '模版路径',
  `description` varchar(255) DEFAULT NULL COMMENT '模版描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='简历模板';

-- ----------------------------
-- Records of resume_tpl
-- ----------------------------
INSERT INTO `resume_tpl` VALUES ('1', '/resume/images/thumb1.jpg', '/..', '第一个');
INSERT INTO `resume_tpl` VALUES ('2', '/resume/images/thumb2.jpg', '/..', '第二个');

-- ----------------------------
-- Table structure for `skill`
-- ----------------------------
DROP TABLE IF EXISTS `skill`;
CREATE TABLE `skill` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL COMMENT '用户ID',
  `name` varchar(255) DEFAULT NULL COMMENT '技能名称',
  `experience` int(2) DEFAULT NULL COMMENT '熟练度',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of skill
-- ----------------------------
INSERT INTO `skill` VALUES ('1', '1', 'java', '5');
INSERT INTO `skill` VALUES ('2', '1', 'mysql', '8');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL COMMENT '用户名',
  `real_name` varchar(10) NOT NULL COMMENT '真实名字',
  `stature` int(11) NOT NULL COMMENT '身高',
  `nation` varchar(255) NOT NULL COMMENT '民族',
  `education` varchar(255) NOT NULL COMMENT '教育',
  `tel` varchar(255) NOT NULL COMMENT '电话号码',
  `birthday` date NOT NULL COMMENT '生日',
  `email` varchar(255) NOT NULL COMMENT '电子邮箱',
  `college` varchar(255) NOT NULL COMMENT '毕业院校',
  `address` varchar(255) NOT NULL COMMENT '住址',
  `job_intention` varchar(255) NOT NULL COMMENT '求职意向',
  `introduction` mediumtext NOT NULL COMMENT '自我介绍',
  `profile_photo` varchar(255) DEFAULT NULL COMMENT '头像',
  `password` varchar(255) DEFAULT NULL COMMENT '密码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'xuanxin', '王小明', '178', '汉族', '硕士', '18608283799', '2018-08-03', 'xx20510@163.com', '四川理工学院', '四川成都', 'JAVA工程师', '爱好学习，热爱专研,有丰富的开发经验。', '/user/images/default-profile-photo.jpg', '$2a$10$EF9.WQMO/tcYwEsnxVS9sex6tCytaPCR8dEI.SqDuChYK02ldbXeq');
