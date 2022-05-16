package osztalyok;

import java.util.Scanner;

public class Palya {
    private Hajo hajo;

    public Palya(Hajo hajo) {
        this.hajo = hajo;
    }
    
    public static String loves(int poz){
        
        return "Lövés";
    }
    
    public static void bekeres(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Add meg a célpont helyét!");
        int tipp = sc.nextInt();
        while(!(tipp > 0 && tipp < 8)){
            System.out.print("Add meg a célpont helyét!");
            tipp = sc.nextInt();
        }
    }
}
