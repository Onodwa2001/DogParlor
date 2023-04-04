package za.ac.cput.dogparlor.domain;

import java.util.Objects;

public class CustomerService {
    private int customerId;
    private int serviceId;

    public CustomerService() {}

    private CustomerService(Builder builder) {
        this.customerId = builder.customerId;
        this.serviceId = builder.serviceId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getServiceId() {
        return serviceId;
    }

    public static class Builder {
        private int customerId;
        private int serviceId;

        public Builder setCustomerId(int customerId) {
            this.customerId = customerId;
            return this;
        }

        public Builder setServiceId(int serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        public Builder copy(CustomerService customerService) {
            this.customerId = customerService.customerId;
            this.serviceId = customerService.serviceId;
            return this;
        }

        public CustomerService build() {
            return new CustomerService(this);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Builder builder)) return false;
            return customerId == builder.customerId && serviceId == builder.serviceId;
        }

        @Override
        public int hashCode() {
            return Objects.hash(customerId, serviceId);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "customerId=" + customerId +
                    ", serviceId=" + serviceId +
                    '}';
        }
    }

}
