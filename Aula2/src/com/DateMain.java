package com;

public class DateMain {
    public static void main(String[] args) {
        Date date = new Date(2021, 5, 10);
        System.out.println(date.isValid());
        System.out.println(date);

        Date date2 = new Date("20/02/2020");
        System.out.println(date2.isValid());
        System.out.println(date2);

        date.addDay();
        date2.addDay();
        System.out.println(date);
        System.out.println(date2);
    }
}
