package QuizzApp;

public class Quiz {
    
        public static void main(String[] args) {
    
            QuestionsServices questionService = new QuestionsServices();
            questionService.playQuiz();
            questionService.printScore();
        }
    
    
}
