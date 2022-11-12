package ensio.ia2.tp1_ghaith_mefteh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_authentification.*
import java.text.DateFormat
import java.util.*

class AuthentificationActivity : AppCompatActivity() {
    fun afficherDate(){
        val d = Date()
        val df = DateFormat.getDateInstance(DateFormat.LONG)
        val fd = df.format(d)


        val t = Date()
        val tf = DateFormat.getTimeInstance(DateFormat.LONG)
        val ft = tf.format(t)
        textView3.text ="$fd \n $ft"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authentification)
        button2.setOnClickListener { afficherDate() }
        button.setOnClickListener {
            val login= editTextTextPersonName.text.toString()
            val pass= editTextTextPassword.text.toString()

            if (pass == "pw$login"){
                val intent = Intent(this,ComputeActivity::class.java)
                startActivity(intent)
            }
            else   {
                Toast.makeText(this,"données érronnée",Toast.LENGTH_LONG).show()
            }
        }


    }
}
