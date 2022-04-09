package com.cookandroid.myfifthhw3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editTextSMS;
    TextView textViewCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewCount = (TextView) findViewById(R.id.textViewCount);
        editTextSMS = (EditText) findViewById(R.id.editTextSMS);
        editTextSMS.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                textViewCount.setText(Integer.toString(s.toString().length()));

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
    public void onButtonSendClicked(View v) {


        Toast toast = Toast.makeText(this, editTextSMS.getText(),Toast.LENGTH_LONG);toast.show();
    }
}