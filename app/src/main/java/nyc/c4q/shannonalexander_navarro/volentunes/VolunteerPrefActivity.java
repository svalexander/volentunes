package nyc.c4q.shannonalexander_navarro.volentunes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class VolunteerPrefActivity extends AppCompatActivity {

    private Button saveVolunteerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volunteer_pref);
        initViews();
    }

    private void initViews(){
        saveVolunteerBtn = (Button) findViewById(R.id.saveVolunteerBtn);
        saveVolunteerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToMapIntent = new Intent(VolunteerPrefActivity.this, MapsActivity.class);
                startActivity(goToMapIntent);
            }
        });
    }
}
