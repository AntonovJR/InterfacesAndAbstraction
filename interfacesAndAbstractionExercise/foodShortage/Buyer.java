package interfacesAndAbstractionExercise.foodShortage;

import java.io.Serializable;

public interface Buyer extends Serializable {
    public int getFood();
    public void buyFood();
}
