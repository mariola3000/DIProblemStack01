package pl.kermit.diproblem.di

import dagger.Module
import dagger.Provides
import pl.kermit.diproblem.objects.RegistrationDependency
import pl.kermit.diproblem.objects.RegistrationFragmentDependency

@Module
class RegistrationModule {

    @PerRegistration
    @Provides
    fun provideRegistrationDependency(): RegistrationDependency {
        return RegistrationDependency("RegistrationDependency")
    }

    @PerRegistration
    @Provides
    fun provideRegistrationFragmentDependency(): RegistrationFragmentDependency {
        return RegistrationFragmentDependency("RegistrationFragmentDependency")
    }

}