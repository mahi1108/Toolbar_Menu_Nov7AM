package cubex.mahesh.toolbar_menu_nov7am

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
     //   supportActionBar!!.setTitle("Naresh IT")
       setActionBar(tBar)
        tBar.name.text = "Srikanth"
        tBar.last.text = "Online"
     //   actionBar.setHomeButtonEnabled(true)
        tBar.back.setOnClickListener {
            finish()
        }
    }
}
