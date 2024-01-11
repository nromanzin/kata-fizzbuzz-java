public class Fizzbuzz {
    public String convert(int input) {
        String output = "";
        if (isMultipleOf(input, 3)) {
            output += "Fizz";
        }
        if (isMultipleOf(input, 5)) {
            output += "Buzz";
        }
        return output.isBlank() ? String.valueOf(input) : output;
    }

    private boolean isMultipleOf(int input, int divider) {
        return input % divider == 0;
    }
}
