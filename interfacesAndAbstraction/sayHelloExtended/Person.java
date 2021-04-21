package interfacesAndAbstraction.sayHelloExtended;

import java.io.Serializable;

public interface Person extends Serializable {

    public String getName();
    public String sayHello();
}