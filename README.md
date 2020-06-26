# TallerSOLID
La clase de Helado y Pastel al tener métodos y atributos en común por lo tanto se debe hacer una clase padre que contenga esos métodos y atributos para que la clase Helado y Pastel hereden de este y a la vez esa super clase y subclases cumplen con el principio de sustitución de Liskov.
Se rompe el principio de independencia en la clase OperacionesAdereso ya que esta depende de las clases Pastel y Helado por lo tanto depende principalmente de Postre, por lo tanto para solucionarlo se elimina la clase OperacionesAdereso y sus métodos migran a Pastel.

La clase Aderezos al convertirse en abstracta cumple con el principio de inversion de dependencia porque ya no depende de los detalles de ENUM que solo eran FRUTILLA,CREMA,MALVAVISCO, sino que ahora esos tres elementos se convierten en clases y dependen de la abstraccion.
Al crear una clase para los metodos showPrecioFinal y calcularPrecioFInal se esta cumpliendo el principio Open/Close porque ManejadorDePrecios es una clase que se da para extenderla no para modificarla.
-Punto 5

La clase LecheDeslactosada, quién hereda de LecheEntera no cumplía con el principio de Liskov, ya que esta no se puede reemplazar por la clase padre, debido a que el método usarPastel() genera un error.
Para solucionar este error se sustituyeron los dos métodos usarPastel() y usarHelado() por uno solo llamado usarPostre() en LecheEntera, de tal manera que sus subclases puedan
modificar este método como deseen cumpliendo con el principio de Liskov.
