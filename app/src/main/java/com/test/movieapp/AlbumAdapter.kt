package com.test.movieapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.test.movieapp.model.response.Albums

class AlbumAdapter : RecyclerView.Adapter<AlbumAdapter.ViewHolder>() {
    var data: List<Albums> = listOf()

    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        var imageView: ImageView = view.findViewById(R.id.imgPoster)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_movie_detail, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       Glide.with(holder.imageView).load(data[position].thumbnailUrl)
    }

    override fun getItemCount(): Int {
        return data.size
    }
}