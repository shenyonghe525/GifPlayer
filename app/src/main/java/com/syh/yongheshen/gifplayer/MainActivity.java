package com.syh.yongheshen.gifplayer;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.ant.liao.GifView;


public class MainActivity extends Activity implements View.OnClickListener
{

    private GifView gifView1;
    private GifView gifView2;

    private boolean f = true;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews()
    {
        gifView1 = (GifView) findViewById(R.id.gif1);
        gifView1.setGifImage(R.drawable.android_gif);
        gifView1.setOnClickListener(this);

        gifView2 = (GifView) findViewById(R.id.gif2);
        gifView2.setGifImage(R.drawable.gif2);
        // 设置显示的大小，拉伸或者压缩
        gifView2.setShowDimension(1080,200);
        // 设置加载方式：先加载后显示、边加载边显示、只显示第一帧再显示
        gifView2.setGifImageType(GifView.GifImageType.COVER);
        gifView2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        if(f)
        {
            gifView2.showCover();
            f = false;
        }else
        {
            gifView2.showAnimation();
            f = true;
        }
    }
}
