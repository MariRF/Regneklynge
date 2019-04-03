class Rack {
  private int antallNoderPerRack;
  private int antallNoder;
  private Node[] noder;

  public Rack(int antallNoderPerRack) {
    this.antallNoderPerRack = antallNoderPerRack;
    noder = new Node[antallNoderPerRack];
  }

  //Setter inn en node i node arrayen.
  public void settInnNode(Node node) {
    for (int i = 0; i < noder.length; i++) {
      if (noder[i] == null) {
        noder[i] = node;
        antallNoder++;
        return;
      }
    }
  }

  /*
  Returnerer true hvis racken er full, og returnerer
  false hvis racken har ledig plass.
  */
  public boolean full() {
    return antallNoder >= antallNoderPerRack;
  }

  //Returnerer en node array.
  public Node[] hentNoder() {
    return noder;
  }
}
