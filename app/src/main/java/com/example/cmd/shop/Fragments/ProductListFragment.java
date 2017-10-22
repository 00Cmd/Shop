package com.example.cmd.shop.Fragments;


import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cmd.shop.Adapters.ProductAdapter;
import com.example.cmd.shop.JavaClasses.Models.Product;
import com.example.cmd.shop.R;
import com.example.cmd.shop.databinding.ProductListFragmentBinding;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cmd on 22.10.17.
 */

public class ProductListFragment extends Fragment {

    private List<Product> mProducts;

    public static ProductListFragment newInstance() {
        return new ProductListFragment();
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mProducts = new ArrayList<>();
        Product product = new Product("Title","Description",
                "ImgUrl",5.5);
        Product product2 = new Product("Title2","Description2",
                "ImgUrl2",5.5);
        Product product3 = new Product("Title3","Description3",
                "ImgUrl3",5.5);

        mProducts.add(product);
        mProducts.add(product2);
        mProducts.add(product3);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ProductListFragmentBinding mBinding = DataBindingUtil.inflate(inflater,
                R.layout.product_list_fragment,container,false);
        mBinding.recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        ProductAdapter adapter = new ProductAdapter(mProducts);
        mBinding.recyclerView.setAdapter(adapter);

        return mBinding.getRoot();
    }
}
