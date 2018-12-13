package pl.kermit.diproblem.activities

import android.os.Bundle
import android.widget.TextView
import dagger.android.AndroidInjection
import pl.kermit.diproblem.R
import pl.kermit.diproblem.fragments.RegistrationFragment
import pl.kermit.diproblem.objects.RegistrationDependency
import javax.inject.Inject

class RegistrationActivity : CommonActivity() {

    @Inject
    lateinit var registrationDependency: RegistrationDependency

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        val registrationMessage = findViewById<TextView>(R.id.registration_text)
        registrationMessage.text = registrationDependency.message

        val transaction = this.supportFragmentManager.beginTransaction()
        val fragment = RegistrationFragment()
        transaction.replace(R.id.registration_fragment_container, fragment)
        transaction.addToBackStack(fragment.javaClass.simpleName)
        transaction.commit()
    }
}
