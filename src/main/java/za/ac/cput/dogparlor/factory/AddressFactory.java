/* AddressFactory.java
  Factory for the Address entity
  Author: Byron Young (218155077)
  Date:05 April 2023
 */
package za.ac.cput.dogparlor.factory;
import za.ac.cput.dogparlor.domain.Address;
import za.ac.cput.dogparlor.util.Helper;

public class AddressFactory {
    public static Address createAddress(int addressID, String streetAddress, String city, String state, String zipCode , String country){
        if (addressID == 0 )
            return null;

        if (Helper.isNullOrEmpty(streetAddress) || Helper.isNullOrEmpty(city) || Helper.isNullOrEmpty(state) || Helper.isNullOrEmpty(zipCode)
                || Helper.isNullOrEmpty(country))
            return null;

        if ( !Helper.isValidString(city) || !Helper.isValidString(state) || !Helper.isValidString(country))
            return null;


            return new Address.Builder().setAddressID(addressID)
                .setStreetAddress(streetAddress)
                .setCity(city)
                .setState(state)
                .setZipCode(zipCode)
                .setCountry(country)
                .build();

    }

}
