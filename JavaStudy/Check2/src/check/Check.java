package check;

import constants.Constants;

public class Check {
	private static String firstName="佐藤";
	private static String lastName="壮太";
	
	private static void printName(String firstName,String lastName) {
		System.out.println("printNameメソッド → "+ firstName+lastName);
	}

	
	
	
	
	public static void main(String[] args) {
		printName(firstName,lastName);
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA , Constants.CHECK_CLASS_HOGE);
		RobotPet robotpet = new RobotPet(Constants.CHECK_CLASS_LUKE,Constants.CHECK_CLASS_R2D2);
		pet.introduce();
		robotpet.introduce();
		

	
	}
}

