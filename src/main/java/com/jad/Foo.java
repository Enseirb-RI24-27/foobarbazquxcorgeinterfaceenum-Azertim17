package com.jad;

import java.util.ArrayList;
import java.util.List;

public class Foo implements IFoo {
    private List<IBar> bars = new ArrayList<>();
    private IQux qux;
    private IBaz baz;
    private ICorge corge;

    public Foo(IBaz baz) {
        this.baz = baz;
    }

    public IQux getQux() {
        return this.qux;
    }

    public ICorge getCorge() {
        return this.corge;
    }

    public void setCorge(ICorge corge) {
        this.corge = corge;
    }

    @Override
    public String toString() {
        return "Foo{" +
                "bars=" + this.bars +
                '}';
    }

    public List<IBar> getBars() {
        return this.bars;
    }

    public void addBar(IBar bar) {
        this.bars.add(bar);
    }

}
