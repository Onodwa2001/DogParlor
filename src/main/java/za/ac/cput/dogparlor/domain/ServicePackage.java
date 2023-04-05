/*  ServicePackage.java
    Entity for services packages
    Author: Lindiwe Thokozile Somana (218076509)
    Date: 4 April 2023
 */

package za.ac.cput.dogparlor.domain;

public class ServicePackage {
    private int serviceId;
    private int extraId;

    public ServicePackage(){}

    private ServicePackage(Builder builder){
        this.serviceId = builder.serviceId;
        this.extraId = builder.extraId;
    }

    public int getServiceId() {
        return serviceId;
    }

    public int getExtraId() {
        return extraId;
    }

    @Override
    public String toString() {
        return "ServicePackage{" +
                "serviceId=" + serviceId +
                ", extraId=" + extraId +
                '}';
    }

    public static class Builder{

        private int serviceId, extraId;

        public Builder setServiceId(int serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        public Builder setExtraId(int extraId) {
            this.extraId = extraId;
            return this;
        }

        public Builder copy(ServicePackage servicePackage){
            this.serviceId = servicePackage.serviceId;
            this.extraId = servicePackage.extraId;
            return this;
        }

        public ServicePackage build(){
            return new ServicePackage(this);
        }
    }
}
