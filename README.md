# TallerSOLID
La clase de Helado y Pastel al tener métodos y atributos en común por lo tanto se debe hacer una clase padre que contenga esos métodos y atributos para que la clase Helado y Pastel hereden de este y a la vez esa super clase y subclases cumplen con el principio de sustitución de Liskov.
Se rompe el principio de independencia en la clase OperacionesAdereso ya que esta depende de las clases Pastel y Helado por lo tanto depende principalmente de Postre, por lo tanto para solucionarlo se elimina la clase OperacionesAdereso y sus métodos migran a Pastel.
