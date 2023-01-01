package com.example.miniproject;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ShoesActivity extends AppCompatActivity {
    String Text;
    TextView textView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getExtras();
        textView=findViewById(R.id.ShoesTextView);
        textView.setText(Text);
        textView.setOnClickListener(view ->
        {
            Toast.makeText(ShoesActivity.this,"Application Is yet to Build",Toast.LENGTH_LONG).show();
        });
    }
    public void getExtras()
    {
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        Text=bundle.getString("shoes");
    }
}
