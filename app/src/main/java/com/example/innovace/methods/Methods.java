package com.example.innovace.methods;

/**
 * Created by innovace on 22/1/18.
 */

public class Methods {


    public static void main(String[] args) {
        int l = 20;
        int w = 15;
        printArea(l,w);


       // printArea(10,10);
        printName();

        int area = getAreaValue(3,5);

        System.out.println("getarea vale : " +area);


    }
    public static void printName(){
        System.out.println("my name is soundharya,my bestie call sound");
    }

    public static void printArea(int len,int wid){

        System.out.println("Area :" +len*wid);
    }


    public static  int getAreaValue(int len,int wid){

        int areaVal = len*wid;
        return  areaVal;
    }

}
