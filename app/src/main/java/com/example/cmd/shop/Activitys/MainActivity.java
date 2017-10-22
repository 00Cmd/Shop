package com.example.cmd.shop.Activitys;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.cmd.shop.Fragments.ProductListFragment;
import com.example.cmd.shop.Fragments.SingleFragmentActivity;
import com.example.cmd.shop.R;

public class MainActivity extends SingleFragmentActivity {

    @Override
    public Fragment createFragment() {
        return ProductListFragment.newInstance();
    }
}
