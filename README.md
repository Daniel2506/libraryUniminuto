# libraryUniminuto
Sofware library uniminuto

** This project was developed in Java.
Pasos:
1. create project in (NetBeans or Eclipse) with name "libraryUniminuto"
2. in resource package make git pull
3. add library JDBC-Mysql 
4. run class main.java
5. create Databe biblioteca
6. import script in server MYSQL
  
**Script**
  
-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 14-09-2017 a las 01:32:48
-- Versión del servidor: 10.1.21-MariaDB
-- Versión de PHP: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `biblioteca`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bets sellers`
--

CREATE TABLE `bets sellers` (
  `id_libro_bets` int(50) NOT NULL,
  `titulo` varchar(100) NOT NULL,
  `autor` varchar(50) NOT NULL,
  `editorial` varchar(100) NOT NULL,
  `cantidad` int(100) NOT NULL,
  `tiempo_limite` int(1) NOT NULL,
  `estado` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `bets sellers`
--

INSERT INTO `bets sellers` (`id_libro_bets`, `titulo`, `autor`, `editorial`, `cantidad`, `tiempo_limite`, `estado`) VALUES
(11, 'juego de tronos', 'ivan ', 'santillana ', 20, 1, 0),
(12, '50 sombras de ted ', 'ted', 'santillana', 5, 1, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `devoluciones`
--

CREATE TABLE `devoluciones` (
  `id_libro` int(50) NOT NULL,
  `id_usuario` int(50) NOT NULL,
  `id_prestamo` int(50) NOT NULL,
  `fecha_entrega` date NOT NULL,
  `id_devolucion` int(50) NOT NULL,
  `id_multimedia` int(50) NOT NULL,
  `id_libro_best` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `devoluciones`
--

INSERT INTO `devoluciones` (`id_libro`, `id_usuario`, `id_prestamo`, `fecha_entrega`, `id_devolucion`, `id_multimedia`, `id_libro_best`) VALUES
(111, 123698, 11, '2017-09-11', 8, 111111, 11);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `libros`
--

CREATE TABLE `libros` (
  `id_libros` int(50) NOT NULL,
  `titulo` varchar(100) NOT NULL,
  `autor` varchar(50) NOT NULL,
  `editorial` varchar(100) NOT NULL,
  `cantidad` int(100) NOT NULL,
  `tiempo_limite` int(3) NOT NULL,
  `estado` int(1) NOT NULL,
  `referencia` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `libros`
--

INSERT INTO `libros` (`id_libros`, `titulo`, `autor`, `editorial`, `cantidad`, `tiempo_limite`, `estado`, `referencia`) VALUES
(111, 'metamorfosis', 'eduardo', 'zamora', 10, 3, 0, 'no'),
(112, 'diccionario medico', 'medico', 'zamora', 5, 3, 0, 'no'),
(122, 'principito', 'carlos', 'zamora', 10, 3, 0, 'no'),
(222, 'algebra', 'baldor', 'zamora', 20, 3, 0, 'no'),
(223, 'calculo diferencial', 'jose francisco', 'santillana', 5, 3, 0, 'si'),
(233, 'ecuaciones diferenciales', 'francisco ', 'santillana', 5, 3, 0, 'si'),
(333, 'programacion basica', 'carlos', 'zamora', 5, 3, 0, 'no'),
(5555, 'estrellitas ninjas', 'cristhian', 'cristhian s.a', 10, 3, 0, 'no'),
(12345, 'Titulo1', 'Autor1', 'editorial1', 5, 3, 1, 'no'),
(123456, 'titulo1', 'Autor1', 'editorial1', 3, 3, 1, 'referencia1');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `multa`
--

CREATE TABLE `multa` (
  `id_multa` int(50) NOT NULL,
  `id_usuario` int(50) NOT NULL,
  `id_devolucion` int(50) NOT NULL,
  `valor_multa` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `multa`
--

INSERT INTO `multa` (`id_multa`, `id_usuario`, `id_devolucion`, `valor_multa`) VALUES
(3, 123698, 8, 2000);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `multimedia`
--

CREATE TABLE `multimedia` (
  `id_multimedia` int(50) NOT NULL,
  `titulo` varchar(100) NOT NULL,
  `cantidad` int(100) NOT NULL,
  `tiempo_limite` int(2) NOT NULL,
  `estado` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `multimedia`
--

INSERT INTO `multimedia` (`id_multimedia`, `titulo`, `cantidad`, `tiempo_limite`, `estado`) VALUES
(111111, 'pelicula señor de los pitillos', 30, 2, 0),
(111112, 'cancion mago de oz ', 40, 2, 0),
(111122, 'batman', 30, 2, 0),
(111222, 'molinos de viento', 40, 2, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `prestamo`
--

CREATE TABLE `prestamo` (
  `id_prestamo` int(50) NOT NULL,
  `id_usuario` int(50) NOT NULL,
  `fecha_salida` date NOT NULL,
  `fecha_entrega` date NOT NULL,
  `id_libro` int(50) NOT NULL,
  `id_multimedia` int(50) NOT NULL,
  `id_libro_best` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `prestamo`
--

INSERT INTO `prestamo` (`id_prestamo`, `id_usuario`, `fecha_salida`, `fecha_entrega`, `id_libro`, `id_multimedia`, `id_libro_best`) VALUES
(11, 123698, '2017-09-10', '2017-09-14', 122, 111111, 12),
(12, 123698, '2017-09-07', '2017-09-10', 233, 111111, 11),
(13, 987563, '2017-09-01', '2017-09-05', 222, 111122, 12);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `revista`
--

CREATE TABLE `revista` (
  `id_revista` int(50) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `editorial` varchar(100) NOT NULL,
  `cantidad` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `revista`
--

INSERT INTO `revista` (`id_revista`, `nombre`, `editorial`, `cantidad`) VALUES
(11111, 'motor', 'santillana ', 5),
(11112, 'milenio', 'milenio ', 10),
(11122, 'planeta', 'zantillana', 10),
(11222, 'investigacion', 'cromo', 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `nombre` varchar(50) NOT NULL,
  `direccion` varchar(100) NOT NULL,
  `telefono` varchar(50) NOT NULL,
  `fecha_nacimiento` date NOT NULL,
  `numero_tarjeta` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`nombre`, `direccion`, `telefono`, `fecha_nacimiento`, `numero_tarjeta`) VALUES
('yesid', 'asdfghgfd', '1234567', '1994-05-23', 89564895);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `bets sellers`
--
ALTER TABLE `bets sellers`
  ADD PRIMARY KEY (`id_libro_bets`),
  ADD KEY `titulo` (`titulo`),
  ADD KEY `autor` (`autor`),
  ADD KEY `editorial` (`editorial`),
  ADD KEY `cantidad` (`cantidad`),
  ADD KEY `tiempo_limite` (`tiempo_limite`),
  ADD KEY `estado` (`estado`);

--
-- Indices de la tabla `devoluciones`
--
ALTER TABLE `devoluciones`
  ADD PRIMARY KEY (`id_devolucion`),
  ADD KEY `id_libro` (`id_libro`),
  ADD KEY `id_usuario` (`id_usuario`),
  ADD KEY `id_prestamo` (`id_prestamo`),
  ADD KEY `fecha_entrega` (`fecha_entrega`),
  ADD KEY `id_multimedia` (`id_multimedia`),
  ADD KEY `id_libro_best` (`id_libro_best`);

--
-- Indices de la tabla `libros`
--
ALTER TABLE `libros`
  ADD PRIMARY KEY (`id_libros`),
  ADD KEY `titulo` (`titulo`),
  ADD KEY `autor` (`autor`),
  ADD KEY `autor_2` (`autor`),
  ADD KEY `editorial` (`editorial`),
  ADD KEY `cantidad` (`cantidad`),
  ADD KEY `tiempo_limite` (`tiempo_limite`),
  ADD KEY `estado` (`estado`);

--
-- Indices de la tabla `multa`
--
ALTER TABLE `multa`
  ADD PRIMARY KEY (`id_multa`),
  ADD KEY `id_usuario` (`id_usuario`),
  ADD KEY `id_devolucion` (`id_devolucion`),
  ADD KEY `valor_multa` (`valor_multa`);

--
-- Indices de la tabla `multimedia`
--
ALTER TABLE `multimedia`
  ADD PRIMARY KEY (`id_multimedia`),
  ADD KEY `titulo` (`titulo`),
  ADD KEY `cantidad` (`cantidad`),
  ADD KEY `tiempo_limite` (`tiempo_limite`),
  ADD KEY `estado` (`estado`);

--
-- Indices de la tabla `prestamo`
--
ALTER TABLE `prestamo`
  ADD PRIMARY KEY (`id_prestamo`),
  ADD KEY `id_usuario` (`id_usuario`),
  ADD KEY `fecha_salida` (`fecha_salida`),
  ADD KEY `fecha_entrega` (`fecha_entrega`),
  ADD KEY `id_libro` (`id_libro`),
  ADD KEY `id_multimedia` (`id_multimedia`),
  ADD KEY `id_libro_best` (`id_libro_best`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`numero_tarjeta`),
  ADD KEY `nombre` (`nombre`),
  ADD KEY `direccion` (`direccion`),
  ADD KEY `telefono` (`telefono`),
  ADD KEY `fecha_nacimiento` (`fecha_nacimiento`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `devoluciones`
--
ALTER TABLE `devoluciones`
  ADD CONSTRAINT `devoluciones_ibfk_1` FOREIGN KEY (`id_libro`) REFERENCES `libros` (`id_libros`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `devoluciones_ibfk_2` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`numero_tarjeta`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `devoluciones_ibfk_3` FOREIGN KEY (`id_multimedia`) REFERENCES `multimedia` (`id_multimedia`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `devoluciones_ibfk_4` FOREIGN KEY (`id_prestamo`) REFERENCES `prestamo` (`id_prestamo`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `devoluciones_ibfk_5` FOREIGN KEY (`id_libro_best`) REFERENCES `bets sellers` (`id_libro_bets`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `multa`
--
ALTER TABLE `multa`
  ADD CONSTRAINT `multa_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`numero_tarjeta`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `multa_ibfk_2` FOREIGN KEY (`id_devolucion`) REFERENCES `devoluciones` (`id_devolucion`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `prestamo`
--
ALTER TABLE `prestamo`
  ADD CONSTRAINT `prestamo_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`numero_tarjeta`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `prestamo_ibfk_2` FOREIGN KEY (`id_libro`) REFERENCES `libros` (`id_libros`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `prestamo_ibfk_3` FOREIGN KEY (`id_multimedia`) REFERENCES `multimedia` (`id_multimedia`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `prestamo_ibfk_4` FOREIGN KEY (`id_libro_best`) REFERENCES `bets sellers` (`id_libro_bets`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

  


