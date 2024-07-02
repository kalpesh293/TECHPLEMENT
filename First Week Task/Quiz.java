package QuizGenerater;

import java.util.ArrayList;
import java.util.List;

public class Quiz 
{
	private final String name;
	//creating the list of question
    private final List<Question> questions;
    //creating the constructor
    public Quiz(String name) 
    {
        this.name = name;
        this.questions = new ArrayList<>();
    }
    
    public void addQuestion(Question question)
    {
        questions.add(question);
    }

    public List<Question> getQuestions() 
    {
        return questions;
    }

    public String getName()
    {
        return name;
    }

}
