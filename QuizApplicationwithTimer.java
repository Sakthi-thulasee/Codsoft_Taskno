import java.io.*;
class Quiz 
{	
        String questionText;
        String[] options;
        int correctOption;
	Quiz(String questionText, String[] options, int correctOption) 
	{
            this.questionText = questionText;
            this.options = options;
            this.correctOption = correctOption;
        }
}
public class QuizApplicationwithTimer
{
	public static void main(String[] args)throws IOException  
	{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        Quiz[] q = new Quiz[3];
        q[0] = new Quiz("Which component of java is responsible for running the compiled Java bytecode?", new String[]{"1. JDK", "2. JVM", "3. JRE", "4. JIT"}, 3);
        q[1] = new Quiz("What is the default value of a boolean variable in Java?", new String[]{"1.True", "2. False", "3. 0", "4. null"}, 4);
        q[2] = new Quiz("Who developed Java?", new String[]{"1. Microsoft", "2. Sun Microsystems", "3. Apple", "4. Google"}, 2);

        int score = 0;

        System.out.println("Welcome to the Quiz!");
        System.out.println("You have 10 seconds to answer each question.");
        System.out.println();

        for (int i = 0; i < q.length; i++) {
            Quiz qu = q[i];

            System.out.println("Q" + (i + 1) + ": " + qu.questionText);
            for (String option : qu.options) {
                System.out.println(option);
            }

            long startTime = System.currentTimeMillis();
            boolean answered = false;
            int userAnswer = -1;

            while ((System.currentTimeMillis() - startTime) / 1000 < 10) {
                if (br.ready()) {
                    userAnswer = Integer.parseInt(br.readLine());
                    answered = true;
                    break;
                }
            }

            if (!answered) {
                System.out.println("Time - up , Moving to the next question.");
            } else if (userAnswer == qu.correctOption) {
                System.out.println("Your answer is Correct!");
                score++;
            } else {
                System.out.println("Wrong! The correct answer was " + qu.correctOption + ".");
            }

            System.out.println();
        }

        System.out.println("Quiz Over!");
        System.out.println("Your Score: " + score + "/" + q.length);
    }
}
	


