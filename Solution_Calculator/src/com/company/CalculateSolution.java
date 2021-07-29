package com.company;

public class CalculateSolution {
    private static IUserInput inputObj;
    private static int[] input1;
    private static int[] input2;

    public static int[] calculate(IUserInput inputObj){
        this.inputObj=inputObj;
        input1 = inputObj.getInput();
        input2 = inputObj.getInput();
    }
}
