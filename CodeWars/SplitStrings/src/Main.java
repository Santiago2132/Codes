import java.util.ArrayList;
import java.util.List;

/**
 *Complete the solution so that it splits the string into pairs of two characters.
 * If the string contains an odd number of characters then it should replace the
 * missing second character of the final pair with an underscore ('_').
 * 'abc' =>  ['ab', 'c_']
 * 'abcdef' => ['ab', 'cd', 'ef']
 * Author: Santiago Maldonado Rojas
 */
public class Main {
    public static List<String> split(String input){
        List<String> result = new ArrayList<>();
        for(int i = 0; i < input.length();){
            if (i + 1 < input.length()) {
                result.add(input.substring(i, i + 2));
                i += 2;
            } else {
                result.add(input.substring(i) + "_");
                break;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String input1 = "abcde";
        String input2 = "abcdef";

        List<String> resultado1 = split(input1);
        List<String> resultado2 = split(input2);

        System.out.println(input1 + " => " + resultado1);
        System.out.println(input2 + " => " + resultado2);
    }
}