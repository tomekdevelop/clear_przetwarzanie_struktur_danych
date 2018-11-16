package pl.infoshare.processing._5_json._1_example;

import java.util.List;

public class EmployeeProfile {

    private String name;
    private int age;
    private boolean unemployed;
    private List<String> companies;

    public EmployeeProfile(String name, int age, boolean unemployed, List<String> companies) {
        this.name = name;
        this.age = age;
        this.unemployed = unemployed;
        this.companies = companies;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isUnemployed() {
        return unemployed;
    }

    public List<String> getCompanies() {
        return companies;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setUnemployed(boolean unemployed) {
        this.unemployed = unemployed;
    }

    public void setCompanies(List<String> companies) {
        this.companies = companies;
    }

    @Override
    public String toString() {
        return "EmployeeProfile{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", unemployed=" + unemployed +
                ", companies=" + companies +
                '}';
    }
}
