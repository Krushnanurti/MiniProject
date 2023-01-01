package com.example.miniproject;


import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;


public class ProductPurchaseDialog extends Dialog {

    TextView PaymentMode;
    Button PhonePay,GooglePay;

    public ProductPurchaseDialog(@NonNull Context context) {
        super(context);
        setContentView(R.layout.product_purchase_activity);
        initViews();
        initListener();
    }
    public void initViews()
    {
        PhonePay=findViewById(R.id.PhonePay);
        PaymentMode=findViewById(R.id.PaymentMode);

    }
    public void initListener()
    {

        PhonePay.setOnClickListener(view ->  { Toast.makeText(view.getContext(),"Phone Pay Done",Toast.LENGTH_LONG).show();});

    }

}
