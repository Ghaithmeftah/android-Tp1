package ensio.ia2.tp1_ghaith_mefteh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "This APP is developed by Arij Tlili", Toast.LENGTH_LONG).show();
    }
}