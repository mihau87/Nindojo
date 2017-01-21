package pl.mihau.game.nindojo.Activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import pl.mihau.game.nindojo.MainActivity;
import pl.mihau.game.nindojo.R;

public class Splash extends Activity {

    private static final int CZAS = 2000;

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
                Thread.sleep(CZAS);

            } catch (Exception e) {
                Log.e("Catch z SplashScreen", e.getMessage());
            }

            // Włącz główną aktywność
            Intent intent = new Intent(Splash.this, MainActivity.class);
            Splash.this.startActivity(intent);
            Splash.this.finish();
        }
    }

}