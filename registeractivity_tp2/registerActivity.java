package com.fsb.registeractivity_tp2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class registerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        TextView btn=findViewById(R.id.alreadyHabeAccount);
        btn.setOnClickListener(view -> startActivity(new Intent(registerActivity.this, LoginActivity.class)));
    }
}
