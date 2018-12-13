package pl.kermit.diproblem.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import pl.kermit.diproblem.activities.MainActivity

@Module
abstract class AppAndroidBindingModule {

    @PerActivity
    @ContributesAndroidInjector()
    abstract fun bindMainActivity(): MainActivity

}