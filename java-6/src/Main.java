public class Main {

    public static void main(String[] args) {
        Factory factory = new Factory();

        Cat Masya = factory.getCat("Musya",200, 0);
        Masya.run(150);
        Masya.run(50);
        Masya.swim(10);
        Masya.swim(10);

        Dog Sliva = factory.getDog("Sliva", 500, 10);
        Sliva.run(100);
        Sliva.run(100);
        Sliva.run(100);
        Sliva.run(100);
        Sliva.run(100);
        Sliva.run(100);
        Sliva.swim(5);
        Sliva.swim(5);
        Sliva.swim(5);




        factory.print();

    }
}

