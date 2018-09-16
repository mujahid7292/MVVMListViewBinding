package com.sand_corporation.www.mvvmlistviewbinding.Adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.sand_corporation.www.mvvmlistviewbinding.R;
import com.sand_corporation.www.mvvmlistviewbinding.ViewModel.MainViewModel;
import com.sand_corporation.www.mvvmlistviewbinding.databinding.ListRowBinding;

import java.util.ArrayList;

public class MainViewAdapter extends ArrayAdapter<MainViewModel>{

    private ArrayList<MainViewModel> newsModelArrayList;
    private Context mContext;

    public MainViewAdapter(@NonNull Context context, ArrayList<MainViewModel> newsModelArrayList) {
        super(context, R.layout.list_row, newsModelArrayList);
        this.mContext = context;
        this.newsModelArrayList = newsModelArrayList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        ListRowBinding listRowBinding = DataBindingUtil.inflate(
                inflater,R.layout.list_row,parent,false);
        listRowBinding.setNewsList(newsModelArrayList.get(position));
        View view = listRowBinding.getRoot();
        return view;
    }
}
