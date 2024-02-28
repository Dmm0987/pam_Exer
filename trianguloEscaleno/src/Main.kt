
import kotlin.math.sqrt

fun main() {
    print("lado A: ")
    val ladoA = readLine()!!.toDouble()
    print("lado B: ")
    val ladoB = readLine()!!.toDouble()
    print("lado C: ")
    val ladoC = readLine()!!.toDouble()
    triangulo(ladoA, ladoB, ladoC)
}

fun triangulo(ladoA: Double, ladoB: Double, ladoC: Double) {
    val s = (ladoA + ladoB + ladoC) / 2
    val area = sqrt(s * (s - ladoA) * (s - ladoB) * (s -ladoC))
    println("A area do triangulo Escaleno é: $area")
}