package com.example.afrasilv.exampleprojectkotlin

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso

class MediaAdapter(val items: List<MediaItem>) : RecyclerView.Adapter<MediaAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.view_media_item, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val title = view.findViewById<TextView>(R.id.media_title) as TextView
        val image = view.findViewById<ImageView>(R.id.media_image) as ImageView

        fun bind(item: MediaItem){
            title.text = item.title
            Picasso.with(image.context).load(item.thumbUrl).into(image)
        }
    }
}