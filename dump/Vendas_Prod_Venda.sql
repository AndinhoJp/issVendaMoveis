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
-- Table structure for table `Prod_Venda`
--

DROP TABLE IF EXISTS `Prod_Venda`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Prod_Venda` (
  `prodVenda_ID` varchar(60) NOT NULL,
  `venda_ID` varchar(60) DEFAULT NULL,
  `prod_ID` varchar(60) DEFAULT NULL,
  `quantidade` int(11) DEFAULT NULL,
  `valor_unitario` float DEFAULT NULL,
  PRIMARY KEY (`prodVenda_ID`),
  KEY `prod_ID_idx` (`prod_ID`),
  KEY `venda_ID_idx` (`venda_ID`),
  CONSTRAINT `produto_ID` FOREIGN KEY (`prod_ID`) REFERENCES `Produto` (`prod_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `vendas_id` FOREIGN KEY (`venda_ID`) REFERENCES `Vendas` (`venda_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Prod_Venda`
--

LOCK TABLES `Prod_Venda` WRITE;
/*!40000 ALTER TABLE `Prod_Venda` DISABLE KEYS */;
/*!40000 ALTER TABLE `Prod_Venda` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-10-23 20:01:44
