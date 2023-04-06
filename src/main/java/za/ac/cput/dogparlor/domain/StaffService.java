/* StaffService.java
  Entity for the StaffService
  Author: Byron Young (218155077)
  Date:05 April 2023
 */
package za.ac.cput.dogparlor.domain;

import java.util.Objects;

public class StaffService {
    private int staffID;
    private int serviceID;

    private StaffService(){};

    private StaffService(Builder builder){
        this.staffID = builder.staffID;
        this.serviceID = builder.serviceID;
    }

    public int getStaffID() {
        return staffID;
    }

    public int getServiceID() {
        return serviceID;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StaffService that = (StaffService) o;
        return staffID == that.staffID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(staffID);
    }

    public static class Builder{
        private int staffID;
        private int serviceID;

        public Builder setStaffID(int staffID) {
            this.staffID = staffID;
            return this;
        }

        public Builder setServiceID(int serviceID) {
            this.serviceID = serviceID;
            return this;
        }

        public Builder copy(StaffService staffService){
            this.serviceID = staffService.serviceID;
            this.staffID = staffService.staffID;
            return this;
        }

        public StaffService build(){
            return new StaffService(this);
        }

    }
}
