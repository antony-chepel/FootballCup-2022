package com.playgendary.sportmasterst.bhud

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import android.content.Intent
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.Dispatchers
import androidx.appcompat.app.AppCompatActivity
import com.playgendary.sportmasterst.R
import com.playgendary.sportmasterst.bhud.Hysdya.Companion.woaspdps
import com.playgendary.sportmasterst.zsdsa.Vekajshah


import kotlinx.coroutines.runBlocking

class Nebgsa : AppCompatActivity() {
    lateinit var mksahsdadhwq: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cgdsij)
        val qosapdskasdkokasd = Lojsja(applicationContext)
        mksahsdadhwq = ""

        val cjsaodokkoasdkokoads = GlobalScope.launch(Dispatchers.IO) {
            mksahsdadhwq = qosapdskasdkokasd.vlosdkdsajsdji()
        }

        runBlocking {
            cjsaodokkoasdkokoads.join()
            Log.d("jsoup status", mksahsdadhwq)
            if (mksahsdadhwq == woaspdps) {
                Intent(applicationContext, Vekajshah::class.java).also { startActivity(it) }
            } else {
                Intent(applicationContext, Bcfdgha::class.java).also { startActivity(it) }
            }
            finish()
        }
    }
}