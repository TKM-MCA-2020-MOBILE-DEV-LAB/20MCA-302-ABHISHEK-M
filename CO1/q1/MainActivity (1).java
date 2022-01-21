package com.example.log;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Objects;


public class MainActivity extends AppCompatActivity {
    EditText Username,Password;
    Button LOGIN;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Username=findViewById(R.id.editTextTextPersonName3);
        Password=findViewById(R.id.editTextTextPersonName4);
        LOGIN=findViewById(R.id.button);
        LOGIN.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        if(Objects.equals(Username.getText().toString(), "admin")&&Objects.equals(Password.getText().toString(),"admin"))
        {
            Toast.makeText(MainActivity.this,"You have Authenticated Successfully",Toast.LENGTH_LONG).show();
        }else
        {
            Toast.makeText(MainActivity.this,"Authentication Failed",Toast.LENGTH_LONG).show();
        }
    }
        });
    }
}
