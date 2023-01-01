package com.example.miniproject;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MobileActivity extends AppCompatActivity {
    String Text;
    ArrayList<Product> products;
    MobileAdapter mobileAdapter;
    Product product;
    RecyclerView recyclerView;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mobile_activity_layout);
        getExtras();
        initProducts();
        recyclerView=findViewById(R.id.Rv2);
        recyclerView.setLayoutManager(new LinearLayoutManager(MobileActivity.this,
                LinearLayoutManager.VERTICAL,false));
        mobileAdapter=new MobileAdapter(products);
        recyclerView.setAdapter(mobileAdapter);


    }
    public void getExtras()
    {
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        Text=bundle.getString("Mobile");
    }

    public  void initProducts()
    {
        products=new ArrayList<>();
        for (int i=0;i<10;i++)
        {
            products.add(new Product(i,
                    "Mobile1","12000"));
        }

    }
}
