package com.mihau.game.nindojo.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.mihau.game.nindojo.MainActivity;
import com.mihau.game.nindojo.R;


public class Splash extends Activity {

    private static final int TIME = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        // Uruchom wątek otwierający główną aktywność
        ActivityStarter starter = new ActivityStarter();
        starter.start();
    }

    private class ActivityStarter extends Thread {

        @Override
        public void run() {
            try {
                // tutaj wrzucamy wszystkie akcje potrzebne podczas ładowania aplikacji
                Thread.sleep(TIME);

            } catch (Exception e) {
                Log.e("SplashScreen", e.getMessage());
            }

            // MainActivity launching
            Intent intent = new Intent(Splash.this, MainActivity.class);
            Splash.this.startActivity(intent);
            Splash.this.finish();
        }
    }

}