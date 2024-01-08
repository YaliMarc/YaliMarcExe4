package com.example.yalimarcexe4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button bt;
    int count=0;
    String str2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt.setText("Click me");
        bt=findViewById(R.id.button);
        str2="BOOM!";
    }


    public void exe(View view)
    {
    count++;
    String str=("This is a click number:"+count);
    bt.setText(str);
    if (count%7==0){
        bt.setText(str2);
        count=0;}

    }
}










