package ru.geekbrains;

public class Employee {

    private String firstName;
    private String lastName;
    private String position;
    private String email;
    private long phone;
    private long salary;
    private int age;

    public Employee(String firstName, String lastName, String position, String email, long phone, long salary, int age){
        // TODO: Надо исправить. Если у нас указано неверно одно какое либо поле, то запись все равно будет сделана что не верно с точки зрения логики
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setEmail(email);
        this.setPosition(position);
        this.setPhone(phone);
        this.setSalary(salary);
        this.setAge(age);

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        // TODO: Добавить проверку на валидность электронного адреса => должен присутствовать символ "@"
        this.email = email;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        // TODO: Телефон должен соответствовать формату +7-(XXX)-XX-XX-XXX Возможно сделать ввод черз маску?
        this.phone = phone;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age > 0) {
            this.age = age;
        } else  {
            System.out.println("Введен некорректный возраст");
        }
    }

    public String info() {
        StringBuilder sb = new StringBuilder();
        sb.append("===");
        sb.append("\nИмя: " + getFirstName() + "\nФамилия: " + getLastName() + "\nДолжность: " + getPosition() +
                "\nE-mail: " + getEmail() + "\nТелефон: " + getPhone() + "\nЗарплата: " + getSalary() +
                "\nВозраст: " + getAge());
        sb.append("\n===\n");
        return sb.toString();
    }

}
