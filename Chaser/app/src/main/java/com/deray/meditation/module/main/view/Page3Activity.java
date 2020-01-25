package com.deray.meditation.module.main.view;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.deray.meditation.R;

public class Page3Activity extends AppCompatActivity {

    ImageView page3img1;
    ImageView page3img2;
    int is_change1=0;
    int is_change2=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);
        page3img1=(ImageView) findViewById(R.id.page3img1);
        page3img2=(ImageView)findViewById(R.id.page3img2);
        page3img1.setImageDrawable(getResources().getDrawable(R.mipmap.tongyao));
        page3img2.setImageDrawable(getResources().getDrawable(R.mipmap.tongyaoimg));

        page3img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                is_change1++;
                if(is_change1==1){
                    page3img1.setImageDrawable(getResources().getDrawable(R.mipmap.calm));
                }
                if(is_change1==2){
                    page3img1.setImageDrawable(getResources().getDrawable(R.mipmap.liuxing));
                }
            }
        });

        page3img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                is_change2++;
                if (is_change2==1){
                    page3img2.setImageDrawable(getResources().getDrawable(R.mipmap.calmimg));
                }
                if(is_change2==2){
                    page3img2.setImageDrawable(getResources().getDrawable(R.mipmap.liuxingimg));
                }
            }
        });
    }
}
