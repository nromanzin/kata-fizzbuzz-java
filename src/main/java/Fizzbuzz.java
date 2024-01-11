public class Fizzbuzz {
    public String convert(int input) {
        if (5 == input) {
            return "Buzz";
        }
        if (3 == input) {
            return "Fizz";
        }
        return String.valueOf(input);
    }
}
