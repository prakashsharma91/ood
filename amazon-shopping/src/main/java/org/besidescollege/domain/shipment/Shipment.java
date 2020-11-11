package org.besidescollege.domain.shipment;

import java.util.List;

public class Shipment {
    String shipmentNumber;
    String creationDate;
    String expectedDeliveryDate;
    List<ShipmentLog> shipmentLog;
    private String shipmentMethod;

    public void addShipmentLog(ShipmentLog log) {
    };
}
