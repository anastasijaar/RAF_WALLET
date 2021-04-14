package rs.raf.RAF_WALLET.Anastasija_Radonjic_6819RN.application;

import android.app.Application;

import timber.log.Timber;

public class RAF_WALLETApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Timber.plant(new Timber.DebugTree());
    }
}
