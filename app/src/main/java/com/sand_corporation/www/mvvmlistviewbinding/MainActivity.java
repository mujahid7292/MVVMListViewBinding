package com.sand_corporation.www.mvvmlistviewbinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.sand_corporation.www.mvvmlistviewbinding.Adapter.MainViewAdapter;
import com.sand_corporation.www.mvvmlistviewbinding.ViewModel.MainViewModel;
import com.sand_corporation.www.mvvmlistviewbinding.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mainBinding;
    private MainViewModel mViewModel;
    private ArrayList<MainViewModel> mViewModelArrayList;
    private MainViewAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        mViewModel = new MainViewModel();
        mViewModelArrayList = mViewModel.getArrayListForMainActivity();
        mAdapter = new MainViewAdapter(this,mViewModelArrayList);

        mainBinding.listView.setAdapter(mAdapter);
    }
}
