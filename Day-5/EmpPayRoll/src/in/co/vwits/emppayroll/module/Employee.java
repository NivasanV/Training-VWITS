package in.co.vwits.emppayroll.module;


public class Employee implements Comparable<Employee>{
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "Employee [id="+id+", name="+name+"]";
    }

    // compareTo is a methos of comparable interface
    // it is used to sort employee object
    @Override
    public int compareTo(Employee o) {
        // TODO Auto-generated method stub
        //return this.id - o.id;
        return this.name.compareTo(o.name);
    }

}