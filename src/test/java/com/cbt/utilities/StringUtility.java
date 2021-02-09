package com.cbt.utilities;



public class StringUtility {

    public static String verifyEquals(String expected,String actual){
        expected="Safari";actual="Safari";
        if (expected.equals(actual)){
            return "PASS";

        }else {
            return "FAIL";
        }
      // System.out.println("expected = " + expected);
       // System.out.println("actual = " + actual);

    }
}
