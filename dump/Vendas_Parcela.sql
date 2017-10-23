CREATE DATABASE  IF NOT EXISTS `Vendas` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `Vendas`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: projetovendas.no-ip.org    Database: Vendas
-- ------------------------------------------------------
-- Server version	5.7.19-0ubuntu0.16.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Parcela`
--

DROP TABLE IF EXISTS `Parcela`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Parcela` (
  `parcela_ID` varchar(60) NOT NULL,
  `venda_ID` varchar(60) DEFAULT NULL,
  `parcela` int(11) DEFAULT NULL,
  `parcela_paga` int(11) DEFAULT NULL,
  `valor_total` float DEFAULT NULL,
  `total_pago` float DEFAULT NULL,
  `juros` float DEFAULT NULL,
  `data_parcela` date DEFAULT NULL,
  PRIMARY KEY (`parcela_ID`),
  KEY `FK_6x109vfb23s0c8c58ue2fqueo` (`venda_ID`),
  CONSTRAINT `FK_6x109vfb23s0c8c58ue2fqueo` FOREIGN KEY (`venda_ID`) REFERENCES `Vendas` (`venda_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Parcela`
--

LOCK TABLES `Parcela` WRITE;
/*!40000 ALTER TABLE `Parcela` DISABLE KEYS */;
/*!40000 ALTER TABLE `Parcela` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-10-23 20:01:45