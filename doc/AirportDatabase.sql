-- MySQL dump 10.13  Distrib 8.0.15, for macos10.14 (x86_64)
--
-- Host: 127.0.0.1    Database: Sys
-- ------------------------------------------------------
-- Server version	8.0.15

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `crew_type`
--

DROP TABLE IF EXISTS `crew_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `crew_type` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `crew_type`
--

LOCK TABLES `crew_type` WRITE;
/*!40000 ALTER TABLE `crew_type` DISABLE KEYS */;
/*!40000 ALTER TABLE `crew_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `flight`
--

DROP TABLE IF EXISTS `flight`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `flight` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `route_number` varchar(255) NOT NULL,
  `arrival_time` timestamp NULL DEFAULT NULL,
  `departure_time` timestamp NULL DEFAULT NULL,
  `arrival_offset` int(10) DEFAULT NULL,
  `departure_offset` int(10) DEFAULT NULL,
  `from_destination` varchar(30) DEFAULT NULL,
  `to_destination` varchar(30) DEFAULT NULL,
  `plane_size` int(2) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1489 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `flight`
--

LOCK TABLES `flight` WRITE;
/*!40000 ALTER TABLE `flight` DISABLE KEYS */;
INSERT INTO `flight` VALUES (1,'D8 3563','2019-09-18 22:10:00','2019-09-18 23:10:00',0,0,'KRK','CPH',0),(2,'JTG360','2019-09-18 22:30:00','2019-09-18 23:30:00',0,0,'AHO','CPH',0),(3,'SK 9250','2019-09-19 00:40:00','2019-09-19 01:40:00',10,0,'ARN','CPH',0),(4,'SU 2494','2019-09-18 22:00:00','2019-09-18 23:00:00',0,10,'CPH','SVO',0);
/*!40000 ALTER TABLE `flight` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `flight__station`
--

DROP TABLE IF EXISTS `flight__station`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `flight__station` (
  `fk_flight_id` int(11) NOT NULL,
  `fk_station_id` int(10) NOT NULL,
  `reserved_from` timestamp NULL DEFAULT NULL,
  `reserved_to` timestamp NULL DEFAULT NULL,
  KEY `fk__flight_id_idx` (`fk_flight_id`),
  KEY `fk_station_id` (`fk_station_id`),
  CONSTRAINT `flight__station_ibfk_1` FOREIGN KEY (`fk_flight_id`) REFERENCES `flight` (`id`),
  CONSTRAINT `flight__station_ibfk_2` FOREIGN KEY (`fk_station_id`) REFERENCES `station` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `flight__station`
--

LOCK TABLES `flight__station` WRITE;
/*!40000 ALTER TABLE `flight__station` DISABLE KEYS */;
INSERT INTO `flight__station` VALUES (1,1,NULL,NULL);
/*!40000 ALTER TABLE `flight__station` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `station`
--

DROP TABLE IF EXISTS `station`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `station` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `active` bit(1) NOT NULL,
  `station_type` int(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `station`
--

LOCK TABLES `station` WRITE;
/*!40000 ALTER TABLE `station` DISABLE KEYS */;
INSERT INTO `station` VALUES (1,_binary '\0',1),(2,_binary '\0',2),(3,_binary '\0',3),(4,_binary '',1);
/*!40000 ALTER TABLE `station` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-10-24 13:58:15
