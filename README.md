package com.example.tamagotchi

import android.annotation.SuppressLint

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ProgressBar

class MainActivity : AppCompatActivity() {
    private lateinit var feedProgressBar: ProgressBar
    private lateinit var playProgressBar: ProgressBar
    private lateinit var cleanProgressBar: ProgressBar

    private var feedProgressStatus: Int = 0
    private var playProgressStatus: Int = 0
    private var cleanProgressStatus: Int = 0

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        feedProgressBar = findViewById(R.id.feedProgressBar)
        playProgressBar = findViewById(R.id.playProgressBar)
        cleanProgressBar = findViewById(R.id.cleanProgressBar)

        val feedButton = findViewById<Button>(R.id.feedButton)
        val cleanButton = findViewById<Button>(R.id.cleanButton)
        val playButton = findViewById<Button>(R.id.playButton)

        feedButton.setOnClickListener {
            feedProgressStatus = 0
            feedProgressBar.progress = feedProgressStatus

            Thread {
                while (feedProgressStatus < 100) {
                    feedProgressStatus += 5
                    Thread.sleep(1000)
                    runOnUiThread {
                        feedProgressBar.progress = feedProgressStatus
                    }
                }
                runOnUiThread {
                    // Update feedTextView message
                }
            }.start()
        }

        cleanButton.setOnClickListener {
            cleanProgressStatus = 0
            cleanProgressBar.progress = cleanProgressStatus

            Thread {
                while (cleanProgressStatus < 100) {
                    cleanProgressStatus += 5
                    Thread.sleep(1000)
                    runOnUiThread {
                        cleanProgressBar.progress = cleanProgressStatus
                    }
                }
                runOnUiThread {
                    // Update cleanTextView message
                }
            }.start()
        }

        playButton.setOnClickListener {
            playProgressStatus = 0
            playProgressBar.progress = playProgressStatus

            Thread {
                while (playProgressStatus < 100) {
                    playProgressStatus += 5
                    Thread.sleep(1000)
                    runOnUiThread {
                        playProgressBar.progress = playProgressStatus
                    }
                }
                runOnUiThread {
                    // Update playTextView message
                }
            }.start()
        }
    }
}







https://youtube.com/shorts/p4Ccn74egkg?si=0IBtDkua49htR1BJ
https://youtube.com/shorts/p4Ccn74egkg?si=0IBtDkua49htR1BJ
