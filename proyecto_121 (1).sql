-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-01-2025 a las 19:56:09
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `proyecto_121`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estudiantes`
--

CREATE TABLE `estudiantes` (
  `id` int(11) NOT NULL,
  `ci` bigint(20) NOT NULL,
  `nombre` varchar(100) DEFAULT NULL,
  `edad` int(11) DEFAULT NULL,
  `grado` varchar(50) DEFAULT NULL,
  `nota` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `estudiantes`
--

INSERT INTO `estudiantes` (`id`, `ci`, `nombre`, `edad`, `grado`, `nota`) VALUES
(3, 12828713, 'Cristian', 17, '1 secundaria', 55);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materias`
--

CREATE TABLE `materias` (
  `id` int(11) NOT NULL,
  `nombre_materia` varchar(100) DEFAULT NULL,
  `profesor_nombre` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `materias`
--

INSERT INTO `materias` (`id`, `nombre_materia`, `profesor_nombre`) VALUES
(2, 'Matemáticas', 'Negro jose'),
(3, 'Matemáticas', 'Negro jose'),
(4, 'Matemáticas', 'Negro jose'),
(5, 'Matemáticas', 'Negro jose'),
(6, 'Matemáticas', 'Negro jose'),
(7, 'Matemáticas', 'Negro jose'),
(8, 'Matemáticas', 'Negro jose'),
(9, 'Matemáticas', 'Negro jose'),
(10, 'Biologia', 'Fernando Lopez'),
(11, 'Matemáticas', 'Negro jose'),
(12, 'Matemáticas', 'Negro jose'),
(13, 'Matemáticas', 'Negro jose'),
(14, 'Matemáticas', 'Negro jose'),
(15, 'Matemáticas', 'Negro jose'),
(16, 'Matemáticas', 'Negro jose');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `estudiantes`
--
ALTER TABLE `estudiantes`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `ci` (`ci`);

--
-- Indices de la tabla `materias`
--
ALTER TABLE `materias`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `estudiantes`
--
ALTER TABLE `estudiantes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT de la tabla `materias`
--
ALTER TABLE `materias`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
