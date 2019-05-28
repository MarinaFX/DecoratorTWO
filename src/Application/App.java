package Application;

import Entities.*;

/**
 *  Decorator Pattern -> Exatamente como uma arma. Pense que você tem o corpo completo de uma M4,
 *  porém sem coronha, paint, cano, mira, grip, ...
 *  O decorator serve como um create a class, onde definimos um metodo abstrato para qual outras
 *  classes (partes) irão incrementar a classe principal (o corpo da arma).
 */

public class App {

    private static void close(){
        System.out.println("Fim!");
    }

    private static void greetings(){
        System.out.println("Bem vindo!");
        System.out.println("Aprecie com moderação oaksdpaokpko");
    }

    public static void main(String[] args) {
        Decorator parenthesis = new Parenthesis();
        Decorator brackets = new Brackets();
        Decorator braces = new Braces();

        App.greetings();

        System.out.println(" " + parenthesis.getOne());
        parenthesis.print();
        brackets.print();
        braces.print();

        App.close();
    }
}
