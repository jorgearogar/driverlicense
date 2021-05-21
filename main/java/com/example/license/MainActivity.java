package com.example.license;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button enter;
    EditText a,b,c,d,e,f,g,h,i;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enter=(Button)findViewById(R.id.button);
        a=(EditText) findViewById(R.id.name);
        b=(EditText) findViewById(R.id.national);
        c=(EditText) findViewById(R.id.gender);
        d=(EditText) findViewById(R.id.dob);
        e=(EditText) findViewById(R.id.weight);
        f=(EditText) findViewById(R.id.height);
        g=(EditText) findViewById(R.id.address);
        h=(EditText) findViewById(R.id.blood);
        i=(EditText) findViewById(R.id.condition);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    intent = new Intent(getApplicationContext(), driver.class);
                    intent.putExtra("E1", a.getText().toString());
                    intent.putExtra("E2", b.getText().toString());
                    intent.putExtra("E3", c.getText().toString());
                    intent.putExtra("E4", d.getText().toString());
                    intent.putExtra("E5", e.getText().toString());
                    intent.putExtra("E6", f.getText().toString());
                    intent.putExtra("E7", g.getText().toString());
                    intent.putExtra("E8", h.getText().toString());
                    intent.putExtra("E9", i.getText().toString());
                Toast.makeText(getApplicationContext(), "DATA SUBMITTED", Toast.LENGTH_SHORT).show();
                    startActivity(intent);

            }
        });
    }
}