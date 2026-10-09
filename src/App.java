
void main() {
    Bil bil1 = new Bil("Volvo", "AC90", "BOR589", 2009, 10);
    System.out.println(bil1);

    bil1.ökaHastigheten(50);
    System.out.println("Efter att ha ökat hastigheten: " + bil1.gethastighet());

    bil1.bromsa(20);
    System.out.println("Efter att ha minskat hastigheten: " + bil1.gethastighet());
    try {
        bil1.ökaHastigheten(-10);
    } catch (IllegalArgumentException e) {
        System.out.println("Fel: " + e.getMessage());
    }
}
