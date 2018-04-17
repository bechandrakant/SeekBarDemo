package com.example.android.seekbardemo;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private SeekBar seekBar;
    private TextView seekBarPercent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = findViewById(R.id.seek_bar);
        seekBarPercent = findViewById(R.id.seek_percent_tv);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            String msg = "";
            Toast toast = Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT);
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                seekBarPercent.setText(progress + " %");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                toast.cancel();
                msg = "Start";
                toast = Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT);
                toast.show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                toast.cancel();
                msg = "Stop";
                toast = Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}
