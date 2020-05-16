package com.example.smkcodingchallange2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_profil.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class ProfilFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profil, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    private fun getMove() {

        val MoveModel = MoveRequest.getmove().doTarget2()
        MoveModel.enqueue(object : Callback<ResponseMove> {
            override fun onFailure(call: Call<ResponseMove>, t: Throwable) {
            }

            override fun onResponse(call: Call<ResponseMove>, response: Response<ResponseMove>) {
                tampilGithubUser(response.body()!!.results!!)
            }

        })
    }
    private fun tampilGithubUser(githubUsers: List<ResultsItem>) {
        rvmoved.layoutManager = LinearLayoutManager(activity)
        rvmoved.adapter = PokemonAdapter(activity!!, githubUsers) {
        }
    }
}
