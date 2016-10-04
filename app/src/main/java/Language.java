package com.rifat.refatportfolio;

/**
 * Created by refat on 10/3/2016.
 */
public class Language {

    String id;
    String name;
    String detail;

    public Language(String id,String name,String detail) {
        this.id = id;
        this.name = name;
        this.detail=detail;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public  String getDetail(){return  detail;}
    @Override
    public String toString() {
        return
                "Title: " + name;
    }
}
