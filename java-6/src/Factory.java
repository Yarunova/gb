public class Factory {

    private int animalCount;
    private int dogCount;
    private int catCount;

    public Animal getAnimal(String name, int maxRun, int maxSwim) {
        Animal animal = new Animal(name, maxRun, maxSwim);
        this.animalCount++;
        return animal;
    }

    public Cat getCat(String name, int maxRun, int maxSwim) {
        Cat cat = new Cat(name, maxRun, maxSwim);
        this.catCount++;
        this.animalCount++;
        return cat;
    }

    public Dog getDog(String name, int maxRun, int maxSwim) {
        Dog dog = new Dog(name, maxRun, maxSwim);
        this.dogCount++;
        this.animalCount++;
        return dog;
    }

    public void print() {
        System.out.println("Животных создано:" + this.animalCount);
        System.out.println("Кошек создано:" + this.catCount);
        System.out.println("Собак создано:" + this.dogCount);
    }
}
