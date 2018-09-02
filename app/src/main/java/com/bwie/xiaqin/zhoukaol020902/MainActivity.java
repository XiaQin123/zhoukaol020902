package com.bwie.xiaqin.zhoukaol020902;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.bwie.xiaqin.zhoukaol020902.View.MyView;

public class MainActivity extends AppCompatActivity {

    private MyView My_View;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        My_View = findViewById(R.id.My_View);
    }
}
