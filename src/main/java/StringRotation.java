import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Программа проверки на вращение строк
 */

public class StringRotation {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите первую строку (оригинал):");
        String original = reader.readLine();
        System.out.println("Введите вторую строку:");
        String rotation = reader.readLine();

        if(checkRotation(original, rotation)) System.out.println("Все хорошо! Вторая строка подходит под условие!");
        else System.out.println("Вторая строка не подходит под условие задачи!!!");
        reader.close();
    }

    /**
     * Метод проверяет образована строка rotation из original путем поворота или нет
     * @param original
     * @param rotation
     * @return true or false
     */
    private static boolean checkRotation(String original, String rotation) {
        if (original.length() != rotation.length()) return false;
        String newOriginal = original + original;

        if (newOriginal.indexOf(rotation) != -1) return true;
        return false;
    }
}
