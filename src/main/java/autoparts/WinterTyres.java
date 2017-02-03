package autoparts;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by alex on 01.02.17.
 */

@ImportResource("classpath:car.properties.xml")
public class WinterTyres extends Tyres {
    private boolean isWinter = true;

    @Value("${car.tyreSize}")
    private int size;
    @Value("${car.tyreName}")
    private String name;

}
