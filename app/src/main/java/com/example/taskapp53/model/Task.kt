package com.example.taskapp53.model

import android.os.Parcelable

data class Task(
    var title:String?=null,
    var desc:String?=null,
): java.io.Serializable
