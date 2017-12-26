package org.rajesh.dp.strategy.bridge;

class DigitalHorizontal implements Horizontal {

    @Override
    public String getResource(String nameOfSkill) {
        switch (nameOfSkill) {
            case "Microservices":
                return "Here is Microservices Resource";
            case "AEM":
                return "Here is AEM Resource";
            case "Angular":
                return "Here is Angular Resource";
            default:
                return "Here is full stack developer";
        }
    }
}
