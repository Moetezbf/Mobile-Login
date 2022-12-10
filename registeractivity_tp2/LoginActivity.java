package com.fsb.registeractivity_tp2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.fsb.registeractivity_tp2.R;
import com.fsb.registeractivity_tp2.registerActivity;

public class LoginActivity extends AppCompatActivity {
    Button btn;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        txt = findViewById(R.id.signup);
        txt.setOnClickListener(view -> startActivity(new Intent(LoginActivity.this, registerActivity.class)));
    }
}