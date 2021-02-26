import java.util.*;

public class problem2{

    
    public static int bin2Dec(String binaryString) throws NumberFormatException {
        int total = 0;
        for(int i = 0; i < binaryString.length(); ++i) {
            if(binaryString.charAt(i) != '0' && binaryString.charAt(i) != '1') {
                throw new NumberFormatException(binaryString + " error. Not a binary character");
            }
            total += Math.pow(2, binaryString.length() - i - 1) * (binaryString.charAt(i) - '0');
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String str = in.nextLine();
        try {
            System.out.println("Decimal value of " + str + " is " + bin2Dec(str));
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
