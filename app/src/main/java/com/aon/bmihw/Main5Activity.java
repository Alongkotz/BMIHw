package com.aon.bmihw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {
    private TextView text6,text7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        TextView text6 = (TextView)findViewById(R.id.Text7);
        TextView text7 = (TextView)findViewById(R.id.Text8);

        Intent d = getIntent();

        double bmi = d.getDoubleExtra("BMI",0);
        String show = d.getStringExtra("name");

        text6.setText(String.format("ค่า BMI ที่ได้ : %.2f",bmi));
        text7.setText(show);
    }
}
