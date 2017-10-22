package com.example.cmd.shop.DbOps;

import android.content.Context;

import com.example.cmd.shop.JavaClasses.Models.Product;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by cmd on 20.10.17.
 */

public class DbOps {
    private static final String TAG = "DbOps";
    private FirebaseDatabase dbInstance;
    private Context mContext;

    public DbOps(FirebaseDatabase dbInstance,Context xtx) {
        this.dbInstance = dbInstance;
        this.mContext = xtx;
    }

    public void AddProduct(Product product) {
        if (product != null) {
            DatabaseReference dbRef = FirebaseDatabase.getInstance().getReference("products");
            String productId = dbRef.push().getKey();
            product.setProductId(productId);
            dbRef.child(productId).setValue(product);
            //TODO: Add seprate For imgUrl and modify Product Model.

        }
    }

    public void getProduct() {
        DatabaseReference dbRef = FirebaseDatabase.getInstance().getReference("products");

    }


}
