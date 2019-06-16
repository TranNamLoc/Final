package com.example.midterm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {
Button signUp;
Button facebook;
Button google;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        facebook = (Button)findViewById(R.id.btn_facebook_signup);
        signUp = (Button)findViewById(R.id.btn_signup_signup);
        google = (Button) findViewById(R.id.btn_google_signup);
        signUp.setText("Sign up");
        //signUp.setTypeface(typeface);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        );
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SignUp.this, "sign up clicked",
                        Toast.LENGTH_LONG).show();
            }
        });
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SignUp.this, "facebook clicked",
                        Toast.LENGTH_LONG).show();
            }
        });
        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SignUp.this, "google clicked",
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}
