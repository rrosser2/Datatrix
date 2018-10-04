-- phpMyAdmin SQL Dump
-- version 4.4.15.5
-- http://www.phpmyadmin.net
--
-- Host: localhost:3306
-- Generation Time: Jan 23, 2017 at 06:43 PM
-- Server version: 5.5.49-log
-- PHP Version: 7.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `school`
--

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE IF NOT EXISTS `employee` (
  `Id` int(11) NOT NULL,
  `first_name` text NOT NULL,
  `last_name` text NOT NULL,
  `phone` text NOT NULL,
  `email` text NOT NULL,
  `skills` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`Id`, `first_name`, `last_name`, `phone`, `email`, `skills`) VALUES
(23425, 'Michelle', 'Kir', '678-322-1233', 'Kir121@gmail.com', 'Java'),
(61123, 'Don', 'Jo', '404-321-3421', 'joDon@hotmail.com', 'C++,C#,C'),
(42234, 'Boer', 'King', '201-322-1101', 'KingPo12@yahoo.com', 'HTML,CSS,Javascript'),
(21324, 'Dirr', 'Ig', '601-332-4564', 'DirIg@aol.com', 'Swift,Java,MySql'),
(34334, 'Bob', 'Brown', '911-119-9191', 'Brown121B@gmail.com', 'Pascal,Lua,Python'),
(87874, 'James', 'Kron', '322-121-4121', 'JamesK@yahoo.com', 'Perl,Ruby,Php'),
(51223, 'Rea', 'Day', '678-122-3221', 'rea232@gmail.com', 'Fortran,Cobol');

-- --------------------------------------------------------

  ALTER TABLE `employee`
  ADD PRIMARY KEY (`Id`);