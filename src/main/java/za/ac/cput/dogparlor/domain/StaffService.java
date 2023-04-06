/* StaffService.java
  Entity for the StaffService
  Author: Byron Young (218155077)
  Date:05 April 2023
 */
package za.ac.cput.dogparlor.domain;

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
