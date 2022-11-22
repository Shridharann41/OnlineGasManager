package com.example.onlinegasmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.os.Bundle;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton cylinderin_btn = findViewById(R.id.cylinderin_btn);
        cylinderin_btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent CylinderINIntent = new Intent(getApplicationContext(),CylinderIN.class);
                startActivity(CylinderINIntent);
            }
        });
        ImageButton cylinderout_btn = findViewById(R.id.cylinderout_btn);
        cylinderout_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent CylinderOUTIntent = new Intent(getApplicationContext(), CylinderOUT.class);
                startActivity(CylinderOUTIntent);
            }
        });
        ImageButton godownstock_btn = findViewById(R.id.godownstock_btn);
        godownstock_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent GodownstockIntent = new Intent(getApplicationContext(), Godownstock.class);
                startActivity(GodownstockIntent);
            }
        });


        ImageButton emptystock_btn = findViewById(R.id.emptystock_btn);
        emptystock_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent EmptystockIntent = new Intent(getApplicationContext(), Emptystock.class);
                startActivity(EmptystockIntent);
            }
        });

        ImageButton fullstock_btn = findViewById(R.id.fullstock_btn);
        fullstock_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent FullStockIntent = new Intent(getApplicationContext(), FullStock.class);
                startActivity(FullStockIntent);
            }
        });


    }
}