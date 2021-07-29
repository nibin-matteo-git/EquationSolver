package com.company;

import java.util.Scanner;

public class Input {

    private static Scanner myScanner = new Scanner(System.in);
    private static int [][] matrix;
    private static int noOfVariables;

    public static void getInput(){
        int start = 0;
        System.out.println("enter the expressions. Eg. 5x+3y=3 or y=3x+6...");
        String expression = myScanner.nextLine();
        noOfVariables = noOfTerms(expression)-1;
        matrix= new int[noOfVariables][noOfVariables+1];
        matrix[0]=getCoefficients(expression);
        for (int i=1;i<=noOfVariables;i++){
            expression = myScanner.nextLine();
            matrix[i]=getCoefficients(expression);
        }


    }

    private static int noOfTerms(String variable){
        int noOfTerms=1;
        for (int i=0; i<variable.length(); i++){
            if (variable.substring(i)=="+" || variable.substring(i)=="=") {
                noOfTerms += 1;
            }
        }
        return noOfTerms;
    }

    private static int[] getCoefficients(String varr){
        int start=0;
        int[] coefficient=new int[noOfVariables+1];
        varr=varr.replaceAll("[abcdefghijklmnopqrstuvwxyzPQRSTUVWXYZABCDEFGHIJKLMNO]",
               "");
        varr=varr.replaceAll("[+=]",",");
        varr=varr+",";
        for (int i=0; i<noOfVariables+1; i++){
            coefficient[i]=Integer.parseInt(varr.substring(start,varr.indexOf(",")));
            start=varr.indexOf(",")+1;
        }
        return coefficient;

    }

}
