package com.example.bookapp.Authentication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.bookapp.MainActivity;
import com.example.bookapp.OnBoarding.OnBoardingScreen;
import com.example.bookapp.R;

public class SignUpActivity extends AppCompatActivity {

   private Button Next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        Next = findViewById(R.id.Next);

        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUpActivity.this, OnBoardingScreen.class);
                startActivity(intent);
                finish();
            }
        });
    }
}