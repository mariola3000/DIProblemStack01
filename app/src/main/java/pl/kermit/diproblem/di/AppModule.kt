package pl.kermit.diproblem.di

import dagger.Module
import dagger.Provides
import dagger.Subcomponent
import pl.kermit.diproblem.objects.Global2Dependency
import pl.kermit.diproblem.objects.GlobalDependency

@Module(subcomponents = [RegistrationComponent::class])
class AppModule {
    @Provides
    fun provideGlobalDependency(): GlobalDependency {
        return GlobalDependency("GlobalDependency")
    }
    @Provides
    fun provideGlobal2Dependency(): Global2Dependency {
        return Global2Dependency("Global2Dependency")
    }
}