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

public class MainActivity extends AppCompatActivity {
    Button facebook;
    Button google;
    Button signIn;
    Button signUp;
    Typeface typeface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        typeface = Typeface.createFromAsset(getAssets(),"didot.ttf");
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        facebook = (Button) findViewById(R.id.btn_facebook);
        google = (Button) findViewById(R.id.btn_google);
        signIn = (Button)findViewById(R.id.btn_signin);
        signUp = (Button)findViewById(R.id.btn_signup);
        facebook.setText("Facebook");
        google.setText("Google");
        facebook.setTypeface(typeface);
        google.setTypeface(typeface);
        signIn.setText("Sign in");
        signIn.setTypeface(typeface);
        signUp.setText("Sign up");
        signUp.setTypeface(typeface);
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        );
        signIn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Toast.makeText(MainActivity.this, "sign in clicked",
                Toast.LENGTH_LONG).show();
    }
});
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signUp= new Intent(MainActivity.this, SignUp.class);
                startActivity(signUp);
            }
        });
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "facebook clicked",
                        Toast.LENGTH_LONG).show();
            }
        });
        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "google clicked",
                        Toast.LENGTH_LONG).show();
            }
        });
    }

    }
