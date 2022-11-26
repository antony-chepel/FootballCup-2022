package com.playgendary.sportmasterst.bhud
import java.net.HttpURLConnection
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.*
import java.lang.Exception
import android.content.Context
import java.net.URL
import android.content.Intent
import com.playgendary.sportmasterst.bhud.Hysdya.Companion.MNSHJDHJS
import androidx.appcompat.app.AppCompatActivity

import com.playgendary.sportmasterst.bhud.Hysdya.Companion.QOSIJDJIASD
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.playgendary.sportmasterst.bhud.Hysdya.Companion.wpsaolsdaasld
import com.facebook.applinks.AppLinkData
import com.orhanobut.hawk.Hawk

import com.playgendary.sportmasterst.bhud.Hysdya.Companion.ZOSLDSDOK


import com.playgendary.sportmasterst.bhud.Hysdya.Companion.bjjidsaisd

import com.playgendary.sportmasterst.databinding.ActivityMainBinding
import com.playgendary.sportmasterst.zsdsa.Vekajshah

import com.playgendary.sportmasterst.bhud.Hysdya.Companion.KSDJIDJSAIJASDKOASDKOK




class MainActivity : AppCompatActivity() {
    var zosapdlas: String = "null"
    private lateinit var cgsaydsuisoa: ActivityMainBinding
    lateinit var bnjsidjasd: String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        cgsaydsuisoa = ActivityMainBinding.inflate(layoutInflater)
        setContentView(cgsaydsuisoa.root)
        bnjsidjasd = ""

        usauhdsasdas(this)

        val mkokdsajijasd = getSharedPreferences("ActivityPREF", MODE_PRIVATE)
        if (mkokdsajijasd.getBoolean("activity_exec", false)) {

            when (Hawk.get<String>(QOSIJDJIASD)) {
                "2" -> {
                    hdyusuhdsfjjidfs()
                }
                else -> {
                    nkodkasdokdas()
                }
            }
        } else {
            val mksijdsaoasdas = mkokdsajijasd.edit()
            mksijdsaoasdas.putBoolean("activity_exec", true)
            mksijdsaoasdas.apply()

            val xjchasduasd = GlobalScope.launch(Dispatchers.IO) {
                zosapdlas = vjshduhsdahuashuas(bjjidsaisd+wpsaolsdaasld)
            }
            runBlocking {
                try {
                    xjchasduasd.join()
                } catch (_: Exception){
                }
            }

            when (zosapdlas) {
                "1" -> {
                    AppsFlyerLib.getInstance()
                        .init(KSDJIDJSAIJASDKOASDKOK, bhdyghuasdasd, applicationContext)
                    AppsFlyerLib.getInstance().start(this)
                    djsmmmxmznznx(1500)
                }
                "2" -> {
                    hdyusuhdsfjjidfs()

                }
                "0" -> {
                    nkodkasdokdas()
                }
            }
        }
    }





    val bhdyghuasdasd = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {

            val zosapdldskdsako = data?.get("campaign").toString()
            Hawk.put(MNSHJDHJS, zosapdldskdsako)
        }

        override fun onConversionDataFail(p0: String?) {

        }

        override fun onAppOpenAttribution(p0: MutableMap<String, String>?) {

        }

        override fun onAttributionFailure(p0: String?) {
        }
    }


    fun usauhdsasdas(xlcokvockx: Context) {
        AppLinkData.fetchDeferredAppLinkData(
            xlcokvockx
        ) { chcgygas: AppLinkData? ->
            chcgygas?.let {
                val lsaodkodaspdsak = chcgygas.targetUri.host
                Hawk.put(ZOSLDSDOK,lsaodkodaspdsak.toString())
            }
        }
    }



    private suspend fun vjshduhsdahuashuas(link: String): String {
        val eoaosdpaspdpasd = "0"
        val diasoas = URL(link)
        val xlxockkcxoz = "1"
        val cchchxjxjcjchxvvuhxc = "2"
        val zopsadlasdlad = withContext(Dispatchers.IO) {
            diasoas.openConnection()
        } as HttpURLConnection

        return try {
            when (val dosldsadpl = zopsadlasdlad.inputStream.bufferedReader().readText()) {
                "2" -> {
                    Hawk.put(QOSIJDJIASD, cchchxjxjcjchxvvuhxc)
                    Log.d("jsoup status", dosldsadpl)
                    cchchxjxjcjchxvvuhxc
                }
                "1" -> {
                    Log.d("jsoup status", dosldsadpl)
                    xlxockkcxoz
                }
                else -> {
                    Log.d("jsoup status", "is null")
                    eoaosdpaspdpasd
                }
            }
        } finally {
            zopsadlasdlad.disconnect()
        }

    }


    private fun djsmmmxmznznx(timeInterval: Long): Job {

        return CoroutineScope(Dispatchers.IO).launch {
            while (NonCancellable.isActive) {
                val fysauhudas: String? = Hawk.get(MNSHJDHJS)
                if (fysauhudas != null) {
                    Log.d("TestInUIHawk", fysauhudas.toString())
                    nkodkasdokdas()
                    break
                } else {
                    val iasdisdjajidjiajdans: String? = Hawk.get(MNSHJDHJS)
                    Log.d("TestInUIHawkNulled", iasdisdjajidjiajdans.toString())
                    delay(timeInterval)
                }
            }
        }
    }


    private fun nkodkasdokdas() {
        Intent(this, Nebgsa::class.java)
            .also { startActivity(it) }
        finish()
    }


    private fun hdyusuhdsfjjidfs() {
        Intent(this, Vekajshah::class.java)
            .also { startActivity(it) }
        finish()
    }




}