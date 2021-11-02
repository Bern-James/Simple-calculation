package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MathExcution[] excutions = new MathExcution[4];

        excutions[0] = create(100, 300, 'a');
        excutions[1] = create(200, 789, 's');
        excutions[2] = create(467, 100, 'd');
        excutions[3] = create(500, 43, 'm');

        for (MathExcution excution : excutions){
            excution.execute();
            System.out.println("Result is ="+excution.getResults());

        }

    }

    public static MathExcution create(double leftVal, double rightVal, char codes){
        MathExcution excution = new MathExcution();
        excution.setLeftVal(leftVal);
        excution.setRightVal(rightVal);
        excution.setCodes(codes);
        return excution;
    }
}
