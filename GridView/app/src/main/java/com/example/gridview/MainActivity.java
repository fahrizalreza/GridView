package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.GridLayoutAnimationController;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    GridView carGridView;
    GridAdapter gridAdapter;
    String[] feature = {
        "Rain Sensor",
        "Seat Heater",
        "Door Lock",
        "Key Battery",
        "Windscreen Defrost",
        "Boot Open",
        "Key not in vehicle",
        "Rear Window Defogger",
        "Clutch Pedal",
        "Break Pedal"
    };

    int[] images = {
        R.drawable.rain_sensor,
        R.drawable.seat_heater,
        R.drawable.door_lock,
        R.drawable.key_fob_battery_low,
        R.drawable.windscreen_defrost,
        R.drawable.boot_open,
        R.drawable.key_not_in_vehicle,
        R.drawable.rear_window_defogger,
        R.drawable.press_clutch_pedal,
        R.drawable.press_break_pedal
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        carGridView = (GridView) findViewById(R.id.gridView);
        gridAdapter = new GridAdapter(this, feature, images);
        carGridView.setAdapter(gridAdapter);
    }
}
