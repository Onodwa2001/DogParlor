/*Service.java
  Entity for the Service
  Author: Karabo Magagula (220042292)
  Date: 04 April 2023
 */
package za.ac.cput.dogparlor.domain;

import java.util.Objects;

public class Service {
    private int serviceId;
    private double price;
    private String serviceType;
    private String serviceDuration;
    private String serviceDescription;
    private String servicePackage;

    private Service() {}

    private Service(Builder builder) {
        this.serviceId = builder.serviceId;
        this.price = builder.price;
        this.serviceType = builder.serviceType;
        this.serviceDuration = builder.serviceDuration;
        this.serviceDescription = builder.serviceDescription;
        this.servicePackage = builder.servicePackage;
    }

    public int getServiceId() {
        return serviceId;
    }

    public double getPrice() {
        return price;
    }

    public String getServiceType() {
        return serviceType;
    }

    public String getServiceDuration() {
        return serviceDuration;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public String getServicePackage() {
        return servicePackage;
    }

    public static class Builder {
        private int serviceId;
        private double price;
        private String serviceType;
        private String serviceDuration;
        private String serviceDescription;
        private String servicePackage;

        public Builder setServiceId(int serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }

        public Builder setServiceDuration(String serviceDuration) {
            this.serviceDuration = serviceDuration;
            return this;
        }

        public Builder setServiceDescription(String serviceDescription) {
            this.serviceDescription = serviceDescription;
            return this;
        }

        public Builder setServicePackage(String servicePackage) {
            this.servicePackage = servicePackage;
            return this;
        }

        public Builder copy(Service service) {
            this.serviceId = service.serviceId;
            this.price = service.price;
            this.serviceType = service.serviceType;
            this.serviceDuration = service.serviceDuration;
            this.serviceDescription = service.serviceDescription;
            this.servicePackage = service.servicePackage;
            return this;
        }
        public Service build() {
            return new Service(this);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Builder builder)) return false;
            return serviceId == builder.serviceId && Double.compare(builder.price, price) == 0 && Objects.equals(serviceType, builder.serviceType) && Objects.equals(serviceDuration, builder.serviceDuration) && Objects.equals(serviceDescription, builder.serviceDescription) && Objects.equals(servicePackage, builder.servicePackage);
        }


    }
    @Override
    public int hashCode() {
        return Objects.hash(serviceId, price, serviceType, serviceDuration, serviceDescription, servicePackage);
    }

    @Override
    public String toString() {
        return "Builder{" +
                "serviceId=" + serviceId +
                ", price=" + price +
                ", serviceType='" + serviceType + '\'' +
                ", serviceDuration='" + serviceDuration + '\'' +
                ", serviceDescription='" + serviceDescription + '\'' +
                ", servicePackage='" + servicePackage + '\'' +
                '}';
    }
}
