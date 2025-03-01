import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter bracket sequence: ");

        String[] s = {input.nextLine()};
        Stack<String> balanceBracket = new Stack<>();

        //add input string to stack
        for(int i = 0; i < s.length; i++){
            balanceBracket.push(s[i]);
        }

        //check if balanced
        for(int i = 0; i < balanceBracket.size(); i++){
            if(balanceBracket.contains("{") || balanceBracket.contains("[") || balanceBracket.contains("(")){
                balanceBracket.pop();
            } else if(balanceBracket.contains("]")){}
        }

        //System.out.println(balanceBracket);
    }
}