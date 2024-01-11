public class Kata {
    public static void main(String[] args) {
        System.out.println("Welcome to the Dojo");
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        for (int i = 1; i <= 100 ; i++) {
            System.out.println(fizzbuzz.convert(i));
        }
    }
}
