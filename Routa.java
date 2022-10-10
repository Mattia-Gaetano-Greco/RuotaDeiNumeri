import java.util.Random;

class Ruota extends Thread {
  private String nome;
  private int nNumeri;

  public Ruota(String nome, int nNumeri) {
    this.nome = nome;
    this.nNumeri = nNumeri;
  }

  public void run() {
    for (int i = 0; i < nNumeri; i++) {
      Random r = new Random();
      System.out.println(nome + " " + (r.nextInt(90)+1));
      try{
        sleep(10);
      }
      catch(Exception e){}
    }
  }
}