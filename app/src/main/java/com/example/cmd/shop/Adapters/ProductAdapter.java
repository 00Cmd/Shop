package com.example.cmd.shop.Adapters;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import com.example.cmd.shop.JavaClasses.Models.Product;
import com.example.cmd.shop.R;
import com.example.cmd.shop.ViewModels.ProductViewModel;
import com.example.cmd.shop.databinding.ProductListBinding;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cmd on 22.10.17.
 */

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductHolder>{
    private List<Product> mProducts;

    public ProductAdapter(List<Product> mProducts) {
        this.mProducts = mProducts;
    }

    @Override
    public ProductHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        ProductListBinding mBinding = DataBindingUtil.inflate(inflater, R.layout.product_list
        ,parent,false);
        return new ProductHolder(mBinding);
    }

    @Override
    public void onBindViewHolder(ProductHolder holder, int position) {
        ProductListBinding mBinding = holder.mBinding;
        mBinding.setPvm(new ProductViewModel(mProducts.get(position)));
    }

    @Override
    public int getItemCount() {
        return mProducts.size();
    }

    public static class ProductHolder extends RecyclerView.ViewHolder {
        private ProductListBinding mBinding;

        public ProductHolder(ProductListBinding mBinding) {
            super(mBinding.mainView);
            this.mBinding = mBinding;
        }
    }
}
