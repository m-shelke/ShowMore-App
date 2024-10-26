package com.example.showmoreapp;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import kr.co.prnd.readmore.ReadMoreTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        TextView loremTv = findViewById(R.id.loremTv);
        TextView loremTv1 = findViewById(R.id.loremTv1);

        ImageView imageView = findViewById(R.id.imageView);
        ImageView imageView1 = findViewById(R.id.imageView1);

       imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (loremTv.getVisibility() == View.GONE){
                    loremTv.setVisibility(View.VISIBLE);
                    imageView.setImageResource(R.drawable.ic_launcher_background);
                }else {
                    loremTv.setVisibility(View.GONE);
                    imageView.setImageResource(R.drawable.ic_launcher_foreground);
                }
            }
        });

       imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (loremTv1.getVisibility() == View.GONE){
                    loremTv1.setVisibility(View.VISIBLE);
                    imageView1.setImageResource(R.drawable.ic_launcher_background);
                }else {
                    loremTv1.setVisibility(View.GONE);
                    imageView1.setImageResource(R.drawable.ic_launcher_foreground);
                }
            }
        });

    }
}