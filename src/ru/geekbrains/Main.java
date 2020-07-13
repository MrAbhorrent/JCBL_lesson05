package ru.geekbrains;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Домашне задание 5");
        System.out.println("Создаем список сотрудников...");
        Employee[] employeers = new Employee[5];
        employeers[0] = new Employee("Иван", "Поддубный", "Стажер","poddubnyi@geekbrains.ru", 89012345678l, 25000, 28);
        employeers[1] = new Employee("Никита", "Кожемяка", "Программист","kozhemiakan@geekbrains.ru", 89023456781l, 47000, 42);
        employeers[2] = new Employee("Добрыня", "Панкратов", "Зав. складом","pankratovd@geekbrains.ru", 89034567891l, 23000, 45);
        employeers[3] = new Employee("Светлана", "Худая", "Бухгалтер","hoodayas@geekbrains.ru", 89337891234l, 56000, 34);
        employeers[4] = new Employee("Ганнибал", "Мокрый", "Начальник","mokryig@geekbrains.ru", 89221122679l, 89000, 53);

        System.out.println("Вывводим сотрудников старше 40 лет...");
        for (Employee employee1: employeers
             ) {
            if (employee1.getAge() >= 40) System.out.println(employee1.info());
        }
    }
}
