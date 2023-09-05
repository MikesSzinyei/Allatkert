public class App {
    public static void main(String[] args) throws Exception {

        Maci maci = new Maci();
        //maci.nev="Brumi";
        maci.hangotad("Brumm");
        maci.mezgyujtes();

        Macska mici = new Macska();
        //mici.nev="aa";
        mici.beallitnev("");
        mici.hangotad("Miau");
        mici.dorombol();
 
        System.out.println(mici.nev);

       
    }
}
