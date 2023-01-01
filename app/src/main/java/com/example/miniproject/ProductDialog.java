package com.example.miniproject;

import android.app.Dialog;
import android.content.Context;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
public class ProductDialog extends Dialog {
    TextView Title,Price,Descrition;
    Button Buy,Dismiss;
    Context context1;
    String Title1,Price1;
    public ProductDialog(@NonNull Context context,String Title1,String Price1) {
        super(context);
        this.Title1=Title1;
        this.Price1=Price1;
        setContentView(R.layout.product_dialog_layout);
        initViews();
        initListener();
        this.context1=context;

    }
    interface OnSetProductDialog{
        void buyProduct();
        void cancel();
    }
    public OnSetProductDialog onSetProductDialog;
    public void setOnSetProductDialog(OnSetProductDialog onSetProductDialog)
    {
        this.onSetProductDialog=onSetProductDialog;
    }
    public void initViews()
    {
        Title=findViewById(R.id.TextViewTitle);
        Title.setText(Title1);
        Price=findViewById(R.id.TextViewPrice);
        Price.setText(Price1);
        Descrition=findViewById(R.id.Description);
        Descrition.setText(Title.getText().toString() + "is a Awsome product with Great Features");
        Buy=findViewById(R.id.Buy);
        Dismiss=findViewById(R.id.Dismiss);
    }
    public void initListener()
    {
        Buy.setOnClickListener(view ->
        {
            onSetProductDialog.buyProduct();
        });
        Dismiss.setOnClickListener(view ->
        {
            onSetProductDialog.cancel();
        });
    }

}
