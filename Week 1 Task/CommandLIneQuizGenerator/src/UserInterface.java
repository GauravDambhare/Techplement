
public class UserInterface {

	public static void main(String[] args) {

		QuizController controller = new QuizController();

		Quiz createdQuiz = controller.createQuiz();
		controller.startQuiz(createdQuiz);
		// all documentation provided in QuizDocumentation.docx file please go through
		// it for clarification of code
	}

}
