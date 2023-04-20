import alkatresz.Ablak;
import alkatresz.Kerek;
import alkatresz.Ules;
import interfaces.IHangJelzes;
import tulajdonsag.Marka;
import tulajdonsag.Szin;

public class Auto implements IHangJelzes {
    private Kerek kerekekSzama;
    private Ules ulesekSzama;
    private Ablak ablakokSzama;

    private Marka brand;

    private Szin color;

    public Auto(int kerekekSzama,int ules,int ablak, String marka, String szin){
        this.kerekekSzama=new Kerek(kerekekSzama);
        this.ablakokSzama=new Ablak(ablak);
        this.ulesekSzama = new Ules(ules);
        this.brand = new Marka(marka);
        this.color = new Szin(szin);
    }

    public int kerekekszamaAKocsin() {
        return this.kerekekSzama.getKerekekSzama();
    }
    public int ulesekszamaAKocsin() {
        return this.ulesekSzama.getUlesSzam();
    }

    public int ablakokszamaAKocsin() {
        return this.ablakokSzama.getAblakSzama();
    }

    public String kocsiSzine(){
        return this.color.getColor();

    }

    public String kocsiMarkaja(){
        return this.brand.getBrand();

    }


    @Override
    public void jelzes() {
        System.out.println("tütűűűűűűűűűűűűűűű");
    }
}
