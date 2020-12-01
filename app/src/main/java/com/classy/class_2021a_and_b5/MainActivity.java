package com.classy.class_2021a_and_b5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button main_BTN_updateTime;

    private Fragment_List fragment_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();
        initViews();

        fragment_list = new Fragment_List();
        getSupportFragmentManager().beginTransaction().add(R.id.main_LAY_list, fragment_list).commit();





    }

    private void initViews() {
        main_BTN_updateTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragment_list.updateTime();
            }
        });
    }

    private void findViews() {
        main_BTN_updateTime = findViewById(R.id.main_BTN_updateTime);
    }
}