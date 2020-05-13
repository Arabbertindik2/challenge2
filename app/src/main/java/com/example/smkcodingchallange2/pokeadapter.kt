package com.example.smkcodingchallange2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.pokedex_item.*
import java.util.ArrayList

class pokeadapter(private val context: Context, private val items: ArrayList<pokemon.poke>) :
    RecyclerView.Adapter<pokeadapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): pokeadapter.ViewHolder {
        LayoutInflater.from(context).inflate(R.layout.pokedex_item, parent, false)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    ​
    override fun onBindViewHolder(holder: ViewHolder, position: Int)
    { holder.bindItem(items.get(position)) }

    class ViewHolder(override val containerView: View) : RecyclerView.ViewHolder(containerView),
        LayoutContainer {
        fun bindItem(items: ArrayList<pokemon.poke>){
            txthp.text=items.nama
            txtpokemonname.text = items.hp
        }
    }

}