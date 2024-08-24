/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan1;

/**
 *
 * @author HP
 */
public class Utama {
    public static void main(String[] args) {
         //Hewan
        Hewan meong = new Hewan();
        System.out.println("Nama saya meong: ");
        meong.bernafas();
        meong.tumbuh();
        System.out.println();
        
        // Pisces
        Pisces ikan = new Pisces();
        ikan.setJumlahKaki(0);
        ikan.setBerjalan("Berenang");
        ikan.setBeradaptasi("Beradaptasi dengan lingkungan air");
        ikan.setTemperaturTubuh("Dingin");
        ikan.setTipeSirip("Sirip punggung dan sirip ekor");

        System.out.println("Saya adalah Pisces, atau ikan. Tubuh saya memiliki temperatur " + ikan.getTemperaturTubuh() + ", dan saya dilengkapi dengan " + ikan.getTipeSirip() + ".");
        System.out.println("Saya tidak memiliki kaki, dan cara bergerak saya adalah " + ikan.getBerjalan() + ".");
        System.out.println("Adaptasi saya adalah " + ikan.getBeradaptasi() + ".");
        ikan.bernafas();
        ikan.tumbuh();

        // Amfibia
        Amfibia kodok = new Amfibia();
        kodok.setMetamorfosis("Metamorfosis lengkap");
        kodok.setAlatGerakLarva("Kaki berenang");

        kodok.setJumlahKaki(4); // Misalnya kodok memiliki empat kaki
        kodok.setBerjalan("Berlari dan melompat");
        kodok.setBeradaptasi("Beradaptasi dengan lingkungan air dan darat");

        System.out.println("Nama saya Kodok.");
        System.out.println("Saya mengalami " + kodok.getMetamorfosis() + ", dan larva saya menggunakan " + kodok.getAlatGerakLarva() + " untuk bergerak di air.");
        System.out.println("Saya memiliki " + kodok.getJumlahKaki() + " kaki. Cara bergerak saya adalah " + kodok.getBerjalan() + ".");
        System.out.println("Saya beradaptasi dengan " + kodok.getBeradaptasi() + ".");
        kodok.bernafas();
        kodok.tumbuh();
        System.out.println();

        // Aves
        Aves burung = new Aves();
        burung.setJenisParuh("Paruh melengkung untuk makan buah");
        burung.setTulang("Tulang berongga");

        burung.setJumlahKaki(2); // Burung memiliki dua kaki
        burung.setBerjalan("Terbang dan berjalan");
        burung.setBeradaptasi("Beradaptasi dengan berbagai habitat udara dan darat");

        System.out.println("Nama saya Burung.");
        System.out.println("Paruh saya " + burung.getJenisParuh() + ", dan tulang saya " + burung.getTulang() + ".");
        System.out.println("Saya memiliki " + burung.getJumlahKaki() + " kaki. Saya dapat " + burung.getBerjalan() + ".");
        System.out.println("Saya beradaptasi dengan " + burung.getBeradaptasi() + ".");
        burung.bernafas();
        burung.tumbuh();
        System.out.println();

        // Reptilia
        Reptilia ular = new Reptilia();
        ular.setTipeTelur("Telur dengan cangkang keras");
        ular.setCangkangTelur("Cangkang keras dan kalis air");

        ular.setJumlahKaki(0); 
        ular.setBerjalan("Merayap");
        ular.setBeradaptasi("Beradaptasi dengan lingkungan kering dan lembab");

        System.out.println("Nama saya Ular.");
        System.out.println("Saya bertelur dengan " + ular.getTipeTelur() + " yang memiliki " + ular.getCangkangTelur() + ".");
        System.out.println("Saya tidak memiliki kaki, dan cara bergerak saya adalah " + ular.getBerjalan() + ".");
        System.out.println("Saya beradaptasi dengan " + ular.getBeradaptasi() + ".");
        ular.bernafas();
        ular.tumbuh();
        System.out.println();

        // Mamalia
        Mamalia harimau = new Mamalia();
        harimau.setJenisRambut("Bulu lebat");
        harimau.setJenisMakanan("Karnivora");

        harimau.setJumlahKaki(4); // Harimau memiliki empat kaki
        harimau.setBerjalan("Berjalan dan berlari");
        harimau.setBeradaptasi("Beradaptasi dengan habitat darat dan berburu");

        System.out.println("Nama saya Harimau.");
        System.out.println("Rambut saya " + harimau.getJenisRambut() + " dan saya termasuk dalam kategori " + harimau.getJenisMakanan() + ".");
        System.out.println("Saya memiliki " + harimau.getJumlahKaki() + " kaki. Saya bisa " + harimau.getBerjalan() + ".");
        System.out.println("Saya beradaptasi dengan " + harimau.getBeradaptasi() + ".");
        harimau.bernafas();
        harimau.tumbuh();
        System.out.println();
        
        // Dikotil
        Dikotil bungaMatahari = new Dikotil();
        bungaMatahari.setJumlahKelopakBunga(15);
        bungaMatahari.setPolaVenasi("Pola venasi jala");
        bungaMatahari.setWarnaDaun("Hijau");
        bungaMatahari.setArahDaun("Timur");
        bungaMatahari.setFotosintesis("Fotosintesis C3");

        System.out.println("Nama saya Bunga Matahari.");
        System.out.println("Saya memiliki " + bungaMatahari.getJumlahKelopakBunga() + " kelopak bunga, dan pola venasi daun saya berbentuk " + bungaMatahari.getPolaVenasi() + ".");
        System.out.println("Warna daun saya adalah " + bungaMatahari.getWarnaDaun() + ", dan arah daun saya menghadap ke " + bungaMatahari.getArahDaun() + ".");
        System.out.println("Proses fotosintesis saya adalah " + bungaMatahari.getFotosintesis() + ".");
        bungaMatahari.bernafas();
        bungaMatahari.tumbuh();
        System.out.println();

        // Monokotil
        Monokotil jagung = new Monokotil();
        jagung.setJenisAkar("Akar serabut");
        jagung.setTipeDaun("Daun garis panjang");
        jagung.setWarnaDaun("Hijau cerah");
        jagung.setArahDaun("Selatan");
        jagung.setFotosintesis("Fotosintesis C4");

        System.out.println("Nama saya Jagung.");
        System.out.println("Saya memiliki jenis akar " + jagung.getJenisAkar() + " dan daun dengan tipe " + jagung.getTipeDaun() + ".");
        System.out.println("Warna daun saya adalah " + jagung.getWarnaDaun() + ", dan arah daun saya menghadap ke " + jagung.getArahDaun() + ".");
        System.out.println("Proses fotosintesis saya adalah " + jagung.getFotosintesis() + ".");
        jagung.bernafas();
        jagung.tumbuh();
    }
}
