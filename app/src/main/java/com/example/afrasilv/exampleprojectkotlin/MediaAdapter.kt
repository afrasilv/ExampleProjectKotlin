@file:Suppress("DEPRECATION")

package com.example.afrasilv.exampleprojectkotlin

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.view_media_item.view.*

class MediaAdapter(val items: List<MediaItem>) : RecyclerView.Adapter<MediaAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//        val v =LayoutInflater.from(parent.context).inflate(R.layout.view_media_item, parent, false)
        val v = parent.inflate(R.layout.view_media_item)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

//        val title = view.findViewById<TextView>(R.id.media_title)
//        val image = view.findViewById<ImageView>(R.id.media_thumb)
//        val videoIndicator = view.findViewById<ImageView>(R.id.media_video_indicator)

        fun bind(item: MediaItem) = with(itemView) {
            media_title.text = item.title
//            Picasso.with(image.context).load(item.thumbUrl).into(image)
            media_thumb.loadUrl(item.thumbUrl)
            media_video_indicator.visibility = when (item.type) {
                MediaItem.Type.VIDEO -> View.VISIBLE
                MediaItem.Type.PHOTO -> View.GONE
            }
        }
    }
}