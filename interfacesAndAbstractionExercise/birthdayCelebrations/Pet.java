package interfacesAndAbstractionExercise.birthdayCelebrations;

public class Pet implements Person,Birthable{
    private String name;
private String birthDate;

    public Pet(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    @Override
    public String getBirthDate() {
        return this.birthDate;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return 0;
    }

}
