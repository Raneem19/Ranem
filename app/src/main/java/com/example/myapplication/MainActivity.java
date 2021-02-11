package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button bu;
    EditText et;
    TextView tv;
    String st;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bu = (Button)findViewById(R.bu.hbutton);
        et = (EditText)findViewById(R.et.PersonName);
        tv = (TextView)findViewById(R.tv.textView);

        bu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                st = et.getText().toString();
                sentDate(st);

            }
        });

    }

}
private void sentData(String st){
    tv.setText("Hello, "+st);}