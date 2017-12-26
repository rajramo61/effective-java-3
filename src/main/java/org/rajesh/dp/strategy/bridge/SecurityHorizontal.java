package org.rajesh.dp.strategy.bridge;

class SecurityHorizontal implements Horizontal {

    @Override
    public String getResource(String nameOfSkill) {
        switch (nameOfSkill) {
            case "ORACLE-IDM":
                return "Here is ORACLE-IDM Resource";
            case "WEB-SECURITY":
                return "Here is WEB-SECURITY Resource";
            default:
                return "Here is Security Resource";
        }
    }
}
