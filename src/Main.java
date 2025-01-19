import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача № 1");
        int[] summa = {6456, 6577, 6799, 5675, 7950};
        int result = 0;
        for (int i = 0; i < summa.length; i++) {
            result += summa[i];
        }
        System.out.println("Сумма трат за месяц составила " + result + " рублей");
        System.out.println();
        System.out.println("Задача № 2");

        int[] expenses = {9887, 9456, 9677, 9545, 9564};
        int min = Arrays.stream(expenses).min().getAsInt();
        int max = Arrays.stream(expenses).max().getAsInt();
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей. Максимальная сумма трат за неделю составила " + max + " рублей");
        System.out.println();
        System.out.println("Задача № 3");

        double[] sum = {9387, 9356, 9477, 9545, 9364};
        double totalSum = 0;
        for (double num : sum) {
            totalSum += num;
        }
        double average = totalSum / sum.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

        System.out.println();
        System.out.println("Задача № 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(reverseFullName));
    }
}
