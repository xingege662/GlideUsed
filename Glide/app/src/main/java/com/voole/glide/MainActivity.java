package com.voole.glide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class MainActivity extends AppCompatActivity {
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image = (ImageView) findViewById(R.id.iv);

        Glide.with(MainActivity.this)
                .load("http://img.yxbao.com/news/image/201701/13/cd0eb9d29a.gif")
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .override(30,30)
                .crossFade()//动画
                .centerCrop()
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .into(image);


    }
}
