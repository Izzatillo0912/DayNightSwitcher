package arfo.developer.daynightmode

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sun.translationY = -400f

        day_night_switch.setListener { is_night ->
            if (is_night) {
                sun.animate().translationY(110f).duration = 1000
                day_landscape.animate().alpha(0f).duration = 1300
                day_bg.animate().alpha(0f).duration = 1300
            } else {
                sun.animate().translationY(-400f).duration = 1000
                day_landscape.animate().alpha(1f).duration = 1300
                day_bg.animate().alpha(1f).duration = 1300
            }
        }

    }
}