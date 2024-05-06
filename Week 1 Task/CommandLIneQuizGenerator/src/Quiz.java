import java.util.ArrayList;
import java.util.List;

public class Quiz {

	public String QuizSubject;
	public List<QueManager> questions;

	public Quiz(String quizSubject) {

		QuizSubject = quizSubject;
		this.questions = new ArrayList<QueManager>();

	}

	public void addQuestion(QueManager question) {

		questions.add(question);

	}

	public String getQuizSubject() {

		return QuizSubject;
	}

	public List<QueManager> getQuestions() {
		return questions;
	}

}
