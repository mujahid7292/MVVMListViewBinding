package com.sand_corporation.www.mvvmlistviewbinding.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.ArrayAdapter;

import com.sand_corporation.www.mvvmlistviewbinding.R;
import com.sand_corporation.www.mvvmlistviewbinding.ViewModel.MainViewModel;

import java.util.ArrayList;

public class NewsAdapter extends ArrayAdapter<MainViewModel>{

    public NewsAdapter(@NonNull Context context, ArrayList<MainViewModel> newsModelArrayList) {
        super(context, R.layout.list_row);
    }
}
