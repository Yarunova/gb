public class Plate
{
    private int food;

    public Plate(int food)
    {
        this.food = food;
    }

    public void info()
    {
        System.out.println("Plate food: " + this.food);
    }

    public boolean decrease(int appetite)
    {
        if (appetite > food) {
            return false;
        }

        this.food -= appetite;
        return true;
    }

    public void increase(int food)
    {
        this.food += food;
    }
}
