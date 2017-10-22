package com.example.cmd.shop.ViewModels;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.cmd.shop.BR;
import com.example.cmd.shop.JavaClasses.Models.Product;

/**
 * Created by cmd on 22.10.17.
 */

public class ProductViewModel extends BaseObservable{
    private Product mProduct;

    public ProductViewModel(Product mProduct) {
        this.mProduct = mProduct;
    }

    @Bindable
    public String getTitle() {
        return mProduct.getTitle();
    }

    public void setTitle(String title) {
        mProduct.setTitle(title);
        notifyPropertyChanged(BR.title);
    }

    @Bindable
    public String getDesc() {
        return mProduct.getDescription();
    }

    public void setDesct(String desc) {
        mProduct.setDescription(desc);
        notifyPropertyChanged(BR.desc);
    }

    @Bindable
    public String getImg() {
        return mProduct.getImgString();
    }

    public void setImg(String url) {
        mProduct.setImgString(url);
        notifyPropertyChanged(BR.img);
    }

    @Bindable
    public String getPrice() {
        return "" + mProduct.getPrice();
    }

    public void setPrice(double price) {
        mProduct.setPrice(price);
    }


}
