package pl.kermit.diproblem.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import pl.kermit.diproblem.activities.RegistrationActivity
import pl.kermit.diproblem.fragments.RegistrationFragment

@Module
abstract class RegistrationAndroidBindingModule {

    @PerActivity
    @ContributesAndroidInjector
    abstract fun bindRegistrationActivity(): RegistrationActivity

    @PerFragment
    @ContributesAndroidInjector
    abstract fun bindRegistrationFragment(): RegistrationFragment


}
