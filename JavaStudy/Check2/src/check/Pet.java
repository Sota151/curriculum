package check;

import constants.Constants;

public class Pet extends Constants{

    private static String name;
    private static String masterName;

    public Pet(String name, String masterName) {
        this.name = name;
        this.masterName = masterName;
    }

    public static String getName() {
        return name;
    }

    public static String getMasterName() {
        return masterName;
    }

    public static void introduce(String name,String masterName) {
        System.out.println("■僕の名前は" + name + "です");
        System.out.println("■ご主人様は" + masterName + "です");
    }

	

class RobotPet extends Pet {
    public RobotPet() {
        super(name, masterName);
    }

    public static void troduce() {
        System.out.println("◇私はロボット。名前は" +CHECK_CLASS_R2D2 + "。");
        System.out.println("◇ご主人様は" + CHECK_CLASS_LUKE + "。");
    }
}
}

