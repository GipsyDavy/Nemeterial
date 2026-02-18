CREATE TABLE IF NOT EXISTS `Camaras Fotos` (
    `id_camaras` INT NOT NULL AUTO_INCREMENT,
    `Marca / Modelo` VARCHAR(255) DEFAULT NULL,
    PRIMARY KEY (`id_camaras`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE IF NOT EXISTS `Telefonos` (
    `id_tlf` INT NOT NULL AUTO_INCREMENT,
    `Marca / Modelo` VARCHAR(255) DEFAULT NULL,
    `Numero` BIGINT DEFAULT NULL COMMENT 'Usar BIGINT para números de teléfono largos',
    PRIMARY KEY (`id_tlf`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE IF NOT EXISTS `Usuarios` (
    `id_usuarios` INT NOT NULL AUTO_INCREMENT,
    `Apellidos` VARCHAR(255) DEFAULT NULL,
    `Nombre` VARCHAR(255) DEFAULT NULL,
    `DNI` VARCHAR(20) DEFAULT NULL,  -- 20 es suficiente para DNI con letra
    PRIMARY KEY (`id_usuarios`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE IF NOT EXISTS `Vehiculos` (
    `id_vehiculos` INT NOT NULL AUTO_INCREMENT,
    `Marca` VARCHAR(100) DEFAULT NULL,
    `Modelo` VARCHAR(100) DEFAULT NULL,
    `Matricula` VARCHAR(20) DEFAULT NULL,
    PRIMARY KEY (`id_vehiculos`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Insert de ejemplo corregido
INSERT INTO `Usuarios` (`id_usuarios`, `Apellidos`, `Nombre`, `DNI`)
VALUES (1, 'Abad Garcia', 'Juan Antonio', '44.444.444-G');
