package com.rifat.refatportfolio;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by refat on 10/3/2016.
 */
public class Provider {
    static List<Language> languageList= new ArrayList<>();
    public static List<Language>getData(){return  languageList;}

    static {
        for (int i=0;i<1;i++) {
            languageList.add(new Language("o", "Bengali Sign Language Conversion","The objective of my project was translate signs to letter."+
                    "and So that deaf people" +
                    "        language to be understood by the people out of deaf community."+
                    "I work on this project" +
                    "        only translate Bengali langauge."+"I build a tool for the people who is unable to hear and speak."+
                    "    My system is one kind of bridge between deaf,"+"dumb and normal people."+" My system is cost effective."+
                    "  So that the poor background people may also use my system."+"I applied technical tools Matlab and Visual  Studio for" +
                    "        build my project."+" The whole project was divided into 8 step which was Feature Extraction" +"Image Processing," +
                    "        Segmentation,Database,"+"Recognition,"+"Experimental Results and Analysis,"+"Classification"+" and the last one was Conclusion."
                    +"      I have used K-nearest neighbor algorithm in classification step which give the output which dataset is nearest."));
            languageList.add(new Language("ss", "Online Shopping Ecommerce","   My website was about online shopping which name was Collection."+
                    "Nowadays online shopping" +
                    "        is so popular."+"It is too much tough for busy people to get enough time for shopping. "+" So for" +
                    "        this purpose I have decided to make a project about online shopping so people can easily buy" +
                    "        their necessary products."+"To build my online project I applied technical tools Netbeans  with database" +
                    "        MySql."+"I used the code HTML5,"+"CSS3,"+"PHP,"+"JAVASCRIPT and Bootstrap to develop my website."+
                    "I used javascript" +
                    "        to made image slideshow."+"I also applied javascript in order page.It is my first website with database,"+" mysql,"+
                    "php,"+"javascript."+"I hope I will build a better website than this in future."));
            languageList.add(new Language("ocs", "Coffee Shop","This is my website which was about Online Coffee Shop."+
                    "It was just like cafeteria website.In this website I keep a menu option where different type of flavoured coffees existed."+
                    "   People can be register and they can also login in my website."+"And they can order any kind of" +
                    "        flavoured coffee whatever they want."+"I used Netbeans as a technical tools.I applied HTML5," +
                    "        CSS3 and JAVASCRIPT."));
            languageList.add(new Language("temp", "TemaparatureCalculator ","   This is my first android app which is convert any  number Celsius to Farenheight" +
                    "        or Farenheight to Celsius.This is my first android app.My app is only convert integer" +
                    "        number.In my app user can take input by help of some button.And there are 2 button." +
                    "        One is for convert input number Celsius to Farenheight and another is for convert the number" +
                    "        Farenheight to Celsius."));
        }
    }
}
