package osztalyok;

import java.util.Scanner;

public class Palya {
    private Hajo hajo;
    private static int[] tippek = new int[7];

    public Palya(Hajo hajo) {
        this.hajo = hajo;
    }
    
    public static String loves(int poz){
        String eredmeny = "";
        int i = 0;
        boolean van = false;
        while(i < Hajo.getPos().length && !(poz == Hajo.getPos()[i])) {
            i++;
        }
        van = i < Hajo.getPos().length;
        eredmeny = van ? "Talált" : "Nem talált";
        return eredmeny;
    }
    
    public static void bekeres(){
        System.out.println(Hajo.getPos()[1]);
        Scanner sc = new Scanner(System.in);
        System.out.print("Add meg a célpont helyét: ");
        int tipp = sc.nextInt();
        while(!(tipp > 0 && tipp < 8)){
            System.out.print("Add meg a célpont helyét: ");
            tipp = sc.nextInt();
        }
        
        
        // debug
        
        System.out.println(loves(tipp));
        int db = 0;
        while(loves(tipp) != "Süllyedt"){
            tippek[db] = tipp;
            bekeres();
            db++;
        }
        System.out.println("Ennyiszer tippeltél: " + db);
    }
}
