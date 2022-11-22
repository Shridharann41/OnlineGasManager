package com.example.onlinegasmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Godownstock extends AppCompatActivity {

    EditText Date3_txt, cylinder5_txt, cylinder6_txt, cylinder7_txt, cylinder8_txt, cylinder9_txt;
    Button Add3_btn;
    DatabaseReference reff;
    Member3 member3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_godownstock);

        Date3_txt= (EditText)findViewById(R.id.Date3_txt);
        cylinder5_txt= (EditText)findViewById(R.id.cylinder5_txt);
        cylinder6_txt=(EditText)findViewById(R.id.cylinder6_txt);
        cylinder7_txt=(EditText)findViewById(R.id.cylinder7_txt);
        cylinder8_txt=(EditText)findViewById(R.id.cylinder8_txt);
        cylinder9_txt=(EditText)findViewById(R.id.cylinder9_txt);
        Add3_btn = (Button)findViewById(R.id.Add3_btn);
        member3 = new Member3();
        reff = FirebaseDatabase.getInstance().getReference().child("Member3");

        Add3_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int cylin1 = Integer.parseInt(cylinder5_txt.getText().toString().trim());
                int cylin2 = Integer.parseInt(cylinder6_txt.getText().toString().trim());
                int cylin3 = Integer.parseInt(cylinder7_txt.getText().toString().trim());
                int cylin4 = Integer.parseInt(cylinder8_txt.getText().toString().trim());
                int cylin5 = Integer.parseInt(cylinder9_txt.getText().toString().trim());

                member3.setDate(Date3_txt.getText().toString().trim());
                member3.setCylinderin5(cylin1);
                member3.setCylinderin6(cylin2);
                member3.setCylinderin7(cylin3);
                member3.setCylinderin8(cylin4);
                member3.setCylinderin9(cylin5);
                reff.push().setValue(member3);

            }
        });

    }
}