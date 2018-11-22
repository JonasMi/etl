CREATE TABLE `${table_name}` (
`id` varchar(64) NOT NULL,
  `resource_type` varchar(100) DEFAULT NULL,
  `soap_action` varchar(255) DEFAULT NULL,
  `request_body` longtext,
  `cn` varchar(50) NOT NULL,
  `sended` tinyint(4) DEFAULT NULL,
  `success` tinyint(4) DEFAULT NULL,
  `error_type` varchar(255) DEFAULT NULL,
  `error_message` text,
  `error_detail` text,
  `message_id` varchar(64) DEFAULT NULL,
  `message_class` varchar(128) DEFAULT NULL,
  `message_order` int(11) DEFAULT NULL,
  `send_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `retry_times` int(11) DEFAULT NULL,
   PRIMARY KEY (`id`)
);