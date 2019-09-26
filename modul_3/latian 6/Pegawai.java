package localvariable;

public class Pegawai {
  String nama;
    int nip;
    double gaji;
    public void setPegawai(String nama, int nip, double gaji) {
        this.nama = nama;
        this.nip = nip;
        this.gaji = gaji;
        System.out.println("Nama : " + nama + "\n" +
                            "NIP : " + nip + "\n" +
                            "Gaji : " + gaji + "\n");
    }
    public static void main(String[] args) {
        Pegawai pegawai1 = new Pegawai();
        Pegawai pegawai2 = new Pegawai();
        Pegawai pegawai3 = new Pegawai();
        Pegawai pegawai4 = new Pegawai();
        Pegawai pegawai5 = new Pegawai();
        pegawai1.setPegawai("Gofud",546379,10000000);
        pegawai2.setPegawai("Golaif",927353,2500000);
        pegawai3.setPegawai("Gojeq",846290,5000000);
        pegawai4.setPegawai("Gosen",938748,6400000);
        pegawai5.setPegawai("Goqar",152647,9000000);
    }  
}