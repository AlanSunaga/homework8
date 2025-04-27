import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Задача 1
        //Бухгалтеры попросили посчитать сумму всех выплат за месяц.
        //
        //Создайте массив с пятью целочисленными элементами и задайте каждому элементу значение.
        //
        //Напишите программу, которая решит эту задачу, и выведите в консоль результат в формате: «Сумма трат за месяц составила … рублей».

        System.out.println("Задача 1");
        int[] arr = new int[5];
        int sum = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] <= arr.length - 1) {
                arr[i] = (int) (Math.random() * 100000);
            }
            sum += arr[i];
            System.out.println(arr[i]);

        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println();

        //Задача 2
        //Также бухгалтерия попросила найти минимальную и максимальную траты за неделю.
        //
        //Создайте массив с пятью целочисленными элементами и задайте каждому элементу значение.
        //
        //Напишите программу, которая решит эту задачу, и выведите в консоль результат в формате: «Минимальная сумма трат за неделю составила … рублей. Максимальная сумма трат за неделю составила … рублей».

        System.out.println("Задача 2");

        Arrays.sort(arr);
        System.out.println("Минимальная сумма трат за неделю составила " + arr[0] + " рублей");
        System.out.println("Максимальная сумма трат за неделю составила " + arr[arr.length - 1] + " рублей");
        System.out.println();

        System.out.println("Или");

        int min = 0;
        int max = 0;


        for (int i = 0; i <= arr.length - 1; i++) {
            if (i == 0) {
                min = arr[i];
                max = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }

        }

        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей");
        System.out.println("Максимальная сумма трат за неделю составила " + max + " рублей");
        System.out.println();

        System.out.println("Или");

        for (int num : arr) {
            if (num == 0) {
                min = arr[num];
                max = arr[num];
            }
            if (max < num) {
                max = num;
            }
            if (min > num) {
                min = num;
            }
        }



        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей");
        System.out.println("Максимальная сумма трат за неделю составила " + max + " рублей");
        System.out.println();

        //Задача 3
        //Теперь бухгалтерия хочет понять, какую в среднем сумму компания тратила еженедельно.
        //
        //Создайте массив с пятью целочисленными элементами и задайте каждому элементу значение.
        //
        //Напишите программу, которая посчитает среднее значение трат за месяц (то есть сумму всех трат за месяц поделить на количество недель),
        // и выведите в консоль результат в формате: «Средняя сумма трат за месяц составила … рублей».
        //
        //Важно помнить: подсчет среднего значения может иметь остаток, то есть быть не целым, а дробным числом.

        System.out.println("Задача 3");

        double weekMid = 0;

        for (int week : arr) {
            weekMid += week;

        }
        weekMid /= arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + weekMid + " рублей");
        System.out.println();

        System.out.println("Или");

        weekMid = sum;
        weekMid /= arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + weekMid + " рублей");
        System.out.println();

        //Задача 4
        //В бухгалтерской книге появился баг. Что-то пошло не так: фамилии и имена сотрудников начали отображаться в обратную сторону. Т. е. вместо «Иванов Иван» мы имеем «навИ вонавИ».
        // Данные с именами сотрудников хранятся в виде массива символов
        //char[ ]
        //.
        //
        //Напишите код, который развернет содержимое массива, а затем распечатает его содержимое. В качестве данных для массива используйте:
        //
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        //В результате в консоль должно быть выведено: Ivanov Ivan.
        //
        //Важно: не используйте дополнительные массивы для решения этой задачи. Необходимо корректно пройти по массиву циклом и поменять его содержимое , чтобы установить правильный порядок.

        System.out.println("Задача 4");

        char simInEnd = 0;
        char simInBegin = 0;

        for (int i = 0; i < reverseFullName.length / 2; i++) {
            simInEnd = reverseFullName[i];
            simInBegin = reverseFullName[(reverseFullName.length - i) - 1];

            reverseFullName[i] = simInBegin;
            reverseFullName[(reverseFullName.length - i) - 1] = simInEnd;
        }
        System.out.println(Arrays.toString(reverseFullName));


    }
}