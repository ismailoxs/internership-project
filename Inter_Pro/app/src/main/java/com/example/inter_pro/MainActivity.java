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
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button submit,creationaccout;
    EditText user,code;
    TextView login,textView3,textView4,textView39;
    LinearLayout linearLayout2;
    ImageView imageView,ImageView11,imageView12;
    View view5,view6;
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
        login=findViewById(R.id.loginID);
        user=findViewById(R.id.userID);
        textView3=findViewById(R.id.textView3);
        textView4=findViewById(R.id.textView4);
        textView39=findViewById(R.id.textView39);
        linearLayout2=findViewById(R.id.linearLayout2);
        ImageView11=findViewById(R.id.imageView11);
        imageView12=findViewById(R.id.imageView12);

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
                imageView12.setVisibility(View.VISIBLE);
                ImageView11.setVisibility(View.VISIBLE);
                linearLayout2.setVisibility(View.VISIBLE);
                textView39.setVisibility(View.VISIBLE);
                textView4.setVisibility(View.VISIBLE);
                textView3.setVisibility(View.VISIBLE);
            }
        }, 3000);  // 3000 milliseconds = 3 seconds
    }
}