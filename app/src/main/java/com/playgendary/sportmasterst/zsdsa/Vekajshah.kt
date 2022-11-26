package com.playgendary.sportmasterst.zsdsa

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import com.playgendary.sportmasterst.databinding.ActivityVekajshahBinding
import kotlin.random.Random

class Vekajshah : AppCompatActivity() {
    var ksaldssdlk = ""
    private lateinit var ksdjasdiasd : ActivityVekajshahBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ksdjasdiasd = ActivityVekajshahBinding.inflate(layoutInflater)
        setContentView(ksdjasdiasd.root)
        ldsosdksdajsdj()

    }



    @SuppressLint("ClickableViewAccessibility")
    private fun ldsosdksdajsdj() = with(ksdjasdiasd){
        val yssdgyas = View.OnTouchListener(function = { view, cjsksal->
            if(cjsksal.action == MotionEvent.ACTION_MOVE){
                view.x = cjsksal.rawX - view.width/2
                view.y = cjsksal.rawY - view.height/2
                val wpslasdd = IntArray(2)
                val xjchsakdsa = IntArray(2)
                val splslsd = IntArray(2)
                zlxkcx.getLocationOnScreen(wpslasdd)
                lbkbkbkbk.getLocationOnScreen(xjchsakdsa)
                opsopdsasodkjd.getLocationOnScreen(splslsd)
                val zoxpckcxz = view.x.toInt()
                val iejdiasjasd = view.y.toInt()

                if(zoxpckcxz == wpslasdd[0] || iejdiasjasd == wpslasdd[1] ){
                    ksdjasdiasd.zlxkcx.visibility = View.GONE
                    ksaldssdlk = Kijhdsa.nhnygbngybn[Random.nextInt(6)]
                    xjkxncz.text = ksaldssdlk
                }

                if(zoxpckcxz == xjchsakdsa[0] || iejdiasjasd == xjchsakdsa[1] ){
                    ksdjasdiasd.lbkbkbkbk.visibility = View.GONE
                    ksaldssdlk = Kijhdsa.nhnygbngybn[Random.nextInt(6)]
                    xjkxncz.text = ksaldssdlk
                }

                if(zoxpckcxz == splslsd[0] || iejdiasjasd == splslsd[1] ){
                    ksdjasdiasd.opsopdsasodkjd.visibility = View.GONE
                    ksaldssdlk = Kijhdsa.nhnygbngybn[Random.nextInt(6)]
                    xjkxncz.text = ksaldssdlk
                }

                if(zlxkcx.visibility == View.GONE && lbkbkbkbk.visibility == View.GONE&& opsopdsasodkjd.visibility == View.GONE){
                    startActivity(Intent(this@Vekajshah,Ftyasu::class.java)
                        .putExtra("res_fb",ksaldssdlk)
                    )
                }

            }

            true
        })
        lspddosasod.setOnTouchListener(yssdgyas)
    }
}