package QuizGenerater;

import java.util.HashMap;
import java.util.Scanner;

public class QuizManager
{
	private final Scanner xyz;
	//creating the hashmap 
    private final HashMap<String, Quiz> quizzes;

    public QuizManager(Scanner xyz) 
    {
        this.xyz = xyz;
        this.quizzes = new HashMap<>();
    }

    public void createQuiz() 
    {
        System.out.print("Enter quiz name: ");
        String quizName = xyz.nextLine();
        if (quizzes.containsKey(quizName))
        {
            System.out.println("Quiz already exists.");
        } 
        else 
        {
            quizzes.put(quizName, new Quiz(quizName));
            System.out.println("Quiz \"" + quizName + "\" created.");
        }
    }

    public void addQuestionToQuiz() 
    {
        System.out.print("Enter quiz name: ");
        String quizName = xyz.nextLine();
        Quiz quiz = quizzes.get(quizName);

        if (quiz == null)
        {
            System.out.println("Quiz not found.");
            return;
        }

        System.out.print("Enter question text: ");
        String questionText = xyz.nextLine();

        System.out.print("Enter number of options: ");
        int numOptions = Integer.parseInt(xyz.nextLine());

        String[] options = new String[numOptions];
        for (int i = 0; i < numOptions; i++)
        {
            System.out.print("Enter option " + (i + 1) + ": ");
            options[i] = xyz.nextLine();
        }

        System.out.print("Enter correct option number: ");
        int correctOption = Integer.parseInt(xyz.nextLine());

        Question question = new Question(questionText, options, correctOption);
        quiz.addQuestion(question);
        System.out.println("Question added to quiz \"" + quizName + "\".");
    }

    public void takeQuiz() 
    {
        System.out.print("Enter quiz name: ");
        String quizName = xyz.nextLine();
        Quiz quiz = quizzes.get(quizName);

        if (quiz == null) 
        {
            System.out.println("Quiz not found.");
            return;
        }

        int score = 0;
        for (Question question : quiz.getQuestions())
        {
            System.out.println("\n" + question.getQuestionText());
            String[] options = question.getOptions();
            for (int i = 0; i < options.length; i++)
            	
            {
                System.out.println((i + 1) + ". " + options[i]);
            }
            System.out.print("Your answer: ");
            int answer = Integer.parseInt(xyz.nextLine());

            if (answer == question.getCorrectOption()) 
            {
                score++;
            }
        }

        System.out.println("\nQuiz completed!");
        System.out.println("Your score: " + score + "/" + quiz.getQuestions().size());
    }

}
