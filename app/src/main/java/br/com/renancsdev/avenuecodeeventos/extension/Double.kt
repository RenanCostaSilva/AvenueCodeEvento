package br.com.renancsdev.avenuecodeeventos.extension

fun Double.converterFormatoMoeda(): String {
    return this.toString().replace("." , ",")
}