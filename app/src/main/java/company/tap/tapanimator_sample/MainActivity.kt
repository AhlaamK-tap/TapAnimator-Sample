package company.tap.tapanimator_sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import company.tap.tapanimationkit.RenderAnimate
import company.tap.tapanimationkit.viewsanim.Slide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val render = RenderAnimate(this)
        render.setAnimation(Slide().InUp(tv_hello))
        render.setDuration(5000)
        render.start()
    }
}
