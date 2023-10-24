import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the following data: ");
        System.out.print("avgLength phrase1: ");
        String avgLenP1 = kb.nextLine();
        System.out.print("avgLength phrase2: ");
        String avgLenP2 = kb.nextLine();
        System.out.print("firstLastLetter phrase1: ");
        String firstLastLetterP1 = kb.nextLine();
        System.out.print("firstLastLetter phrase2: ");
        String firstLastLetterP2 = kb.nextLine();
        System.out.print("middleLetter phrase: ");
        String middleLetterP1 = kb.nextLine();
        System.out.print("swapFirst phrase1: ");
        String swapFirstP1 = kb.nextLine();
        System.out.print("swapFirst phrase2: ");
        String swapFirstP2 = kb.nextLine();
        System.out.print("removeAt phrase: ");
        String removeAtP1 = kb.nextLine();
        System.out.print("removeAt index: ");
        int removeAtIndex = kb.nextInt();

        System.out.println(" ");

        System.out.println("---- Average Length ----");
        System.out.println("Phrase1: " + avgLenP1);
        System.out.println("Phrase2: " + avgLenP2);
        System.out.println("Average length: " + StringMethods.avgLength(avgLenP1, avgLenP2));

        System.out.println("");

        System.out.println("---- First Last Letter ----");
        System.out.println("Phrase1: " + firstLastLetterP1);
        System.out.println("Phrase2: " + firstLastLetterP2);
        System.out.println("First and last letter: " + StringMethods.firstLastLetter(firstLastLetterP1, firstLastLetterP2));

        System.out.println("");

        System.out.println("---- Middle Letter ----");
        System.out.println("Phrase: " + middleLetterP1);
        System.out.println("Middle letter: " + StringMethods.middleLetter(middleLetterP1));

        System.out.println("");

        System.out.println("---- Swap First ----");
        System.out.println("Phrase1: " + swapFirstP1);
        System.out.println("Phrase2: " + swapFirstP2);
        System.out.println(StringMethods.swapFirst(swapFirstP1, swapFirstP2));

        System.out.println("");

        System.out.println("---- Remove At ----");
        System.out.println("Phrase: " + removeAtP1);
        System.out.println("Index: " + removeAtIndex);
        System.out.println("Updated phrase: " + StringMethods.removeAt(removeAtP1, removeAtIndex));





    }
}