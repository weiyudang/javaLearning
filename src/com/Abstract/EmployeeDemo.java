package com.Abstract;


abstract class Employee {
    private  String name;
    private String eid;
    private  int salary;


    public Employee(){}
    public  Employee(String name,String eid,int salary){
        this.name=name;
        this.eid=eid;
        this.salary=salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", eid='" + eid + '\'' +
                ", salary=" + salary +
                '}';
    }

    public abstract  void  work();
}


class Programmer extends  Employee {
    public Programmer() {
    }

    public Programmer(String name, String eid, int salary) {
        super(name, eid, salary);
    }

    @Override
    public void work() {
        System.out.println("工程师写代码");
    }
}

class  Manager extends  Employee {
    public Manager() {
    }

    public Manager(String name, String eid, int salary) {
        super(name, eid, salary);
    }

    @Override
    public void work() {
        System.out.println("管理好人员");
    }
}

public class EmployeeDemo {


    public static void main(String[] args) {

        Programmer p=new Programmer();
        Employee  m=new Manager();
        showWork(m);
        showWork(p);



    }


    public  static  void showWork(Employee e){
        e.work();
    }



}
