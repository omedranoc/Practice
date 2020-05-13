package com.example.practice.hackerRank;

public class UtfDecode {
    // number of bytes indicates how many bytes is going to have
    //For 1-byte character, the first bit is a 0, followed by its unicode code.
    //For n-bytes character, the first n-bits are all one's, the n+1 bit is 0, followed by n-1 bytes with most significant 2 bits being 10.
    //uses the less significan integers
//         A character in UTF8 can be from 1 to 4 bytes long, subjected to the following rules:
//
//    For 1-byte character, the first bit is a 0, followed by its unicode code.
//    For n-bytes character, the first n-bits are all one's, the n+1 bit is 0, followed by n-1 bytes with most significant 2 bits being 10.
//    This is how the UTF-8 encoding would work:
    public static boolean validUtf8(int[] data) {
        for(int i = 0; i < data.length; i++) {
            System.out.println(data.length);
            String number = getNumber(data[i]);
            if(data.length == 1 && number.charAt(0) != '0'){
                return false;
            }
//            if(number.charAt(0) != '1' && i !=0 )
//                return false;

            if(number.charAt(0) == '1') {

                System.out.println("index"+i);
                if(!(number.length() > i && data.length > i && number.charAt(i+1) != '0')){
                    return false;
                }
                int counter = 0;
                while (number.length() > i + 1 && data.length > i +1 && number.charAt(i+1) != '0') {
                    i++;
                    counter += 1;
                    if(counter > 3)
                        return false;
                    String subsecuentData = getNumber(data[i]);
                    System.out.println("Sub data "+subsecuentData);
                    if(subsecuentData.charAt(0) != '1' || subsecuentData.charAt(1) != '0') {
                        return false;
                    }

                }

                System.out.println(i);

            }


        }

        return true;
    }

    static String getNumber(int i){
        String number =  Integer.toBinaryString(i);
        if (number.length() >8){
            number = number.substring(number.length() - 8);

        }
        if (number.length() <8){
            number = "00000000".substring(number.length()) + number;

        }
        return number;

    }

//        static String getBinary(int i){
//          String number = Integer.toBinaryString(i);
////          if (number.length() < 8)
////              number = number << (8 - number.length());
//            return number;
//        }
    }

