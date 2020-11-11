package com.callicoder.goparking.domain;

import com.callicoder.goparking.exceptions.ParkingLotFullException;
import com.callicoder.goparking.exceptions.SlotNotFoundException;

import java.util.*;
import java.util.stream.Collectors;

public class ParkingLot {
    private final int numSlots;
    private final int numFloors;
    private SortedSet<ParkingSlot> availableSlots = new TreeSet<>();
    private Set<ParkingSlot> occupiedSlots = new HashSet<>();

    public ParkingLot(int numSlots) {
        if(numSlots <= 0) {
            throw new IllegalArgumentException("Number of slots in the Parking Lot must be greater than zero.");
        }

        // Assuming Single floor since only numSlots are specified in the input.
        this.numSlots = numSlots;
        this.numFloors = 1;

        for(int i = 0; i < numSlots; i++) {
            ParkingSlot parkingSlot = new ParkingSlot(i+1, 1);
            this.availableSlots.add(parkingSlot);
        }
    }



    public synchronized Ticket reserveSlot(Car car) {
        if(car == null) {
            throw new IllegalArgumentException("Car must not be null");
        }

        if(this.isFull()) {
            throw new ParkingLotFullException();
        }

        ParkingSlot nearestSlot = this.availableSlots.first();

        nearestSlot.reserve(car);
        this.availableSlots.remove(nearestSlot);
        this.occupiedSlots.add(nearestSlot);

        return new Ticket(nearestSlot.getSlotNumber(), car.getRegistrationNumber(), car.getColor());
    }

    public ParkingSlot leaveSlot(int slotNumber) {
        ParkingSlot slot = this.occupiedSlots.stream()
                .filter(parkingSlot -> parkingSlot.getSlotNumber() == slotNumber)
                .findFirst()
                .orElseThrow(() -> new SlotNotFoundException(slotNumber));

        slot.clear();
        occupiedSlots.remove(slot);
        availableSlots.add(slot);

        return slot;
    }

    public boolean isFull() {
        return this.availableSlots.isEmpty();
    }

    public List<String> getRegistrationNumbersByColor(String color) {
        if(color == null) {
            throw new IllegalArgumentException("Color must not be null");
        }

        return this.occupiedSlots.stream()
                .filter(parkingSlot -> parkingSlot.getCar().getColor().equalsIgnoreCase(color))
                .map(parkingSlot -> parkingSlot.getCar().getRegistrationNumber())
                .collect(Collectors.toList());
    }

    public List<Integer> getSlotNumbersByColor(String color) {
        if(color == null) {
            throw new IllegalArgumentException("Color must not be null");
        }

        return this.occupiedSlots.stream()
                .filter(parkingSlot -> parkingSlot.getCar().getColor().equalsIgnoreCase(color))
                .map(ParkingSlot::getSlotNumber)
                .collect(Collectors.toList());
    }

    public Optional<Integer> getSlotNumberByRegistrationNumber(String registrationNumber) {
        if(registrationNumber == null) {
            throw new IllegalArgumentException("Registration number must not be null");
        }

        return this.occupiedSlots.stream()
                .filter(parkingSlot -> parkingSlot.getCar().getRegistrationNumber()
                        .equalsIgnoreCase(registrationNumber))
                .map(ParkingSlot::getSlotNumber)
                .findFirst();
    }


    public int getNumSlots() {
        return numSlots;
    }

    public int getNumFloors() {
        return numFloors;
    }

    public SortedSet<ParkingSlot> getAvailableSlots() {
        return availableSlots;
    }

    public Set<ParkingSlot> getOccupiedSlots() {
        return occupiedSlots;
    }
}
