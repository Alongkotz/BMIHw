package com.aon.bmihw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    private TextView text2;
    private TextView text3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        TextView text2 = (TextView) findViewById(R.id.Text3);
        TextView text3 = (TextView)findViewById(R.id.Text4);

        Intent b = getIntent();

        double bmi = b.getDoubleExtra("BMI",0);
        String show = b.getStringExtra("name");

        text2.setText(String.format("ค่า BMI ที่ได้คือ : %.2f",bmi));
        text3.setText(show);

    }
}
