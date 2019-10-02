package com.brokenshotgun.emogen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val emotions = arrayOf(
        R.drawable.angry,
        R.drawable.anxious,
        R.drawable.ashamed,
        R.drawable.bored,
        R.drawable.cautious,
        R.drawable.confident,
        R.drawable.confused,
        R.drawable.depressed,
        R.drawable.ecstatic,
        R.drawable.embarrassed,
        R.drawable.enraged,
        R.drawable.exhausted,
        R.drawable.frightened,
        R.drawable.frustrated,
        R.drawable.guilty,
        R.drawable.happy,
        R.drawable.hopeful,
        R.drawable.hysterical,
        R.drawable.jealous,
        R.drawable.lonely,
        R.drawable.lovestruck,
        R.drawable.mischievous,
        R.drawable.overwhelmed,
        R.drawable.sad,
        R.drawable.shocked,
        R.drawable.shy,
        R.drawable.smug,
        R.drawable.surprised,
        R.drawable.suspicious
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        randomButton.setOnClickListener { randomizeEmotion() }
        randomizeEmotion()
    }

    private fun randomizeEmotion() {
        emotionImageView.setImageResource(emotions.random())
    }
}
