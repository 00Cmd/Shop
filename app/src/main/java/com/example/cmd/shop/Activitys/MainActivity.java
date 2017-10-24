package com.example.cmd.shop.Activitys;

import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;

import com.example.cmd.shop.Fragments.ProductListFragment;
import com.example.cmd.shop.Fragments.SingleFragmentActivity;
import com.example.cmd.shop.R;

public class MainActivity extends SingleFragmentActivity  {


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public Fragment createFragment() {
        return ProductListFragment.newInstance();
    }
}
