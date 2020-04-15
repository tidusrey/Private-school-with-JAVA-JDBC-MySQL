-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: localhost    Database: privateschool
-- ------------------------------------------------------
-- Server version	8.0.18

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
-- Table structure for table `assigment`
--

DROP TABLE IF EXISTS `assigment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `assigment` (
  `Assigment_id` int(11) NOT NULL AUTO_INCREMENT,
  `Assigment_Name` varchar(45) NOT NULL,
  `Assigment_Sub_Date` varchar(45) NOT NULL,
  `Assigment_Oral_Mark` int(11) NOT NULL,
  `Assigment_Total_Mark` int(11) NOT NULL,
  PRIMARY KEY (`Assigment_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `assigment`
--

LOCK TABLES `assigment` WRITE;
/*!40000 ALTER TABLE `assigment` DISABLE KEYS */;
INSERT INTO `assigment` VALUES (1,'TORTURE FOR STUDENTS IN MODERN ERA','15-01-2020',20,100),(2,'TORTURE FOR STUDENTS IN ANCIENT ERA','30-01-2020',20,100),(3,'TORTURE FOR STUDENTS IN FUTURE ERA','15-01-2020',20,100),(4,'TORTURE FOR STUDENTS DURING CHRISTMAS','30-01-2020',20,100);
/*!40000 ALTER TABLE `assigment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `course`
--

DROP TABLE IF EXISTS `course`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `course` (
  `Course_Id` int(11) NOT NULL AUTO_INCREMENT,
  `Course_Semester` varchar(45) NOT NULL,
  `Course_Stream` varchar(45) NOT NULL,
  `Course_Type` varchar(45) NOT NULL,
  `Course_Start_Date` varchar(45) NOT NULL,
  `Course_End_Date` varchar(45) NOT NULL,
  PRIMARY KEY (`Course_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `course`
--

LOCK TABLES `course` WRITE;
/*!40000 ALTER TABLE `course` DISABLE KEYS */;
INSERT INTO `course` VALUES (1,'CB9','JAVA','FULL-TIME','2019-10-26','2020-01-26'),(2,'CB9','JAVA','PART-TIME','2019-10-26','2020-04-26'),(3,'CB9','C#','FULL-TIME','2019-10-26','2020-01-26'),(4,'CB9','C#','PART-TIME','2019-10-26','2020-04-26'),(5,'CB9','SQL','FULL-TIME','2019-10-26','2020-01-26'),(6,'CB9','SQL','PART-TIME','2019-10-26','2020-04-26');
/*!40000 ALTER TABLE `course` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `course_student`
--

DROP TABLE IF EXISTS `course_student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `course_student` (
  `course_id` int(11) NOT NULL,
  `student_id` int(11) NOT NULL,
  PRIMARY KEY (`course_id`,`student_id`),
  KEY `student_id_idx` (`student_id`),
  CONSTRAINT `course_id` FOREIGN KEY (`course_id`) REFERENCES `course` (`Course_Id`),
  CONSTRAINT `student_id` FOREIGN KEY (`student_id`) REFERENCES `student` (`Student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `course_student`
--

LOCK TABLES `course_student` WRITE;
/*!40000 ALTER TABLE `course_student` DISABLE KEYS */;
INSERT INTO `course_student` VALUES (1,1),(2,2),(1,3),(2,4),(1,5),(2,6),(1,7),(2,8),(1,9),(2,10),(3,11),(4,12),(3,13),(4,14),(3,15),(4,16),(3,17),(4,18),(3,19),(4,20);
/*!40000 ALTER TABLE `course_student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student` (
  `Student_id` int(11) NOT NULL AUTO_INCREMENT,
  `Student_Name` varchar(45) NOT NULL,
  `Student_last_name` varchar(45) NOT NULL,
  `Student_Birthday` varchar(45) NOT NULL,
  `Student_Fee` int(11) NOT NULL,
  PRIMARY KEY (`Student_id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (1,'Kostas','Papanikolaou','1985-04-26',2500),(2,'Maria','Gerakarh','1986-06-12',2500),(3,'Vasilis','Gretsitsas','1987-07-29',2500),(4,'Manolis','Rigas','1988-09-13',2500),(5,'Vasiliki','Basileiou','1989-10-30',2500),(6,'Rina','Athanasiou','1990-12-16',2500),(7,'Chris','Delaponte','1992-02-01',2500),(8,'Xontas','Diplas','1993-03-19',2500),(9,'Greg','Red','1994-05-05',2500),(10,'Dafni','Tzoumerka','1995-06-21',2500),(11,'Thalia','Mpoylh','1996-08-06',2500),(12,'Alexandra','Mylonakh','1997-09-22',2500),(13,'Xara','Bouranta','1998-11-08',2500),(14,'Stauros','Stayrinidis','1999-12-25',2500),(15,'Christina','Bardari','2001-02-09',2500),(16,'Rosalinta','Maikious','2002-03-28,',2500),(17,'Poluxenh','Fteropoulou','2003-05-14',2500),(18,'Barbara','Mhtropoulou','2004-06-29',2500),(19,'Tasos','Trelopoulos','2005-08-15',2500),(20,'Malvina','Harakia','2006-10-01',2500),(21,'greg','red','22/06/1988',2500),(22,'makis','mpour','22/06/1988',2500);
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `trainer`
--

DROP TABLE IF EXISTS `trainer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `trainer` (
  `trainer_id` int(11) NOT NULL AUTO_INCREMENT,
  `trainer_first_name` varchar(45) NOT NULL,
  `trainer_last_name` varchar(45) NOT NULL,
  `trainer_subject` varchar(45) NOT NULL,
  PRIMARY KEY (`trainer_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `trainer`
--

LOCK TABLES `trainer` WRITE;
/*!40000 ALTER TABLE `trainer` DISABLE KEYS */;
INSERT INTO `trainer` VALUES (1,'Nikos','Aggelopoulos','JAVA'),(2,'Giannis','Papafilipoy','C#'),(3,'Antreas','Delapontes','HTML'),(4,'Argyris','Pagidas','SQL'),(5,'Giorgos','Alexandrou','SPRING'),(6,'Greg','Red','Java');
/*!40000 ALTER TABLE `trainer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'privateschool'
--

--
-- Dumping routines for database 'privateschool'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-12-20 21:25:18
