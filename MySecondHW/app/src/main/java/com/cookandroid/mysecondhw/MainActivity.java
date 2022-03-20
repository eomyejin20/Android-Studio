package com.cookandroid.mysecondhw;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText1;
    Button button1;
    Button button2;
    RadioButton radioButton1;
    RadioButton radioButton2;
    ImageView imageView1;
    ImageView imageView2;
    RadioGroup radioGroup1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar ab = getSupportActionBar() ;

        ab.setIcon(R.drawable.img) ;
        ab.setDisplayUseLogoEnabled(true) ;
        ab.setDisplayShowHomeEnabled(true) ;

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        editText1 = (EditText) findViewById(R.id.editText1);
        radioButton1 = (RadioButton) findViewById(R.id.radioButton1);
        radioButton2 = (RadioButton) findViewById(R.id.radioButton2);
        radioGroup1 = (RadioGroup) findViewById(R.id.radioGroup1);
        imageView1 = (ImageView) findViewById(R.id.imageView1);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), editText1. getText(), Toast.LENGTH_SHORT).show();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent mlntent = new Intent(Intent.ACTION_VIEW, Uri.parse(editText1.getText().toString()));
                startActivity(mlntent);
            }
        });
        radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup1, int Checkedld) {
                switch (Checkedld) {
                    case R.id.radioButton1 :
                        imageView1.setImageResource(R.drawable.img_1);
                        break;
                    case R.id.radioButton2 :
                        imageView1.setImageResource(R.drawable.img_2);
                        break;
                }

            }

        });
    }
}