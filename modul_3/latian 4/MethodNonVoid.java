package localvariable;

public class NonVoidMethod {
    public String getNama() {
        String nama = "Luckyta Afia";
        return nama;
    }

    public String getNIM() {
        String nim = "L200183103";
        return nim;
    }

    public static void main(String[] args) {
        NonVoidMethod nonvoidmethod = new NonVoidMethod();
        System.out.println("Nama : " + nonvoidmethod.getNama());
        System.out.println("NIM : " + nonvoidmethod.getNIM());
    }
}