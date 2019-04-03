class Node {
  private int minnestorrelse;
  private Prosessor[] p;

  //Konstruktur for en prosessor.
  public Node(int minnestorrelse, int kjerner, double klokkehastighet) {
    this.minnestorrelse = minnestorrelse;
    Prosessor prosessor = new Prosessor(kjerner, klokkehastighet);
    p = new Prosessor[1];
    p[0] = prosessor;
  }

  //Konstruktur for to prosessorer.
  public Node(int minnestorrelse, int kjerner, int kjerner2, double klokkehastighet, double klokkehastighet2) {
    this.minnestorrelse = minnestorrelse;
    Prosessor prosessor = new Prosessor(kjerner, klokkehastighet);
    Prosessor prosessor2 = new Prosessor(kjerner2, klokkehastighet2);
    p = new Prosessor[2];
    p[0] = prosessor;
    p[1] = prosessor2;
  }

  //Returnerer minnestorrelsen.
  public int hentMinne() {
    return minnestorrelse;
  }

  //Returnerer en prosessor array.
  public Prosessor[] hentProsessor() {
    return p;
  }
}
