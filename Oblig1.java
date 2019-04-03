class Oblig1 {
  public static void main(String[] args) {
    Regneklynge abel = new Regneklynge(12);

    for (int i = 0; i < 650; i++) {
      abel.settInnNode(new Node(64, 8, 8, 2.6, 2.6));
    }

    for (int i = 0; i < 16; i++) {
      abel.settInnNode(new Node(1024, 8, 8, 2.3, 2.3));
    }

    System.out.println("Samlet FLOPS: " + abel.flops());
    System.out.println("Noder med minst 32 GB: " + abel.noderMedNokMinne(32));
    System.out.println("Noder med minst 64 GB: " + abel.noderMedNokMinne(64));
    System.out.println("Noder med minst 128 GB: " + abel.noderMedNokMinne(128));
    System.out.println("Antall rack: " + abel.antallRacks());
  }
}
