import java.util.ArrayList;
import java.util.List;

public class QueManager {

	public String questionText;
	public List<String> options;
	public int answerIndex;

	public QueManager(String questionText) {

		this.questionText = questionText;
		this.options = new ArrayList<String>();
		this.answerIndex = -1;

	}

	public void addOptions(String option) {

		options.add(option);
	}

	public void setCorrectAnswer(int correctAns) {
		this.answerIndex = correctAns;

	}

	public String getQuestion() {
		return questionText;
	}

	public List<String> getOptions() {

		return options;
	}

	public int getAnswer() {

		return answerIndex;
	}

}
