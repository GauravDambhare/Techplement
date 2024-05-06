import java.util.List;
import java.util.Scanner;

public class QuizController {

    Scanner sc = new Scanner(System.in);

    public Quiz createQuiz() {
        System.out.println("Enter Subject");
        String subject = sc.nextLine();
        Quiz quiz = new Quiz(subject);

        boolean addQuestion = true;
        while (addQuestion) {
            System.out.println("Enter question (if done, type 'done'):");
            String question = sc.nextLine();
            if (question.equals("done")) {
                addQuestion = false;
            } else {
                QueManager que = new QueManager(question);

                boolean addOptions = true;
                while (addOptions) {
                    System.out.println("Enter option (if done, type 'done'):");
                    String option = sc.nextLine();
                    if (option.equals("done")) {
                        addOptions = false;
                    } else {
                        que.addOptions(option);
                    }
                }

                System.out.println("Enter correct answer index:");
                int indexInInt = sc.nextInt();
                sc.nextLine(); 
                que.setCorrectAnswer(indexInInt);

                quiz.addQuestion(que);
            }
        }
        return quiz;
    }

    public void startQuiz(Quiz quiz) {
        int score = 0;
        List<QueManager> questions = quiz.getQuestions();

        for (int i = 0; i < questions.size(); i++) {
            QueManager queManager = questions.get(i);
            System.out.println("Question " + (i + 1) + ": " + queManager.getQuestion());
            List<String> options = queManager.getOptions();

            for (int j = 0; j < options.size(); j++) {
                System.out.println((char) ('A' + j) + ". " + options.get(j));
            }

            System.out.println("Enter your answer:");
            String answerFromUser = sc.nextLine();
            int userAnswerIndex = answerFromUser.toUpperCase().charAt(0) - 'A';
            if (userAnswerIndex == queManager.getAnswer()) {
                System.out.println("Correct Answer");
                score++;
            } else {
                System.out.println("Incorrect Answer");
            }
        }
        System.out.println("Quiz complete! Your score: " + score + "/" + questions.size());
    }
}
