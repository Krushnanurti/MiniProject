package com.example.miniproject;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class WatchActivity extends AppCompatActivity {
    String Text;
    TextView text;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getExtras();
        text=findViewById(R.id.WatchTextView);
        text.setText(Text);
        text.setOnClickListener(view ->
        {
            Toast.makeText(WatchActivity.this,"Application Is yet to Build",Toast.LENGTH_LONG).show();
        });

    }
    public void getExtras()
    {
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        Text=bundle.getString("watches");
    }
}
