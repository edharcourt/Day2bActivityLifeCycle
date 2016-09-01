package com.example.ehar.day2bactivitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            double x = extras.getDouble("PI");
            Toast.makeText(
                    Main2Activity.this,
                    Double.toString(x),
                    Toast.LENGTH_LONG).show();
            
        }

    }
}
