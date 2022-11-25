public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();
        CoffeRobot coffeRobot = new CoffeRobot();
        RobotDancer robotDancer = new RobotDancer();
        RobotCoocker robotCoocker = new RobotCoocker();

        robot.work();
        coffeRobot.work();
        robotDancer.work();
        robotCoocker.work();

        System.out.println("*****************************************");

        Robot[] arr = {robot, coffeRobot, robotCoocker, robotDancer};
        for (int i = 0; i < arr.length; i++) {
            Robot c = arr[i];
            c.work();
        }


        Animal a = new Animal("Леопард", 20, 7);
        System.out.println( "Назва тварини = " + a.getName()   +
                ", Швидкість тварини = " +  a.getSpeed() +
                " км/год, Вік тварини = " +  a.getAge() +
                " років");
        a.setName("Бик");
        a.setAge(14);
        a.setSpeed(2);
        System.out.println(a);
    }

}

