package com.aon.bmihw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {
    private TextView text4,text5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        TextView text4 = (TextView)findViewById(R.id.Text5);
        TextView text5 = (TextView)findViewById(R.id.Text6);

        Intent c = getIntent();

        double bmi = c.getDoubleExtra("BMI",0);
        String show = c.getStringExtra("name");

        text4.setText(String.format("ค่า BMI ที่ได้ : %.2f",bmi));
        text5.setText(show);
    }
}
