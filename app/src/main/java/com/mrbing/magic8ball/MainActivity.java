package com.mrbing.magic8ball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView balls=(ImageView) findViewById(R.id.image_ball);

        final int[] ballarr=new int[] {
                R.drawable.magic8ball1,
                R.drawable.magic8ball2,
                R.drawable.magic8ball3,
                R.drawable.magic8ball4,
                R.drawable.magic8ball5
        };

        Button askbutton=(Button) findViewById(R.id.ask_button);

        askbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rnumg=new Random();
                int num=rnumg.nextInt(5);
                balls.setImageResource(ballarr[num]);
            }
        });
    }
}
