public class Main {
    public static void main(String[] args) {

        Auto kocsi = new Auto(4,7,5,"Opel","piros");
        System.out.print(kocsi.kerekekszamaAKocsin()+" | "+kocsi.ablakokszamaAKocsin()+" | "+kocsi.ulesekszamaAKocsin()+" | "+kocsi.kocsiSzine()+" | "+kocsi.kocsiMarkaja());
        System.out.println();
        System.out.println();
        System.out.println();
        Car kocsi2 = new Car("#654859","Mazda",3,3,3);
        System.out.println(kocsi2.getColor()+" | "+kocsi2.getBrand()+" | "+kocsi2.getWindow()+" | "+kocsi2.getDoor()+" | "+kocsi2.getSeat());
    }
}