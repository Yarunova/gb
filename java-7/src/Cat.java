public class Cat
{
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite)
    {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    void eat(Plate plate)
    {
        if(plate.decrease(appetite)) {
            this.satiety = true;
        }
    }

    public void info()
    {
        System.out.println("Cat name: " + this.name + " (satiety is " + this.satiety + ")");
    }


}
