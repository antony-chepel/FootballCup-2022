# Onesignal
-dontwarn com.onesignal.**

-keep class com.onesignal.ActivityLifecycleListenerCompat** {*;}
#Coroutines
-keep class kotlinx.coroutines.**
-dontwarn kotlinx.coroutines.**

# Facebook
-keep class com.facebook.** {
   *;
}
#Lottie
-dontwarn com.airbnb.lottie.**
-keep class com.airbnb.lottie.** {*;}
# Appsflyer
-dontwarn com.appsflyer.AFKeystoreWrapper

-keepnames class * implements android.os.Parcelable
-keepclassmembers class * implements android.os.Parcelable {
  public static final *** CREATOR;
}
# Jsoup
-keep public class org.jsoup.** {
    public *;
}




