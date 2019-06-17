package com.example.midterm;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {
    Button facebook;
    Button google;
    Button signUp;
    Typeface typeface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        typeface = Typeface.createFromAsset(getAssets(),"didot.ttf");
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_sign_up);
        facebook = (Button)findViewById(R.id.btn_facebook_signup);
        signUp = (Button)findViewById(R.id.btn_signup_signup);
        google = (Button) findViewById(R.id.btn_google_signup);
        signUp.setText("Sign up");
        signUp.setTypeface(typeface);
        facebook.setText("Facebook");
        facebook.setTypeface(typeface);
        google.setText("Google");
        google.setTypeface(typeface);
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        );
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SignUp.this, "Facebook clicked",
                        Toast.LENGTH_LONG).show();
            }
        });
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SignUp.this,"Sign up clicked",Toast.LENGTH_LONG).show();
            }
        });
        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SignUp.this,"Google clicked",Toast.LENGTH_LONG).show();
            }
        });
    }

}