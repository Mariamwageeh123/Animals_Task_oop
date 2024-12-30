abstract public class Animal {
    private int age;
    private double health;


    public void setAge(int age) {
        this.age = age;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getHealth() {
        return health;
    }

    public int getAge() {
        return age;
    }

    abstract public void Sound(String Sound);

    public void Eat(double Eat) {
        setHealth(Eat);
        System.out.println("your health is"+ Eat);
    }

}
