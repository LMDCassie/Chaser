package com.deray.meditation.module.main.view;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.ImageView;

import com.deray.meditation.R;

public class Page2Activity extends AppCompatActivity {

    ImageView page2img1;
    ImageView page2img2;
    ImageView page2img3;
    int is_change1=0;
    int is_change2=0;
    int is_change3=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        page2img1=(ImageView)findViewById(R.id.page2img1);
        page2img1.setImageDrawable(getResources().getDrawable(R.drawable.page2_1));
        page2img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                is_change1++;
                if(is_change1==2){
                    page2img1.setImageDrawable(getResources().getDrawable(R.drawable.page2_4));
                }
            }
        });

        page2img2=(ImageView)findViewById(R.id.page2img2);
        page2img2.setImageDrawable(getResources().getDrawable(R.drawable.page2_2));
        page2img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                is_change2++;
                if(is_change2==2){
                    page2img2.setImageDrawable(getResources().getDrawable(R.drawable.page2_5));
                }
            }
        });

        page2img3=(ImageView)findViewById(R.id.page2img3);
        page2img3.setImageDrawable(getResources().getDrawable(R.drawable.page2_3));
        page2img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                is_change3++;
                if(is_change3==2){
                    page2img3.setImageDrawable(getResources().getDrawable(R.drawable.page2_6));
                }
            }
        });


    }
}
