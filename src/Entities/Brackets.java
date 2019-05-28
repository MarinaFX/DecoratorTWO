package Entities;

public class Brackets extends Decorator {
    @Override
    public void print() {
        System.out.println("[" + super.getOne() + "]");
    }
}
