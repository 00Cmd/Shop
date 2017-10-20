package com.example.cmd.shop.Activitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.cmd.shop.DbOps.DbOps;
import com.example.cmd.shop.JavaClasses.Models.Product;
import com.example.cmd.shop.R;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirebaseDatabase mDb = FirebaseDatabase.getInstance();
        DbOps dbOps = new DbOps(mDb,getApplicationContext());
        Product product = new Product("Title","Description","ImgUrl",2.5);
        dbOps.AddProduct(product);
    }
}
