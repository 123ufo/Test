package com.dw.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.dw.libs.utils.DWUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DWUtil.show();
    }
}