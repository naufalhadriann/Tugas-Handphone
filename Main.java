import java.io.*;

class Main
{
    public static void main (String [] args) throws Exception
    {        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
           
        //instance of  class
        Handphone hp = new Handphone();

        //input
        System.out.print("Masukan merk handphone : ");
        String merk_hp = br.readLine();
        System.out.print("Masukan tipe handphone : ");
        String tipe_hp = br.readLine();
        System.out.print("Masukan warna handphone : ");
        String warna_hp = br.readLine();
        System.out.print("Masukan harga handphone : ");
        double harga_hp = Double.parseDouble(br.readLine());

        hp.setMerk(merk_hp);
        hp.setTipe(tipe_hp);
        hp.setWarna(warna_hp);
        hp.setHarga(harga_hp);

        //output
        System.out.println("===================================");
        System.out.println("DAFTAR HARGA PONSEL DAN SPESIFIKASINYA");
        System.out.println("===================================");
        System.out.println("Merk HP = "+ hp.getMerk());
        System.out.println("Tipe HP = "+ hp.getTipe());
        System.out.println("Warna HP = "+ hp.getWarna());
        System.out.println("Harga HP sebelum diskon = Rp"+ hp.getHarga());
        hp.keterangan();
    }
}