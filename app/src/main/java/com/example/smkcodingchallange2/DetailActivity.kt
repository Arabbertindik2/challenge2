package com.example.smkcodingchallange2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_detail.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DetailActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        getGrate()
    }

    private fun getGrate(){
        val intentData = intent.extras
        val id = intentData!!.getString("id")
        val url = intentData!!.getString("URL")
        val addAPI = DetailRequest.get().dotarget(id.toString())
        addAPI.enqueue(object : Callback<DetailResponse>{
            override fun onFailure(call: Call<DetailResponse>, t: Throwable) {
            }

            override fun onResponse(call: Call<DetailResponse>, response: Response<DetailResponse>) {
                Glide.with(applicationContext).load(url+id+".png").into(ivcircle)
                idnamapokemon.text = response.body()!!.name!!.toString()
                idtype.text= response.body()!!.types!![0].type?.name.toString()
                idheight.text=response.body()!!.height!!.toString()
                idweight.text=response.body()!!.height!!.toString()
            }

        })
    }
}
