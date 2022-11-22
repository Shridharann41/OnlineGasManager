package com.example.onlinegasmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FullStock extends AppCompatActivity {

    EditText openingstock_txt, fromBPCL_txt, Refillsale_txt, Defectives_txt;
    Button Add4_btn;
    DatabaseReference reff;
    Member4 member4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_stock);


        openingstock_txt = (EditText)findViewById(R.id.openingempty_txt);
        fromBPCL_txt = (EditText)findViewById(R.id.returnBPCL_txt);
        Refillsale_txt= (EditText)findViewById(R.id.Refillsale_txt);
        Defectives_txt=(EditText)findViewById(R.id.Defectives_txt);
        Add4_btn = (Button)findViewById(R.id.Add6_btn);
        member4 = new Member4();
        reff = FirebaseDatabase.getInstance().getReference().child("Member1");
        Add4_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int opstock = Integer.parseInt(openingstock_txt.getText().toString().trim());
                int frombpc = Integer.parseInt(fromBPCL_txt.getText().toString().trim());
                int refillsale = Integer.parseInt(Refillsale_txt.getText().toString().trim());
                int defec = Integer.parseInt(Defectives_txt.getText().toString().trim());

                member4.setOpeningstock(opstock);
                member4.setFromBPCL(frombpc);
                member4.setRefillsale(refillsale);
                member4.setDefectives(defec);

                reff.push().setValue(member4);

            }

        });



    }
}