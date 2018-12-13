package pl.kermit.diproblem.di

import dagger.Subcomponent

@PerRegistration
@Subcomponent(modules = [RegistrationModule::class, RegistrationAndroidBindingModule::class])
interface RegistrationComponent {

    @Subcomponent.Builder
    interface Builder {
        fun requestModule(module: RegistrationModule): Builder
        fun build(): RegistrationComponent
    }

}