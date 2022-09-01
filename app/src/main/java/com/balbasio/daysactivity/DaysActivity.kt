package com.balbasio.daysactivity

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class DaysActivity : AppCompatActivity() {
    var daysList = ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        daysList.add("Monday")
        daysList.add("Tuesday")
        daysList.add("Wednesday")
        daysList.add("Thursday")
        daysList.add("Friday")
        daysList.add("Saturday")
        daysList.add("Sunday")

        val index = daysList.indexOf("Monday")
        daysFun(index)
    }

    private fun daysFun(index:Int) {
        var index2 = index
        mondayButton.setOnClickListener {
            if (index2 == 0) {
                mondayButton.setBackgroundColor(Color.GREEN)
                index2 += 1
            } else {
                mondayButton.setBackgroundColor(Color.RED)
            }
        }
        tuesdayButton.setOnClickListener {
            if (index2 == 1) {
                tuesdayButton.setBackgroundColor(Color.GREEN)
                index2 += 1
            } else {
                tuesdayButton.setBackgroundColor(Color.RED)

            }
        }
        wednesdayButton.setOnClickListener {
            if (index2 == 2) {
                wednesdayButton.setBackgroundColor(Color.GREEN)
                index2 += 1
            } else {
                wednesdayButton.setBackgroundColor(Color.RED)
            }
        }
        thursdayButton.setOnClickListener {
            if (index2 == 3) {
                thursdayButton.setBackgroundColor(Color.GREEN)
                index2 += 1
            } else {
                thursdayButton.setBackgroundColor(Color.RED)
            }
        }
        fridayButton.setOnClickListener {
            if (index2 == 4) {
                fridayButton.setBackgroundColor(Color.GREEN)
                index2 += 1
            } else {
                fridayButton.setBackgroundColor(Color.RED)
            }
        }
        saturdayButton.setOnClickListener {
            if (index2 == 5) {
                saturdayButton.setBackgroundColor(Color.GREEN)
                index2 += 1
            } else {
                saturdayButton.setBackgroundColor(Color.RED)
            }
        }

        sundayButton.setOnClickListener {
            if (index2 == 6) {
                sundayButton.setBackgroundColor(Color.GREEN)
                index2 += 1
            } else {
                sundayButton.setBackgroundColor(Color.RED)
            }
        }
    }

}

