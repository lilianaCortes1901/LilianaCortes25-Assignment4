import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
    public static String isBalanced(String s){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter bracket sequence: ");

        s = input.nextLine();
        Stack<String> balanceBracket = new Stack<>();

        //adding s charAt to stack
        for(int i = 0; i < s.length(); i++){
            char bracket = s.charAt(i);
            if(bracket == '{' || bracket == '[' || bracket == '('){
                balanceBracket.push(String.valueOf(bracket));
            } else if(bracket == '}' || bracket == ']' || bracket == ')'){
                //if stack empty, not balanced
                if(balanceBracket.isEmpty()){
                    return "No";
                }
            }
            if(balanceBracket.isEmpty()){
                return "Yes";
            }
        }
        return "Yes";
    }

    public static void main(String[] args) {
        

        //System.out.println(balanceBracket);
    }
}