fun main() {
    // Solicita dos números al usuario
    print("Introduce el primer número: ")
    val num1 = readLine()?.toIntOrNull() ?: 
    print("Introduce el segundo número: ")
    val num2 = readLine()?.toIntOrNull() ?: 
    
    // Realiza la suma
    val suma = num1 + num2
    println("La suma de $num1 y $num2 es: $suma")
}
