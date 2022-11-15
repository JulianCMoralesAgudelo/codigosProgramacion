-- CREATE SCHEMA `platzi_java_se` DEFAULT CHARACTER SET utf8 DEFAULT COLLATE utf8_general_ci;
ALTER SCHEMA `platzi_java_se` DEFAULT CHARACTER SET utf8 DEFAULT COLLATE utf8_general_ci;

CREATE TABLE `platzi_java_se`.`material` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `platzi_java_se`.`material` (`id`, `name`) VALUES (1, 'movie'), (2, 'serie'), (3, 'chapter'), (4, 'book'), (5, 'magazine');

CREATE TABLE `platzi_java_se`.`movie` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) NOT NULL,
  `genre` varchar(255) NOT NULL,
  `creator` varchar(255) NOT NULL,
  `duration` int(11) NOT NULL,
  `year` int(11) NOT NULL,
  PRIMARY KEY (`id`)) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `platzi_java_se`.`movie` (`id`, `title`, `genre`, `creator`, `duration`, `year`) VALUES
(6, 'Coco', 'Animación', 'Pixart', 120, 2017),
(7, 'Titanic', 'Drama', 'James Cameron', 195, 1997),
(8, 'Avatar', 'Ficción', 'James Cameron', 161, 2009),
(9, 'Amélie', 'Romance', 'Jean-Pierre Jeunet', 123, 2001),
(10, 'Sombra del Agua', 'Drama-Fantasía', 'Guillermo del Toro', 123, 2017);

CREATE TABLE `platzi_java_se`.`user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `platzi_java_se`.`user` (`id`, `username`) VALUES (1, 'ann'), (2, 'cdram');

CREATE TABLE `platzi_java_se`.`viewed` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_material` int(11) NOT NULL,
  `id_element` int(11) NOT NULL,
  `id_user` int(11) NOT NULL,
  PRIMARY KEY (`id`)) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `platzi_java_se`.`viewed` (`id`, `id_material`, `id_element`, `id_user`) VALUES (1, 1, 6, 2);
INSERT INTO `platzi_java_se`.`viewed` (`id`, `id_material`, `id_element`, `id_user`) VALUES (2, 1, 10, 2);

ALTER TABLE `platzi_java_se`.`viewed` ADD COLUMN `datetime` DATETIME NOT NULL AFTER `id_user`;