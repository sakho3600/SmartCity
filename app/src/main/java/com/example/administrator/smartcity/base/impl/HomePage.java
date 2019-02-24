package com.example.administrator.smartcity.base.impl;

import android.app.Activity;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.example.administrator.smartcity.base.BasePage;

/**
 * Create by SunnyDay on 2019/02/21
 * 首页
 */
public class HomePage extends BasePage {
    public HomePage(Activity activity) {
        super(activity);
    }

    @Override
    public void initData() {
        TextView tv = new TextView(activity);
        tv.setText("主页");
        tv.setTextColor(Color.RED);
        tv.setGravity(Gravity.CENTER);
        flLayout.addView(tv);
        tvTitle.setText("智慧城市");
        btnMenu.setVisibility(View.GONE);
    }
}
