package com.string.com.string.conversion;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws Exception{
        //String to int
        String s = "200";
        int i = Integer.parseInt(s);
        System.out.println(s+100);
        System.out.println(i+100);

        //int to String:co 2 cach
        //---cach1: String.valueof()
        int i1= 200;
        String s1= String.valueOf(200);
        System.out.println("s1: "+(s1+100));
        //cach2: Integer.toString()
        String s2= Integer.toString(i);
        System.out.println("s2: "+(s2+20));

        //String to Date
        String sDate = "29/01/1996";
        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
        System.out.println(sDate+"\t"+date1);
        //types of string to Date
        String sDate2 = "31-Dec-1998";
        SimpleDateFormat fm2 = new SimpleDateFormat("dd-MMM-yyyy");
        Date date2 = fm2.parse(sDate2);
        System.out.println(sDate2+"\t"+date2);
        //--
        String sDate3 = "12 31,1998";
        SimpleDateFormat fm3 = new SimpleDateFormat("MM dd,yyyy");
        Date date3= fm3.parse(sDate3);
        System.out.println(sDate3+"\t"+date3);
        //--
        String sDate4 = "Thu, Dec 31 1998";
        SimpleDateFormat fm4 = new SimpleDateFormat("E, MMM dd yyyy");
        Date date4 = fm4.parse(sDate4);
        System.out.println(sDate4+"\t"+date4);

    }
}
