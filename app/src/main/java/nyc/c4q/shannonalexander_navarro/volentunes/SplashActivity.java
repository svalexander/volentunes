package nyc.c4q.shannonalexander_navarro.volentunes;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                final Intent intent = new Intent(SplashActivity.this, MusicPrefActivity.class);
                startActivity(intent);
                finish();
            }
        }, 3000);
    }


}
