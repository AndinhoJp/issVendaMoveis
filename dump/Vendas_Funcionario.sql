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
-- Table structure for table `Funcionario`
--

DROP TABLE IF EXISTS `Funcionario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Funcionario` (
  `id_func` varchar(60) NOT NULL,
  `Nome` varchar(60) NOT NULL,
  `CPF` varchar(20) NOT NULL,
  `RG` varchar(15) DEFAULT NULL,
  `Data_nascimento` date DEFAULT NULL,
  `Estado_Civil` varchar(20) DEFAULT NULL,
  `Nome_conjuge` varchar(80) DEFAULT NULL,
  `Endereco` varchar(60) NOT NULL,
  `Numero` varchar(15) DEFAULT NULL,
  `Complemento` varchar(25) DEFAULT NULL,
  `Cidade` varchar(30) DEFAULT NULL,
  `Estado` varchar(30) DEFAULT NULL,
  `Cargo` varchar(25) DEFAULT NULL,
  `Data_contratacao` date DEFAULT NULL,
  `nivel_acesso` int(11) DEFAULT NULL,
  `sexo` varchar(10) DEFAULT NULL,
  `bairro` varchar(50) DEFAULT NULL,
  `cep` varchar(15) DEFAULT NULL,
  `telefone` varchar(15) DEFAULT NULL,
  `status` int(1) DEFAULT NULL,
  PRIMARY KEY (`id_func`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Funcionario`
--

LOCK TABLES `Funcionario` WRITE;
/*!40000 ALTER TABLE `Funcionario` DISABLE KEYS */;
INSERT INTO `Funcionario` VALUES ('1','Anderson','6593',NULL,NULL,NULL,NULL,'Rua Algum Lugar',NULL,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,NULL,1),('2','Admin','123',NULL,NULL,NULL,NULL,'Rua',NULL,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,NULL,1);
/*!40000 ALTER TABLE `Funcionario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-10-23 20:01:48
