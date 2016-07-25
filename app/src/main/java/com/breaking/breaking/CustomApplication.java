package com.breaking.breaking;

/**
 * Created by Ellen on 15/06/2016.
 */

import android.app.Application;
//import com.firebase.client.Firebase;

public class CustomApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
      // Firebase.setAndroidContext(this);
    }
}

