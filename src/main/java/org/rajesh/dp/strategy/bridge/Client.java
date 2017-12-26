package org.rajesh.dp.strategy.bridge;

public class Client {
    public static void main(String[] args) {
        VerticalDomain vd = new HealthCareVertical(new DigitalHorizontal());
        System.out.printf("Now project is running. %s", vd.runProject());

    }
}

