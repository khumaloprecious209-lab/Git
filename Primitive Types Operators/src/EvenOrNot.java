public class EvenOrNot {
    public static void main(String[] args){
        //Generate random number between 1 and 100
        int randomNumber = (int)(Math.random() * 100) + 1;
        System.out.println("Generated random number: " + randomNumber);

        //Check if random number is even or not
        if (randomNumber % 2 == 0) {
            System.out.println("The number " + randomNumber +
                    " is EVEN (divisible by 2 with no remainder)");
        } else {
            System.out.println("The number " + randomNumber +
                    " is NOT EVEN (has remainder of 1 when divided by 2)");
        }
    }
}
