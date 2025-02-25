package org.launchcode.java.studios.funwithquizes;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckboxChoice extends Question{

    private ArrayList<String>possibleAnswers;
    private ArrayList<Integer>correctAnswers;

    public CheckboxChoice(int pointValue, String text, ArrayList<Integer> correctAnswers, ArrayList<String> possibleAnswers){
        super(pointValue, text);
        this.correctAnswers = correctAnswers;
        this.possibleAnswers = possibleAnswers;
        setPointValue(this.correctAnswers.size());
    }

    @Override
    public void displayAnswers() {
        for (String possibleAnswer : possibleAnswers) {
            System.out.println(possibleAnswer);
        }
    }

    public int checkAnswers(ArrayList<Integer> check){
        int answersCorrect = 0;
        for (Integer integer : check) {
            if (correctAnswers.contains(integer)) {
                answersCorrect++;
            }
        }
        return answersCorrect;
    }

    @Override
    public int getAnswers() {
        ArrayList<Integer> userAnswers = new ArrayList<>();
        System.out.println("For this question, there are multiple correct answers. To begin answering the question, enter 'y'.");
        Scanner userContinue = new Scanner(System.in);
        String goingToContinue = userContinue.nextLine();
        while(goingToContinue.indexOf('y') >= 0 && userAnswers.size() <= possibleAnswers.size()) {
            System.out.println("What will your answer be? Enter the number of the option you believe is correct. For example, to select the first option, enter 1");
            Scanner userAnswer = new Scanner(System.in);
            String answer = userAnswer.nextLine();
            int option = Integer.parseInt(answer);
            userAnswers.add(option);

            System.out.println("For this question, there are multiple correct answers. To continue answering the question, enter 'y'. To stop, enter 'n'");
            goingToContinue = userContinue.nextLine();
        }
        return checkAnswers(userAnswers);
    }


}
