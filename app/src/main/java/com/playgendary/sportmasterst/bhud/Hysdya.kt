package com.playgendary.sportmasterst.bhud

import kotlinx.coroutines.withContext
import android.app.Application
import com.orhanobut.hawk.Hawk
import android.content.Context
import android.util.Log
import kotlinx.coroutines.GlobalScope
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.onesignal.OneSignal
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class Hysdya : Application() {
    companion object {
        const val XGSHAJAJS = "397525cd-1764-49ca-a299-1aff1bf7b7f5"
        const val woaspdps = "admin"
        var ZOSLDSDOK: String? = "d11"
        var MNSHJDHJS: String? = "c11"
        val bjjidsaisd = "http://rainbowsky"
        var WOSIAKDJDSA: String? = ""
        val fisjdsda = ".xyz/go.php?to=1&"
        val xdiasodapsd = "http://rainbowsky"
        val vjsdhuasd = "sub_id_1="
        var QOSIJDJIASD: String? = "check"
        val wpsaolsdaasld = ".xyz/apps.txt"
        const val KSDJIDJSAIJASDKOASDKOK = "SrTYaR4kRbn37SWCs6EMPG"
    }

    override fun onCreate() {
        super.onCreate()

        GlobalScope.launch(Dispatchers.IO) {
            klmsdaskmd(context = applicationContext)
        }
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        OneSignal.initWithContext(this)
        OneSignal.setAppId(XGSHAJAJS)
        Hawk.init(this).build()
    }


    private suspend fun klmsdaskmd(context: Context) {
        val tasydgsdgya = Zxnsdb(context)
        val kisjdjsadbsd = tasydgsdgya.psadooksda()
        Hawk.put(WOSIAKDJDSA, kisjdjsadbsd)
    }



}

class Zxnsdb (rodskoakosdko: Context) {
    private val njbdsbha = AdvertisingIdClient(rodskoakosdko.applicationContext)
    suspend fun psadooksda(): String =
        withContext(Dispatchers.IO) {
            njbdsbha.start()
            val cfysuadhasduh = njbdsbha.info
            Log.d("getAdvertisingId = ", cfysuadhasduh.id.toString())
            cfysuadhasduh.id
        }
}