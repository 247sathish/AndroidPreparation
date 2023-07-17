package com.androidpreparation.uilayer.databinding.recycleview

import androidx.recyclerview.widget.RecyclerView
import com.androidpreparation.databinding.ItemListBinding


class ExampleViewHolder(private val binding: ItemListBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(item: Item) {
        binding.item = item
        binding.executePendingBindings()
    }
}
