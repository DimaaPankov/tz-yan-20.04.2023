package com.gamezzz.screen

import android.os.Bundle
import android.util.Log

import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.gamezzz.app.adver
import com.gamezzz.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class MainActivity : AppCompatActivity() {
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        CoroutineScope(Dispatchers.IO).launch {
            try {
                adver = AdvertisingIdClient.getAdvertisingIdInfo(this@MainActivity).id!!
                Log.d("aas", adver)
            }catch (e:Exception){

            }
        }

    }


    }

