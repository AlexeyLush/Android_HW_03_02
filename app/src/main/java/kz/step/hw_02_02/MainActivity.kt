package kz.step.hw_02_02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox

class MainActivity : AppCompatActivity() {

    var check_1: CheckBox? = null
    var check_2: CheckBox? = null
    var check_3: CheckBox? = null
    var check_4: CheckBox? = null
    var check_5: CheckBox? = null
    var check_6: CheckBox? = null
    var check_7: CheckBox? = null
    var check_8: CheckBox? = null
    var check_9: CheckBox? = null
    var check_10: CheckBox? = null
    var check_11: CheckBox? = null
    var check_12: CheckBox? = null
    var check_13: CheckBox? = null
    var check_14: CheckBox? = null
    var check_15: CheckBox? = null

    var checkButton: Button? = null

    var listProduct: ArrayList<String>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeViews()
    }

    fun initializeViews(){
        check_1 = findViewById(R.id.check_1)
        check_2 = findViewById(R.id.check_2)
        check_3 = findViewById(R.id.check_3)
        check_4 = findViewById(R.id.check_4)
        check_5 = findViewById(R.id.check_5)
        check_6 = findViewById(R.id.check_6)
        check_7 = findViewById(R.id.check_7)
        check_8 = findViewById(R.id.check_8)
        check_9 = findViewById(R.id.check_9)
        check_10 = findViewById(R.id.check_10)
        check_11 = findViewById(R.id.check_11)
        check_12 = findViewById(R.id.check_12)
        check_13 = findViewById(R.id.check_13)
        check_14 = findViewById(R.id.check_14)
        check_15 = findViewById(R.id.check_15)

        checkButton = findViewById(R.id.check_button)

        listProduct?.shuffle()

    }

    fun initializeListeners(){
        checkButton?.setOnClickListener{

        }
    }

}