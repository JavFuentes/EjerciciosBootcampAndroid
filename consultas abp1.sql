USE abp1;

/*
Se insertan 10 registros.
*/
INSERT INTO ventas (comprador, vendedor, cantidad_articulos, subtotal) VALUES
('giordano bruno','mateo iscariote', 3, 1300),
('giovanni','maria', 1, 1600),
('luca brassi','mateo iscariote ', 80, 1660),
('andrea pirlo','anna hooper', 23, 2060),
('sonia garrido','mateo iscariote', 1, 5600),
('lucas','mateo iscariote', 20, 320),
('davide','mateo iscariote', 20, 230),
('beatrice alighieri','anna', 10, 8880),
('laura contadini','maria', 8, 190),
('chiara fuentes','valentina tadeo', 1, 900);

/*
Se calcula el impuesto y el total.
*/
UPDATE ventas SET impuesto = subtotal * 0.19, total = subtotal + impuesto;

/*
Una consulta que permita obtener todos los registros de la tabla tales que la 
cantidad de artículos sea mayor que 2, devolviendo todos sus campos.
*/
SELECT id_ventas, comprador, vendedor, cantidad_articulos, subtotal, impuesto, total FROM ventas
WHERE cantidad_articulos > 2;

/*
Una consulta que permita obtener todos los registros de la tabla tales que el subtotal sea
menor que 1000, desplegando solo el ID de venta, el comprador y la cantidad de artículos.
*/
SELECT id_ventas, comprador, cantidad_articulos FROM ventas
WHERE subtotal < 1000;

/* 
Una consulta que permite obtener los registros tales que el vendedor tiene el nombre
“SONIA GARRIDO”, y que el valor total de la venta es mayor o igual a 5000. Debe indicar
todos los campos de la tabla, pero en orden inverso al que se indica en la figura.
*/
SELECT subtotal, cantidad_articulos, vendedor, comprador FROM ventas WHERE vendedor = 'sonia garrido' AND total >= 5000;

/*
Una consulta que retorne los registros de la tabla tales que el comprador es “LUCAS”, o bien
que el vendedor es “MARIA”. Despliegue solo los campos vendedor, comprador y total, en
ese orden.
*/
SELECT vendedor, comprador, total FROM ventas WHERE comprador = 'lucas' OR vendedor = 'maria';

/*
Una consulta que despliegue todos los campos de todos los registros tales que el
identificador está en el siguiente conjunto: 2,5,6 y 9.
*/
SELECT * FROM ventas WHERE id_ventas IN (2,5,6,9);

