package T09InterfacesAndAbstraction.lab.L01CarShop;

import java.io.Serializable;

public interface Car extends Serializable {

    int TIRE = 4;

    String getModel();

    String getColor();

    Integer getHorsePower();

    String countryProduced();
}
