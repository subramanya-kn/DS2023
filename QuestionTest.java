
public class QuestionTest {

	public static void main(String[] args) {
		
		// TODO Auto-generated constructor stub
		
		Question question1 = new Question(101,"What is an Object?","Easy","MCQ",2);
		Question question2 = new Question(102,"What is a class?","Easy","MCQ",2);
		Question question3 = new Question(103,"What is Java","Easy","MCQ",2);
		Question question4 = new Question(104,"What is OOPS?","Easy","MCQ",2);
		Question question5 = new Question(105,"What is POPS?","Medium","MCQ",2);
	
		System.out.println("question1 : "+question1);
		System.out.println("question2 : "+question2);
		System.out.println("question3 : "+question3);
		System.out.println("question4 : "+question4);
		System.out.println("question5 : "+question5);
		
	}

}

class Question
{
	int questionId;
	String questionAsked;
	String questionType;
	String type;
	float marks;
	
	public Question(int questionId, String questionAsked, String questionType, String type, float marks) {
		super();
		this.questionId = questionId;
		this.questionAsked = questionAsked;
		this.questionType = questionType;
		this.type = type;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", questionAsked=" + questionAsked + ", questionType="
				+ questionType + ", type=" + type + ", marks=" + marks + "]";
	}
	
	
	
	
	
}
