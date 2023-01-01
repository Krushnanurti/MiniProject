package com.example.miniproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class QuickDelivery extends AppCompatActivity  {
    ImageView Mobile,Watches,Shoes;
    String Mobiles="AndroidPhones";
    String Watch="AndroidWatches";
    String Shoe="Shoes";
   private final int LogIn=1,LogOut=2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quick_delivery_layout);
        initViews();
        getExtras();
        initListener();
    }
    public void initViews()
    {
        Mobile=findViewById(R.id.Mobile);
        Watches=findViewById(R.id.Watches);
        Shoes=findViewById(R.id.Shoes);
    }
    public void initListener()
    {
        Mobile.setOnClickListener(view ->
        {
            Intent imageIntent=new Intent(QuickDelivery.this,MobileActivity.class);
            imageIntent.putExtra("Mobile",Mobiles);
            startActivity(imageIntent);
        });
        Watches.setOnClickListener(view ->
        {
            Intent WatchIntent=new Intent(QuickDelivery.this,WatchActivity.class);
            WatchIntent.putExtra("watches",Watch);
            startActivity(WatchIntent);
        });
        Shoes.setOnClickListener(view ->
        {
            Intent shoeIntent=new Intent(QuickDelivery.this,ShoesActivity.class);
            shoeIntent.putExtra("shoes",Shoe);
            startActivity(shoeIntent);
        });

    }
    public void getExtras()
    {
        Intent i=getIntent();
        Bundle bundle=i.getExtras();
        String s=bundle.getString("Username");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem menuItem=menu.add(1,1,1,"LogIn");
        MenuItem menuItem1=menu.add(2,2,2,"LogOut");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case 1:
                Toast.makeText(QuickDelivery.this,"LogIn",Toast.LENGTH_LONG).show();
            case 2:
                Toast.makeText(QuickDelivery.this,"Logout Successful",Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
