package main;

import osztalyok.Hajo;
import osztalyok.Palya;

public class torpedoProgram {
    public static void main(String[] args) {
        int[] hajoPoz = new int[3];
        Hajo h = new Hajo(hajoPoz);
        
        System.out.println(h.talalat(3));
    }
    
}
