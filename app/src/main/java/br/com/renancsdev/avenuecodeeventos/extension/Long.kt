package br.com.renancsdev.avenuecodeeventos.extension

import java.text.SimpleDateFormat

fun Long.convertLongToTime(): String {
    return SimpleDateFormat("dd/MM/yyyy").format(this)
}


