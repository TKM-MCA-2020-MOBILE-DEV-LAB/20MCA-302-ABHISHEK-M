package com.example.co2_q1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView t1 = (TextView) findViewById(R.id.name2);
        TextView t2 = (TextView) findViewById(R.id.add2);
        TextView t3 = (TextView) findViewById(R.id.phone2);
        TextView t4 = (TextView) findViewById(R.id.email2);
        Bundle extras = getIntent().getExtras();
        String name2 = extras.getString("Name");
        String add2 = extras.getString("Address");
        String phone2 = extras.getString("Phone");
        String email2 = extras.getString("Email");
        t1.setText(name2);
        t2.setText(add2);
        t3.setText(phone2);
        t4.setText(email2);
    }

}