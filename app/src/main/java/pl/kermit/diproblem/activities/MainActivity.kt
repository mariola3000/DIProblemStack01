package pl.kermit.diproblem.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import dagger.android.AndroidInjection
import pl.kermit.diproblem.R
import pl.kermit.diproblem.objects.Global2Dependency
import javax.inject.Inject

class MainActivity : CommonActivity() {

    @set:Inject
    lateinit var global2Dependency: Global2Dependency

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text: TextView = findViewById(R.id.main_text)

        text.text = global2Dependency.message

        val button: Button = findViewById(R.id.main_button)
        button.setOnClickListener {
            startActivity(Intent(this, RegistrationActivity::class.java))
        }

    }

}
