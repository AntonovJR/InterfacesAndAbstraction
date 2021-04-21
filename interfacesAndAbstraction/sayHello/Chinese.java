package interfacesAndAbstraction.sayHello;

import java.io.Serializable;

public class Chinese implements Person {
    private String name;

    public Chinese(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public String sayHello() {
        return "Djydjybydjy";
    }
}
