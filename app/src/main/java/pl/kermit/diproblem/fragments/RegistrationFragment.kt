package pl.kermit.diproblem.fragments

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import dagger.android.support.AndroidSupportInjection
import pl.kermit.diproblem.R
import pl.kermit.diproblem.objects.RegistrationFragmentDependency
import javax.inject.Inject

class RegistrationFragment: Fragment() {

    @Inject
    lateinit var fragmentDependency: RegistrationFragmentDependency

    override fun onAttach(context: Context?) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val root = inflater.inflate(R.layout.fragment_registration, container, false)
        val fragmentMessage: TextView = root.findViewById(R.id.fragment_text)
        fragmentMessage.text = fragmentDependency.message
        return root
    }


}