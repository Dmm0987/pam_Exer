//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
const val PI = 3.141592653589793

fun calcula(raio: Double): Double {
    return PI * raio * raio
}

fun main() {
    print("Insira o raio da circuferencia: ")
    val raio = readLine()!!.toDouble()
    val area = calcula(raio)
    println("a area da circuferencia com um raio de $raio is: $area")
}
