package nyc.c4q.shannonalexander_navarro.volentunes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MusicPrefActivity extends AppCompatActivity {

     Button saveBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_pref);

        initViews();
    }

    private void initViews(){
        saveBtn = (Button) findViewById(R.id.saveMusicBtn);
        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MusicPrefActivity.this, VolunteerPrefActivity.class);
                startActivity(intent);
            }
        });
    }

    //just a note
}
