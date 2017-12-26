package org.rajesh.dp.strategy.bridge;

class HealthCareVertical extends VerticalDomain {

    public HealthCareVertical(Horizontal horizontal){
        super(horizontal);
    }

    @Override
    String runProject() {
        return getHorizontal().getResource("AEM");
    }
}
