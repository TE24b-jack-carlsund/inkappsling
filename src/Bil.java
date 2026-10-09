public class Bil {
    private String märke;
    private String modell;
    private String registreringsnummer;
    private int årsmodell;
    private int hastighet;

    // konstruktor är en metod som skapar instanser av objektet
    Bil(String märke, String modell, String registreringsnummer, int årsmodell, int hastighet) {
        if (märke == "null" || märke == null) {
            throw new IllegalArgumentException("Olagligt märke");

        } else {
            this.märke = märke;
        }
        if (modell == "null" || modell == null) {
            throw new IllegalArgumentException("Olagligt märke");

        } else {
            this.modell = modell;
        }
        if (registreringsnummer == "null" || registreringsnummer == null) {
            throw new IllegalArgumentException("Olagligt märke");

        } else {
            this.registreringsnummer = registreringsnummer;
        }
        if (årsmodell > 1860 || årsmodell < 2026) {
            throw new IllegalArgumentException("Olagligt märke");

        } else {
            this.årsmodell = årsmodell;
        }

        this.hastighet = 0;

    }

    // getters hämtar privata variablers värden
    public String getmärke() {
        return märke;
    }

    public String getmodell() {
        return modell;
    }

    public String getregistreringsnummer() {
        return registreringsnummer;
    }

    public int getårsmodell() {
        return årsmodell;
    }

    public int gethastighet() {
        return hastighet;
    }

    // setter ändrar privata variablers värden
    public void setModell(String modell) {
        if (modell == "" || modell == null) {
            throw new IllegalArgumentException("Olagligt märke");
        }

    }
    
    //metoder
    public void ökaHastigheten(int ökning) {
        if (ökning <= 0) {
            throw new IllegalArgumentException("Ökning måste vara större än 0");
        } else {
            this.hastighet += ökning;
        }
    }
    public void bromsa(int minskning){
        if (minskning <= 0){
            throw new IllegalArgumentException("minskningen måste vara större än 0");
        }
        if (minskning > hastighet)
        {
            hastighet = 0;
        }
        else {
            hastighet--;
        }
    }
    public String toString()
    {
        return "märke: " + märke 
        +  "modell: " + modell 
        + "registreringsnummer: " 
        + registreringsnummer 
        + "årsmodell: " 
        + årsmodell 
        + "Hastighet: " + hastighet;
    }
}


