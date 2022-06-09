package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1000.0,2250.0,4000.0,6000.0)

    for(salario in salarios){
        println(salario)
    }
    println("-----------------------------------")

    println(salarios.average())

    println("-----------------------------------")
    val salarioMaior = salarios.filter { it > 2500.0 }
    salarioMaior.forEach{
        println(it)
    }
    println("-----------------------------------")

    println(salarios.count{it in 2000.0..5000.0})

    println("-----------------------------------")

    println(salarios.find{it == 2250.0})

    println("-----------------------------------")

    println(salarios.any{it == 2250.0})
}