import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person( "Сидоров Иван Петрович", "Экономист", "ivan@gmail.com",305046, 30000, 25);
        Person person2 = new Person("Петров Николай Яковлевич", "Электрик", "petrov@mail.ru",411048,25000, 48);

        System.out.println("Два отдельных сотрудника:");
        person1.info();
        person2.info();

        // 4. Создать массив из 5 сотрудников.
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Новиков Михаил Эдуардович","Водитель","novikov@mail.ru",414826, 23000,53);
        persArray[1] = new Person("Кондрашов Александр Геннадьевич", "Сантехник","kondrashov@mail.ru", 782599,23000,42);
        persArray[2] = new Person("Николаев Игорь Альбертович", "Местер","nikolaev@mail.ru", 231098,26000,49);
        persArray[3] = new Person("Шукшин Виктор Игоревич", "Техник","shukshin@mail.ru", 684321,26000,38);
        persArray[4] = new Person("Власов Дмитрий Николаевич", "Охранник","vlasov@mail.ru", 256978,24000,62);

        System.out.println("Массив из 5 сотрудников:");
        for(int i = 0; i < 5; i++)
        {
            persArray[i].info();
        }

        System.out.println("Сотрудники старше 40 лет");
        for (int i = 0; i < 5; i++)
        {
            if(persArray[i].age > 40)
            {
                persArray[i].info();
            }
        }
    }
}
