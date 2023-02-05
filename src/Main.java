public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 16;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " ,то он совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + " ,он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int airTemperature = 2;
        if (airTemperature < 5) {
            System.out.println("На улице " + airTemperature + " градусов, нужно надеть шапку");
        }
        if (airTemperature > 5) {
            System.out.println("На улице " + airTemperature + " градусов, можно идти без шапки");
        }

    }

    public static void task3() {
        System.out.println("Задача 3");
        int speedLimit = 59;
        if (speedLimit > 60) {
            System.out.println("Если скорость " + speedLimit + " придется заплатить штраф");
        }
        if (speedLimit <= 60) {
            System.out.println("Если скорость " + speedLimit + " можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int age = 14;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
            if (age >=7 && age <= 18) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
                 if (age > 18 && age <= 24) {
                    System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
                    if (age > 24) {
                        System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
                    }
                }
            }
        }


    }public static void task5() {
        System.out.println("Задача 5");
        int age  = 12;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
            if (age >= 5 || age < 14) {
                System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении" +
                        "взрослого");
                if (age >= 14) {
                    System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без" +
                            "сопровождения взрослого");
                }
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int totalCarriageCapacity = 102;
        int sittingSpots = 60;
        int standingSpots = totalCarriageCapacity - sittingSpots;
        if (totalCarriageCapacity > 102) {
            System.out.println("Вагон полностью заполнен");
            if (sittingSpots < 60) {
                System.out.println("В вагоне осталось " + sittingSpots + "сидячих мест и" + standingSpots +  " стоячих мест" );
                if (sittingSpots > 60 && standingSpots < 102) {
                    System.out.println("В вагоне осталось " + standingSpots + "стоячих мест");

                }
            }
        }






















