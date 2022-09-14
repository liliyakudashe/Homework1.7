public class Main {
    public static void main(String[] args) {
        // Задание 1.1
        System.out.println("Первая задача");
        int savings = 150_000;
        int total = 0;
        for (int i = 0; total < 2_459_000; i++) {
            total = total + total / 100;
            total = total + savings;
            System.out.println("Месяц " + i + " " + "Итого" + " " + total);
        }
        // Задание 1.2
        System.out.println("Вторая задача");
        int number = 1;
        while (number <= 10) {
            System.out.print(number++ + " ");
        }
        System.out.println();
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        // Задание 1.3
        System.out.println();
        System.out.println("Третяя задача");
        int country = 12_000_000;
        int birthRate = country / 1000 * 17;
        int mortality = country / 1000 * 8;
        int populationSize = country - mortality + birthRate;
        int increasePerYear = 0;
        for (int year = 2010; year <= 2020; year++) {
            increasePerYear = increasePerYear + populationSize;
            System.out.printf("Год %d, численнось насиления состовляет %d \n", year, increasePerYear);
        }
        // Задание 2.1
        System.out.println("Первая задача");
        int contributionVasiliya = 15000;
        double percentages = contributionVasiliya * 1.7;
        double savingsVasiliya = 0;
        int months = 0;
        for (; months <= 12; months++) {
            savingsVasiliya = savingsVasiliya + percentages;
            System.out.println("Накопления Василия за " + months + " месяц составит: " + savingsVasiliya);
        }
        // Задание 2.2
        System.out.println("Вторая задача");
        double dream = 0;
        int i = 0;
        while (dream <= 12_000_000) {
            dream = dream + dream * 1.7;
            dream = dream + contributionVasiliya;
            months++;
            if (i % 4 == 0) {
                System.out.println("Накопил " + dream);
            }
        }
        // Задание 2.3
        System.out.println("Третяя задача");
        double initialAmount = 15000;
        int selective = 9;
        for (; selective <= 108; selective++) {
            initialAmount = initialAmount * 1.7;
            if (selective % 6 == 0)
            System.out.println("За " + selective + " месяц накоплений " + initialAmount);
            //break;
        }
        // Задание 2.4
        System.out.println("Четвёртая задача");
        for (int friday = 7; friday <= 31; friday++) {
            if (friday % 7 == 0)
                System.out.println("Сегодня пятница " + friday + "-е число. Необходимо подъготовить отчёт");
        }
        // Задача 3.1
        System.out.println("Первая задача");
        for (int year = 1817; year <= 2054; year++){
            if (year % 79 == 0)
                System.out.println(year);
        }



        // Задача 3.2
        System.out.println("Шестая задача");
        int n = 2;
        for (int multiplication = 2; multiplication <= 20; multiplication++){
           // if (multiplication % 2 == 0)
            System.out.println(n + " * " + multiplication + " = " + n * multiplication );
        }



    }
}

