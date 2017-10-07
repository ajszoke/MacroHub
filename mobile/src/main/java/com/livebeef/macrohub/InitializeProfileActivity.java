package com.livebeef.macrohub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InitializeProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_initialize_profile);

        final Button initialManualButton = (Button) findViewById(R.id.initialManualButton);
        initialManualButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchManualMacroInputIntent = new Intent(InitializeProfileActivity.this,
                        ManualMacroInputActivity.class);
                startActivity(launchManualMacroInputIntent);
            }
        });
        final Button initialCalculateButton = (Button) findViewById(R.id.initialCalculateButton);
        initialCalculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchCalculateMacroInputIntent = new Intent(InitializeProfileActivity.this,
                        CalculateMacro1Activity.class);
                startActivity(launchCalculateMacroInputIntent);
            }
        });
    }

}
