package com.aesraethr.rudder.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/**
 * Created by aanglade on 24/01/14.
 */
public class AuthenticationService extends Service {
    public IBinder onBind(Intent intent) {
        return new AccountAuthenticator(this).getIBinder();
    }
}
