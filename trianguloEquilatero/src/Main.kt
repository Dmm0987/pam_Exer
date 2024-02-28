//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import kotlin.math.sqrt //Kotlin.math Importa as funções matematicas basicas
                        //importa o pacote sqrt para não ter a necessidade de escrever o pacote completo

fun main() {
    print("Coloque o lado do Triângulo: ")
    val lado = readLine()!!.toDouble()

    val area = (sqrt(3.0) / 4.0) * lado * lado
    println("A sua area é de: $area")
}