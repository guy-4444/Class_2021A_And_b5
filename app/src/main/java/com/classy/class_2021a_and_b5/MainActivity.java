package com.classy.class_2021a_and_b5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telecom.Call;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button main_BTN_updateTime;

    private Fragment_List fragment_list;
    private Fragment_Map fragment_map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();
        initViews();

        fragment_list = new Fragment_List();
        fragment_list.setCallBack_top(callBack_top);
        getSupportFragmentManager().beginTransaction().add(R.id.main_LAY_list, fragment_list).commit();

        fragment_map = new Fragment_Map();
        getSupportFragmentManager().beginTransaction().add(R.id.main_LAY_map, fragment_map).commit();


    }

    private CallBack_Top callBack_top = new CallBack_Top() {
        @Override
        public void changeTitle(String str) {
            main_BTN_updateTime.setText(str);
        }

        @Override
        public void displayLocation(double lat, double lon) {
            fragment_map.showLocationOnMap(lat, lon);
        }
    };

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