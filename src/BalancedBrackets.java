import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
    public static String isBalanced(String s){
        Stack<Character> balanceBracket = new Stack<>();

        //pushing opening brackets to stack
        for(int i = 0; i < s.length(); i++){
            char bracket = s.charAt(i);
            if(bracket == '{' || bracket == '[' || bracket == '('){
                balanceBracket.push(bracket);
            } else if(bracket == '}' || bracket == ']' || bracket == ')'){
                //if stack empty, not balanced since there is nothing to compare brackets to already in the stack
                if(balanceBracket.isEmpty()){
                    return "No";
                }
                //checks if brackets are paired, by comparing the char that has been popped from the stack
                //to current remaining bracket not yet added to stack
                char bracketTop = balanceBracket.pop();
                if((bracket == '}' && bracketTop != '{') ||
                        (bracket == ']' && bracketTop != '[') ||
                        (bracket == ')' && bracketTop != '(')){
                    return "No";
                }
            }
        }
        //if stack is empty, considered balanced
        return balanceBracket.isEmpty() ? "Yes" : "No";
    }

    public static void main(String[] args) {
        String s = "{[()]]}";
        System.out.println(isBalanced(s));
    }
}