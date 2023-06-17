/* Staff.java
  Entity for the Staff
  Author: Byron Young (218155077)
  Date:05 April 2023
 */

package za.ac.cput.dogparlor.domain;

import java.util.Objects;

public class Staff extends Person {
    private int staffID;
    private double salary;
    private String handleArea;
    private int idRole;
    private int personID;

    private Staff(){};

    private Staff(Builder builder){
        this.staffID = builder.staffID;
        this.salary = builder.salary;
        this.handleArea = builder.handleArea;
        this.idRole = builder.idRole;
        this.personID = builder.personID;
    }

    public int getStaffID() {
        return staffID;
    }

    public double getSalary() {
        return salary;
    }

    public String getHandleArea() {
        return handleArea;
    }

    public int getIdRole() {
        return idRole;
    }

    public int getPersonID() {
        return personID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Staff that = (Staff) o;
        return staffID == that.staffID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(staffID);
    }
    @Override
    public String toString() {
        return "Staff{" +
                "staffID=" + staffID +
                ", salary=" + salary +
                ", handleArea='" + handleArea + '\'' +
                ", idRole=" + idRole +
                ", personID=" + personID +
                '}';
    }

    public static class Builder{
        private int staffID;
        private double salary;
        private String handleArea;
        private int idRole;
        private int personID;

        public Builder() {}
        public Builder setStaffID(int staffID) {
            this.staffID = staffID;
            return this;
        }

        public Builder setSalary(double salary) {
            this.salary = salary;
            return this;
        }

        public Builder setHandleArea(String handleArea) {
            this.handleArea = handleArea;
            return this;
        }

        public Builder setIdRole(int idRole) {
            this.idRole = idRole;
            return this;
        }

        public Builder setPersonID(int personID) {
            this.personID = personID ;
            return this;
        }

        public Builder copy(Staff staff){
            this.staffID = staff.staffID;
            this.salary = staff.salary;
            this.handleArea = staff.handleArea;
            this.idRole = staff.idRole;
            this.personID = staff.personID;
            return this;
        }

        public Staff build(){
            return new Staff(this);
        }

    }

}
