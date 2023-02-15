-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: needforcarsdb
-- ------------------------------------------------------
-- Server version	8.0.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `car_description`
--

DROP TABLE IF EXISTS `car_description`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `car_description` (
  `ID_CAR_DESCRIPTION` int unsigned NOT NULL AUTO_INCREMENT,
  `ID_CAR_TYPE` int unsigned NOT NULL,
  `BRAND` varchar(30) NOT NULL,
  `MODEL` varchar(30) NOT NULL,
  `DRIVECHAIN` varchar(20) NOT NULL,
  `CAR_COLOR` varchar(30) NOT NULL,
  `POWER` int DEFAULT NULL,
  `TRANSMISSION` char(1) DEFAULT NULL,
  `ENGINE` varchar(30) DEFAULT NULL,
  `DOOR_NUMBER` int DEFAULT NULL,
  `WEIGHT` int DEFAULT NULL,
  `FUEL` char(1) DEFAULT NULL,
  `DISPLACEMENT` int DEFAULT NULL,
  `DESCRIPTION` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`ID_CAR_DESCRIPTION`),
  UNIQUE KEY `ID_CAR_DESCRIPTION_UNIQUE` (`ID_CAR_DESCRIPTION`),
  KEY `ID_CAR_TYPE_FK_idx` (`ID_CAR_TYPE`),
  CONSTRAINT `ID_CAR_TYPE_FK` FOREIGN KEY (`ID_CAR_TYPE`) REFERENCES `car_type` (`ID_CAR_TYPE`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `car_description`
--

LOCK TABLES `car_description` WRITE;
/*!40000 ALTER TABLE `car_description` DISABLE KEYS */;
INSERT INTO `car_description` VALUES (1,1,'Opel','Corsa','forward','blue',40,'5','1.2',2,400,'g',1198,'A Great car for small people.'),(2,1,'Nissan','Micra','forward','red',39,'0','1.3',2,380,'g',1300,'Super car for everything.'),(16,2,'Opel','Corsa','four wheel','Red',60,'6','1.3 ECO',2,500,'a',1295,'Get and drive now.\r\nBuy now pls.'),(17,1,'Opel','Corsa','front wheel','Red',57,'0','1.3 ECO',2,500,'g',1299,'Качваш се и караш.');
/*!40000 ALTER TABLE `car_description` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-06-02  0:08:48
