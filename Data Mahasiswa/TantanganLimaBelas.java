import java.util.Scanner;
public class VotingCounter1
{
    public static void main(String [] args){
        Scanner userInput = new Scanner(System.in);
        final int SIZE = 6;
        int[] votes = new int[SIZE];
        String[] names = new String[SIZE];

        for (int i = 0; i < names.length && i < votes.length; i++){
            System.out.print("Enter candidate's name: ");
            names[i] = userInput.next( );
            System.out.print("Enter number of votes: ");
            votes[i] = userInput.nextInt( );
        }

        System.out.println("And the Winner is: " + highest(votes));
    }
    public static int highest(int[] votes){
        int high = votes[0];

        for (int i = 1; i < votes.length; i++){
            if (votes[i] > high){
                high = votes[i];
            }
        }
        return high;
    }
}