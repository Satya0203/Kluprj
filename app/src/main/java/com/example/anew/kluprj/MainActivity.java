package com.example.anew.kluprj;

import android.app.ActionBar;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ViewSwitcher;

public class MainActivity extends AppCompatActivity {
    Button b1,b2;
    ImageSwitcher iw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        iw=(ImageSwitcher)findViewById(R.id.imageSwitcher);
        iw.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView myview=new ImageView(getApplicationContext());
                myview.setScaleType(ImageView.ScaleType.FIT_CENTER);
                myview.setLayoutParams(new ImageSwitcher.LayoutParams(ViewPager.LayoutParams.WRAP_CONTENT, ViewPager.LayoutParams.WRAP_CONTENT));
                return myview;
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"previous image",Toast.LENGTH_LONG).show();
                //iw.setImageResource(R.drawable.);
            }

        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getApplicationContext(),"Next Image",Toast.LENGTH_LONG).show();
                //iw.setImageResource(R.drawable.tp);


            }
        });
    }
}
