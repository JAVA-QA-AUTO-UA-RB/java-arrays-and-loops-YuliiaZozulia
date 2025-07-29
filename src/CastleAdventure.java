import java.util.Scanner;

public class CastleAdventure {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Нижче перша частина завдання для прикладу
        // Там де в завданні вказані початкові дані у вигляді масиву - ініціалізуйте окремий масив
        // Нижче обробляйте масив, додайте логіку обробки
        // Частина 1: Увійди в Замок
        int[] secretCode = {7, 14, 28, 56, 112};
        System.out.println("Введіть 5 чисел, щоб відкрити двері замку:");
        boolean isCodeCorrect = true;

        for (int i = 0; i < secretCode.length; i++) {
            int userInput = scanner.nextInt(); // питаємо в користувача чергове число
            if (userInput != secretCode[i]) { // перевіряємо число проти i-го елемента масиву з правильним кодом
                isCodeCorrect = false; // якщо натрапляємо на неправильно введене число - усю комбінацію вважаємо невірною
            }
        }

        if (isCodeCorrect) {
            System.out.println("Замок відкрито! Заходьте всередину.");
        } else {
            System.out.println("Невірний код. Спробуйте ще.");
        }

            // Частина 2: Магічна дошка
            int[] magicBoard = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30};
            int sum = 0;

            for (int number : magicBoard) {
                sum += number;
            }

            System.out.println("Сума чисел на магічній дошці: " + sum);

            // Частина 3: Перемогти Залізного Дракона
            int[] dragonAttacks = {8, 16, 24, 32, 40};
            boolean allEven = true;

            for (int attack : dragonAttacks) {
                if (attack % 2 != 0) {
                    allEven = false;
                    break;
                }
            }

            if (allEven) {
                System.out.println("Атаки парні! Захист активовано!");
            } else {
                System.out.println("Увага! Непарна атака!");
            }

            // Частина 4: Знайди магічний ключ
            System.out.print("Введи своє улюблене число: ");
            int favNumber = scanner.nextInt();
            boolean found = false;

            // Перевірка у всіх масивах
            for (int num : secretCode) {
                if (num == favNumber) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                for (int num : magicBoard) {
                    if (num == favNumber) {
                        found = true;
                        break;
                    }
                }
            }

            if (!found) {
                for (int num : dragonAttacks) {
                    if (num == favNumber) {
                        found = true;
                        break;
                    }
                }
            }

            if (found) {
                System.out.println("Твій ключ знайдено!");
            } else {
                System.out.println("Треба більше магії...");
            }
        }
    }