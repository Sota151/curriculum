
public class Nanaumi implements OrderFromMotoki, OrderFromShihandai {

	 private String name;
	 private String date;
	 
	 public Nanaumi(String n, String yyyyMM) {
	 name = n;
	 date = yyyyMM;
	 }
	 
	 private void submitOrder(final int shoriFlg) {
		 String nameAnd = name + "、";
		 
		 if (shoriFlg == 0) {
		  // 勤務表
		 System.out.println(nameAnd + date + "の勤務表出しました(｀･ω･´)ゞ！！！！！！");
		 } else if (shoriFlg == 1) {
		  // 交通費
		 System.out.println(nameAnd + date + "の交通費も出しました(｀･ω･´)ゞ！！！！！！");
		 } else {
		  // その他
		 System.out.println(nameAnd + "本当はまだ何も出してません(｀･ω･´)ドヤ！！！！！！");
		 }
		 }
	 public void doNothing() {
		 submitOrder(-1);
		 }
		 
	 
	 
	 
	@Override
	public void daseyaKinmuhyo() {
		submitOrder(0);
		
	}

	@Override
	public void daseyaKotsuhi() {
		submitOrder(1);
	}

	@Override
	public void goToSevenEleven() {
		System.out.println("先にセブンイレブン行ってきやす！");
	}

	@Override
	 public String doCreateJavaCurriculum() {
	 return "Javaカリキュラム完成しました！";
		 }
}
