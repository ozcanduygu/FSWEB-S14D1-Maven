package com.workintech.developers;

public class HRManager extends Employee{
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;
    public HRManager(long id, String name, double salary) {
        super(id, name, salary);
        juniorDevelopers = new JuniorDeveloper[5];
        midDevelopers = new MidDeveloper[5];
        seniorDevelopers = new SeniorDeveloper[5];
    }

    public HRManager(long id, String name, double salary, int juniorSize, int midSize, int seniorSize){
        super(id,name,salary);
        juniorDevelopers= new JuniorDeveloper[juniorSize];
        midDevelopers= new MidDeveloper[midSize];
        seniorDevelopers= new SeniorDeveloper[seniorSize];
    }
    @Override
    public void work() {
        System.out.println("HR Manager is managing employees...");
        setSalary(getSalary() + 1500);
    }

    public void addEmployee(JuniorDeveloper dev, int index){
        if(index<0 || index>=juniorDevelopers.length){
            System.out.println("Invalid index");
            return;
        }if(juniorDevelopers[index]!= null){
            System.out.println("JuniorDeveloper slot is already full");
            return;
        }
        juniorDevelopers[index]=dev;
    }
    public void addEmployee(MidDeveloper dev, int index){
        if(index<0 || index>= midDevelopers.length){
            System.out.println("Invalid index");
            return;
        }if(midDevelopers[index]!=null){
            System.out.println("MidDeveloper slot is already full");
            return;
        }
        midDevelopers[index]=dev;
    }
    public void addEmployee(SeniorDeveloper dev, int index){
        if(index<0 || index>=seniorDevelopers.length){
            System.out.println("Invalid index");
            return;
        }if(seniorDevelopers[index]!=null){
            System.out.println("SeniorDeveloper slot is already full");
            return;
        }
        seniorDevelopers[index]=dev;
    }

}
