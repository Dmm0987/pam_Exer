
fun main(args:Array<String>){

    print("Insira a primeira base: ")
    val base1 = readLine()!!.toDouble()

    print("Insira a segunda base: ")
    val base2 = readLine()!!.toDouble()

    print("Insira a Altura: ")
    val alt = readLine()!!.toDouble()

    val area: Double = trapezoidArea(base1,base2,alt)
    println("A area do Trapezio é de: $area")
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun trapezoidArea(base1: Double, base2: Double, alt: Double): Double {
    return 0.5 * alt * (base1 + base2)
}