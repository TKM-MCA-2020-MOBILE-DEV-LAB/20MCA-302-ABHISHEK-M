//Design a registration activity and store registration details in local memory of phone using Intents and SharedPreferences.
package com.example.co2_q1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String Name;
    String Address;
    String Phone;
    String Email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onSubmit(View view){
        EditText name = (EditText) findViewById(R.id.name);
        EditText add = (EditText) findViewById(R.id.add);
        EditText phone = (EditText) findViewById(R.id.phone);
        EditText email = (EditText) findViewById(R.id.email);
        Intent i = new Intent(getApplicationContext(),MainActivity2.class);
        Name=  name.getText().toString();
        Address = add.getText().toString();
        Phone = phone.getText().toString();
        Email = email.getText().toString();
        SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref",MODE_PRIVATE);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putString("name", name.getText().toString());
        myEdit.putString("add", add.getText().toString());
        myEdit.putString("phone", phone.getText().toString());
        myEdit.putString("email", email.getText().toString());
        myEdit.apply();
        i.putExtra("Name",Name);
        i.putExtra("Address",Address);
        i.putExtra("Phone",Phone);
        i.putExtra("Email",Email);
        startActivity(i);
    }

    @Override
    protected void onResume() {
        super.onResume();
        EditText name = (EditText) findViewById(R.id.name);
        EditText add = (EditText) findViewById(R.id.add);
        EditText phone = (EditText) findViewById(R.id.phone);
        EditText email = (EditText) findViewById(R.id.email);
        SharedPreferences sh = getSharedPreferences("MySharedPref", MODE_PRIVATE);
        name.setText(sh.getString("name",""));
        add.setText(sh.getString("add",""));
        phone.setText(sh.getString("phone",""));
        email.setText(sh.getString("email",""));

    }
}