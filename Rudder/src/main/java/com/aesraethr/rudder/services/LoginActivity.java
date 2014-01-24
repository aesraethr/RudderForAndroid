package com.aesraethr.rudder.services;

import android.accounts.AccountAuthenticatorActivity;
import android.os.Bundle;

import com.aesraethr.rudder.R;

/**
 * Created by aanglade on 24/01/14.
 */
public class LoginActivity extends AccountAuthenticatorActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }
}