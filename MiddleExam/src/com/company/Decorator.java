package com.company;

/**
 * Created by Olia on 02.12.2016.
 */
public abstract class Decorator implements IDecorator{
    protected IDecorator decorator;

    public Decorator(IDecorator decorator) {
        this.decorator = decorator;
    }

    public void modify(int number) {
        decorator.modify(number);
    }
}
