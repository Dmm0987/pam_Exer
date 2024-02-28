//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import kotlin.math.sqrt

fun main() {

    print("Insira o comprimento dos lados: ")
    val lados = readLine()!!.toDouble()

    print("Insira a base: ")
    val base = readLine()!!.toDouble()

    val baseM = base / 2
    val altura = sqrt(lados * lados - baseM * baseM)

    val area = base * altura
    println("A area do triangulo Isoceles é: $area")
}