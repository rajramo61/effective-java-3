package org.rajesh.dp.strategy.bridge;

abstract class VerticalDomain {
    private Horizontal horizontal;

    VerticalDomain(){}

    public VerticalDomain(Horizontal horizontal){
        this.horizontal = horizontal;
    }

    public Horizontal getHorizontal() {
        return horizontal;
    }

    public void setHorizontal(Horizontal horizontal) {
        this.horizontal = horizontal;
    }

    abstract String runProject();
}
