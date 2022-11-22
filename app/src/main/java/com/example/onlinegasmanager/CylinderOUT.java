package com.example.onlinegasmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class CylinderOUT extends AppCompatActivity {

    EditText Datecylin2_txt, labourcode2_txt, cylinderin3_txt, cylinderin4_txt;
    Button Add2_btn;
    DatabaseReference reff;
    Member1 member1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Datecylin2_txt= (EditText)findViewById(R.id.openingempty_txt);
        labourcode2_txt = (EditText)findViewById(R.id.returnBPCL_txt);
        cylinderin3_txt= (EditText)findViewById(R.id.Refillsale_txt);
        cylinderin4_txt=(EditText)findViewById(R.id.Defectives_txt);
        Add2_btn = (Button)findViewById(R.id.Add6_btn);
        member1 = new Member1();
        reff = FirebaseDatabase.getInstance().getReference().child("Member1");
        Add2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int lbrcode = Integer.parseInt(labourcode2_txt.getText().toString().trim());
                int cylin1 = Integer.parseInt(cylinderin3_txt.getText().toString().trim());
                int cylin2 = Integer.parseInt(cylinderin4_txt.getText().toString().trim());
                member1.setDate(Datecylin2_txt.getText().toString().trim());
                member1.setLabourcode(lbrcode);
                member1.setCylinderin(cylin1);
                member1.setCylinderin2(cylin2);
                reff.push().setValue(member1);

            }

        });


    }
}