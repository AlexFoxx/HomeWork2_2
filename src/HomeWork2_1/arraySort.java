package HomeWork2_1;

/**
 * Created by Aleksandr Lis on 8.04.15.
 */

public class arraySort {

    public static void main(String[] args) {

        int[] array = new int[20];                                      // задаём массив целых чисел array

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000 - 500);              // заполняем массив целыми числами в диапазоне [-500, 500]
            System.out.print(array[i] + " ");
        }

        int indexNext;                                                  // индекс следующего элемента
        int temp;                                                       // временная переменная
        for (int i = 0; i < (array.length - 1); i++) {                  // проходим весь массив
            indexNext = i + 1;
            temp = array[indexNext];
            for (int j = i + 1; j > 0; j--) {
                if (temp < array[j - 1]) {                              // если следующий элемент < текущего, то меняем их местами
                    array[j] = array[j - 1];
                    indexNext = j - 1;
                }
            }
            array[indexNext] = temp;                                    // отсортированный элемент
        }

        System.out.println();
        System.out.println("Отсортированный по возрастанию массив:");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }
}