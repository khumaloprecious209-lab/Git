public class LegoBricks {
    public static void main(String[]args){

     //Choose an odd number between 50 and 100
     int amountOfBricks = 61;
        System.out.println("Number of Lego Bricks: " + amountOfBricks);

     //Choose an even number between 5 and 10
        int containerCapacity = 6;
     System.out.println("Each container can hold: " + containerCapacity);

     //Calculate number of full containers
        int fullContainers = amountOfBricks / containerCapacity;
        System.out.println("Number of FULL containers: " + fullContainers);

        //Calculate how many containers( full and not full)
        int totalContainers = (int)Math.ceil((double)amountOfBricks/
                containerCapacity);
        System.out.println("Total containers needed (full + not full): " +
                totalContainers);

        //Calculate how many blocks are in the container that is not full
        int remainingBricks = amountOfBricks % containerCapacity;
        System.out.println("Blocks in the container that is not full: " + remainingBricks);

    }
}
