package QuizzApp;

import java.util.Scanner;

public class QuestionsServices {

    Questions[] questions = new Questions[5]; // Array for 5 questions
    String[] selection = new String[5];       // Array to store user selections

    public QuestionsServices() {
        // Initializing the questions array with Questions objects
        questions[0] = new Questions(1, "size of int", new String[]{"2", "6", "4", "8"}, "4");
        questions[1] = new Questions(2, "size of double", new String[]{"2", "6", "4", "8"}, "8");
        questions[2] = new Questions(3, "size of char", new String[]{"2", "6", "4", "8"}, "2");
        questions[3] = new Questions(4, "size of long", new String[]{"2", "6", "4", "8"}, "8");
        questions[4] = new Questions(5, "size of boolean", new String[]{"1", "2", "4", "8"}, "1");
    }

    public void playQuiz() {
        int i = 0;
        for (Questions q : questions) {
            System.out.println("Question no. : " + q.getId());
            System.out.println(q.getQuestion());

            // Print the options array using a loop
            String[] options = q.getOptions();
            for (int j = 0; j < options.length; j++) {
                System.out.println((j + 1) + ". " + options[j]);
            }

            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine(); // Store the user's answer
            i++;
        }

        for (String s : selection) {
            System.out.println("Your selection: " + s);
        }
    }

    public void printScore() {
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            Questions que = questions[i];
            String answer = que.getAnswer();
            String userAnswer = selection[i];
            if (answer.equals(userAnswer)) {
                score++;
            }
        }
        System.out.println("Your score is : " + score);
    }
}
