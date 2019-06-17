package multiBracketValidation;

import java.util.Stack;

public class MultiBracketValidation {
    public static boolean multiBracketValidation(String input){
        if(input.equals("")) return true;

        Stack stack = new Stack();
        String[] symbols = input.split("");
        boolean isEqual = false;

        for(String c : symbols){
            if(c.equals("{") || c.equals("[") || c.equals("(")){
                stack.push(c);
            } else if (
                    c.equals("}") && stack.peek().equals("{") ||
                    c.equals("]") && stack.peek().equals("[") ||
                    c.equals(")") && stack.peek().equals("(")) {
                stack.pop();
                isEqual = true;
            } else {
                isEqual = false;
            }
        }
        return isEqual;
    }
}