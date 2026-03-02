public class MarsWeight {
    public static void main(String[] args){
        //declare all variables at the top
        //float marsWeightKhumalo;
        float marsGravityKhumalo;
        char marsWeightCharKhumalo;
        //double marsWeightDoubleKhumalo;
        float earthWeightKhumalo = 70f;//weight on earth in kg
        float marsGravityPercentKhumalo = 0.38f;//Mars gravity is 38% of Earth's

        //calculate Mars weight and assign to double variable
        float marsWeightFloat = earthWeightKhumalo * marsGravityPercentKhumalo;
        double marsWeightDouble = marsWeightFloat;

        //Print result
        //System.out.println("Weight on Mars(float): " + marsWeightKhumalo);
        //marsWeightDoubleKhumalo = marsWeightKhumalo;

        //Print double with 4 decimal places
        System.out.println("My weight on Mars (double with 4 decimal places): " +
                String.format("%.4f", marsWeightDouble) + " kg");

        //Cast double type to int type
        int marsWeightInt = (int) marsWeightDouble;
        System.out.println("After casting to int (decimal part truncated): " +
                marsWeightInt + " kg");

        //Cast int type to char type
        char marsWeightChar = (char) marsWeightInt;
        //System.out.println("Int cast to char: " + marsWeightCharKhumalo);
        System.out.println("After casting to char (ASCII character): '" +
                marsWeightChar + "' (ASCII value: " + (int)marsWeightChar + ")");

        //Math Operation with variable char
        int newIntValue = marsWeightChar + 5;
        System.out.println("After adding 5 to char value: " + newIntValue);
    }
}
