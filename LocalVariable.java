package localvariable;

public class LocalVariable {
     public void hitungUsia() {
        int usia = 0;
        int tahunSekarang = 2019;
        int tahunLahir = 1993;

        usia = tahunSekarang - tahunLahir;

        System.out.println("Usia saya : " + usia);
    }
    public void beratBadan() {
        int beratBadan = 0;
        int beratLahir = 2;

        beratBadan = beratLahir + (usia / 2);

        System.out.println("Berat badan : " + beratBadan);
    }
    public static void main(String[] args) {
        LocalVariable localvariable = new LocalVariable();
        localvariable.hitungUsia();
        localvariable.beratBadan();
    }
}