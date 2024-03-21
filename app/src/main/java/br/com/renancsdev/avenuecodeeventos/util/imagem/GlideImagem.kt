package br.com.renancsdev.avenuecodeeventos.util.imagem

import android.content.Context
import android.widget.ImageView
import br.com.renancsdev.avenuecodeeventos.R
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions

class GlideImagem {

    fun show(context: Context, url: String, imagem: ImageView){
        Glide.with(context)
            .load(url)
            .apply(RequestOptions.bitmapTransform(RoundedCorners(10) ))
            .error(R.drawable.img404)
            .override(500,500)
            .into(imagem)
    }

}