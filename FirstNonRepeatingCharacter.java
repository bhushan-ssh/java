import java.util.*;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        HashMap<Character, Integer> map = new LinkedHashMap<>();

        for(char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(char ch : map.keySet()) {

            if(map.get(ch) == 1) {
                System.out.println("First non repeating character: " + ch);
                return;
            }
        }

        System.out.println("No unique character found");

        sc.close();
    }
}