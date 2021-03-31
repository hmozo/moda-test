# moda-test
Technical interview (Backend developer Java)

Respuestas
  1.C
  2.A
  3.C
  4.B
  5.A
  6.A
  7.D
  8.A
  9.(see code in package moda.e9)
  10.
    a. He usado un 'stream' (secuencia de objetos con iteración interna) con la lista de todos los Employee. A cada objecto le he aplicado un 'map' (como input cada Employee, y como output el name del Employee). Luego he agrupado la lista obtenida de nombres (tipo String) en un solo String con Collectors.joining().
	b. La complejidad es O(n). Se podrían utilizar 'parallel streams', pero solo mejoraría el rendimiento si 'n' es muy alta.
