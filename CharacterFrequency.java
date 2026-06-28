import java.util.HashMap;
import java.util.Scanner;

public class CharacterFrequency {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        HashMap<Character, Integer> frequency = new HashMap<>();

        for (char ch : str.toCharArray()) {

            if (frequency.containsKey(ch)) {
                frequency.put(ch, frequency.get(ch) + 1);
            } else {
                frequency.put(ch, 1);
            }
        }

        System.out.println("Character Frequency:");

        for (char key : frequency.keySet()) {
            System.out.println(key + " = " + frequency.get(key));
        }

        sc.close();
    }
}