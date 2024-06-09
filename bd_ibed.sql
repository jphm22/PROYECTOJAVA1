-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 25-05-2024 a las 15:10:53
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.1.17

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bd_ibed`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

CREATE TABLE `empleado` (
  `codigo` varchar(30) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `apellido` varchar(30) NOT NULL,
  `cargo` varchar(30) NOT NULL,
  `turno` varchar(30) NOT NULL,
  `dni_huesped` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `empleado`
--

INSERT INTO `empleado` (`codigo`, `nombre`, `apellido`, `cargo`, `turno`, `dni_huesped`) VALUES
('123', 'yerson', 'caceres', 'GERENTE', 'MA?ANA ', '456'),
('567', 'yampier', 'caceres', 'GERENTE', 'TARDE ', '6544'),
('98776', 'karina', 'caceres', 'RECEPSIONISTA ', 'NOCHE', '9665'),
('654', 'david', 'caceres', 'SUPERVISOR', 'TARDE ', '4455'),
('', '', '', 'Seleccione Cargo', 'Seleccione Turno', ''),
('', '', '', 'Seleccione Cargo', 'Seleccione Turno', ''),
('234', 'Felipe', 'Carlos', 'GERENTE', 'TARDE ', '544554'),
('344', 'drev', 'ererve', 'SUPERVISOR', 'TARDE ', '33434'),
('', '', '', 'SUPERVISOR', 'TARDE ', ''),
('123123', 'maicol', 'veles', 'SUPERVISOR', 'NOCHE', '54321'),
('123345', 'berta', 'caceres', 'RECEPSIONISTA ', 'NOCHE', '1233'),
('01234', 'marta', 'chavez', 'GERENTE', 'TARDE ', '0987'),
('71479228', 'YERSON', 'CACERES CARI', 'GERENTE', 'TARDE ', '2921749'),
('1234', 'aaa', 'bbb', 'RECEPSIONISTA ', 'TARDE ', '1234'),
('', '', '', 'Seleccione Cargo', 'Seleccione Turno', ''),
('1234', 'qwe', 'asd', 'SUPERVISOR', 'TARDE ', '4321'),
('1223', 'qwwe', 'assd', 'GERENTE', 'TARDE ', '1223'),
('1223', 'caser', 'assd', 'GERENTE', 'TARDE ', '1223'),
('1231', 'DSFSDV', 'FDBDB', 'RECEPSIONISTA ', 'NOCHE', '32525'),
('124', 'yampier', 'caceres', 'GERENTE', 'MA?ANA ', '223423'),
('63524', 'alex', 'caceres', 'SUPERVISOR', 'NOCHE', '743884'),
('62352', 'alex', 'cares', 'SUPERVISOR', 'TARDE ', '73123'),
('1212', 'Yerson', 'Caceres', 'RECEPSIONISTA ', 'MA?ANA ', '7632131');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura`
--

CREATE TABLE `factura` (
  `numero_dias` int(11) NOT NULL,
  `tipo_habitacion` varchar(30) NOT NULL,
  `precio` float NOT NULL,
  `fecha_entrada` varchar(30) NOT NULL,
  `fecha_salida` varchar(30) NOT NULL,
  `total` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `factura`
--

INSERT INTO `factura` (`numero_dias`, `tipo_habitacion`, `precio`, `fecha_entrada`, `fecha_salida`, `total`) VALUES
(2, 'e', 10, '', '', 0),
(2, 'eco', 50, '', '', 0),
(2, 'eco', 10, '', '', 0),
(3, 'barata', 15, '', '', 0),
(5, 'tata', 10, '', '', 0),
(2, 'economica', 13, '', '', 0),
(5, 're', 10, '', '', 0),
(2, 'e', 23, '', '', 0),
(4, 'renta', 10, '', '', 0),
(1, 'retgf', 40, '', '', 0),
(5, 'economica', 10, '', '', 0),
(2, 'economica', 31, '', '', 0),
(2, 're', 16, '', '', 0),
(2, '4', 10.5, '', '', 0),
(3, 'tercio', 10, '', '', 0),
(3, 'economica', 15.5, '', '', 0),
(3, 'economica', 15.5, '', '', 0),
(2, 'A', 10, '', '', 0),
(2, 'A', 10, '', '', 0),
(2, 'A', 10, '', '', 0),
(3, 'C', 30, '', '', 0),
(1, 'A', 10, '', '', 0),
(3, 'B', 20, '', '', 0),
(2, 'B', 20, '', '', 0),
(1, 'B', 20, '', '', 0),
(10, 'A', 10, '', '', 0),
(3, 'B', 20, '', '', 0),
(1, 'A', 10, '', '', 0),
(1, 'A', 10, '', '', 0),
(1, 'B', 20, '', '', 0),
(12, 'A', 10, '', '', 0),
(3, 'B', 20, '', '', 0),
(2, 'A', 10, '', '', 0),
(1, 'A', 10, '', '', 0),
(1, 'A', 10, '', '', 0),
(2, 'A', 10, '2/2/2', '', 0),
(2, 'A', 10, '2/2/2', '', 0),
(1, 'C', 30, '4/4/4', '', 0),
(1, 'A', 10, '1/1/', '', 0),
(1, 'A', 10, '1/1/1', '', 0),
(1, 'A', 10, '1/1/1', '', 0),
(3, 'C', 30, '3/3/3', '4/4/4', 90),
(10, 'B', 20, '1/1/2024', '11/1/2024', 200),
(10, 'A', 10, '1/1/2024', '11/1/2024', 100),
(3, 'B', 20, '1/1/2024', '4/1/2024', 60),
(3, 'C', 30, '1/1/2024', '4/1/2024', 90),
(1, 'Vip', 50, '1/1/2024', '2/1/2024', 50),
(2, 'Vip', 50, '22/05/2024', '24/05/2024', 100);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `huesped`
--

CREATE TABLE `huesped` (
  `nombre` varchar(30) NOT NULL,
  `apellido` varchar(30) NOT NULL,
  `dni` varchar(30) NOT NULL,
  `edad` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `huesped`
--

INSERT INTO `huesped` (`nombre`, `apellido`, `dni`, `edad`) VALUES
('carlos', 'caceres', '123', '33'),
('wilde', 'caceres casilla', '12144545', '40'),
('', '', '', ''),
('', '', '', ''),
('alicia', 'casilla', '123124', '44'),
('renzo', 'rese', 'der', '22'),
('camisama', 'tevez', '9087', '11'),
('aaa', 'bbb', '1234', '1'),
('qaz', 'wsx', '123', '22'),
('edc', 'rfv', '455', '11'),
('wefwe', 'sfwe', '1231', '5353'),
('egerber', 'tmtyuyt', '32552', '99'),
('etgrrg', 'ergetheh', '124124', '1'),
('wegwg', 'wegerh', '23424', '2'),
('esteban', 'tata', '5678', '10'),
('chi', 'cho', '34', '1'),
('1', '1', '1', '1'),
('jevin', 'quispe', '78742488', '21'),
('kevin', 'quispe', '7342246', '22'),
('', '', '', ''),
('eeee', 'eeee', '222222', '3333333333'),
('', '', '', ''),
('eee', 'eee', '333', '33'),
('Jhan Pool', 'Huayre', '76131313', '50');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
