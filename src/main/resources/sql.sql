-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        5.5.30-MariaDB - mariadb.org binary distribution
-- 服务器操作系统:                      Win32
-- HeidiSQL 版本:                  8.3.0.4694
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- 导出 pgm 的数据库结构
DROP DATABASE IF EXISTS `pgm`;
CREATE DATABASE IF NOT EXISTS `pgm` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `pgm`;


-- 导出  表 pgm.ba_data_store 结构
DROP TABLE IF EXISTS `ba_data_store`;
CREATE TABLE IF NOT EXISTS `ba_data_store` (
  `id_` bigint(20) NOT NULL DEFAULT '0',
  `type_key_` varchar(50) DEFAULT NULL,
  `type_name_` varchar(50) DEFAULT NULL,
  `item_key_` varchar(50) DEFAULT NULL,
  `item_value_` varchar(200) DEFAULT NULL,
  `item_data_type_` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_`),
  KEY `type_` (`type_name_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='数据仓库';

-- 正在导出表  pgm.ba_data_store 的数据：~3 rows (大约)
/*!40000 ALTER TABLE `ba_data_store` DISABLE KEYS */;
INSERT INTO `ba_data_store` (`id_`, `type_key_`, `type_name_`, `item_key_`, `item_value_`, `item_data_type_`) VALUES
	(1, '1', '1', '1', '1', '1'),
	(2, '', '', '1', '1', '1'),
	(3, NULL, NULL, NULL, NULL, NULL);
/*!40000 ALTER TABLE `ba_data_store` ENABLE KEYS */;


-- 导出  表 pgm.ba_data_treestore 结构
DROP TABLE IF EXISTS `ba_data_treestore`;
CREATE TABLE IF NOT EXISTS `ba_data_treestore` (
  `id_` bigint(20) NOT NULL DEFAULT '0',
  `type_key_` varchar(50) DEFAULT NULL,
  `type_name_` varchar(50) DEFAULT NULL,
  `item_key_` varchar(50) DEFAULT NULL,
  `item_value_` varchar(200) DEFAULT NULL,
  `parent_id_` bigint(20) DEFAULT NULL,
  `vchar1` varchar(200) DEFAULT NULL,
  `vchar2` varchar(200) DEFAULT NULL,
  `vchar3` varchar(200) DEFAULT NULL,
  `vchar4` varchar(200) DEFAULT NULL,
  `vchar5` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id_`),
  KEY `type_` (`type_name_`),
  KEY `type_key_` (`type_key_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='树形仓库数据';

-- 正在导出表  pgm.ba_data_treestore 的数据：~3 rows (大约)
/*!40000 ALTER TABLE `ba_data_treestore` DISABLE KEYS */;
INSERT INTO `ba_data_treestore` (`id_`, `type_key_`, `type_name_`, `item_key_`, `item_value_`, `parent_id_`, `vchar1`, `vchar2`, `vchar3`, `vchar4`, `vchar5`) VALUES
	(0, 'organization', '组织机构', '公司', '公司', 1, NULL, NULL, NULL, NULL, NULL),
	(1, 'organization', '组织机构', '公司', '公司', NULL, NULL, NULL, NULL, NULL, NULL),
	(2, 'organization', '组织机构', '公司', '公司', 1, NULL, NULL, NULL, NULL, NULL);
/*!40000 ALTER TABLE `ba_data_treestore` ENABLE KEYS */;


-- 导出  表 pgm.pgm_baseinfo 结构
DROP TABLE IF EXISTS `pgm_baseinfo`;
CREATE TABLE IF NOT EXISTS `pgm_baseinfo` (
  `id` bigint(20) NOT NULL,
  `business_pattern` varchar(100) DEFAULT NULL COMMENT '业务方式',
  `material_no` varchar(100) DEFAULT NULL COMMENT '物料编号',
  `main_person` varchar(100) DEFAULT NULL COMMENT '责任人',
  `unit_type` varchar(50) DEFAULT NULL COMMENT '单位类型(百分比；g/L克每升 ; g/t 克每吨)',
  `main_person_code` varchar(100) DEFAULT NULL COMMENT '责任人编号',
  `contract_no` varchar(100) DEFAULT NULL COMMENT '合同编号',
  `customer_name` varchar(100) DEFAULT NULL COMMENT '客户名称',
  `business_environment` varchar(100) DEFAULT NULL COMMENT '行业',
  `material_info` varchar(100) DEFAULT NULL COMMENT '来料名称',
  `material_weight` float DEFAULT NULL COMMENT '来料实际重量',
  `material_notice_weight` float DEFAULT NULL COMMENT '来料结算重量',
  `sr_material_in_date` datetime DEFAULT NULL COMMENT '库房收料日期',
  `sr_material_in_no` varchar(50) DEFAULT NULL COMMENT '库房收料单号',
  `note_first` varchar(1000) DEFAULT NULL,
  `note_second` varchar(1000) DEFAULT NULL,
  `note_third` varchar(1000) DEFAULT NULL,
  `note_forth` varchar(1000) DEFAULT NULL,
  `deal_fee` float DEFAULT NULL COMMENT '加工费',
  `out_deal_fee` float DEFAULT NULL COMMENT '外协加工费',
  `buy_price` float DEFAULT NULL COMMENT '以金属记采购单价',
  PRIMARY KEY (`id`),
  UNIQUE KEY `material_no_unique` (`material_no`),
  KEY `material_no` (`material_no`),
  KEY `business_pattern` (`business_pattern`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='基础信息表';

-- 正在导出表  pgm.pgm_baseinfo 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `pgm_baseinfo` DISABLE KEYS */;
/*!40000 ALTER TABLE `pgm_baseinfo` ENABLE KEYS */;


-- 导出  表 pgm.pgm_cashtrade_detail 结构
DROP TABLE IF EXISTS `pgm_cashtrade_detail`;
CREATE TABLE IF NOT EXISTS `pgm_cashtrade_detail` (
  `id` bigint(20) NOT NULL,
  `customer_no` varchar(50) DEFAULT NULL,
  `customer_name` varchar(50) DEFAULT NULL,
  `receive_amount` float DEFAULT '0' COMMENT '应收',
  `pay_amount` float DEFAULT '0' COMMENT '应付',
  `return_amount` float DEFAULT '0' COMMENT '客户汇款',
  `trade_date` datetime DEFAULT NULL,
  `note` varchar(1000) DEFAULT NULL COMMENT '摘要',
  PRIMARY KEY (`id`),
  KEY `customer_no` (`customer_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='客户款项明细';

-- 正在导出表  pgm.pgm_cashtrade_detail 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `pgm_cashtrade_detail` DISABLE KEYS */;
/*!40000 ALTER TABLE `pgm_cashtrade_detail` ENABLE KEYS */;


-- 导出  表 pgm.pgm_contract 结构
DROP TABLE IF EXISTS `pgm_contract`;
CREATE TABLE IF NOT EXISTS `pgm_contract` (
  `id` bigint(20) NOT NULL,
  `contract_no` varchar(50) DEFAULT NULL COMMENT '合同编号',
  `contract_date` datetime DEFAULT NULL COMMENT '合同签订日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='合同表';

-- 正在导出表  pgm.pgm_contract 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `pgm_contract` DISABLE KEYS */;
/*!40000 ALTER TABLE `pgm_contract` ENABLE KEYS */;


-- 导出  表 pgm.pgm_customer 结构
DROP TABLE IF EXISTS `pgm_customer`;
CREATE TABLE IF NOT EXISTS `pgm_customer` (
  `id` bigint(20) NOT NULL,
  `customer_no` varchar(100) DEFAULT NULL,
  `customer_name` varchar(100) DEFAULT NULL,
  `customer_address` varchar(100) DEFAULT NULL,
  `tel` varchar(100) DEFAULT NULL COMMENT '座机',
  `contrator` varchar(100) DEFAULT NULL COMMENT '联系人',
  `contrator_phone` varchar(100) DEFAULT NULL COMMENT '联系人电话',
  `fax` varchar(100) DEFAULT NULL,
  `postcode` varchar(100) DEFAULT NULL,
  `note` varchar(200) DEFAULT NULL,
  `reg_balance` double DEFAULT NULL COMMENT '注册资本',
  `company_prop` varchar(100) DEFAULT NULL COMMENT '企业性质',
  `bank_name` varchar(100) DEFAULT NULL COMMENT '开户行',
  `bank_card_no` varchar(100) DEFAULT NULL COMMENT '开户帐号',
  `post_address` varchar(100) DEFAULT NULL COMMENT '邮寄地址',
  `credit_level` varchar(100) DEFAULT NULL COMMENT '信用等级',
  `max_credit_balance` double DEFAULT NULL COMMENT '最大赊销额度（万元为单位）',
  `max_pay_day` double DEFAULT NULL COMMENT '最长付款期限(天为单位)',
  `pay_type` varchar(50) DEFAULT NULL COMMENT '付款方式',
  PRIMARY KEY (`id`),
  UNIQUE KEY `customer_name` (`customer_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='客户表';

-- 正在导出表  pgm.pgm_customer 的数据：~12 rows (大约)
/*!40000 ALTER TABLE `pgm_customer` DISABLE KEYS */;
INSERT INTO `pgm_customer` (`id`, `customer_no`, `customer_name`, `customer_address`, `tel`, `contrator`, `contrator_phone`, `fax`, `postcode`, `note`, `reg_balance`, `company_prop`, `bank_name`, `bank_card_no`, `post_address`, `credit_level`, `max_credit_balance`, `max_pay_day`, `pay_type`) VALUES
	(2, '2', '客户2', '大', '1122', '邹蕊鲜', '23', '穿2222', '655400', '的的', 222, '软件', '建行', '到了快速减肥', '春城路222', '1', 2, 3, '银行'),
	(23378718307123225, '8', '8', '', '', '', '', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(23378718307123227, '44', '44', '', '', '', '', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(23378718307123228, '45', '45', '', '', '', '', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(23395847559446528, '', '1', '', '', '', '', '', '', '', NULL, '', '', '', '', '', NULL, NULL, ''),
	(23395847559446529, '', '333', '', '', '', '', '', '', '', NULL, '', '', '', '', '', NULL, NULL, ''),
	(23395847559446530, '', 'rrr', '', '', '', '', '', '', '', NULL, '', '', '', '', '', NULL, NULL, ''),
	(23395847559446531, '', 'eeas', '', '', '', '', '', '', '', NULL, '', '', '', '', '', NULL, NULL, ''),
	(23395847559446532, '', 'sfsdf', '', '', '', '', '', '', '', NULL, '', '', '', '', '', NULL, NULL, ''),
	(23395847559446533, '', '发', '', '', '', '', '', '', '', NULL, '', '', '', '', '', NULL, NULL, ''),
	(23395847559446537, '', '饿', '', '', '', '', '', '', '', NULL, '', '', '', '', '', NULL, NULL, ''),
	(23481461961129984, 'ydasdhjk', 'yiyao', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
/*!40000 ALTER TABLE `pgm_customer` ENABLE KEYS */;


-- 导出  表 pgm.pgm_detail 结构
DROP TABLE IF EXISTS `pgm_detail`;
CREATE TABLE IF NOT EXISTS `pgm_detail` (
  `id` bigint(20) NOT NULL,
  `pgm_id` varchar(50) DEFAULT NULL,
  `unit_type` varchar(50) DEFAULT NULL COMMENT '单位类型(百分比；g/L克每升 ; g/t 克每吨)',
  `Pt` float DEFAULT NULL COMMENT '实际铂含量',
  `Pd` float DEFAULT NULL COMMENT '实际钯含量',
  `Rh` float DEFAULT NULL COMMENT '实际铑含量',
  `Ir` float DEFAULT NULL COMMENT '实际铱含量',
  `Ru` float DEFAULT NULL COMMENT '实际钌含量',
  `Au` float DEFAULT NULL COMMENT '实际金含量',
  `Ag` float DEFAULT NULL COMMENT '实际银含量',
  `Pt_notice` float DEFAULT NULL COMMENT '实际铂含量',
  `Pd_notice` float DEFAULT NULL COMMENT '实际钯含量',
  `Rh_notice` float DEFAULT NULL COMMENT '实际铑含量',
  `Ir_notice` float DEFAULT NULL COMMENT '实际铱含量',
  `Ru_notice` float DEFAULT NULL COMMENT '实际钌含量',
  `Au_notice` float DEFAULT NULL COMMENT '实际金含量',
  `Ag_notice` float DEFAULT NULL COMMENT '实际银含量',
  `Pt_recycle` float DEFAULT NULL COMMENT '结算铂含量回收率',
  `Pd_recycle` float DEFAULT NULL COMMENT '结算钯含量回收率',
  `Rh_recycle` float DEFAULT NULL COMMENT '结算铑含量回收率',
  `Ir_recycle` float DEFAULT NULL COMMENT '结算铱含量回收率',
  `Ru_recycle` float DEFAULT NULL COMMENT '结算钌含量回收率',
  `Au_recycle` float DEFAULT NULL COMMENT '结算金含量回收率',
  `Ag_recycle` float DEFAULT NULL COMMENT '结算银含量回收率',
  `Pt_price` float DEFAULT NULL COMMENT '铂采购单价',
  `Pd_price` float DEFAULT NULL COMMENT '实际钯含量',
  `Rh_price` float DEFAULT NULL COMMENT '实际铑含量',
  `Ir_price` float DEFAULT NULL COMMENT '实际铱含量',
  `Ru_price` float DEFAULT NULL COMMENT '实际钌含量',
  `Au_price` float DEFAULT NULL COMMENT '实际金含量',
  `Ag_price` float DEFAULT NULL COMMENT '实际银含量',
  PRIMARY KEY (`id`),
  KEY `pgm_id` (`pgm_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='贵金属相关含量表';

-- 正在导出表  pgm.pgm_detail 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `pgm_detail` DISABLE KEYS */;
/*!40000 ALTER TABLE `pgm_detail` ENABLE KEYS */;


-- 导出  表 pgm.pgm_product 结构
DROP TABLE IF EXISTS `pgm_product`;
CREATE TABLE IF NOT EXISTS `pgm_product` (
  `id` bigint(20) NOT NULL,
  `pgm_id` bigint(20) NOT NULL,
  `product_name` varchar(100) DEFAULT NULL,
  `unit_type` varchar(50) DEFAULT NULL COMMENT '单位类型(百分比；g/L克每升 ; g/t 克每吨)',
  `product_weight` float DEFAULT NULL COMMENT '产品重量',
  `Pt` float DEFAULT NULL COMMENT '产品规格-铂',
  `Pd` float DEFAULT NULL COMMENT '产品规格-钯',
  `Rh` float DEFAULT NULL COMMENT '产品规格-铑',
  `Ir` float DEFAULT NULL COMMENT '产品规格-铱',
  `Ru` float DEFAULT NULL COMMENT '产品规格-钌',
  `Au` float DEFAULT NULL COMMENT '产品规格-金',
  `Ag` float DEFAULT NULL COMMENT '产品规格-银',
  `out_date` datetime DEFAULT NULL COMMENT '产品实际出库日期',
  `out_bill_date` datetime DEFAULT NULL COMMENT '出库单日期',
  `out_bill_no` varchar(50) DEFAULT NULL COMMENT '出库单号',
  PRIMARY KEY (`id`),
  KEY `FK_pgm_product_pgm_baseinfo` (`pgm_id`),
  CONSTRAINT `FK_pgm_product_pgm_baseinfo` FOREIGN KEY (`pgm_id`) REFERENCES `pgm_baseinfo` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='产出产品信息';

-- 正在导出表  pgm.pgm_product 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `pgm_product` DISABLE KEYS */;
/*!40000 ALTER TABLE `pgm_product` ENABLE KEYS */;


-- 导出  表 pgm.pm_definition 结构
DROP TABLE IF EXISTS `pm_definition`;
CREATE TABLE IF NOT EXISTS `pm_definition` (
  `id` bigint(10) NOT NULL DEFAULT '0',
  `name` varchar(200) DEFAULT NULL,
  `identifying_code` varchar(200) DEFAULT NULL,
  `version` int(11) DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `identifying_code_version` (`identifying_code`,`version`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='自定义\r\n流程定义表';

-- 正在导出表  pgm.pm_definition 的数据：~2 rows (大约)
/*!40000 ALTER TABLE `pm_definition` DISABLE KEYS */;
INSERT INTO `pm_definition` (`id`, `name`, `identifying_code`, `version`) VALUES
	(1, '流程1', 'pgm', 1),
	(2, '流程1', 'pgm', 2);
/*!40000 ALTER TABLE `pm_definition` ENABLE KEYS */;


-- 导出  表 pgm.pm_def_task 结构
DROP TABLE IF EXISTS `pm_def_task`;
CREATE TABLE IF NOT EXISTS `pm_def_task` (
  `id_` bigint(20) NOT NULL DEFAULT '0',
  `task_name_` varchar(200) DEFAULT NULL,
  `note_` varchar(200) DEFAULT NULL,
  `identifying_code` varchar(200) DEFAULT NULL,
  `type_` varchar(10) DEFAULT NULL,
  `process_def_id_` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  pgm.pm_def_task 的数据：~4 rows (大约)
/*!40000 ALTER TABLE `pm_def_task` DISABLE KEYS */;
INSERT INTO `pm_def_task` (`id_`, `task_name_`, `note_`, `identifying_code`, `type_`, `process_def_id_`) VALUES
	(1, '开始', NULL, 'start', 'start', 1),
	(2, '填写申请', NULL, 'apply', 'task', 1),
	(3, '审核', NULL, 'check', 'task', 1),
	(4, '结束', NULL, 'end', 'end', 1);
/*!40000 ALTER TABLE `pm_def_task` ENABLE KEYS */;


-- 导出  表 pgm.pm_def_task_rel 结构
DROP TABLE IF EXISTS `pm_def_task_rel`;
CREATE TABLE IF NOT EXISTS `pm_def_task_rel` (
  `id_` bigint(20) DEFAULT NULL,
  `src_tid_` bigint(20) DEFAULT NULL,
  `dest_tid_` bigint(20) DEFAULT NULL,
  `type_` varchar(10) DEFAULT NULL,
  `muti_instance_` varchar(10) DEFAULT '0' COMMENT '目标多任务实例',
  `dest_pid_` bigint(20) DEFAULT NULL COMMENT '目标子流程id',
  `rel_name_` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  pgm.pm_def_task_rel 的数据：~4 rows (大约)
/*!40000 ALTER TABLE `pm_def_task_rel` DISABLE KEYS */;
INSERT INTO `pm_def_task_rel` (`id_`, `src_tid_`, `dest_tid_`, `type_`, `muti_instance_`, `dest_pid_`, `rel_name_`) VALUES
	(1, 1, 2, 'single', '0', NULL, '填写表单'),
	(2, 2, 3, 'single', '0', NULL, '领导审批'),
	(3, 3, 2, 'single', '0', NULL, '退回修改'),
	(4, 3, 4, 'single', '0', NULL, '结束');
/*!40000 ALTER TABLE `pm_def_task_rel` ENABLE KEYS */;


-- 导出  表 pgm.pm_group 结构
DROP TABLE IF EXISTS `pm_group`;
CREATE TABLE IF NOT EXISTS `pm_group` (
  `ID_` varchar(64) NOT NULL DEFAULT '',
  `REV_` int(11) DEFAULT NULL,
  `NAME_` varchar(255) DEFAULT NULL,
  `TYPE_` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  pgm.pm_group 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `pm_group` DISABLE KEYS */;
/*!40000 ALTER TABLE `pm_group` ENABLE KEYS */;


-- 导出  表 pgm.pm_inst_process 结构
DROP TABLE IF EXISTS `pm_inst_process`;
CREATE TABLE IF NOT EXISTS `pm_inst_process` (
  `id` bigint(20) NOT NULL DEFAULT '0',
  `Column 2` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  pgm.pm_inst_process 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `pm_inst_process` DISABLE KEYS */;
/*!40000 ALTER TABLE `pm_inst_process` ENABLE KEYS */;


-- 导出  表 pgm.pm_inst_task 结构
DROP TABLE IF EXISTS `pm_inst_task`;
CREATE TABLE IF NOT EXISTS `pm_inst_task` (
  `ID_` varchar(64) NOT NULL,
  `PROC_DEF_ID_` varchar(64) DEFAULT NULL,
  `TASK_DEF_KEY_` varchar(255) DEFAULT NULL,
  `PROC_INST_ID_` varchar(64) DEFAULT NULL,
  `EXECUTION_ID_` varchar(64) DEFAULT NULL,
  `NAME_` varchar(255) DEFAULT NULL,
  `PARENT_TASK_ID_` varchar(64) DEFAULT NULL,
  `DESCRIPTION_` varchar(4000) DEFAULT NULL,
  `OWNER_` varchar(255) DEFAULT NULL,
  `ASSIGNEE_` varchar(255) DEFAULT NULL,
  `START_TIME_` datetime NOT NULL,
  `CLAIM_TIME_` datetime DEFAULT NULL,
  `END_TIME_` datetime DEFAULT NULL,
  `DURATION_` bigint(20) DEFAULT NULL,
  `DELETE_REASON_` varchar(4000) DEFAULT NULL,
  `PRIORITY_` int(11) DEFAULT NULL,
  `DUE_DATE_` datetime DEFAULT NULL,
  `FORM_KEY_` varchar(255) DEFAULT NULL,
  `CATEGORY_` varchar(255) DEFAULT NULL,
  `TENANT_ID_` varchar(255) DEFAULT '',
  PRIMARY KEY (`ID_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  pgm.pm_inst_task 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `pm_inst_task` DISABLE KEYS */;
/*!40000 ALTER TABLE `pm_inst_task` ENABLE KEYS */;


-- 导出  表 pgm.pm_membership 结构
DROP TABLE IF EXISTS `pm_membership`;
CREATE TABLE IF NOT EXISTS `pm_membership` (
  `USER_ID_` varchar(64) NOT NULL DEFAULT '',
  `GROUP_ID_` varchar(64) NOT NULL DEFAULT '',
  PRIMARY KEY (`USER_ID_`,`GROUP_ID_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  pgm.pm_membership 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `pm_membership` DISABLE KEYS */;
/*!40000 ALTER TABLE `pm_membership` ENABLE KEYS */;


-- 导出  表 pgm.t_app 结构
DROP TABLE IF EXISTS `t_app`;
CREATE TABLE IF NOT EXISTS `t_app` (
  `id` bigint(10) NOT NULL DEFAULT '0',
  `app_name` varchar(50) DEFAULT NULL,
  `path` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `app_name` (`app_name`),
  UNIQUE KEY `path` (`path`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  pgm.t_app 的数据：~5 rows (大约)
/*!40000 ALTER TABLE `t_app` DISABLE KEYS */;
INSERT INTO `t_app` (`id`, `app_name`, `path`) VALUES
	(1000, '用户管理', '/user/index'),
	(1002, '保存用户', '/user/save'),
	(1003, '删除用户', '/user/delete'),
	(2000, '客户管理', '/customer/index'),
	(5000, '组织机构管理', '/organization/index');
/*!40000 ALTER TABLE `t_app` ENABLE KEYS */;


-- 导出  表 pgm.t_log 结构
DROP TABLE IF EXISTS `t_log`;
CREATE TABLE IF NOT EXISTS `t_log` (
  `id` bigint(20) NOT NULL DEFAULT '0',
  `user_id` bigint(20) DEFAULT NULL,
  `user_name` varchar(50) DEFAULT NULL,
  `note` text,
  `log_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  pgm.t_log 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `t_log` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_log` ENABLE KEYS */;


-- 导出  表 pgm.t_menu 结构
DROP TABLE IF EXISTS `t_menu`;
CREATE TABLE IF NOT EXISTS `t_menu` (
  `id` bigint(10) NOT NULL DEFAULT '0',
  `menu_name` varchar(50) DEFAULT NULL,
  `path` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `menu_name` (`menu_name`),
  UNIQUE KEY `path` (`path`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  pgm.t_menu 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `t_menu` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_menu` ENABLE KEYS */;


-- 导出  表 pgm.t_role 结构
DROP TABLE IF EXISTS `t_role`;
CREATE TABLE IF NOT EXISTS `t_role` (
  `id` bigint(10) NOT NULL,
  `role_name` varchar(50) DEFAULT NULL,
  `role_no` varchar(50) DEFAULT NULL,
  `type` varchar(50) DEFAULT NULL COMMENT '角色类型',
  `role_description` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `role_no` (`role_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  pgm.t_role 的数据：~2 rows (大约)
/*!40000 ALTER TABLE `t_role` DISABLE KEYS */;
INSERT INTO `t_role` (`id`, `role_name`, `role_no`, `type`, `role_description`) VALUES
	(1, '用户管理', 'user', NULL, NULL),
	(2, '客户管理', 'customer', NULL, NULL);
/*!40000 ALTER TABLE `t_role` ENABLE KEYS */;


-- 导出  表 pgm.t_role_app 结构
DROP TABLE IF EXISTS `t_role_app`;
CREATE TABLE IF NOT EXISTS `t_role_app` (
  `id` bigint(10) NOT NULL DEFAULT '0',
  `role_id` bigint(10) DEFAULT NULL,
  `app_id` bigint(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  pgm.t_role_app 的数据：~2 rows (大约)
/*!40000 ALTER TABLE `t_role_app` DISABLE KEYS */;
INSERT INTO `t_role_app` (`id`, `role_id`, `app_id`) VALUES
	(1, 1, 1000),
	(2, 2, 2000);
/*!40000 ALTER TABLE `t_role_app` ENABLE KEYS */;


-- 导出  表 pgm.t_user 结构
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE IF NOT EXISTS `t_user` (
  `id` bigint(20) NOT NULL,
  `user_name` varchar(50) DEFAULT NULL,
  `user_password` varchar(50) DEFAULT NULL,
  `user_no` varchar(50) DEFAULT NULL COMMENT '用户编号(可为工号)',
  `position` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_name` (`user_name`),
  UNIQUE KEY `user_no` (`user_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  pgm.t_user 的数据：~3 rows (大约)
/*!40000 ALTER TABLE `t_user` DISABLE KEYS */;
INSERT INTO `t_user` (`id`, `user_name`, `user_password`, `user_no`, `position`) VALUES
	(1, 'admin', 'admin', '1', '管理员'),
	(23378718307123205, '邹蕊鲜', '1', '岁的卡卡了', '的'),
	(23395847559446535, '的', '', '', '');
/*!40000 ALTER TABLE `t_user` ENABLE KEYS */;


-- 导出  表 pgm.t_user_role 结构
DROP TABLE IF EXISTS `t_user_role`;
CREATE TABLE IF NOT EXISTS `t_user_role` (
  `id` bigint(10) NOT NULL DEFAULT '0',
  `user_id` bigint(10) DEFAULT NULL,
  `role_id` bigint(10) DEFAULT NULL,
  `note` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  pgm.t_user_role 的数据：~3 rows (大约)
/*!40000 ALTER TABLE `t_user_role` DISABLE KEYS */;
INSERT INTO `t_user_role` (`id`, `user_id`, `role_id`, `note`) VALUES
	(1, 1, 1, NULL),
	(2, 1, 2, NULL),
	(3, 2, 1, NULL);
/*!40000 ALTER TABLE `t_user_role` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
