package com.example.tamagotchi

import android.annotation.SuppressLint
import android.widget.ProgressBar
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class GameActivity : AppCompatActivity() {

    private lateinit var feedProgressBar: ProgressBar
    private lateinit var playProgressBar: ProgressBar
    private lateinit var cleanProgressBar: ProgressBar

    private var feedProgressStatus: Int = 0
    private var playProgressStatus: Int = 0
    private var cleanProgressStatus: Int = 0

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        feedProgressBar = findViewById(R.id.feedProgressBar)
        playProgressBar = findViewById(R.id.playProgressBar)
        cleanProgressBar = findViewById(R.id.cleanProgressBar)

        val feedButton = findViewById<Button>(R.id.feedButton)
        val cleanButton = findViewById<Button>(R.id.cleanButton)
        val playButton = findViewById<Button>(R.id.playButton)

        feedButton.setOnClickListener {
            feedProgressStatus = 0
            Thread(Runnable {
                while (feedProgressStatus < 100) {
                    feedProgressStatus += 5
                    Thread.sleep(1000)
                    runOnUiThread {
                        feedProgressBar.progress = feedProgressStatus
                    }
                }
                runOnUiThread {
                    // Update feedTextView message
                    // Example: feedTextView.text = "Feed complete"
                }
            }).start()
        }

        cleanButton.setOnClickListener {
            cleanProgressStatus = 0
            Thread(Runnable {
                while (cleanProgressStatus < 100) {
                    cleanProgressStatus += 5
                    Thread.sleep(1000)
                    runOnUiThread {
                        cleanProgressBar.progress = cleanProgressStatus
                    }
                }
                runOnUiThread {
                    // Update cleanTextView message
                    // Example: cleanTextView.text = "Cleaning done"
                }
            }).start()
        }

        playButton.setOnClickListener {
            playProgressStatus = 0
            Thread(Runnable {
                while (playProgressStatus < 100) {
                    playProgressStatus += 5
                    Thread.sleep(1000)
                    runOnUiThread {
                        playProgressBar.progress = playProgressStatus
                    }
                }
                runOnUiThread {
                    // Update playTextView message
                    // Example: playTextView.text = "Playing completed"
                }
            }).start()
        }
    }
}
