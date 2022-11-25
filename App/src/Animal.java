public class Animal {
    private String Name;
    private int Speed;
    private int Age;

    public Animal(String name, int speed, int age) {
        super();
        Name = name;
        Speed = speed;
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int speed) {
        Speed = speed;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    @Override
    public String toString() {
        return "Назва тварини = " + Name  +
                ", Швидкість тварини = " + Speed +
                " км/год, Вік тварини = " + Age +
                " років";
    }
}
