package com.aon.bmihw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {
    private TextView text;
    private TextView text1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView text = (TextView)findViewById(R.id.Textt);
        TextView text1 = (TextView)findViewById(R.id.Texttt);

        Intent a = getIntent();
        double bmi = a.getDoubleExtra("BMI",0);
        String show = a.getStringExtra("name");

        text.setText(String.format("ค่า BMI ที่ได้ : %.2f",bmi));
        text1.setText(show);
    }
}
