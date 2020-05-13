package com.example.practice.pramp;

public class Test {

    static boolean validateIP(String ip) {  //  "192.168.0.1"
        String[] ipSections = ip.split("\\.");
        for (String val : ipSections){
            System.out.println(val);
        }
        if(ipSections.length != 4)
        {
            System.out.println("");

            return false;
        }

        for(String val: ipSections)
        {      //
            if( val.length() > 3 || val.length() <1)
            {
                return false;
            }

            char[] charValues = val.toCharArray();
            for(char charVal: charValues)    // getIntegerValues
            {
                if(charVal > '9' || charVal < '0')
                {  System.out.println("3"+val);
                    return false;
                }
            }

            if(val.length() >= 2 && charValues[0] == '0')  // checkValidZefro
            { System.out.println("4"+val);
                return false;
            }

            Integer inVal = new Integer(val);
            if(inVal > 255 || inVal < 0)
            {
                System.out.println("5"+inVal);
                return false;
            }
        }

        return true;
    }



    // your code goes here

    public static void main(String[] args) {
        System.out.println(validateIP( "192.168.0.1"));
        // valid Ip.   split by the point more or less than 4 groups -> false
        //  0< integer <=255



    }

}
