package nyc.c4q.shannonalexander_navarro.volentunes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by leighdouglas on 6/24/17.
 */

public class PasscodeActivity extends AppCompatActivity {

    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.access_code_layout);
        initViews();
    }

    private void initViews(){
        submitButton = (Button) findViewById(R.id.passcodesubmit);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LyricEarnedActivity.class);
                startActivity(intent);
            }
        });
    }
}
