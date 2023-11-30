package Modul_10;

public interface ActivityLampu {
    public static final int LAMPU_HIDUP = 2;
    public static final int LAMPU_REDUP = 1;
    public static final int LAMPU_MATI = 0;
    public abstract void matikanLampu();
    public abstract void hidupkanLampu();
    public abstract void redupkanLampu();
}
