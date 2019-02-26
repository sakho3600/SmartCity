package com.example.administrator.smartcity.activities;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.VideoView;

import com.example.administrator.smartcity.R;

import butterknife.BindView;
import butterknife.OnClick;

public class VideoActivity extends BaseActivity implements View.OnClickListener {
    private VideoView videoView;
    private Button btnStart;
    private Button btnPause;
    private Button btnBack;

    private String url2 = "http://flashmedia.eastday.com/newdate/news/2016-11/shznews1125-19.mp4";
    private String url1 = "https://www.bilibili.com/video/av18781504/";
    @Override
    public Object getLayout() {
        return R.layout.activity_video;
    }

    @Override
    public void onCreate() {
        setNoTitleBarAndFullScreen();
        setImmersionStatusBar();
        videoView = findViewById(R.id.vv);
        btnStart = findViewById(R.id.btn_pause);
        btnPause = findViewById(R.id.btn_start);
        btnBack = findViewById(R.id.btn_back);
        videoView.setVideoPath(url2);
        btnBack.setOnClickListener(this);// 点击事件使用 @onClick更快速
        btnStart.setOnClickListener(this);
        btnPause.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_start:
                if (!videoView.isPlaying()){
                    videoView.start();
                }
                Toast.makeText(this, "start", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_pause:
                Toast.makeText(this, "start", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_back:
                Toast.makeText(this, "start", Toast.LENGTH_SHORT).show();
                finish();
                break;
        }
    }
}
