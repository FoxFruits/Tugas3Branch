class DemoKalkulator
{
    double a;
    double b;

    public DemoKalkulator(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public double add()
    {
        return a+b;
    }

    public double dec() {
        return a - b;
    }

    public void tampil()
    {
        System.out.println("Hasil penjumlahan dari " + a +" dan " +b + " = " + add());
        System.out.println("Hasil pengurangan dari " + a +" dan " +b +" = " +dec());
    }
}

public class Kalkulator {
    public static void main(String[] args) {
        DemoKalkulator dkl = new DemoKalkulator(5,10);
        dkl.tampil();
    }
}