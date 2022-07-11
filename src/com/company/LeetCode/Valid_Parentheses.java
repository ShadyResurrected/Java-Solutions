package com.company.LeetCode;

import java.util.Stack;

public class Valid_Parentheses {
    public static void main(String[] args) {
        String s = "()[]{}[}";
        boolean res = isValid(s);
        System.out.println(res);
    }

    static boolean isValid(String s) {
        Stack<String> stack = new Stack<>();
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push("(");
            }else if(s.charAt(i) == '['){
                stack.push("[");
            } else if(s.charAt(i) == '{'){
                stack.push("{");
            }
            if(s.charAt(i) == ')'){
                if(stack.pop() == "("){
                    count++;
                }
            }else if(s.charAt(i) == ']'){
                if(stack.pop() == "["){
                    count++;
                }
            }else if(s.charAt(i) == '}'){
                if(stack.pop() == "{"){
                    count++;
                }
            }
        }
        if(count == s.length()) {
            return true;
        }

        return false;
    }
}
