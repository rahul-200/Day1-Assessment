package java_training;
import java.util.Scanner;
public class Numbertowords {
    
    private static final String[] ONES = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", 
                                         "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", 
                                         "Eighteen", "Nineteen" };
    
    private static final String[] TENS = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
    
    private static final String[] THOUSANDS = { "", "Thousand", "Million", "Billion" };
    
    public static String convertToWords(long number) {
        if (number == 0) {
            return "Zero";
        }
        
        StringBuilder words = new StringBuilder();
        int thousandIndex = 0;

        while (number > 0) {
            if (number % 1000 != 0) {
                words.insert(0, convertHundreds((int)(number % 1000)) + THOUSANDS[thousandIndex] + " ");
            }
            number /= 1000;
            thousandIndex++;
        }
        
        return words.toString().trim();
    }
    
    private static String convertHundreds(int number) {
        StringBuilder word = new StringBuilder();
        
        if (number >= 100) {
            word.append(ONES[number / 100] + " Hundred ");
            number %= 100;
        }
        
        if (number >= 20) {
            word.append(TENS[number / 10] + " ");
            number %= 10;
        }
        
        if (number > 0) {
            word.append(ONES[number] + " ");
        }
        
        return word.toString();
    }

    public static void main(String[] args) {
    	Scanner Sc= new Scanner(System.in);
        int number = Sc.nextInt();
        System.out.println("Number in words: " + convertToWords(number));
    }
}
