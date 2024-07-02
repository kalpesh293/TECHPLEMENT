package QuizGenerater;

public class Question 
{
	private final String questionText;
    private final String[] options;
    private final int correctOption;
    
    //Parameterized constructor for taking values

    public Question(String questionText, String[] options, int correctOption) 
    {
    	//pointing the current variable in memory
        this.questionText = questionText;
        this.options = options;
        this.correctOption = correctOption;
    }

    //get the output question
    public String getQuestionText() 
    {
        return questionText;
    }
    //get the output of options
    public String[] getOptions() 
    {
        return options;
    }
    // get the output of correct ans
    public int getCorrectOption() 
    {
        return correctOption;
    }

}
