package org.rajesh.objcreation.builder;

public class Client {
    public static void main(String[] args) {
        DigitalDeveloper dd = new DigitalDeveloper.Builder(3)
                .addSkill(TechSkills.JAVA)
                .addSkill(TechSkills.SPRING)
                .addSkill(TechSkills.JPA)
                .addSkill(TechSkills.MICRO_SERVICES)
                .build();
        System.out.printf("Got a new Digital Developer object using Builder pattern %s", dd);
    }
}
