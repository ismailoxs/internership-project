package com.example.inter_pro;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class accountcreation extends AppCompatActivity {
Button signup;
EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_accountcreation);
        signup=findViewById(R.id.buttonsignup);
        editText  =findViewById(R.id.editTextTextEmailAddress)  ;
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast=Toast.makeText(accountcreation.this,"Sending code acceptaion to "+editText.getText().toString(),Toast.LENGTH_LONG);
                toast.show();
            }
        });
    }
}