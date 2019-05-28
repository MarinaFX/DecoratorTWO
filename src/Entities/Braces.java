package Entities;

public class Braces extends Decorator {
    @Override
    public void print() {
        System.out.println("{" + super.getOne() + "}");
    }
}
