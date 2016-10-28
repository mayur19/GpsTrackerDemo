package com.lambelltech.mayur.gpstrackerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    GpsTrack gpsTrack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.button);

        gpsTrack = new GpsTrack(MainActivity.this);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (gpsTrack.canGetLocation()) {
                    double latitude = gpsTrack.getLatitude();
                    double longitude = gpsTrack.getLongitude();
                    Toast.makeText(getApplicationContext(), "latitude is " + latitude + "longitude is "
                            + longitude, Toast.LENGTH_LONG).show();

                }

            }
        });

    }
}
