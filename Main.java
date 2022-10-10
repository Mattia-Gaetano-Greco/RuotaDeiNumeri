class Main {
  public static void main(String[] args) {
    Ruota ruote[] = new Ruota[3];
    ruote[0] = new Ruota("Torino", 5);
    ruote[1] = new Ruota("Milano", 5);
    ruote[2] = new Ruota("Bari", 5);

    for (int i = 0; i < 3; i++) {
      ruote[i].start();
    }
  }
}