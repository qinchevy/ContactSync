
package com.example.contactsync;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class ContactSyncService extends Service {

    private Thread mSyncThread = null;

    @Override
    public IBinder onBind(Intent intent) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        if (mSyncThread == null) {
            mSyncThread = new Thread(new Runnable() {

                @Override
                public void run() {
                    // TODO Auto-generated method stub

                }

            });

            mSyncThread.start();
        }

        stopSelf();

        return START_STICKY;
    }

}
