package com.example.knowledgeforge;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LoginOption extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginoption);
        Button btn = (Button) findViewById(R.id.btnStudent);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginOption.this, Login.class);
                startActivity(intent);
            }
        });

        Button btn2 = (Button) findViewById(R.id.btnTutor);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginOption.this, LoginTutor.class);
                startActivity(intent);
            }
        });
    }

}
