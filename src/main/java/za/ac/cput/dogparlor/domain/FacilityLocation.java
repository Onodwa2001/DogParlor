package za.ac.cput.dogparlor.domain;

/*
     CustomerAddress.java
     Entity for the CustomerAddress
     Author: Onodwa Siyotula (220087016)
     Date: 05 April 2023
 */

public class FacilityLocation {

    private int facilityID, locationID;

    private FacilityLocation() {}

    private FacilityLocation(FacilityLocationBuilder builder) {
        this.facilityID = builder.facilityID;
        this.locationID = builder.locationID;
    }

    public int getFacilityID() {
        return facilityID;
    }

    public int getLocationID() {
        return locationID;
    }

    @Override
    public String toString() {
        return "FacilityLocation{" +
                "facilityID=" + facilityID +
                ", locationID=" + locationID +
                '}';
    }

    public static class FacilityLocationBuilder {

        private int facilityID, locationID;

        public FacilityLocationBuilder() {}

        public void setFacilityID(int facilityID) {
            this.facilityID = facilityID;
        }

        public void setLocationID(int locationID) {
            this.locationID = locationID;
        }

        public FacilityLocationBuilder copy(FacilityLocation facilityLocation) {
            this.facilityID = facilityLocation.facilityID;
            this.locationID = facilityLocation.locationID;
            return this;
        }

        public FacilityLocation build() { return new FacilityLocation(this); };

    }

}
