package praktek02;
public class Volume {
    double panjang;
    double lebar;
    double tinggi;

    public Volume() {
        panjang=7;
        lebar=8;
        tinggi=5;
    }
    
    void cetakInfo(){
        System.out.println("==================");
        System.out.println("Panjang : "+panjang);
        System.out.println("Lebar :   "+lebar);
        System.out.println("Lebar :   "+tinggi);
        System.out.println("==================");
    }
    
    double hitungLuas(){
        double luas;
        luas=panjang*lebar*tinggi;
        return luas;
    }
    
    void cetakLuas(){
        System.out.println("Luasnya adalah: "+hitungLuas());
    }
}
