package week4_data_structures;

import java.util.HashMap;

/**
 * Hello HashMap
 */
public class HashMapSnow {

    public static void main(String[] args) {

        HashMap snowfall = new HashMap();

        snowfall.put("January", 3);
        snowfall.put("February", 10);

        Object janSnowfall = snowfall.get("January");

        System.out.println("In January, " + janSnowfall + " inches of snow fell");

        for (Object ob : snowfall.keySet()) {
            System.out.println("Month: " + ob);    // ob is a key
            System.out.println("Snowfall inches: " + snowfall.get(ob));  // get(ob) is the value for that key
        }

    }

}
