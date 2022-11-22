package com.example.onlinegasmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;




public class CylinderIN extends AppCompatActivity {

    EditText Datecylin_txt, labourcode1_txt, cylinderin_txt, cylinderin2_txt;
    Button Add1_btn;
    DatabaseReference reff;
    Member member;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder_i_n);
        Datecylin_txt= (EditText)findViewById(R.id.openingempty_txt);
        labourcode1_txt = (EditText)findViewById(R.id.returnBPCL_txt);
        cylinderin_txt= (EditText)findViewById(R.id.Refillsale_txt);
        cylinderin2_txt=(EditText)findViewById(R.id.Defectives_txt);
        Add1_btn = (Button)findViewById(R.id.Add6_btn);
        member = new Member();
        reff = FirebaseDatabase.getInstance().getReference().child("Member");
        Add1_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int lbrcode = Integer.parseInt(labourcode1_txt.getText().toString().trim());
                int cylin1 = Integer.parseInt(cylinderin_txt.getText().toString().trim());
                int cylin2 = Integer.parseInt(cylinderin2_txt.getText().toString().trim());

                member.setDate(Datecylin_txt.getText().toString().trim());
                member.setLabourcode(lbrcode);
                member.setCylinderin(cylin1);
                member.setCylinderin2(cylin2);
                reff.push().setValue(member);

            }
        });

    }
}