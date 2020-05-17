package com.example.smkcodingchallange2

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.moved_item.view.*
import kotlinx.android.synthetic.main.type_item.view.*

class TypeAdapter(private val context: Context, private val items:
List<Result2>, private val listener: (Result2)-> Unit) :
    RecyclerView.Adapter<TypeAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)= TypeAdapter.ViewHolder (
        context, LayoutInflater.from(context).inflate(
        R.layout.type_item,
        parent, false
        )
    )

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: TypeAdapter.ViewHolder, position: Int) {
        holder.bindItem(items.get(position), listener)
    }
    class ViewHolder(val context: Context, override val containerView : View) :
        RecyclerView.ViewHolder(containerView), LayoutContainer {
        fun bindItem(item: Result2, listener: (Result2) -> Unit) {
            itemView.txttype.text = item.name
            val sub = item.url!!.substring(31, item.url.length-1)
            itemView.type_id.text = sub
        }
    }
}