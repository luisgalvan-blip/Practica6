# Practica 6

Descripción general

Este proyecto consiste en la representación visual de cartas utilizando clases en Java. 
Se implementa una clase para manejar posiciones en pantalla y otra para visualizar cartas de manera gráfica.

---

Clase `Posicion`

La clase `Posicion` se utiliza para representar una coordenada en el plano, es decir, un punto con valores **x** y **y**.

Atributos

* `x`: coordenada horizontal
* `y`: coordenada vertical

Métodos principales

* `getX()` → devuelve el valor de x
* `getY()` → devuelve el valor de y
* `setX(int x)` → cambia el valor de x
* `setY(int y)` → cambia el valor de y
* `toString()` → devuelve la posición en formato `(x, y)`

¿Para qué sirve?

Sirve para indicar en qué lugar de la pantalla se va a dibujar una carta.

---

Clase `Visualizador`

La clase `Visualizador` se encarga de mostrar gráficamente una carta en pantalla.

Método principal

* `carta(Carta c, Posicion p)`

Este método es **estático**, lo que significa que no es necesario crear un objeto para usarlo.

¿Qué hace este método?

1. Crea un cuadrado (`Square`) que representa el fondo de la carta
2. Cambia su posición usando los valores de `Posicion`
3. Cambia el color dependiendo del tipo de carta:

   * Rojo → corazones o diamantes
   * Negro → otros tipos
4. Dibuja un círculo (`Circle`) en el centro como parte del diseño
5. Muestra información de la carta en consola

---

Relación entre clases

* `Visualizador` utiliza `Posicion` para saber dónde dibujar
* También utiliza otras clases como:

  * `Carta`
  * `Square`
  * `Circle`

---

Conclusión

En este proyecto:

* `Posicion` ayuda a manejar coordenadas
* `Visualizador` usa esas coordenadas para mostrar cartas en pantalla

Esto permite separar la lógica de posición y la parte visual, haciendo el código más organizado y fácil de entender.

Autor
Luis Galván
