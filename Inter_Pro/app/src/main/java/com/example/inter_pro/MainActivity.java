package com.example.inter_pro;

import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button submit,creationaccout;
    EditText user,code;
    ImageView imageView;
        private AnimationDrawable animation;
//    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        submit=findViewById(R.id.submitButton);
         imageView= (ImageView) findViewById(R.id.companyicon);
        imageView.setBackgroundResource(R.drawable.animation);
        animation = (AnimationDrawable) imageView.getBackground();
        user=findViewById(R.id.userID);
        code=findViewById(R.id.codeID);
        creationaccout=findViewById(R.id.buttoncreationaccount);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent  intent=new Intent(MainActivity.this, Homme1.class);
                startActivity(intent);
            }
        });
        creationaccout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, accountcreation.class);
                startActivity(intent);
            }
        });

    }
    @Override
    protected void onStart() {
        super.onStart();
        animation.start();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                submit.setVisibility(View.VISIBLE);
                user.setVisibility(View.VISIBLE);
                submit.setVisibility(View.VISIBLE);
                code.setVisibility(View.VISIBLE);
                creationaccout.setVisibility(View.VISIBLE);
            }
        }, 3000);  // 3000 milliseconds = 3 seconds
    }
}