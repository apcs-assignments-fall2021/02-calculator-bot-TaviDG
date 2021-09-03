import java.util.Scanner;

public class MyMain {

    // Calculates the median of the three inputs
    public static int median(int a, int b, int c) {
        int big = Math.max(a,b);
        int small = Math.min(a,b);
        if (c>=big){
            return big;
        }
        else {
            return Math.max(c, small);
        }
    }


    // Returns the input with the larger absolute value
    public static int magnitude(int a, int b) {
        if (Math.abs(a)>Math.abs(b)){
            return a;
        }
        return b;
    }

    // Returns the "c" value from the Pythagorean theorem "a^2 + b^2 = c^2",
    // where "a" and "b" are the inputs to the method
    public static double pythagoras(int a, int b) {

        return Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
    }

    public static void main(String[] args) {
        // You may want to keep these lines of code to test that your methods work
//        System.out.println(median(1, 2, 3)); // should be 2
//        System.out.println(magnitude(-7, -1)); // should be -7
//        System.out.println(pythagoras(3, 4)); // should be 5.0

        Scanner scan = new Scanner(System.in);
        System.out.println("What command would you like to carry out?");
        String command = scan.next();
        if (command.equals("median")){
            System.out.println("Input 3 integers");
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            System.out.println(median(a,b,c));
        }
        else if (command.equals("magnitude")){
            System.out.println("Input 2 integers");
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println(magnitude(a,b));
        }
        else if (command.equals("pythagoras")){
            System.out.println("Input 2 integers");
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println(pythagoras(a,b));
        }
        // YOUR CODE HERE
    }
}
