package com.company;

public class Colk <T extends Number> implements Metod<T>{

    private T uch;
    private T tort;

    public Colk(T uch, T tort) {
        this.uch = uch;
        this.tort = tort;
    }

    public T getUch() {
        return uch;
    }

    public void setUch(T uch) {
        this.uch = uch;
    }

    public T getTort() {
        return tort;
    }

    public void setTort(T tort) {
        this.tort = tort;
    }

    @Override
    public void plas(T bir, T eki) {
        System.out.println( bir.intValue() + eki.intValue() + uch.intValue() + tort.intValue());

    }

    @Override
    public void minus(T bir, T eki) {
        System.out.println( bir.intValue() - eki.intValue() - uch.intValue() - tort.intValue());

    }
}
