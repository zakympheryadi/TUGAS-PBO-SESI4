public class Segitiga extends BangunDatar {
    protected double alas ;
    protected double tinggi;
    protected double sisi1;
    protected double sisi2;
    protected double sisi3;

    public void hitungLuas() {
        double setengahLingkaran = (sisi1 + sisi2 + sisi3) / 2;
        super.luas = Math.sqrt(setengahLingkaran * (setengahLingkaran - sisi1) * (setengahLingkaran - sisi2) * (setengahLingkaran - sisi3));
    }

    public void hitungKeliling() {
        super.keliling = sisi1 + sisi2 + sisi3;
    }
}