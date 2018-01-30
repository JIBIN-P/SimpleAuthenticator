package com.example.jibin.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickMe(View viewButton) {
        String user = "JIBIN-P";
        String pass = "nfsshift2";
        EditText editText = (EditText) findViewById(R.id.editText);
        EditText editText1 = (EditText) findViewById(R.id.editText2);
        if (editText.getText().toString()==user && editText1.getText().toString()==pass) {
            Toast.makeText(this, "Hii " + editText.getText().toString(), Toast.LENGTH_LONG).show();
            Log.i("Username",editText.getText().toString());
            Log.i("Pass",editText1.getText().toString());
        }
        else {
            Toast.makeText(this, "Invalid Login", Toast.LENGTH_LONG).show();
        }
    }
}
