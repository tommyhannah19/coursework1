import java.util.Scanner;

class Dex2Hex {
    public static void main(String args[]) {
        // Check if input argument is provided
        if (args.length == 0) {
            System.err.println("Error: No input argument provided. Please provide a decimal value.");
            System.exit(1); // Exit with an error code
        }

        // Handle non-integer inputs
        try {
            int num = Integer.parseInt(args[0]);
            String hexadecimal = convertToHex(num);
            System.out.println("Hexadecimal representation is: " + hexadecimal);
        } catch (NumberFormatException e) {
            System.err.println("Error: Invalid input. Please provide a valid decimal value.");
            System.exit(1); // Exit with an error code
        }
    }

    private static String convertToHex(int num) {
        char ch[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int rem;
        String hexadecimal = "";

        System.out.println("Converting the Decimal Value " + num + " to Hex...");

        while (num != 0) {
            rem = num % 16;
            hexadecimal = ch[rem] + hexadecimal;
            num = num / 16;
        }

        return hexadecimal;
    }
}

