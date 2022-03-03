package com.example.db_insert_select;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name,rno,course;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void insertdata(View view){
        name = findViewById(R.id.name);
        rno = findViewById(R.id.rno);
        course = findViewById(R.id.course);
        DBHelper DB = new DBHelper(this);
        String nam = name.getText().toString();
        String add = rno.getText().toString();
        String num = course.getText().toString();
        Boolean checkinsert = DB.insertDB(nam,add,num);
        if(checkinsert){
            Toast.makeText(this, "Insert Succesfully", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "Not Inserted!!", Toast.LENGTH_SHORT).show();
        }
        name.setText("");
        rno.setText("");
        course.setText("");
    }
    public void  viewdata(View view){
        DBHelper DB = new DBHelper(this);
        Cursor res = DB.getuserDB();
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        if(res.getCount()==0){
            alert.setCancelable(true);
            alert.setTitle("Students Data");
            alert.setMessage("No user found");
            alert.show();
        }
        else {
            StringBuffer buffer = new StringBuffer();
            while (res.moveToNext()) {
                buffer.append("Name:    " + res.getString(0) + "\n");
                buffer.append("Roll_No: " + res.getString(1) + "\n");
                buffer.append("Course:  " + res.getString(2) + "\n\n**********************\n\n");
            }
            alert.setCancelable(true);
            alert.setTitle("Students Data");
            alert.setMessage(buffer.toString());
            alert.show();
            name.setText("");
            rno.setText("");
            course.setText("");
        }
    }
}
