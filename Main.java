import java.util.Random;

public class Main {
  public static void main(String[] args) {
    Random rand = new Random(); 
    int suma = 0;

    for (int i = 0; i < 10; i++) {
      int losowyNum = rand.nextInt(101); 
      suma = losowyNum + losowyNum; 
    }

    int srednia = suma / 10; 

    System.out.println("Średnia z 10 losowych liczb od 0 do 100 wynosi: " + srednia);
  }
}