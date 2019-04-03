import java.util.ArrayList;

class Regneklynge {
  private ArrayList<Rack> racks = new ArrayList<Rack>();
  private int antallNoderPerRack;
  private int antallRacks;

  public Regneklynge(int antallNoderPerRack) {
    this.antallNoderPerRack = antallNoderPerRack;
  }

  /*
  Oppretter en ny rack om det ikke finnes noen fra for av
  og setter noden inn i racken. Hvis racken(e) er fulle saa
  opprettes det en ny rack og noden settes inn i den nye
  racken. Hvis det er en ledig plass i racken saa settes
  noden inn i racken.
  */
  public void settInnNode(Node node) {
    if (racks.isEmpty()) {
      Rack nyRack = new Rack(antallNoderPerRack);
      racks.add(nyRack);
      nyRack.settInnNode(node);
      antallRacks++;
    }

    else if (racks.get(racks.size() - 1).full()) {
      Rack nyRack = new Rack(antallNoderPerRack);
      racks.add(nyRack);
      nyRack.settInnNode(node);
      antallRacks++;
    }

    else {
      int ledigRack = racks.size() - 1;
      racks.get(ledigRack).settInnNode(node);
    }
  }

  //Returnerer antall racks.
  public int antallRacks() {
    return antallRacks;
  }

  //Regner ut og returnerer FLOPS.
  public double flops() {
    double total = 0;

    for (Rack r : racks) {
      Node[] noder = r.hentNoder();

      for (Node n : noder) {
        if (n != null) {
          Prosessor[] prosessor = n.hentProsessor();

          for (Prosessor p : prosessor) {
            int antallKjerner = p.hentAntallKjerner();
            double klokkehastighet = p.hentKlokkehastighet();

            total += antallKjerner * klokkehastighet;
          }
        }
      }
    }
    return total * 8;
  }

  //Returnerer antall noder med nok minne.
  public int noderMedNokMinne(int paakrevdMinne) {
    int noderMedNokMinne = 0;
    for (Rack r : racks) {
      Node[] noder = r.hentNoder();

      for (Node n : noder) {
        if (n != null) {
          if (n.hentMinne() >= paakrevdMinne) {
            noderMedNokMinne++;
          }
        }
      }
    }
    return noderMedNokMinne;
  }
}
