package com.example.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.card_loction_info.view.*

class CardLoctionInfoAdapter(
    val context: Context,
    val data: MutableList<CardLoctionInfo>,
    val click: onClick
) : RecyclerView.Adapter<CardLoctionInfoAdapter.ViewHolder>() {

    class ViewHolder(item: View) : RecyclerView.ViewHolder(item) {
        val title = item.text_loction_info
        val image = item.image_loction_info
        val card = item.card_Loction_Info
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var inflate = LayoutInflater.from(context).inflate(R.layout.card_loction_info, parent, false)
        return ViewHolder(inflate)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.title?.text = data[position].titleLo
        holder.image.setImageResource(data[position].imageLo)
    }

    interface onClick {
        fun onClickItem(position: Int)
    }
}
