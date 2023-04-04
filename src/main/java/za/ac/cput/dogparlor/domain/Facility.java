package za.ac.cput.dogparlor.domain;

public class Facility {
    private int facilityId;

    public Facility() {
    }

    private Facility(Builder builder) {
        this.facilityId = builder.facilityId;
    }

    public int getFacilityId() {
        return facilityId;
    }

    public static class Builder {
        private int facilityId;


        public Builder setFacilityId(int facilityId) {
            this.facilityId = facilityId;
            return this;
        }

        public Builder copy(Facility facility) {
            this.facilityId = facility.facilityId;
            return this;
        }

        public Facility build() {
            return new Facility(this);
        }


        @Override
        public String toString() {
            return "Facility{" +
                    "facilityId=" + facilityId +
                    '}';
        }
    }
}
