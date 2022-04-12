package com.company;

import java.util.Stack;

public class InfixToPostfixPattern implements Pattern{

    @Override
    public String conversion(String exp) {
        int priority = 0;
        String postfix = "";
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
                if (stack.size() <= 0) {
                    stack.push(ch);
                } else {
                    Character chTop = (Character) stack.peek();

                    if (chTop == '*' || chTop == '/') {
                        priority = 1;
                    } else {
                        priority = 0;
                    }

                    if (priority == 1) {
                        if (ch == '*' || ch == '/' || ch == '%') {
                            postfix += stack.pop();
                            i--;
                        } else {
                            postfix += stack.pop();
                            i--;
                        }
                    } else {
                        if (ch == '+' || ch == '-') {
                            postfix += stack.pop();
                            stack.push(ch);
                        } else {
                            stack.push(ch);
                        }
                    }
                }
            } else {
                postfix += ch;
            }
        }

        int len = stack.size();

        for (int j = 0; j < len; j++) {
            postfix += stack.pop();
        }

        return postfix;
    }
}
