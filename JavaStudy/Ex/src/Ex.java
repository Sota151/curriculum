
public class Ex {
	public static void main(String[] args) {
//		try {
//			int[] number= {1,2,3,4,5};
//			for(int num:number) if(num==4)throw new Exception();
//			
//		}
//			
//		 catch (Exception e) {
			// TODO 自動生成された catch ブロック
//			System.out.println("違法な数字です");
//		} 
//		finally {
			
			
//		}
		Sample sample = new Sample();
		try {
			sample.error();
		}
		catch(Exception e) {
			System.out.println("エラーがなくなりました");
		}
	}
}
