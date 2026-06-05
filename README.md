# DialingRobot架构设计

---
## 一、V1.0实现目标
1. 使用SIP协议完成两台设备之间的模拟电话呼叫
2. 具有话术图流转功能，一期做单向的，不做多分支的
3. 具备通话管理页面
4. 具备基本RPC功能
5. 具备数据库连接功能


## 二、V1.0架构设计
1. DialingRobotCore服务承接功能
2. DialingRobotWeb服务承接功能


## 三、数据库相关设计
1. 话术表
   ```sql
   CREATE TABLE `dialing_script` (
   `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键ID',
   `name` varchar(100) NOT NULL COMMENT '话术脚本名称',
   `script_type` tinyint NOT NULL COMMENT '脚本类型',
   `status` tinyint NOT NULL DEFAULT 1 COMMENT '状态 0-禁用 1-启用',
   `description` varchar(500) DEFAULT NULL COMMENT '脚本描述说明',
   `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
   `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
   PRIMARY KEY (`id`),
   KEY `idx_script_type` (`script_type`),
   KEY `idx_status` (`status`)
   ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='话术脚本主表';
   ```
2. 话术节点表
   ```sql
   CREATE TABLE `dialing_script_node` (
   `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键ID',
   `status` tinyint NOT NULL DEFAULT 1 COMMENT '状态 0-禁用 1-启用',
   `script_id` bigint NOT NULL COMMENT '话术脚本ID',
   `father_node_id` bigint DEFAULT NULL COMMENT '父节点ID',
   `node_type` tinyint NOT NULL COMMENT '节点类型 0-普通节点 1-特殊节点',
   `content` text COMMENT '节点内容/话术内容',
   `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
   `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
   PRIMARY KEY (`id`),
   KEY `idx_script_id` (`script_id`),
   KEY `idx_father_node_id` (`father_node_id`)
   ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='话术脚本节点表';
   ```
3. 通话记录表