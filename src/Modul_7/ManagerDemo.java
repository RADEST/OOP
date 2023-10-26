package Modul_7;

public class ManagerDemo extends Manager{
    public static void main(String[] args) {
        ManagerDemo md = new ManagerDemo(); //object
        md.setNama("Mamen");
        md.setGaji(500000);
        md.setUsia(30);
        System.out.println(md.getNama()+" memiliki gaji sebesar "+
                md.getGajiManager() + " walaupun ia sudah berusia " + md.getUsia()
                + " ia bekerja selama " + md.jamKerja() + " jam");

        ManagerDemo nemo = new ManagerDemo();
        nemo.setNama("Nemo");
        nemo.setGaji(400000);
        nemo.setUsia(25);
        nemo.setJamKerja(8.5f);
        System.out.println(nemo.getNama()+" memiliki gaji sebesar "+
                nemo.getGajiManager() + " walaupun ia sudah berusia " + nemo.getUsia()
                + " ia bekerja selama " + nemo.jamKerja() + " jam");

        ManagerDemo Kobo = new ManagerDemo();
        Kobo.setNama("Kobo");
        Kobo.setGaji(300000);
        Kobo.setUsia(20);
        Kobo.setJamKerja(23.5f);
        System.out.println(Kobo.getNama()+" memiliki gaji sebesar "+
                Kobo.getGajiManager() + " walaupun ia sudah berusia " + Kobo.getUsia()
                + " ia bekerja selama " + Kobo.jamKerja() + " jam");

        ManagerDemo Zeta = new ManagerDemo();
        Zeta.setNama("Zeta");
        Zeta.setGaji(200000);
        Zeta.setUsia(15);
        Zeta.setJamKerja(0.5f);
        System.out.println(Zeta.getNama()+" memiliki gaji sebesar "+
                Zeta.getGajiManager() + " walaupun ia sudah berusia " + Zeta.getUsia()
                + " ia bekerja selama " + Zeta.jamKerja() + " jam");

        ManagerDemo Mine = new ManagerDemo();
        Mine.setNama("Mine");
        Mine.setGaji(100000);
        Mine.setUsia(20);
        Mine.setJamKerja(5.5f);
        System.out.println(Mine.getNama()+" memiliki gaji sebesar "+
                Mine.getGajiManager() + " walaupun ia sudah berusia " + Mine.getUsia()
                + " ia bekerja selama " + Mine.jamKerja() + " jam");
    }
}
