-- MySQL dump 10.13  Distrib 8.0.16, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: imobiliario
-- ------------------------------------------------------
-- Server version	8.0.16

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
-- Table structure for table `tbclientes`
--

DROP TABLE IF EXISTS `tbclientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tbclientes` (
  `idcli` int(11) NOT NULL AUTO_INCREMENT,
  `nomecli` varchar(50) NOT NULL,
  `endcli` varchar(100) DEFAULT NULL,
  `fonecli` varchar(15) NOT NULL,
  `emailcli` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idcli`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbclientes`
--

LOCK TABLES `tbclientes` WRITE;
/*!40000 ALTER TABLE `tbclientes` DISABLE KEYS */;
INSERT INTO `tbclientes` VALUES (2,'Gabriel L','Francisco Vieira Cavalcante, posto 2, n° 122','(88)99670-3234','gabrielsousars45@gmail.com'),(3,'Cryfett Hemanoel','Beco do judas, rosa dos ventos, n° 69','(88)99876-3432','cryfett24@gmail.com'),(6,'Cry','Moscow, jow, 3226','(11)23222-3334','crammer1mat@gmail.com'),(7,'Gabriel s','Francisco Vieira Cavalcante, posto 2, n° 122','(88)99670-3234','gabrielsousars45@gmail.com'),(8,'shdiusa','wdwad','214124','rgre'),(9,'Gabriel S','rua abc, n°2','44444-4444','gabriel123@gmail.com'),(10,'Claudio','rua do campo, n°22','33333-44444','claudio@gmail.com'),(12,'Souza','avenida abc, n°33','12333-4444','gabriel123@gmail.com');
/*!40000 ALTER TABLE `tbclientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbimoveis`
--

DROP TABLE IF EXISTS `tbimoveis`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tbimoveis` (
  `idimovel` int(11) NOT NULL AUTO_INCREMENT,
  `data` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `tipo` varchar(15) NOT NULL,
  `situacao` varchar(20) NOT NULL,
  `endereco` varchar(45) NOT NULL,
  `bairro` varchar(45) NOT NULL,
  `CEP` varchar(9) NOT NULL,
  `areaTotal` float NOT NULL,
  `qtdQuartos` int(11) NOT NULL,
  `qtdSuites` int(11) NOT NULL,
  `qtdSala` int(11) NOT NULL,
  `vagasGaragem` int(11) NOT NULL,
  `pintura` varchar(45) NOT NULL,
  `descricao` varchar(45) DEFAULT NULL,
  `valorVenda` float NOT NULL,
  `valorAluguel` float NOT NULL,
  `idcli` int(11) NOT NULL,
  PRIMARY KEY (`idimovel`),
  KEY `idcli_idx` (`idcli`),
  CONSTRAINT `idcli` FOREIGN KEY (`idcli`) REFERENCES `tbclientes` (`idcli`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbimoveis`
--

LOCK TABLES `tbimoveis` WRITE;
/*!40000 ALTER TABLE `tbimoveis` DISABLE KEYS */;
INSERT INTO `tbimoveis` VALUES (2,'2019-06-24 23:29:34','Vender imóvel','Vendido	','Rua desportos','poço alto do sul','22222-222',22.2,5,3,2,2,'Azul','Área perfeita para quem gosta\r\nde silêncio!',10,0,3);
/*!40000 ALTER TABLE `tbimoveis` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbusuario`
--

DROP TABLE IF EXISTS `tbusuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tbusuario` (
  `id_login` int(11) NOT NULL,
  `usuario` varchar(50) NOT NULL,
  `fone` varchar(15) DEFAULT NULL,
  `login` varchar(15) NOT NULL,
  `senha` varchar(15) NOT NULL,
  `perfil` varchar(20) NOT NULL,
  PRIMARY KEY (`id_login`),
  UNIQUE KEY `login_UNIQUE` (`login`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbusuario`
--

LOCK TABLES `tbusuario` WRITE;
/*!40000 ALTER TABLE `tbusuario` DISABLE KEYS */;
INSERT INTO `tbusuario` VALUES (1,'Gabriel Souza','(88)99999-9999','gabrielsouza','123','admin'),(2,'Breno','(88)99876-8789','brenolima','124','user'),(3,'cryfett','(55)22222-2222','cry1','123','user'),(6,'gabriel','(88)99843-3342','gabriel12','abc','user'),(7,'Gabriel Souza','45454-4545','gabrielABC','123','user');
/*!40000 ALTER TABLE `tbusuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'imobiliario'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-06-26 22:49:27
