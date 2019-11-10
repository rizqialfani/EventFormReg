-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 10, 2019 at 09:46 AM
-- Server version: 10.4.6-MariaDB
-- PHP Version: 7.3.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `peserta2019`
--

-- --------------------------------------------------------

--
-- Table structure for table `peserta2019`
--

CREATE TABLE `peserta2019` (
  `noreg` int(14) NOT NULL,
  `nama` varchar(36) NOT NULL,
  `nim` bigint(14) NOT NULL,
  `gender` varchar(9) NOT NULL,
  `institusi` varchar(50) NOT NULL,
  `email` varchar(36) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `peserta2019`
--

INSERT INTO `peserta2019` (`noreg`, `nama`, `nim`, `gender`, `institusi`, `email`) VALUES
(1, 'M. Rizqi Alfani', 21120117140007, 'Laki-laki', 'Universitas Diponegoro', 'muhammadra@students.ce.undip.ac.id'),
(2, 'Muslim', 21120117140032, 'Laki-laki', 'Universitas Diponegoro', 'muslim@students.undip.ac.id'),
(3, 'Kukuh Pranata Sugiarto', 21120117120007, 'Laki-laki', 'Universitas Diponegoro', 'kukuhps@students.undip.ac.id');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `peserta2019`
--
ALTER TABLE `peserta2019`
  ADD PRIMARY KEY (`noreg`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `peserta2019`
--
ALTER TABLE `peserta2019`
  MODIFY `noreg` int(14) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
