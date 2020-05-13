package com.example.practice.pramp;

class RootNumber {

    static double root(double x, int n) {
        double low = 0;
        double high = x; //x
        double error =0.001;
        double mid = (low + high)/2;
        while( mid - error >= 0.001){
            // Klogn
            int counter = 1;
            double val = Math.pow(mid, n);
            // System.out.println(val);
            //    x  <  4
            if(val < x - error){
                mid = mid +0.001;
            }
            else if(val > x + error){
                mid = mid -0.001;
            }
            else{
                return mid;
            }


        }

        return 0.0;
    }



    public static void main(String[] args) {
        System.out.println(root(4, 2));
        System.out.println(root(9, 2));
        System.out.println(root(7, 3));
    }

}