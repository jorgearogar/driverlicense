package com.example.license;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import android.widget.Button;
import android.widget.Toast;

public class driver extends AppCompatActivity {
    TextView A,B,C,D,E,F,G,H,I;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver);
        A = (TextView)findViewById(R.id.name);
        B = (TextView)findViewById(R.id.nation);
        C = (TextView)findViewById(R.id.gender);
        D = (TextView)findViewById(R.id.dob);
        E = (TextView)findViewById(R.id.weight);
        F = (TextView)findViewById(R.id.height);
        G = (TextView)findViewById(R.id.address);
        H = (TextView)findViewById(R.id.blood);
        I = (TextView)findViewById(R.id.condition);

        A.setText(getIntent().getStringExtra("E1"));
        B.setText(getIntent().getStringExtra("E2"));
        C.setText(getIntent().getStringExtra("E3"));
        D.setText(getIntent().getStringExtra("E4"));
        E.setText(getIntent().getStringExtra("E5"));
        F.setText(getIntent().getStringExtra("E6"));
        G.setText(getIntent().getStringExtra("E7"));
        H.setText(getIntent().getStringExtra("E8"));
        I.setText(getIntent().getStringExtra("E9"));
    }
}