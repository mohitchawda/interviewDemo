CREATE TABLE `orders` (
  `id` int NOT NULL,
  `order_total` varchar(100) DEFAULT NULL,
  `purchased_at` varchar(100) DEFAULT NULL,
  `order_create_date` datetime DEFAULT NULL,
  `customer_id` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_customer_id_idx` (`customer_id`),
  CONSTRAINT `fk_customer_id` FOREIGN KEY (`customer_id`) REFERENCES `customers` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `order_lines` (
  `item_id` varchar(20) NOT NULL,
  `item_description` varchar(45) DEFAULT NULL,
  `item_qty` int DEFAULT NULL,
  `item_price` double DEFAULT NULL,
  `order_id` int DEFAULT NULL,
  PRIMARY KEY (`item_id`),
  KEY `fk_order_id_idx` (`order_id`),
  CONSTRAINT `fk_order_id` FOREIGN KEY (`order_id`) REFERENCES `orders` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `customers` (
  `id` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
