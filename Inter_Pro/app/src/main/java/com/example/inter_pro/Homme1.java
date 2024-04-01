package com.example.inter_pro;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Homme1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_homme1);
        GridLayout gridLayout = new GridLayout(this);
        gridLayout.setColumnCount(2); // Set the number of columns

        Button button1 = new Button(this);
        button1.setText("Compte");
        ColorStateList colorStateList = ColorStateList.valueOf(Color.parseColor("#B5CAD7"));
        ViewCompat.setBackgroundTintList(button1, colorStateList);
        button1.setCompoundDrawablesWithIntrinsicBounds(R.drawable.account, 0, 0, 0);
        Button button2 = new Button(this);
        button2.setText("Consultation");
        ViewCompat.setBackgroundTintList(button2, colorStateList);
        button2.setCompoundDrawablesWithIntrinsicBounds(R.drawable.consultation, 0, 0, 0);

        Button button3 = new Button(this);
        button3.setText("Instructions");
        ViewCompat.setBackgroundTintList(button3, colorStateList);
        button3.setCompoundDrawablesWithIntrinsicBounds(R.drawable.instruction, 0, 0, 0);

        Button button4 = new Button(this);
        button4.setText("Don de sang");
        ViewCompat.setBackgroundTintList(button4, colorStateList);

        button4.setCompoundDrawablesWithIntrinsicBounds(R.drawable.don_de_sang, 0, 0, 0);

        Button button5 = new Button(this);
        button5.setText("Urgence");
        ViewCompat.setBackgroundTintList(button5, colorStateList);
        button5.setCompoundDrawablesWithIntrinsicBounds(R.drawable.urgence, 0, 0, 0);

        Button button6 = new Button(this);
        button6.setText("Contact");
        ViewCompat.setBackgroundTintList(button6, colorStateList);

        button6.setCompoundDrawablesWithIntrinsicBounds(R.drawable.contact, 0, 0, 0);

// Add the buttons to the layout
        gridLayout.addView(button1);
        gridLayout.addView(button2);
        gridLayout.addView(button3);
        gridLayout.addView(button4);
        gridLayout.addView(button5);
        gridLayout.addView(button6);

        setContentView(gridLayout);




    }
}