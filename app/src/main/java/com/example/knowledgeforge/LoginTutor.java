package com.example.knowledgeforge;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginTutor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logintutor);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageButton btn = (ImageButton) findViewById(R.id.imageButton3);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) EditText userName = (EditText)findViewById(R.id.editTextText);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) EditText passWord = (EditText)findViewById(R.id.editTextText2);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(userName.getText().toString().equals("username") && passWord.getText().toString().equals("1234")){
                    Intent intent = new Intent(LoginTutor.this, Dashboard.class);
                    startActivity(intent);
                }
                else
                    Toast.makeText(LoginTutor.this, "LOGIN FAILED",Toast.LENGTH_SHORT).show();
            }
        });
    }

}
