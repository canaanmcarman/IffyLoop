import java.util.Scanner;
public class IffyLoopy {
    public static void main(String[] args)
    {
        //start of Loopy
        String word, totalWords = "";
        Scanner keyboard = new Scanner(System.in);

        for (int index = 1; index <= 5; index++)
        {
            System.out.println("Enter a random word: ");
            word = keyboard.nextLine();
            totalWords += word;

        }
        System.out.println(totalWords);


        // Start of Iffy
        String again, answer = "y";
        boolean redEyes = false;
        Scanner kb = new Scanner(System.in);
        do {
            System.out.println("Are your eyes red?");
            answer = kb.nextLine();
            if (answer.charAt(0) == 'y' || answer.charAt(0) == 'Y' )
            {
                redEyes = true;
            }
            else
            {
                redEyes = false;
            }

            if (redEyes)
            {
                System.out.println("Get some sleep!");
            }
            else
            {
                System.out.println("You look great!");
            }
            System.out.println("Do you want to try again?");
            again = kb.nextLine();
        } while (again.charAt(0) != 'n');

    }
}
