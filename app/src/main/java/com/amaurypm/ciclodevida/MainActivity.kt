package com.amaurypm.ciclodevida

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.blogspot.atifsoftwares.animatoolib.Animatoo

class MainActivity : AppCompatActivity() {

    private lateinit var mp: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("INFORMACION", "onCreate()")

        mp = MediaPlayer.create(this, R.raw.zelda)
        //mp.start()

    }

    fun click(v: View){
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
        Animatoo.animateSpin(this)
    }

    override fun onStart() {
        super.onStart()
        Log.d("INFORMACION", "onStart()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("INFORMACION", "onReStart()")
        //mp.start()
    }

    override fun onResume() {
        super.onResume()
        Log.d("INFORMACION", "onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d("INFORMACION", "onPause()")
        //mp.pause()


    }

    override fun onStop() {
        super.onStop()
        Log.d("INFORMACION", "onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("INFORMACION", "onDestroy()")
    }


}