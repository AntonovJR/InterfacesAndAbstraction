package interfacesAndAbstraction.sayHello;

import java.io.Serializable;

public interface Person extends Serializable {

    public String getName();


    public default String sayHello() {
        return "Hello";
    }
}
