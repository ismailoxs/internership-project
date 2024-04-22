
package com.example.inter_pro;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

<<<<<<< HEAD
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


public class MainActivity extends AppCompatActivity implements Serializable {

=======
public class MainActivity extends AppCompatActivity {
>>>>>>> origin/branche_testig
    Button submit,creationaccout;
    EditText user,code;
   TextView login,textView3,textView4,textView39;
    LinearLayout linearLayout2;

    ImageView imageView,ImageView11,imageView12;
    ImageButton imageButtonfacebok,imageButtongoogle;
    View view5,view6;
    private AnimationDrawable animation;
    Intent intent;
int id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
imageButtonfacebok=findViewById(R.id.imageButtonfacebook);
imageButtongoogle=findViewById(R.id.imageButtongoogle);
        submit=findViewById(R.id.submitButton);
//         imageView= (ImageView) findViewById(R.id.companyicon);
        imageView.setBackgroundResource(R.drawable.animation);
        animation = (AnimationDrawable) imageView.getBackground();
        login=findViewById(R.id.loginID);
        user=findViewById(R.id.userID);
        code=findViewById(R.id.codeID);
<<<<<<< HEAD
        textView3=findViewById(R.id.textView3);
        textView4=findViewById(R.id.textView4);
        textView39=findViewById(R.id.textView39);
        linearLayout2=findViewById(R.id.linearLayout2);
        ImageView11=findViewById(R.id.imageView11);
        imageView12=findViewById(R.id.imageView12);
        creationaccout=findViewById(R.id.buttoncreationaccount);
        imageButtonfacebok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast=Toast.makeText(MainActivity.this,"the function of login with facebook not yet added",Toast.LENGTH_LONG);
                toast.show();
            }
        });
        imageButtongoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast=Toast.makeText(MainActivity.this,"the function of login with google not yet added",Toast.LENGTH_LONG);
                toast.show();
            }
        });

=======
        creationaccout=findViewById(R.id.buttoncreationaccount);
>>>>>>> origin/branche_testig

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent=new Intent(MainActivity.this, Homme1.class);
                startActivity(intent);
            }
        });
        creationaccout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, accountcreation.class);
                startActivity(intent);
<<<<<<< HEAD
            }});


        // Retrofit setup
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://dummyjson.com/users/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        UserService service = retrofit.create(UserService.class);
        Call<List<User>> call = service.getUsers();

        // API call
        call.enqueue(new Callback<List<User>>() {
            @Override
            public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                if (!response.isSuccessful()) {
                    // Handle the error
                    return;
                }
                List<User> users = response.body();

                // Get input from EditText
                String inputEmail = user.getText().toString();
                String inputPassword = code.getText().toString();

                // Check if input matches with any user data
                for (User user : users) {
                    if (user.getEmail().equals(inputEmail) && user.getPassword().equals(inputPassword)) {

                        Toast toast= Toast.makeText(MainActivity.this,"login seccsfully" ,Toast.LENGTH_LONG);
                        id=user.getId();
                        Intent intent = new Intent(MainActivity.this, CompteActivity.class);
                        intent.putExtra("full",user.fullname());
                        intent.putExtra("groupe",user.getGroupe());
                        intent.putExtra("adresse",user.getAdresse());
                        intent.putExtra("email",user.getEmail());
                        intent.putExtra("number",user.getNumber());
                        startActivity(intent);
                        break;
                    }
                    else {
                        Toast toast= Toast.makeText(MainActivity.this,"Email or code are not valid",Toast.LENGTH_LONG);

                    }
                }
            }

            @Override
            public void onFailure(Call<List<User>> call, Throwable t) {
            }
        });
=======
            }
        });

>>>>>>> origin/branche_testig
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
<<<<<<< HEAD
                imageView12.setVisibility(View.VISIBLE);
                ImageView11.setVisibility(View.VISIBLE);
                linearLayout2.setVisibility(View.VISIBLE);
                textView39.setVisibility(View.VISIBLE);
                textView4.setVisibility(View.VISIBLE);
                textView3.setVisibility(View.VISIBLE);
=======
>>>>>>> origin/branche_testig
            }
        }, 3000);  // 3000 milliseconds = 3 seconds
    }}


