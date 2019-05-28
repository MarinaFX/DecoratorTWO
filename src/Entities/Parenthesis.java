package Entities;

public class Parenthesis extends Decorator {
    @Override
    public void print() {
        System.out.println("(" + super.getOne() + ")");
    }
}
