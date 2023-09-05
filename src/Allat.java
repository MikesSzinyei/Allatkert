public class Allat  {
    String nev="nevtelen";

    public void beallitnev(String nev) {
        if(nev.isEmpty()) {
            System.out.println("Hiba! nem adtál meg nevet");
            System.exit(1);
        }
        this.nev=nev;
        
    }

    public void hangotad(String hang) {
        System.out.println(hang);
    }
}
