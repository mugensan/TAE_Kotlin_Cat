package com.example.tae_kotlin_cat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.tae_kotlin_cat.model.CatModel
import com.example.tae_kotlin_cat.network.CatRequest
import com.example.tae_kotlin_cat.network.RetrofitInstances
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val catRequest = RetrofitInstances().retrofitInstances.create(CatRequest::class.java)

        val call = catRequest.getIdURL("cat", "10")

        call.enqueue(object : Callback<List<CatModel>>{
            override fun onFailure(call: Call<List<CatModel>>, t: Throwable) {
                Log.d("ERRORMSG",t.message)
            }

            override fun onResponse(call: Call<List<CatModel>>, response: Response<List<CatModel>>) {
                val result = response.body()
//
                Log.d("MAINACTIVITY", result!![0].text)
            }


        })
    }
}