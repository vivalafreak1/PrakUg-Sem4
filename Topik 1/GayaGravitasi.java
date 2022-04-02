public class GayaGravitasi
{
    public static void main(String[] args)
    {
        final double GRAVITASI = 6.674E-11; // Konstanta gravitasi
        double m1 = 40, m2 = 30;            // Massa objek 1 dan objek 2
        double r = 2;                       // Jarak antara objek 1 dan objek 2
        double force;                       // Gaya tarik gravitasi

        // Tuliskan kode Anda di bawah!
        
        force = (GRAVITASI * m1 *m2)/(r * r);

        System.out.print("F = " + force);


    }
}