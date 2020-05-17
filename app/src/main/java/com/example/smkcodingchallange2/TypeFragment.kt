package com.example.smkcodingchallange2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_type.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class TypeFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_type, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getPokemon()
    }
    private fun getPokemon() {

        val PokemonModel = ServiceType.get().dotarget()
        PokemonModel.enqueue(object : Callback<ResponseType> {
            override fun onFailure(call: Call<ResponseType>, t: Throwable) {
            }

            override fun onResponse(call: Call<ResponseType>, response: Response<ResponseType>) {
                tampilGithubUser(response.body()!!.results!!)
            }

        })
    }
    private fun tampilGithubUser(githubUsers: List<Result2>) {
        rvtype.layoutManager = LinearLayoutManager(activity)
        rvtype.adapter = TypeAdapter(activity!!, githubUsers) {
        }
    }

}

