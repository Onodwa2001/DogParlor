/*  ExtraService.java
    Entity for extra services
    Author: Lindiwe Thokozile Somana (218076509)
    Date: 4 April 2023
 */
package za.ac.cput.dogparlor.domain;

public class ExtraService {

    private int extraId;
    private String extraServiceName;

    public ExtraService() {
    }

    private ExtraService(Builder builder) {
        this.extraId = builder.extraId;
        this.extraServiceName = builder.extraServiceName;
    }

    public int getExtraId() {
        return extraId;
    }

    public String getExtraServiceName() {
        return extraServiceName;
    }

    @Override
    public String toString() {
        return "ExtraService{" +
                "extraId=" + extraId +
                ", extraServiceName='" + extraServiceName + '\'' +
                '}';
    }

    public static class Builder {
        private int extraId;
        private String extraServiceName;

        public Builder setExtraId(int extraId) {
            this.extraId = extraId;
            return this;
        }

        public Builder setExtraServiceName(String extraServiceName) {
            this.extraServiceName = extraServiceName;
            return this;
        }

        public Builder copy(ExtraService extraService) {
            this.extraId = extraService.extraId;
            this.extraServiceName = extraService.extraServiceName;
            return this;
        }

        public ExtraService build() {
            return new ExtraService(this);
        }
    }
}