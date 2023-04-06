-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 06, 2023 at 01:39 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cooking_recipes`
--

-- --------------------------------------------------------

--
-- Table structure for table `chefs`
--

CREATE TABLE `chefs` (
  `chef_id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `chefs`
--

INSERT INTO `chefs` (`chef_id`, `name`) VALUES
(1, 'Jamie Oliver'),
(2, 'Gino D\'Acampo'),
(3, 'Gordon Ramsay'),
(4, 'Lisa Faulker');

-- --------------------------------------------------------

--
-- Table structure for table `recipe`
--

CREATE TABLE `recipe` (
  `recipe_id` int(11) NOT NULL,
  `image` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `text` text DEFAULT NULL,
  `chef_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `recipe`
--

INSERT INTO `recipe` (`recipe_id`, `image`, `name`, `text`, `chef_id`) VALUES
(1, 'sausagePasta', 'Jamie Oliver\'s sausage pasta', '350 g broccoli,\n4 higher-welfare chipolata sausages,\n1-2 fresh red chillies,\nolive oil\n2 teaspoons fennel seeds,\n4 cloves of garlic,\n2 onions,\n½ a bunch of fresh oregano , (15g)\n2 tablespoons red wine vinegar,\n1 x 400 g tin of plum tomatoes, 300 g dried wholewheat tagliatelle,\n40 g Parmesan cheese', 1),
(2, 'chocolateTart', 'Lisa’s chocolate and almond tart', 'Pastry ingredients,\n\n200g plain flour,\n\n50g ground almonds,\n\n120g cold butter, diced\n\n1 egg, separated,\n\nA good pinch of salt,\n\n1 tsp water,\n\nFilling ingredients\n\n250g plain chocolate,\n\n250ml double cream,\n\n2 eggs, separated\n\n80g golden caster sugar\n\n1 tsp vanilla extract\n\n1 tbsp Amaretto (optional)\n\nHandful crushed amaretti biscuits, plus extra to serve\n\nServing suggestions\n\n350ml crème fraîche, frozen in quenelles\n\nDessert wine', 4);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `chefs`
--
ALTER TABLE `chefs`
  ADD PRIMARY KEY (`chef_id`);

--
-- Indexes for table `recipe`
--
ALTER TABLE `recipe`
  ADD PRIMARY KEY (`recipe_id`),
  ADD KEY `FKda8lce93vbkh0m4b4wiidjwxf` (`chef_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `chefs`
--
ALTER TABLE `chefs`
  MODIFY `chef_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `recipe`
--
ALTER TABLE `recipe`
  MODIFY `recipe_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `recipe`
--
ALTER TABLE `recipe`
  ADD CONSTRAINT `FK1i6yhdr3kh22itomj8fp0ecg5` FOREIGN KEY (`recipe_id`) REFERENCES `chefs` (`chef_id`),
  ADD CONSTRAINT `FKda8lce93vbkh0m4b4wiidjwxf` FOREIGN KEY (`chef_id`) REFERENCES `chefs` (`chef_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
