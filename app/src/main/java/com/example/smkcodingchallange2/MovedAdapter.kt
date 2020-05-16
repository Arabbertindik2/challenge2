package com.example.smkcodingchallange2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.pokedex_item.*
import kotlinx.android.synthetic.main.pokedex_item.view.*


class MovedAdapter(
    private val context: Context,
    private val item2: ResultItem2,
    private val listener: (ResultItem2) -> Unit):RecyclerView.Adapter<MovedAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)= ViewHolder(context, LayoutInflater.from(context).inflate(R.layout.moved_item))

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: MovedAdapter.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
    class ViewHolder(val context: Context, override val containerView : View) :
        RecyclerView.ViewHolder(containerView), LayoutContainer {
        fun bindItem(item: ResultsItem, listener: (ResultsItem) -> Unit) {
            val url2 = "https://pokeres.bastionbot.org/images/pokemon/"
            itemView.txtpokemonname.text = item.name
//            val id = item.url!!.substring(item.url!!.length - 2)
            val url_lenght = item.url!!.length
            if (url_lenght == 36){
                val id = item.url!!.substring(item.url!!.length - 2)
                itemView.pokemon_id.text = id.substring(0,id.length-1)
                Glide.with(context).load(url2+id.substring(0,id.length-1)+".png").into(ivpokemon)
            }
            if(url_lenght == 37){
                val id = item.url!!.substring(item.url!!.length - 3)
                itemView.pokemon_id.text = id.substring(0,id.length-1)
                Glide.with(context).load(url2+id.substring(0,id.length-1)+".png").into(ivpokemon)
            }



        }
}