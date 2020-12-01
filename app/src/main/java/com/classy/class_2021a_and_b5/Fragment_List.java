package com.classy.class_2021a_and_b5;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.text.SimpleDateFormat;

public class Fragment_List extends Fragment {

    private TextView list_LBL_name;
    private Button list_BTN_update;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d("pttt", "onCreateView - Fragment_List");

        View view = inflater.inflate(R.layout.fragment_list, container, false);
        findViews(view);

        return view;
    }

    public void updateTime() {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yy\nHH:mm:ss");
        String date = format.format(System.currentTimeMillis());

        list_LBL_name.setText(date);
    }

    private void findViews(View view) {
        list_LBL_name = view.findViewById(R.id.list_LBL_name);
        list_BTN_update = view.findViewById(R.id.list_BTN_update);
    }


}
