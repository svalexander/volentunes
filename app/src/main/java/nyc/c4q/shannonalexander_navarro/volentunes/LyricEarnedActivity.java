package nyc.c4q.shannonalexander_navarro.volentunes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by leighdouglas on 6/24/17.
 */

public class LyricEarnedActivity extends AppCompatActivity {

    Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lyric_earned_activity);
        initViews();
    }

    public void initViews(){
        next = (Button) findViewById(R.id.nextbutton);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RedeemLyrics.class);
                startActivity(intent);
            }
        });
    }
}
