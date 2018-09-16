package com.sand_corporation.www.mvvmlistviewbinding.ViewModel;

import com.sand_corporation.www.mvvmlistviewbinding.Model.News;

import java.util.ArrayList;

public class MainViewModel {
    public String header;
    public String description;

    public MainViewModel(News news) {
        this.header = news.header;
        this.description = news.description;
    }

    public MainViewModel() {

    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<MainViewModel> getArrayListForMainActivity(){
        ArrayList<MainViewModel> newsModelArrayList = new ArrayList<>();

        MainViewModel mainViewModel1 = new MainViewModel(new
                News("This First Header","This First Description"));
        MainViewModel mainViewModel2 = new MainViewModel(new
                News("This Second Header","This Second Description"));
        MainViewModel mainViewModel3 = new MainViewModel(new
                News("This Third Header","This Third Description"));
        MainViewModel mainViewModel4 = new MainViewModel(new
                News("This Fourth Header","This Fourth Description"));
        MainViewModel mainViewModel5 = new MainViewModel(new
                News("This Fifth Header","This Fifth Description"));

        newsModelArrayList.add(mainViewModel1);
        newsModelArrayList.add(mainViewModel2);
        newsModelArrayList.add(mainViewModel3);
        newsModelArrayList.add(mainViewModel4);
        newsModelArrayList.add(mainViewModel5);
        return newsModelArrayList;
    }
}
