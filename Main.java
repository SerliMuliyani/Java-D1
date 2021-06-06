public class DataTypes {
  public static void main (String[] args){
 

    String namaDepan = "Serli";
    String namaBelakang = "Muliyani";
    int usia = 20;
    int targetTahunKuliah = 4;
    double ipk = 3.89764512;
    char nilaiAbjad = 'A';
    boolean cantik = true;

    char[] uniskaChar = {'U', 'N', 'I', 'S', 'K', 'A'};
    String uniskaString = new String(uniskaChar);
    System.out.println(uniskaString);

    String namaLengkap = namaDepan + " " + namaBelakang;
    System.out.println(namaLengkap.length());
    System.out.println(namaLengkap.indexOf("NIS));
    System.out.println(namaLengkap.substring(5));
    System.out.println(namaLengkap.substring(5,12));
    System.out.println(namaLengkap.replace(target: "Ser", replacement: "Mul"));
    System.out.println(namaLengkap.toUpperCase());
    System.out.println(namaLengkap.toLowerCase());
    System.out.println(namaLengkap.charArt(6));

    String[] namaArray = namaLengkap.split( regex: " ");

    For(String nama : namaArray){
        System.out.println(nama);

    System.out.println(namaDepan + namaBelakang);

  }
}