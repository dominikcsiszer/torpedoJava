package osztalyok;

import java.util.Scanner;

public class Palya {
    private Hajo hajo;

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
        System.out.print("Add meg a célpont helyét!");
        int tipp = sc.nextInt();
        while(!(tipp > 0 && tipp < 8)){
            System.out.print("Add meg a célpont helyét!");
            tipp = sc.nextInt();
        }
        System.out.println(loves(tipp));
        while(loves(tipp) != "Süllyedt"){
            bekeres();
        }
        System.out.println(loves(tipp));
    }
}
