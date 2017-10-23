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
-- Table structure for table `Cliente`
--

DROP TABLE IF EXISTS `Cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Cliente` (
  `cli_ID` varchar(60) NOT NULL,
  `Nome` varchar(60) NOT NULL,
  `Sobrenome` varchar(60) NOT NULL,
  `CPF` varchar(15) NOT NULL,
  `RG` varchar(60) DEFAULT NULL,
  `Data_nascimento` date DEFAULT NULL,
  `Endereco` varchar(60) NOT NULL,
  `Numero` varchar(30) DEFAULT NULL,
  `Complemento` varchar(60) DEFAULT NULL,
  `Cidade` varchar(60) DEFAULT NULL,
  `Estado` varchar(60) DEFAULT NULL,
  `Tel_fixo` varchar(30) DEFAULT NULL,
  `Tel_movel` varchar(30) DEFAULT NULL,
  `email` varchar(80) DEFAULT NULL,
  `Nome_mae` varchar(80) DEFAULT NULL,
  `Nome_pai` varchar(80) DEFAULT NULL,
  `Sexo` varchar(30) DEFAULT NULL,
  `bairro` varchar(45) DEFAULT NULL,
  `estado_civil` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`cli_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Cliente`
--

LOCK TABLES `Cliente` WRITE;
/*!40000 ALTER TABLE `Cliente` DISABLE KEYS */;
INSERT INTO `Cliente` VALUES ('00000000000','Fulano','Alguem','00000000000','564654','2014-01-01','Rua','123',NULL,'Maringá','Paraná',NULL,NULL,NULL,'Maria','José','Masculino','Bairro','Solteiro(a)'),('11111111111','Anderson','Oyama','111.111.111-11','123456','1992-11-27','Rua','123','','Maringá','Paraná','(44)1234-5678','(44)1234-5678','','Maria','José','Masculino','Zona','Solteiro(a)');
/*!40000 ALTER TABLE `Cliente` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-10-23 20:02:05
