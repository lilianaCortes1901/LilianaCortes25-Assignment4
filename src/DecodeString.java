import java.util.Stack;

public class DecodeString {
    public String toDecode(String s){
        Stack<String> decodeSequence = new Stack<>();
        Stack<Integer> codeNum = new Stack<>();
        StringBuilder newString = new StringBuilder();
        int stringCounter = 0;
        //char valueString;

        //push string s into two different stacks
        for(int i = 0; i < s.length(); i++){
            char codeString = s.charAt(i);
            //checks if the first element in string is a number
            if(Character.isDigit(codeString)){
                stringCounter = stringCounter*10 + codeString - '0';
            } //moves next element to string stack assuming it isn't a number
            else if(codeString == '['){
                //number stops appearing after the first bracket
                codeNum.push(stringCounter);
                decodeSequence.push(String.valueOf(codeString));
                stringCounter = 0;
                newString.setLength(0);
            } else if(codeString == ']') {
                StringBuilder temp = new StringBuilder(decodeSequence.pop());
                int count = codeNum.pop();
                if(count > 0){
                    decodeSequence.push(String.valueOf(codeString));
                } else {
                    decodeSequence.push();
                }
            }
        }
        return s;
    }

    public static void main(String[] args) {
        DecodeString decoder = new DecodeString();
        String s = "3[a]2[bc]";
        System.out.println(decoder.toDecode(s));
    }

}
