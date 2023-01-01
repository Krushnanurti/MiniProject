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
    EditText Address;
    TextView PinCode,PaymentMode;
    Button PhonePay,COD,GooglePay;

    public ProductPurchaseDialog(@NonNull Context context) {
        super(context);
        setContentView(R.layout.product_purchase_activity);
        initViews();
        initListener();
    }
    public void initViews()
    {
        Address=findViewById(R.id.Address);
        PinCode=findViewById(R.id.EditPinCode);
        GooglePay=findViewById(R.id.GooglePay);
        PhonePay=findViewById(R.id.PhonePay);
        COD=findViewById(R.id.COD);
        PaymentMode=findViewById(R.id.PaymentMode);

    }
    public void initListener()
    {
        GooglePay.setOnClickListener(view -> {Toast.makeText(view.getContext(),"Google Pay Done",Toast.LENGTH_LONG).show();});
        PhonePay.setOnClickListener(view ->  { Toast.makeText(view.getContext(),"Phone Pay Done",Toast.LENGTH_LONG).show();});
        COD.setOnClickListener(view ->
        {
            Toast.makeText(view.getContext(),"COD Done",Toast.LENGTH_LONG).show();
        });
    }

}
