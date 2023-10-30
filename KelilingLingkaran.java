class demoKelilingLingkaran
{
    public static final double Phi = 3.14;
    double r;

    /**
     *
     * @param r keliling Lingkaran.
     */
    public demoKelilingLingkaran(double r) {
        this.r = r;
    }

    /**
     *
     * @return Hasil Keliling Lingkaran
     */
    public double kelilingLingkaran()
    {
        return 2*Phi*r;
    }

    public void tampil()
    {
        System.out.print(" Keliling Lingkaran dengan radius " +r+ " adalah " +kelilingLingkaran());
    }
}

public class KelilingLingkaran {
    public static void main(String[] args) {
        demoKelilingLingkaran dKL = new demoKelilingLingkaran(7);
        dKL.tampil();
    }
}