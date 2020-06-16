package main.java.com.mkaloshyn.creational.prototype_05;

import java.util.List;

public class Blueprint implements Copyable{

    private String manufactureName;
    private int numberOfStaff;
    private List<String> departments;

    public Blueprint(String manufactureName, int numberOfStaff, List<String> departments) {
        this.manufactureName = manufactureName;
        this.numberOfStaff = numberOfStaff;
        this.departments = departments;
    }

    public void setManufactureName(String manufactureName) {
        this.manufactureName = manufactureName;
    }

    public void setNumberOfStaff(int numberOfStaff) {
        this.numberOfStaff = numberOfStaff;
    }

    public void setDepartments(List<String> departments) {
        this.departments = departments;
    }

    public String getManufactureName() {
        return manufactureName;
    }

    public int getNumberOfStaff() {
        return numberOfStaff;
    }

    public List<String> getDepartments() {
        return departments;
    }

    @Override
    public Object copy() {
        Blueprint blueprintCopy = new Blueprint(manufactureName, numberOfStaff, departments);
        return blueprintCopy;
    }

    @Override
    public String toString() {
        return "Blueprint{" +
                "manufactureName='" + manufactureName + '\'' +
                ", numberOfStaff=" + numberOfStaff +
                ", departments=" + departments +
                '}';
    }
}
