package com.example.bar_y.myapplication4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sevenboom extends AppCompatActivity {
    Button btn1;
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sevenboom);
        btn1=(Button) findViewById(R.id.btn1);
    }
    public void This(View view) {
        btn1.setText(""+i);
        i++;
        if ((i%7==0)||(i/10==7)||(i%10==7))
            btn1.setText("BOOM!!");
        else
            btn1.setText(""+i);
    }
}
