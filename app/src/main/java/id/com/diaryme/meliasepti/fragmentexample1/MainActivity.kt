package id.com.diaryme.meliasepti.fragmentexample1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), Coordinator {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onEbookChanged(index:Int) {
        val frag = fragmentebookdescription
        if (frag is EbookDescription) {
            frag.changeDescription(index)
        }
    }
}