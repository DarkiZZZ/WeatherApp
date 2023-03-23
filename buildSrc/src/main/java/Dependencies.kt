object AndroidCore {
    private const val ktxVersion = "1.9.0"
    private const val workManagerVersion = "2.8.0"

    const val coreKtx = "androidx.core:core-ktx:$ktxVersion"
    const val workManager = "androidx.work:work-runtime-ktx:$workManagerVersion"
}

object AndroidUi {
    private const val appCombatVersion = "1.6.1"
    private const val materialVersion = "1.8.0"
    private const val constraintLayoutVersion = "2.1.4"
    private const val recViewVersion = "1.2.1"
    private const val cardViewVersion = "1.0.0"

    const val appCompat = "androidx.appcompat:appcompat:$appCombatVersion"
    const val material = "com.google.android.material:material:$materialVersion"
    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:$constraintLayoutVersion"
    const val recyclerView = "androidx.recyclerview:recyclerview:$recViewVersion"
    const val cardView = "androidx.cardview:cardview:$cardViewVersion"
}

object CustomUi {
    private const val shimmerLibVersion = "0.5.0"
    private const val viewBindingLibVersion = "1.5.8"

    const val shimmerLib = "com.facebook.shimmer:shimmer:$shimmerLibVersion"
    const val viewBindingLib = "com.github.kirich1409:viewbindingpropertydelegate-full:$viewBindingLibVersion"
}

object Navigation {
    private const val navVersion = "2.5.3"

    const val navFragmentKtx = "androidx.navigation:navigation-fragment-ktx:$navVersion"
    const val navUi = "androidx.navigation:navigation-ui-ktx:$navVersion"
}

object TestLibs {
    private const val jUnitVersion = "4.13.2"
    private const val androidJUnitVersion = "1.1.5"
    private const val espressoVersion = "3.5.1"

    const val jUnit = "junit:junit:$jUnitVersion"
    const val androidJUnit = "androidx.test.ext:junit:$androidJUnitVersion"
    const val espresso = "androidx.test.espresso:espresso-core:$espressoVersion"
}

object Room {
    private const val roomVersion = "2.5.0"

    const val roomRuntime = "androidx.room:room-runtime:$roomVersion"
    const val roomCompiler = "androidx.room:room-compiler:$roomVersion"
    const val roomKtx = "androidx.room:room-ktx:$roomVersion"
}

object Network {
    private const val retrofitVersion = "2.9.0"
    private const val picassoVersion = "2.71828"

    const val retrofitCore = "com.squareup.retrofit2:retrofit:$retrofitVersion"
    const val retrofitGson = "com.squareup.retrofit2:converter-gson:$retrofitVersion"
    const val picasso = "com.squareup.picasso:picasso:$picassoVersion"
}

object Coroutines {
    private const val coroutinesVersion = "1.6.1"

    const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesVersion"
    const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutinesVersion"
}

object Lifecycle {
    private const val lifecycleVersion = "2.5.1"

    const val viewModelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycleVersion"
    const val liveDataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycleVersion"
}

object Kotlin{
    private const val kotlin_version = "1.7.20"
    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib:$kotlin_version"
}

object Dagger {
    private const val daggerVersion = "2.44"

    const val daggerCore = "com.google.dagger:dagger:$daggerVersion"
    const val daggerCompiler = "com.google.dagger:dagger-compiler:$daggerVersion"
    const val daggerAndroid = "com.google.dagger:dagger-android:$daggerVersion"
    const val daggerProcessor = "com.google.dagger:dagger-android-processor:$daggerVersion"
    const val daggerInject = "javax.inject:javax.inject:1"
}
