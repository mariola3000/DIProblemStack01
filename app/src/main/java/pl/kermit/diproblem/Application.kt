package pl.kermit.diproblem

import android.app.Activity
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import pl.kermit.diproblem.di.DaggerAppComponent
import javax.inject.Inject

/**
 * @author Krzysiek Sławiński
 */
class Application : android.app.Application(), HasActivityInjector/*, HasServiceInjector,
                    HasBroadcastReceiverInjector, HasFragmentInjector, HasSupportFragmentInjector*/{

    @Inject
    lateinit var dispatchingAndroidActivityInjector: DispatchingAndroidInjector<Activity>

    override fun activityInjector(): AndroidInjector<Activity> {
        return dispatchingAndroidActivityInjector
    }

    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent.builder()
            .application(this)
            .build().inject(this)

    }

}