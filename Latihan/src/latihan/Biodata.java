package latihan; //<- 1. deklarasi package

public class Biodata { // 2. bagian class
    public static void main(String[] args) { // 3. Method main
         //tipe data dan variabel
        String nama = "Aldi Fauzi Ilmamuslim";
        String tempatlahir = "Bantul";
        String bulan = "15 November 2005";
        String jeniskelamin = "laki-laki";
        String nohp = "089876543210";
        String email = "aldi123@gmail.com";
        int umur = 16;
        double berat,tinggi;
        berat =70.6;
        tinggi =168.9;
        
        /**menampilkan output*/
        System.out.println("--------- BIODATA--------");
        System.out.println("Nama         :"+nama);
        System.out.println("Tempat lahir :"+tempatlahir);
        System.out.println("Tanggal lahir:"+bulan);
        System.out.println("Umur         :"+umur);
        System.out.println("Berat badan  :"+berat);
        System.out.println("Tinggi badan :"+tinggi);
        System.out.println("Jenis Kelamin:"+jeniskelamin);
        System.out.println("No HP        :"+nohp);
        System.out.println("Email        :"+email);
        System.out.println("-------------------------");
        System.out.println("            --           ");        
    }
}
