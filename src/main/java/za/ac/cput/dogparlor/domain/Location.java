package za.ac.cput.dogparlor.domain;

/*
     CustomerAddress.java
     Entity for the CustomerAddress
     Author: Onodwa Siyotula (220087016)
     Date: 05 April 2023
 */

public class Location {

    private int locationID;
    private String name, longitude, latitude;

    private Location() {}

    private Location(LocationBuilder locationBuilder) {
        this.locationID = locationBuilder.locationID;
        this.name = locationBuilder.name;
        this.latitude = locationBuilder.latitude;
        this.longitude = locationBuilder.longitude;
    }

    public int getLocationID() {
        return locationID;
    }

    public String getName() {
        return name;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    @Override
    public String toString() {
        return "Location{" +
                "locationID=" + locationID +
                ", name='" + name + '\'' +
                ", longitude='" + longitude + '\'' +
                ", latitude='" + latitude + '\'' +
                '}';
    }

    public static class LocationBuilder {

        private int locationID;
        private String name, longitude, latitude;

        public LocationBuilder() {}

        public LocationBuilder setLocationID(int locationID) {
            this.locationID = locationID;
            return this;
        }

        public LocationBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public LocationBuilder setLongitude(String longitude) {
            this.longitude = longitude;
            return this;
        }

        public LocationBuilder setLatitude(String latitude) {
            this.latitude = latitude;
            return this;
        }

        public LocationBuilder copy(Location location) {
            this.locationID = location.locationID;
            this.name = location.name;
            this.latitude = location.latitude;
            this.longitude = location.longitude;
            return this;
        }

        public Location build() {
            return new Location(this);
        }

    }

}
