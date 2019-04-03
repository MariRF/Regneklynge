class Prosessor {
  private int antallKjerner;
  private double klokkehastighet;

  public Prosessor(int antallKjerner, double klokkehastighet) {
    this.antallKjerner = antallKjerner;
    this.klokkehastighet = klokkehastighet * Math.pow(10, 9);
  }

  //Returnerer antall kjerner.
  public int hentAntallKjerner() {
    return antallKjerner;
  }

  //Returnerer klokkehastigheten.
  public double hentKlokkehastighet() {
    return klokkehastighet;
  }
}
