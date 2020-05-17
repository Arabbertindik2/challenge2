package com.example.smkcodingchallange2

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.moved_item.view.*
import kotlinx.android.synthetic.main.pokedex_item.*
import kotlinx.android.synthetic.main.pokedex_item.view.*


class MovedAdapter(private val context: Context, private val items:
List<ResultItem2>, private val listener: (ResultItem2)-> Unit) :
    RecyclerView.Adapter<MovedAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        MovedAdapter.ViewHolder(
            context, LayoutInflater.from(context).inflate(
                R.layout.moved_item,
                parent, false
            )
        )
    override fun getItemCount(): Int {
        return items.size
    }

    class ViewHolder(val context: Context, override val containerView : View) :
        RecyclerView.ViewHolder(containerView), LayoutContainer {
        fun bindItem(item: ResultItem2, listener: (ResultItem2) -> Unit) {
            itemView.txtpokemonmove.text = item.name
            val sub = item.url!!.substring(31, item.url.length-1)
            itemView.move_id.text = sub
            itemView.idmoveadap.setOnClickListener {
                val i = Intent(context, MoveDetailActivity::class.java)
                i.putExtra("id", sub)
                context.startActivity(i)
            }
        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(items.get(position), listener)
    }


}