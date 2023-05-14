package com.example.aakalp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ALogin extends AppCompatActivity {
    TextView message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alogin);
        message = findViewById(R.id.user1);
        Intent i = getIntent();
        String name = i.getStringExtra("name");
        message.setText(name);
    }
}