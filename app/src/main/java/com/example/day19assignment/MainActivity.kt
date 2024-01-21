package com.example.day19assignment

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationSet
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.day19assignment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tVQuestion1.setOnClickListener {
            val answers= arrayOf("Answer 1", "Answer 2", "Answer 3", "Not Answered")
            val builder1= AlertDialog.Builder(this)
            builder1.setTitle("Question")
            builder1.setSingleChoiceItems(answers, 3, DialogInterface.OnClickListener { dialog, which ->
                //Which action is performed when any answer is clicked
                Toast.makeText(this, "You clicked on ${answers[which]}", Toast.LENGTH_SHORT).show()
            })
            builder1.setPositiveButton("Submit", DialogInterface.OnClickListener { dialog, which ->
                //What action Should Performed When Submit is Clicked

            })
            builder1.setNegativeButton("Decline", DialogInterface.OnClickListener { dialog, which ->
                //Which action should performed when submit is clicked

            })
            builder1.show()
        }
        binding.tVQuestion2.setOnClickListener {
            val answers= arrayOf("Answer 1", "Answer 2", "Answer 3", "Not Answered")
            val builder2= AlertDialog.Builder(this)
            builder2.setTitle("Question")
            builder2.setSingleChoiceItems(answers, 3,DialogInterface.OnClickListener { dialog, which ->
                //What action should be performed when answer is clicked
                Toast.makeText(this, "You clicked on ${answers[which]}", Toast.LENGTH_SHORT).show()
            })
            builder2.setPositiveButton("Submit", DialogInterface.OnClickListener { dialog, which ->
                //What action Should Performed When Submit is Clicked
            })
            builder2.setNegativeButton("Decline", DialogInterface.OnClickListener { dialog, which ->
                //Which action should performed when submit is clicked
            })
            builder2.show()
        }

        binding.tVQuestion3.setOnClickListener {
            val answers= arrayOf("Answer 1", "Answer 2", "Answer 3", "Not Answered")
            val builder3= AlertDialog.Builder(this)
            builder3.setTitle("Question")
            builder3.setSingleChoiceItems(answers, 3, DialogInterface.OnClickListener { dialog, which ->
                //What action should be performed when Answer is clicked
                Toast.makeText(this, "You clicked on ${answers[which]}",Toast.LENGTH_SHORT).show()
            })
                builder3.setPositiveButton("Submit", DialogInterface.OnClickListener { dialog, which ->
                //What action should be performed when it is clicked

            })
            builder3.setNegativeButton("Decline", DialogInterface.OnClickListener { dialog, which ->
                //What action should be performed when decline is clicked

            })
            builder3.show()
        }

        binding.btnSubmit.setOnClickListener {
            val builder4= AlertDialog.Builder(this)
            builder4.setTitle("Are you sure")
            builder4.setMessage("Do you want to submit")
            builder4.setIcon(R.drawable.baseline_exit_to_app_24)
            builder4.setPositiveButton("Yes",DialogInterface.OnClickListener { dialog, which ->
                //Action to be performed when clicked on yes
                finish()
            })
            builder4.setNegativeButton("No", DialogInterface.OnClickListener { dialog, which ->
                //Which action to be performed when clicked on no

            })
            builder4.show()

        }
    }
}