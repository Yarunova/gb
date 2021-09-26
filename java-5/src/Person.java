public class Person {


    // 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
    String fullname;
    String position;
    String email;
    int telephone;
    int salary;
    int age;


    // 2. Конструктор класса должен заполнять эти поля при создании объекта.

    public Person(String fullname, String position, String email, int telephone, int salary, int age)
    {
        this.fullname = fullname;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    // 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль
    void info()
    {
        System.out.println(this.fullname + " " + this.position + " " + this.email + " " + this.telephone + " " + this.salary + " " + this.age);
    }
}