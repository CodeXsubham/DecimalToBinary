import  java.util.Scanner;
public class mains {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String binaryString;

        System.out.print("Enter a binary number: ");
        binaryString = scanner.next();

        int baseValue = 2;
        int expValue = 0;
        int powerValue = 1;
        int decNum = 0;
        int i = binaryString.length() - 1;

        while (i >= 0){
            if(binaryString.charAt(i) == '1'){
                for(int j = 0; j < expValue; j++){
                    powerValue *= baseValue;
                }
                decNum += powerValue;
                powerValue = 1;
            }
            i--;
            expValue++;
        }
        System.out.println("Decimal Number is: " + decNum);
    }
}