package com.example.cmd.shop.DbOps;

import android.content.Context;

import com.example.cmd.shop.JavaClasses.Models.ProductTest;
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

    public void AddProduct(ProductTest productTest) {
        if (productTest != null) {
            DatabaseReference dbRef = FirebaseDatabase.getInstance().getReference("products");
            String productId = dbRef.push().getKey();
            productTest.setProductId(productId);
            dbRef.child(productId).setValue(productTest);
            //TODO: Add seprate For imgUrl and modify ProductTest Model.

        }
    }

    public void getProduct() {
        DatabaseReference dbRef = FirebaseDatabase.getInstance().getReference("products");

    }


}
