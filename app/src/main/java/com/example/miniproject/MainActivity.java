package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText Username,Password;
Button Login,Register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initListeners();
    }
    public void initViews()
    {
        Username=findViewById(R.id.Username);
        Password=findViewById(R.id.Password);
        Login=findViewById(R.id.Login);
        Register=findViewById(R.id.Register);
    }

    public void initListeners()
    {

            Login.setOnClickListener(view -> {

                Intent intent = new Intent(MainActivity.this, QuickDelivery.class);
                intent.putExtra("Username", Username.getText().toString());
                startActivity(intent);
            });


    }
}