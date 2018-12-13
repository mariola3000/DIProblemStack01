package pl.kermit.diproblem.activities

import android.os.Bundle
import android.widget.Toast
import dagger.android.AndroidInjection
import dagger.android.support.DaggerAppCompatActivity
import pl.kermit.diproblem.objects.GlobalDependency
import javax.inject.Inject

abstract class CommonActivity : DaggerAppCompatActivity(){

    @Inject
    lateinit var globalDependency: GlobalDependency

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)

        Toast.makeText(this, "global message: " + globalDependency.message, Toast.LENGTH_LONG).show()
    }

}