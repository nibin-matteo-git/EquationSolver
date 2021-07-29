package com.company;

import java.util.Scanner;

public class UserInputVersion1 implements IUserInput{
    Scanner myScanner = new Scanner("System.in");
    @Override
    public int[] getInput() {
        int[] myInput = intUserInput(userInput());
        return myInput;
    }
    private String[] userInput(){
        String[] inputArray = new String[3];
        int arrayIndex=0;
        String myInput = myScanner.nextLine();
        myInput=myInput.replaceAll("[+,=]",",");
        int start = 0;
        for(int i=0; i<myInput.length(); i++){
            if(myInput.charAt(i)==','){
                inputArray[arrayIndex]=myInput.substring(start,i);
                arrayIndex++;
                start = i+1;
            }
        }
        return inputArray;
    }

    private int[] intUserInput(String[] stringInput){
        int a=0,b=0,c=0;
        for(String i:stringInput){
            if (i.contains("x"))
                a=Integer.parseInt(i.replace("x",""));
            else if (i.contains("y"))
                b=Integer.parseInt(i.replace("y",""));
            else
                c=Integer.parseInt(i);
        }
        int[] arrayOfCoefficients = {a,b,c};
        return arrayOfCoefficients;

    }

}
