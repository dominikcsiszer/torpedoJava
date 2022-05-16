package osztalyok;

public class Hajo {
    private static int[] hajoPoz;
    private static int[] poz = new int[3];
    
    public Hajo() {
        this(poz);
    }
    public Hajo(int[] hajoPoz) {
        this.hajoPoz = hajoPoz;
        hajoLerakas();
    }
    
    private static void hajoLerakas() {
        int random = (int)(Math.random() * ((5 - 1) + 1)) + 1;
        
        for (int i = 0; i < poz.length; i++) {
            poz[i] = random;
            random++;
        }
    }
    
    public static int[] getPos() {
        return poz;
    }
}
