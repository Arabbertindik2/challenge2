package com.example.smkcodingchallange2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.activity_detail.idweight
import kotlinx.android.synthetic.main.activity_move_detail.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MoveDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_detail)
    }

    private fun getGrate(){
        val intentData = intent.extras
        val id = intentData!!.getString("id")
        val addAPI = MoveDetailRequest.get().dotarget(id.toString())
        addAPI.enqueue(object : Callback<ResponseMoveDetail> {

            override fun onResponse(call: Call<ResponseMoveDetail>, response: Response<ResponseMoveDetail>) {
                idnamemove.text = response.body()!!.name
                idaccuracy.text = response.body()!!.accuracy.toString()
                idtypemove.text= response.body()!!.types2[0].name
                idpower.text=response.body()!!.power!!.toString()
                idpp.text=response.body()!!.pp!!.toString()
            }

            override fun onFailure(call: Call<ResponseMoveDetail>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })
    }
}
