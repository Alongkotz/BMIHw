package com.aon.bmihw;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText height,weight;
    private Button calculate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        height = (EditText) findViewById(R.id.height);
        weight = (EditText) findViewById(R.id.weight);
        calculate = (Button) findViewById(R.id.calculate);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double height1 = Double.valueOf(height.getText().toString());
                double weight1 = Double.valueOf(weight.getText().toString());
                double BMI = (weight1) / ((height1/100)*(height1/100));
                String name = "";
                if(BMI < 18){
                    name = "อยู่ในเกณฑ์ : น้ำหนักน้อยเกินไป";
                    Intent aon = new Intent(MainActivity.this,Main2Activity.class);
                    aon.putExtra("BMI",BMI);
                    aon.putExtra("name",name);
                    startActivity(aon);
                    height.setText("");
                    weight.setText("");
                }
                else if(BMI < 23){
                    name = "อยู่ในเกณฑ์ : น้ำหนักปกติ";
                    Intent aon2 = new Intent(MainActivity.this,Main3Activity.class);
                    aon2.putExtra("BMI",BMI);
                    aon2.putExtra("name",name);
                    startActivity(aon2);
                    height.setText("");
                    weight.setText("");
                }
                else if(BMI < 28){
                    name = "อยู่ในเกณฑ์ : น้ำหนักเกิน";
                    Intent aon3 = new Intent(MainActivity.this,Main4Activity.class);
                    aon3.putExtra("BMI",BMI);
                    aon3.putExtra("name",name);
                    startActivity(aon3);
                    height.setText("");
                    weight.setText("");
                }
                else {
                    name = "อยู่ในเกณฑ์ : อ้วน";
                    Intent aon4 = new Intent(MainActivity.this,Main5Activity.class);
                    aon4.putExtra("BMI",BMI);
                    aon4.putExtra("name",name);
                    startActivity(aon4);
                    height.setText("");
                    weight.setText("");
                }

            }
        });
    }
}



