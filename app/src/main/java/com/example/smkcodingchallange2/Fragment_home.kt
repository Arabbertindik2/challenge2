package com.example.smkcodingchallange2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_home.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"
class Fragment_home : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getPokemon()
    }
    private fun getPokemon() {

        val PokemonModel = ServiceRequest.get().doTarget()
        PokemonModel.enqueue(object : Callback<ResponsePokemon>{
            override fun onFailure(call: Call<ResponsePokemon>, t: Throwable) {
            }

            override fun onResponse(call: Call<ResponsePokemon>, response: Response<ResponsePokemon>) {
                tampilGithubUser(response.body()!!.results!!)
            }

        })
    }
    private fun tampilGithubUser(githubUsers: List<ResultsItem>) {
        rvpoked.layoutManager = LinearLayoutManager(activity)
        rvpoked.adapter = PokemonAdapter(activity!!, githubUsers) {
        }
    }
}


