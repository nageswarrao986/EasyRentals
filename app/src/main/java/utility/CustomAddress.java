package utility;

import android.location.Location;

/**
 * Created by Parag on 8/7/2017.
 */

public class CustomAddress {

    CustomAddress(Location l){
        geoLocation = l;
    }
    public String street;
    public String city;
    public String state;
    public int zipcode;
    public Location geoLocation;
}
