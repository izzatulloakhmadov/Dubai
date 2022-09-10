package com.example.dubai

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.dubai.databinding.TableItemBinding

class listAdapter:ListAdapter<hause,listAdapter.MyViewHolder>(diffUtil) {

    class MyViewHolder(val binding: TableItemBinding):RecyclerView.ViewHolder(binding.root)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(TableItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
val malumot=getItem(position)
        holder.binding.apply {
            txt1.text=malumot.name
            txt2.text=malumot.rooms.toString()
            txt3.text=malumot.price.toString()
            txt4.text=malumot.size.toString()
        }
    }
    companion object {
        val diffUtil = object : DiffUtil.ItemCallback<hause>() {
            override fun areItemsTheSame(oldItem: hause, newItem: hause): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(oldItem: hause, newItem: hause): Boolean {
               return oldItem.name == newItem.name
            }

        }
    }


}