public class SamaSisi extends Segitiga{
    public SamaSisi (double sisi1, double sisi2, double sisi3){
        super.setNama("SamaSisi");
        this.hitungLuas(sisi1, sisi2, sisi3);
        this.hitungKeliling(sisi1, sisi2, sisi3);
    }

    public void hitungLuas(double sisi1, double sisi2, double sisi3){
        double setengahLingkaran = (sisi1 + sisi2 + sisi3) / 2;
        super.luas = Math.sqrt(setengahLingkaran * (setengahLingkaran - sisi1) * (setengahLingkaran - sisi2) * (setengahLingkaran - sisi3));
    }

    public void hitungKeliling(double sisi1, double sisi2, double sisi3){
        super.keliling = sisi1 + sisi2 + sisi3;
    }

}