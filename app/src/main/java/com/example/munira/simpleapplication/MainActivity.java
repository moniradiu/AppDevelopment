package com.example.munira.simpleapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText myNameET;
    private TextView showNameTV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myNameET =(EditText) findViewById(R.id.myNameEtValue);
        showNameTV =(TextView) findViewById(R.id.headingTvLabel);

    }

    public void ChangeText(View view) {
    String name= myNameET.getText().toString();
    showNameTV.setText(name);
    myNameET.setText("");
    }
}
