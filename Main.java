public class Main {

    public static void main(String[] args) {
        //пункт 2
        // Создать переменные всех пройденных типов данных и инициализировать их значения.
        int a1 = 1;
        int b1 = 1;
        short s1 = 257;
        boolean isNo = true;
        boolean isYes = false;
        float s = 1234.5678f;
        double d1 = 555.33434;
        char c1 = 'C';
        char c2 = '%';
        byte b2 = 127;
        long l1 = 343434;
        String h = "Hello world!";
        System.out.println(h);
        System.out.println("a * (b + (c / d)) = " + Calc(3.5f, 4.23f, 3.14f, 0.5f) );
        System.out.println(Sum(10, 1));
        isPositiveOrNegative(-5);
        System.out.println(isNegative(-1));
        stringToText("Вольдемар");
        System.out.println(method8(2024));

    }

    // пункт 3 Написать метод, вычисляющий выражение c и возвращающий результат,
    // где a, b, c, d – аргументы этого метода, имеющие тип float.
    private static float Calc (float a, float b, float c, float d) {
        return (a * (b + (c / d)));

    }

    // пункт 4
    //Написать метод, принимающий на вход два целых числа и проверяющий,
    // что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    private static boolean Sum (int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <=20) {
                   return true;
                            }
        return false;
    }

    // Пункт 5 Написать метод, которому в качестве параметра передается целое число,
    // метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    // Замечание: ноль считаем положительным числом.

    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    // Пункт 6 Написать метод, которому в качестве параметра передается целое число.
    // Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.

    public static boolean isNegative(int x) {
        if(x < 0) {
            return true;
        }
        return false;
    }

    // Пункт 7
    // Написать метод, которому в качестве параметра передается строка, обозначающая имя.
    // Метод должен вывести в консоль сообщение «Привет, указанное_имя!».

    private static void stringToText(String txtToPrint) { // пункт 7
             System.out.println("Привет, " + txtToPrint);
         }



     /* пункт 8 Задание со *
       Метод определяет яляется ли год високосным и выводит сообщение в консоль,
       каждый 4-й год является високосным, кроме каждого 100, при этом каждый 400й високосный
     */
    private static boolean method8 (int year) {
        return (year%100!=0 && year%4==0) || year%400 ==0;
    }

    }

