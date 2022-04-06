package com.company;

public class Main {

    public static void main(String[] args) {

        QuestionFormat questions = new QuestionFormat("Java Programming Language");

        questions.q = new JavaQuestions();

        questions.delete("What is class?");

        questions.display();

        questions.newOne("What is inheritance?");

        questions.displayAll();
    }
}
