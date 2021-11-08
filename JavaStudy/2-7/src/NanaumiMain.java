public class NanaumiMain {
 
 public static void main(String[] args) {
  // 3. 現実（1, 2 を使ってみる）
 Nanaumi Nanaumi = new Nanaumi("七海", "2019/03");
 final String message = nanaumi.doCreateJavaCurriculum();
 System.out.println("message = " + message);
 }
}