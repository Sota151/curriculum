package check;

import check.Pet.RobotPet;
import constants.Constants;

public class Check {
	private static String firstName="佐藤";
	private static String lastName="壮太";
	
	private static void printName(String firstName,String lastName) {
		System.out.println("printNameメソッド → "+ firstName+lastName);
	}

		
	//「私はロボット。名前は」以降がnull文字になってしまって、Pet.javaのほうをいじったら出力できました。main内でどのような操作をすれば正しかったのか教えてほしいです。
	
	
	public static void main(String[] args) {
		printName(firstName,lastName);
		Pet.introduce(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
		RobotPet.troduce();
		

	
	}
}

