package com.example.activitylifecycle;
import androidx.appcompat.app.AppCompatActivity; import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity
{

@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState); setContentView(R.layout.activity_main);

Log.d("Activity lifecycle","onCreate(): called");
}
@Override
protected void onStart()
{
super.onStart(); Log.d("Activity Lifcecyle",
"onStart: called");
}
@Override
protected void onResume()
{
super.onResume(); Log.d("Activity
Lifecycle","onResume: called");
}
@Override
protected void onPause()
{
super.onPause();
Log.d("Activity Lifecycle","onPause:
called");
}
@Override
protected void onStop()
{
super.onStop();
Log.d("Activity Lifecycle","onStop:
called");
}
@Override
protected void onDestroy()
{
super.onDestroy(); Log.d("Activity
Lifecycle","onDestroy: called");
}
@Override
protected void onRestart()
{
super.onRestart(); Log.d("Activity
Lifecycle","onRestart: called");
}
}
