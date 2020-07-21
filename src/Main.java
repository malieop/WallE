import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Initialize Wall-E
        WallE wallE = new WallE();
        // TESTS
        // Uncomment to run these and see the results
        // I will not test the cases where the input has others characters different than N-S-W-E
        // Because the Regex in the input don't let that happen
        // Test #1
        // Result should be 11
        /*
        String wallETrajectory_1 = "NENENENENEWSWSWSWSWS";
        WallE wallETest_1 = new WallE();
        System.out.println("Result of trajectory: " +wallETrajectory_1);
        System.out.println(wallETest_1.makeWallETrajectory(wallETrajectory_1));

        // Test #2
        // Result should be 16
        String wallETrajectory_2 = "EEESSWWWNNNNEEESS";
        WallE wallETest_2 = new WallE();
        System.out.println("Result of trajectory: " +wallETrajectory_2);
        System.out.println(wallETest_2.makeWallETrajectory(wallETrajectory_2));

        // Test #3
        // Result should be 1
        // Not possible in the normal input because only accepts inputs with the characteres N-S-W-E

        String wallETrajectory_3 = "";
        WallE wallETest_3 = new WallE();
        System.out.println("Result of trajectory: " +wallETrajectory_3);
        System.out.println(wallETest_3.makeWallETrajectory(wallETrajectory_3));

        // Test #4
        // Results should be 8

        String wallETrajectory_4 = "WWWWEEEEEEEWWWWW";
        WallE wallETest_4 = new WallE();
        System.out.println("Result of trajectory: " +wallETrajectory_4);
        System.out.println(wallETest_4.makeWallETrajectory(wallETrajectory_4));

        // Test #5
        // RESULT SHOULD BE 18

        String wallETrajectory_5 = "SSSSSEEEEESEWWWWWWNNNN";
        WallE wallETest_5 = new WallE();
        System.out.println("Result of trajectory: " +wallETrajectory_5);
        System.out.println(wallETest_5.makeWallETrajectory(wallETrajectory_5));
        */
        //Initialize Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Wall-E trajectory.");
        //Verify if input only has the N-S-E-W letters
        while (!scanner.hasNext("[NSEW]+")) {
            System.out.println("That is not allowed. The Allowed values are N, S, E and W.");
            scanner.next();
        }
        //Wall-E tracjectory input
        String wallETrajectory = scanner.next();
        System.out.println(wallE.makeWallETrajectory(wallETrajectory));
    }
}