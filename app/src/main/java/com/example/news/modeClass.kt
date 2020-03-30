package com.example.news

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

//data class News(val tittle:String, val img:Int)
//object supplier{
//    val newslist=listOf<News>(
//        (News("running",R.drawable.whologo)),
//        (News("cleaning",R.drawable.whologo)),
//        (News("running",R.drawable.whologo)),
//        (News("cleaning",R.drawable.whologo))
//    )
//
//}
@Parcelize
class News( val title:String,val url:String, val profileImageUrl: String): Parcelable {
    constructor():this("","","")
}