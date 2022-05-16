package main;

import osztalyok.Hajo;
import osztalyok.Palya;

public class torpedoProgram {
    public static void main(String[] args) {
        Hajo h = new Hajo();
        
        Palya p = new Palya(h);
        p.bekeres();
    }
    
}
