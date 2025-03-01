import java.util.Stack;

public class DecodeString {
    public String toDecode(String s){
        Stack<Character> decodeSequence = new Stack<>();
        Stack<Integer> codeNum = new Stack<>();
        int stringCounter = 0;
        char valueString;

        //push string s into two different stacks
        for(int i = 0; i < s.length(); i++){
            char codeString = s.charAt(i);
            //checks if the first element in string is a number
            if(codeString == '1' || codeString == '2' ||
            codeString == '3' || codeString == '4' ||
            codeString == '5' || codeString == '6' ||
            codeString =='7' || codeString == '8' ||
            codeString == '9'){
                stringCounter = stringCounter*10 + codeString - '0';
            } //moves next element to string stack assuming it isn't a number
            else if(codeString == '['){
                //number stops appearing after the first bracket
                decodeSequence.push(codeString);
                codeNum.push(stringCounter);
            } else if(codeString == ']') {
                valueString = decodeSequence.pop();
                int count = codeNum.pop();
                if(count > 0){
                    decodeSequence.push(codeString);
                }
            }
        }
        return s;
    }

    public static void main(String[] args) {

    }

}
