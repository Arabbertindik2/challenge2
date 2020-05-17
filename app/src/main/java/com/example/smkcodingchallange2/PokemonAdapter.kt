package com.example.smkcodingchallange2

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.pokedex_item.*
import kotlinx.android.synthetic.main.pokedex_item.view.*

class PokemonAdapter(private val context: Context, private val items:
List<ResultsItem>, private val listener: (ResultsItem)-> Unit) :
    RecyclerView.Adapter<PokemonAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ViewHolder(context, LayoutInflater.from(context).inflate(
            R.layout.pokedex_item,
            parent, false))
    override fun getItemCount(): Int {
        return items.size
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(items.get(position), listener)
    }
    class ViewHolder(val context: Context, override val containerView : View) :
        RecyclerView.ViewHolder(containerView), LayoutContainer {
        fun bindItem(item: ResultsItem, listener: (ResultsItem) -> Unit) {
            val url2 = "https://pokeres.bastionbot.org/images/pokemon/"
            itemView.txtpokemonname.text = item.name
//            val id = item.url!!.substring(item.url!!.length - 2)
            val sub = item.url!!.substring(34, item.url.length-1)
            itemView.pokemon_id.text = sub
            Glide.with(context).load(url2+sub.substring(0,sub.length)+".png").into(ivpokemon)
                itemView.iditem!!.setOnClickListener{
                    val i = Intent(context, DetailActivity::class.java)
                    i.putExtra("URL", url2)
                    i.putExtra("id", sub)
                    context.startActivity(i)
            }
        }
    }

}

