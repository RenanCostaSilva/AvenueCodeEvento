package br.com.renancsdev.avenuecodeeventos.extension

import android.content.Context
import android.content.Intent
import br.com.renancsdev.avenuecodeeventos.ui.activity.DetalheEvento

fun Context.redDetalheComID(id: Int ){
    this.startActivity(Intent(this , DetalheEvento::class.java).putExtra("id" , id))
}