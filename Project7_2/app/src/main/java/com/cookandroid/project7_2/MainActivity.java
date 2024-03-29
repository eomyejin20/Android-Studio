package com.cookandroid.project7_2;



import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;



public class MainActivity extends AppCompatActivity {
    private LinearLayoutCompat baseLayout;
    private Button button1, button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("배경색 바꾸기(컨텍스트 메뉴)");

        baseLayout = (LinearLayoutCompat)findViewById(R.id.baseLayout);
        button1 = (Button) findViewById (R.id.button1);
        registerForContextMenu(button1);
        button2= (Button) findViewById(R.id.button2);
        registerForContextMenu(button2);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater mInflater = getMenuInflater();
        if(v == button1){
            menu.setHeaderTitle("배경색 변경");
            mInflater.inflate(R.menu.menu1, menu);
        }
        if(v == button2){
            mInflater.inflate(R.menu.menu2, menu);
        }
    }
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menuRed:
                baseLayout.setBackgroundColor(Color.RED);
                return true;
            case R.id.menuGreen:
                baseLayout.setBackgroundColor(Color.GREEN);
                return true;
            case R.id.menuBlue:
                baseLayout.setBackgroundColor(Color.BLUE);
                return true;
            case R.id.subRotate:
                button1.setRotation(45);
                return true;
            case R.id.subSizeUP:
                button1.setScaleX(2);
                return true;
        }
        return false;
    }
}