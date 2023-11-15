import java.util.Scanner;

class Dex2Hex {
    public static int Arg1;

    public static void main(String args[]) {
        // Check if input argument is provided
        if (args.length == 0) {
            System.err.println("Error: No input argument provided. Please provide a decimal value.");
            System.exit(1); // Exit with an error code
        } else {
            Arg1 = Integer.parseInt(args[0]);
            
            char ch[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
            int rem, num;
            num = Arg1;
            String hexadecimal = "";
            System.out.println("Converting the Decimal Value " + num + " to Hex...");

            while (num != 0) {
                rem = num % 16;
                hexadecimal = ch[rem] + hexadecimal;
                num = num / 16;
            }

            System.out.println("Hexadecimal representation is: " + hexadecimal);
        }
    }
}
