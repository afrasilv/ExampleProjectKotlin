package com.example.afrasilv.exampleprojectkotlin

/**
 * Created by afrasilv on 26/11/17.
 */
data class MediaItem(val title: String, val thumbUrl: String, val type: Type) {
    enum class Type { PHOTO, VIDEO }
}