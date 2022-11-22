package com.example.onlinegasmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Emptystock extends AppCompatActivity {

    EditText openingempty_txt, returnBPCL_txt, Refillsale_txt, Defectives_txt;
    Button Add6_btn;
    DatabaseReference reff;
    Member5 member5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emptystock);

        openingempty_txt= (EditText)findViewById(R.id.openingempty_txt);
        returnBPCL_txt = (EditText)findViewById(R.id.returnBPCL_txt);
        Refillsale_txt= (EditText)findViewById(R.id.Refillsale_txt);
        Defectives_txt=(EditText)findViewById(R.id.Defectives_txt);
        Add6_btn = (Button)findViewById(R.id.Add6_btn);
        member5 = new Member5();
        reff = FirebaseDatabase.getInstance().getReference().child("Member1");
        Add6_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int opempty = Integer.parseInt(openingempty_txt.getText().toString().trim());
                int retbpcl = Integer.parseInt(returnBPCL_txt.getText().toString().trim());
                int refillsale = Integer.parseInt(Refillsale_txt.getText().toString().trim());
                int defects = Integer.parseInt(Defectives_txt.getText().toString().trim());

                member5.setOpeningempty(opempty);
                member5.setReturnBPCL(retbpcl);
                member5.setRefillSale(refillsale);
                member5.setDefectives(defects);
                reff.push().setValue(member5);

            }

        });





    }
}