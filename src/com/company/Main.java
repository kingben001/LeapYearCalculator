package com.company;

public class Main {

    public static void main(String[] args) {
        boolean test = isLeapYear(2006);
        System.out.println(test);
        int tet1 = 2012 % 400;
        System.out.println(tet1);
    }

    public static boolean isLeapYear (int year){
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0){
                if (year % 100 == 0){
                    return  (year % 400 == 0);
                } else return true;
            } else return false;
        } else return false;
    }
}


