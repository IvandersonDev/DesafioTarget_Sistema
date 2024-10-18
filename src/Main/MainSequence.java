package Main;

import Methods.SequenceSolver;

public class MainSequence {
    public static void main(String[] args) {
        SequenceSolver solver = new SequenceSolver();

        System.out.println("Próximo número da sequência A: " + solver.nextInSequenceA());
        System.out.println("Próximo número da sequência B: " + solver.nextInSequenceB());
        System.out.println("Próximo número da sequência C: " + solver.nextInSequenceC());
        System.out.println("Próximo número da sequência D: " + solver.nextInSequenceD());
        System.out.println("Próximo número da sequência E: " + solver.nextInSequenceE());
        System.out.println("Próximo número da sequência F: " + solver.nextInSequenceF());
    }
}


