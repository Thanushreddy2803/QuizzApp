package QuizzApp;

import java.util.Arrays;

public class Questions {
    private int id;
    private String question;
    private String[] options; // Correct array declaration
    private String answer;

    // Constructor accepting individual option strings
    public Questions(int id, String question, String[] options, String answer) {
        this.id = id;
        this.question = question;
        this.options = new String[4]; // Properly initializing the array
        this.answer = answer;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String[] getOptions() { // Return the options array
        return options;
    }

    public void setOptions(String[] options) { // Set all options at once
        this.options = options;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Questions{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", options=" + Arrays.toString(options) + // Use Arrays.toString() to print array elements
                ", answer='" + answer + '\'' +
                '}';
    }
}
