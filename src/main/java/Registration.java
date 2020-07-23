
public class Registration {
    private static int count = 1001;

    private int regNo;
    private Owner owner;
    private Car car;

    public Registration(Owner owner, Car car){
        this.owner = owner;
        this.car = car;
        this.regNo = count;
        count++;
    }

    public String toString(){
        return String.format("%10d %s %s ", regNo, owner.toString(), car.toString());
    }
}

