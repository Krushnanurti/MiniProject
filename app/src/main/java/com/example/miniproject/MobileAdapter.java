package com.example.miniproject;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MobileAdapter extends RecyclerView.Adapter<MobileAdapter.MobileViewHolder> {
    ImageView MobileImageView;
    TextView Title, Price;
    Button ProductDetails;
    Product product;
    ArrayList<Product> products;
    String Title1, Price1;
    ProductDialog productDialog;
    ProductPurchaseDialog productPurchaseDialog;

    public MobileAdapter( ArrayList<Product> products) {

        this.products = products;

    }

    class MobileViewHolder extends RecyclerView.ViewHolder {

        public MobileViewHolder(@NonNull View itemView) {
            super(itemView);
            MobileImageView = itemView.findViewById(R.id.Image1);
            Title = itemView.findViewById(R.id.Title);
            Price = itemView.findViewById(R.id.Price);
            Title1 = Title.getText().toString();
            Price1 = Price.getText().toString();
            ProductDetails = itemView.findViewById(R.id.ProductDetails);
            ProductDetails.setOnClickListener(view -> {
                //on click of this custom dialog should be opened.
                //creating a class for custom dialog
                product = products.get(getAdapterPosition());
                productDialog = new ProductDialog(view.getContext(), Title1, Price1);
                productDialog.setOnSetProductDialog(new OnSetProductDialogListener());
                productDialog.show();

            });

        }

        class OnSetProductDialogListener implements ProductDialog.OnSetProductDialog {

            @Override
            public void buyProduct() {
               productPurchaseDialog=new ProductPurchaseDialog(productDialog.context1);
               productPurchaseDialog.show();
            }

            @Override
            public void cancel() {
                productDialog.dismiss();
            }
        }


    }


    @NonNull
    @Override
    public MobileAdapter.MobileViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.mobile_product_view, null);
        //mam la ethe onClick attach karycha hota munun tyani image cha view show kela
        return new MobileViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MobileAdapter.MobileViewHolder holder, int position) {
        product = products.get(position);
    }

    @Override
    public int getItemCount() {
        return products.size();
    }
}
