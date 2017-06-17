package rdnasim.com.beeradviser;

import java.util.ArrayList;
import java.util.List;

public class BeerExpart {
    List<String> getBrands(String color){
        List<String> brand = new ArrayList<String>();
        if (color.equals("amber")) {
            brand.add("jack Amber");
            brand.add("Red moose");
        }
        else {
            brand.add("jail pale ale");
            brand.add("Gout Stout");
        }
        return brand;
    }
}
