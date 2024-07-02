package QuizGenerater;

import java.util.Scanner;

public class MainApp
{
	public static void main(String[] args) 
	{

		Scanner xyz = new Scanner(System.in);
        QuizManager quizManager = new QuizManager(xyz);

        System.out.println("Welcome!");
        boolean running = true;

        while (running) 
        {
            showMenu();
            int choice = Integer.parseInt(xyz.nextLine());

            switch (choice) 
            {
                case 1:
                    quizManager.createQuiz();
                    break;
                case 2:
                    quizManager.addQuestionToQuiz();
                    break;
                case 3:
                    quizManager.takeQuiz();
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        System.out.println("Thank you !");
    }

    private static void showMenu()
    {
        System.out.println("\nMenu:");
        System.out.println("1. Create a new quiz");
        System.out.println("2. Add a question to a quiz");
        System.out.println("3. Take a quiz");
        System.out.println("4. Exit");
        System.out.print("Choose an option: ");
    }



}
