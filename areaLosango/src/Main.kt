//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun losango(d1: Double, d2: Double): Double {
    return 0.5 * d1 * d2
}

fun main(args: Array<String>){
    print("Primeira diagonal: ")
    val d1 = readLine()!!.toDouble()
    print("Segunda diagonal: ")
    val d2 = readLine()!!.toDouble()
val area = losango(d1, d2)
println("A area do losango é $area")
}