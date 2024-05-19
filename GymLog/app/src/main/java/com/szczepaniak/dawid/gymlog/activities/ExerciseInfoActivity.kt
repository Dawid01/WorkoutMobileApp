package com.szczepaniak.dawid.gymlog.activities

import android.annotation.SuppressLint
import android.content.ComponentName
import android.content.Intent
import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.szczepaniak.dawid.gymlog.R


class ExerciseInfoActivity : AppCompatActivity() {



    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_exercise_info)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var icon: ImageView = findViewById(R.id.icon)
        var tvName: TextView = findViewById(R.id.name_text)
        var tvMuscle: TextView = findViewById(R.id.muscle_text)
        var tvDifficulty: TextView = findViewById(R.id.difficulty_text)
        var tutorialButton: Button = findViewById(R.id.tutorial_button)
        var backButton: Button = findViewById(R.id.back_button)


        icon.setImageDrawable(getResources().getDrawable(getIconImage(intent.getStringExtra("muscle")!!)))
        tvName.text = intent.getStringExtra("name")
        tvMuscle.text = intent.getStringExtra("muscle").toString().replace("_", " ").capitalize()
        tvDifficulty.text = intent.getStringExtra("difficulty").toString().uppercase()
        tvDifficulty.setTextColor(getDifficultyColor(intent.getStringExtra("difficulty")!!))

        tutorialButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/results?search_query=" + intent.getStringExtra("name").toString().replace(" ", "+")))
            intent.setComponent(
                ComponentName(
                    "com.google.android.youtube",
                    "com.google.android.youtube.PlayerActivity"
                )
            )
            startActivity(intent);
        }

        backButton.setOnClickListener {
            finish()
        }


    }

    @SuppressLint("DiscouragedApi")
    fun getIconImage(muscle: String) : Int{
        return resources.getIdentifier(muscle, "drawable", packageName)
    }

    fun getDifficultyColor(dificulty: String) : Int {
        when(dificulty){
            "beginner" -> return Color.GREEN
            "intermediate" -> return Color.YELLOW
            "expert" -> return Color.RED
        }
        return Color.WHITE
    }
}