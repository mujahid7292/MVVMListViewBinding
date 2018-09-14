package com.sand_corporation.www.mvvmlistviewbinding.Model;

public class News {
    public String header;
    public String description;

    public News(String header, String description) {
        this.header = header;
        this.description = description;
    }

    public News() {

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
}
