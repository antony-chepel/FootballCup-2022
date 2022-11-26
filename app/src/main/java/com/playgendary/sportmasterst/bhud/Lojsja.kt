package com.playgendary.sportmasterst.bhud

import org.jsoup.Jsoup
import com.playgendary.sportmasterst.bhud.Hysdya.Companion.xdiasodapsd
import android.content.Context
import com.playgendary.sportmasterst.bhud.Hysdya.Companion.MNSHJDHJS
import android.util.Log
import com.playgendary.sportmasterst.bhud.Hysdya.Companion.ZOSLDSDOK
import com.orhanobut.hawk.Hawk
import kotlinx.coroutines.withContext
import com.playgendary.sportmasterst.bhud.Hysdya.Companion.vjsdhuasd
import kotlinx.coroutines.Dispatchers
import com.playgendary.sportmasterst.bhud.Hysdya.Companion.fisjdsda


class Lojsja(val jsuhdsai: Context) {
    private var ksadsdkaoasdk: String = ""
    suspend fun vlosdkdsajsdji(): String {
        val psosdalkasdk: String? = Hawk.get(ZOSLDSDOK)
        val vjdsnasdkasodk: String? = Hawk.get(MNSHJDHJS)
        val mkosidlsdksda = "${xdiasodapsd}${fisjdsda}${vjsdhuasd}$psosdalkasdk"
        val vhdhsdsjasidjas = "${xdiasodapsd}${fisjdsda}${vjsdhuasd}$vjdsnasdkasodk"

        withContext(Dispatchers.IO) {
            if (vjdsnasdkasodk != "null") {
                mxkozxpzxlckcxz(vhdhsdsjasidjas)
                Log.d("Check1C", vhdhsdsjasidjas)
            } else {
                mxkozxpzxlckcxz(mkosidlsdksda)
                Log.d("Check1C", mkosidlsdksda)
            }
        }
        return ksadsdkaoasdk
    }

    private fun mxkozxpzxlckcxz(nxjisaj: String) {
        val xchndsnjdasi = Jsoup.connect(nxjisaj).get().text()
        Log.d("Text from jsoup", xchndsnjdasi)
        ksadsdkaoasdk = xchndsnjdasi
    }
}