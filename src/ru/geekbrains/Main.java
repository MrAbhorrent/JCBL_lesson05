package ru.geekbrains;

public class Main {

    public static void main(String[] args) {

        System.out.println("Домашнее задание 5");
        System.out.println("Создаем список сотрудников...");
        Employee[] employeers = new Employee[5];
        loadData(employeers);
        System.out.println("Вывводим сотрудников старше 40 лет...");
        for (Employee employee1: employeers) {
            if (employee1.getAge() >= 40) System.out.println(employee1.info());
        }
    }

    private static void loadData(Employee[] array) {
        if (array.length == 5) {
            array[0] = new Employee("Иван", "Поддубный", "Стажер","poddubnyi@geekbrains.ru", 89012345678L, 25000, 28);
            array[1] = new Employee("Никита", "Кожемяка", "Программист","kozhemiakan@geekbrains.ru", 89023456781L, 47000, 42);
            array[2] = new Employee("Добрыня", "Панкратов", "Зав. складом","pankratovd@geekbrains.ru", 89034567891L, 23000, 45);
            array[3] = new Employee("Светлана", "Худая", "Бухгалтер","hoodayas@geekbrains.ru", 89337891234L, 56000, 34);
            array[4] = new Employee("Ганнибал", "Мокрый", "Начальник","mokryig@geekbrains.ru", 89221122679L, 89000, 53);
        }
    }
}
