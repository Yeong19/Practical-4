
public class Owner {
    private String name;
    private String ic_num;


    public Owner(String name, String icNo){
       this.name = name;
       this.ic_num = icNo;
}

    @Override
    public String toString(){
        return String.format("%-15s %-15s",name, ic_num);
    }
}
