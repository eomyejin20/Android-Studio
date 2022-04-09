package com.cookandroid.project5_3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);

        LinearLayout baseLayout = new LinearLayout(this);
        baseLayout.setOrientation(LinearLayout.VERTICAL);
        baseLayout.setBackgroundColor(Color.rgb(255,255,255));
        setContentView(baseLayout,params);

        EditText edit1 = new EditText(this);
        edit1.setHint("입력하세요");
        baseLayout.addView(edit1);





        Button btn = new Button(this);
        btn.setText("버튼입니다");
        btn.setBackgroundColor(Color.rgb(255,255,0));
        baseLayout.addView(btn);


        TextView textView = new TextView(this);
        textView.setTextSize(30);
        textView.setBackgroundColor(Color.rgb(255,100,255));
        baseLayout.addView(textView);

       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String sentence;
               sentence = edit1.getText().toString();
               textView.setText(sentence);
           }
       });
        TextView textView2 = new TextView(this);
        textView2.setText("2020046050 엄예진");
        baseLayout.addView(textView2);

    }
}