package praktek02;

public class VolumeAksi {
    public static void main(String[] args) {
        Volume v1 = new Volume();
        v1.panjang = 7;
        v1.lebar = 5;
        v1.tinggi = 4;
        
        v1.cetakInfo();
        System.out.println("Luas volume = "+v1.hitungLuas());
        v1.cetakLuas();
        
        Volume v2 = new Volume();
        v2.cetakInfo();
        
        Volume v3 = new Volume(40,20);
        v3.cetakInfo();
    }
}
