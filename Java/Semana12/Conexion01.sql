
-- Comenzamos con CRUD: create(insertar), read(leer), update(actualizar), delete(eliminar)
-- Listar los estudiantes (read)
SELECT * FROM estudiantes2022;
-- Insertar estudiante
INSERT INTO estudiantes2022(nombre, apellido, telefono, email) VALUES ("Juan", "Perez", "2615433453", "juan@mail.com");
-- Update (modificar)
UPDATE estudiantes2022 SET nombre="Juan Carlos", apellido="Garcia" WHERE idestudiantes2022= 1;

