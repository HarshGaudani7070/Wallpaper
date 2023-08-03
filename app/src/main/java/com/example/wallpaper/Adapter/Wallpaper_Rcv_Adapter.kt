package com.example.wallpaper.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.wallpaper.Model.PhotosItem
import com.example.wallpaper.R

class Wallpaper_Rcv_Adapter(List: ArrayList<PhotosItem>) :
    RecyclerView.Adapter<Wallpaper_Rcv_Adapter.WallpaperHolder>() {

    var list = List
    lateinit var context: Context



    class WallpaperHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var img = itemView.findViewById<ImageView>(R.id.imgwallpaper)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WallpaperHolder {

        context = parent.context
        var view =
            LayoutInflater.from(parent.context).inflate(R.layout.wallpaper_user, parent, false)
        return WallpaperHolder(view)
    }

    override fun getItemCount(): Int {

        return list.size
    }

    override fun onBindViewHolder(holder: WallpaperHolder, position: Int) {

        Glide.with(context).load(list.get(position).src?.portrait).into(holder.img)
    }


}