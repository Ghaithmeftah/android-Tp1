package ensio.ia2.tp1_ghaith_mefteh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_authentification.*
import kotlinx.android.synthetic.main.activity_compute.*

class ComputeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_compute)

            radioGroup.setOnCheckedChangeListener { group, checkeid ->
                when (checkeid) {
                    R.id.radioButton -> {
                        textView5.text = "Value"
                        editTextTextPersonName2.hint = "Value"
                        textView6.visibility = View.INVISIBLE
                        textView5.visibility = View.VISIBLE
                        editTextTextPersonName3.visibility = View.INVISIBLE
                        editTextTextPersonName2.visibility = View.VISIBLE
                    }
                    R.id.radioButton2 -> {
                        textView5.text = "Value 1"
                        editTextTextPersonName2.hint = "Value 1"
                        textView6.visibility = View.VISIBLE
                        textView5.visibility = View.VISIBLE
                        editTextTextPersonName3.visibility = View.VISIBLE
                        editTextTextPersonName2.visibility = View.VISIBLE
                    }
                }
            }

        button3.setOnClickListener {
            if (radioButton.isChecked){
                val c =editTextTextPersonName2.text.toString().toInt()
                textView8.text="${c*c}"
            }
            else if (radioButton2.isChecked){
                val a= editTextTextPersonName2.text.toString().toInt()
                val b= editTextTextPersonName3.text.toString().toInt()
                val res =a+b
                textView8.text="$res"
            }
            else    {
                Toast.makeText(this,"choisir une opération",Toast.LENGTH_LONG).show()
            }
        }
    }
}
