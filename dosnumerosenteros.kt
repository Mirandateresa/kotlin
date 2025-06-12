**Realizar la carga de dos números enteros por teclado e imprimir su suma y su producto.**
fun main(argumento: Array<String>) {
 print("Ingrese primer valor:")
 val valor1 = readln().toInt()
 print("Ingrese segundo valor:")
 val valor2 = readln().toInt()
 val suma = valor1 + valor2
 println("La suma de $valor1 y $valor2 es $suma")
 val producto = valor1 * valor2
 println("El producto de $valor1 y $valor2 es $producto")
}
