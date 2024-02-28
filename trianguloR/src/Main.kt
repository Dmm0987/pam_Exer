//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// Version 1.2.71

fun main(args: Array<String>) {
    print("base do triângulo : ")
    val base = readLine()!!.toDouble()
    print("altura do triangulo: ")
    val altura = readLine()!!.toDouble()
    val area = (base * altura) / 2.0
    println("a area do Triângulo retangulo é $area")
}