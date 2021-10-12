public class Main
{
    public static void main(String[] args)
    {
        Cat cat1 = new Cat("Мася", 10);
        Cat cat2 = new Cat("Дуся", 20);
        Cat cat3 = new Cat("Вася", 30);
        Plate plate = new Plate(100);

        cat1.eat(plate);
        cat2.eat(plate);
        cat3.eat(plate);

        Cat cats[] = new Cat[3];
        cats[0] = cat1;
        cats[1] = cat2;
        cats[2] = cat3;

        plate.increase(50);

        for(int i=0; i<cats.length; i++) {
            cats[i].info();
        }

        plate.info();
    }
}
