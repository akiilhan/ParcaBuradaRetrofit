package com.example.parcaburadaretrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.create

class MainActivity : AppCompatActivity() {


    //val MODEL_ID="24"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ApiClient.client?.create(ApiInterface::class.java)?.tumModelleriGetir()?.enqueue(object :Callback<List<AracModel>>{
            override fun onFailure(call: Call<List<AracModel>>, t: Throwable) {
Log.e("hata",""+t?.printStackTrace())            }

            override fun onResponse(
                call: Call<List<AracModel>>,
                response: Response<List<AracModel>>
            ) {
                Log.e("başarılı",call?.request().url()?.toString())
                var gelenData=response?.body()
                //for (i in 0..response?.body()?.size!!-1)
                    Log.e("başarılı",""+response?.body()?.get(0)?.model.toString())





        }

        /**var apiInterface=ApiClient.client?.create(ApiInterface::class.java)
        var apiCall=apiInterface?.tumModelleriGetir()
        apiCall?.enqueue(object :Callback<AracModel>{
            override fun onFailure(call: Call<AracModel>, t: Throwable) {
                L

            }

            override fun onResponse(call: Call<AracModel>, response: Response<AracModel>) {

                Log.e("başarılı",call?.request().url()?.toString())
                Log.e("başarılı",response?.body()?.model?.get(0)?.toString())
            }


        })*/

    })
}}
