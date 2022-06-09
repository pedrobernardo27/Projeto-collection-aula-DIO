package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1000.0,2250.0,4000.0,6000.0)

    for(salario in salarios){
        println(salario)
    }
    println("-----------------------------------")

    println(salarios.average())
    val salarioMaior = salarios.filter { it > 2500.0 }
    salarioMaior.forEach{
        println(it)
    }
}