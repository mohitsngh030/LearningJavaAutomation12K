package Practice_april_2026;

public class Practice_20_04 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++)
            System.out.println(i);

        String input = "automation";
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        System.out.println("Reversed: " + reversed);
    }
}

