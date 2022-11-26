package com.playgendary.sportmasterst.zsdsa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.playgendary.sportmasterst.databinding.ActivityFtyasuBinding

class Ftyasu : AppCompatActivity() {
    private lateinit var skdasdko : ActivityFtyasuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        skdasdko = ActivityFtyasuBinding.inflate(layoutInflater)
        setContentView(skdasdko.root)
        val cksjdai = intent.getStringExtra("res_fb")
        val wpsoaldsa = "You got $cksjdai"
        skdasdko.bjjsdj.text = wpsoaldsa
        skdasdko.cklkasd.setOnClickListener {
            startActivity(Intent(this,Vekajshah::class.java))
        }
    }
}