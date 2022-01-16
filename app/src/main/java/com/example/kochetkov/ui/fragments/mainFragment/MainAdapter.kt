package com.example.kochetkov.ui.fragments.mainFragment

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.kochetkov.R
import com.example.kochetkov.data.models.Images
import com.example.kochetkov.databinding.ItemLayoutBinding

class MainAdapter: RecyclerView.Adapter<MainAdapter.MainViewHolder>() {

    private var listImage = Images()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return MainViewHolder(view)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.bind(listImage[position])
    }

    override fun getItemCount(): Int {
        return listImage.size
    }

    class MainViewHolder(view: View): RecyclerView.ViewHolder(view){
        private val binding = ItemLayoutBinding.bind(view)

        fun bind(images: String) = with(binding){



            Glide.with(itemImView.context)
                .load(images)
                .centerCrop()
                .into(itemImView)
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list:  Images){
        listImage = list
        notifyDataSetChanged()
    }
}