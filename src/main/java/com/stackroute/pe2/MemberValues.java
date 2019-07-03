package com.stackroute.pe2;
/*class named Member with Name, age, Salary as its variable, write an other
class named Member Variable that creates an instance of the Member class, initialises its
member variables, and then displays the value of each member variable.*/

import javax.swing.plaf.metal.MetalMenuBarUI;

class Member
{
    private int age, salary;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


public class MemberValues
{
    public static void main(String[] args)
    {

        Member obj = new Member();
        obj.setAge(21);
        obj.setSalary(200);
        obj.setName("Rohit");

        System.out.println(obj.getAge());
        System.out.println(obj.getSalary());
        System.out.println(obj.getName());


    }

}