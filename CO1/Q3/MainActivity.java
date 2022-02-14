package com.example.calculator;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    EditText e1,e2,e3;
    Button b1,b2,b3,b4,b5,b6;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.num1);
        e2=(EditText)findViewById(R.id.num2);
        e3=(EditText)findViewById(R.id.op);
        b1=(Button)findViewById(R.id.add);
        b2=(Button)findViewById(R.id.subtract);
        b3=(Button)findViewById(R.id.divide);
        b4=(Button)findViewById(R.id.multiply);
        b5=(Button)findViewById(R.id.delete);


    }
    public void add(View view)
    {
        int n1=Integer.parseInt(e1.getText().toString());
        int n2=Integer.parseInt(e2.getText().toString());
        String n3=String.valueOf(n1+n2);
        e3.setText(n3);

    }
    public void del(View view)
    {
        e1.setText("Enter number 1");
        e2.setText("Enter number 2");
        e3.setText("Output");
    }
    public void subtract(View view)
    {
        int n1=Integer.parseInt(e1.getText().toString());
        int n2=Integer.parseInt(e2.getText().toString());
        String n3=String.valueOf(n1-n2);
        e3.setText(n3);
    }
    public void divide(View view)
    {
        int n1=Integer.parseInt(e1.getText().toString());
        int n2=Integer.parseInt(e2.getText().toString());
        String n3=String.valueOf(n1/n2);
        e3.setText(n3);
    }
    public void multiply(View view)
    {
        int n1=Integer.parseInt(e1.getText().toString());
        int n2=Integer.parseInt(e2.getText().toString());
        String n3=String.valueOf(n1*n2);
        e3.setText(n3);
    }
}