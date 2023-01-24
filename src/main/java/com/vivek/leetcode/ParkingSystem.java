package com.vivek.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingSystem {
    public enum CarTypeParkingLot{
        Big(1, 0),
        Medium(2, 0),
        Small(3, 0);
        int carType, lotSize;

        private static Map<Integer, CarTypeParkingLot> map = new HashMap();

        static{
            map.put(1, Big);
            map.put(2, Medium);
            map.put(3, Small);
        }

        CarTypeParkingLot(int carType, int lotSize){
            this.carType = carType;
            this.lotSize = lotSize;
        }

        public CarTypeParkingLot setCarType(int carType) {
            this.carType = carType;
            return this;
        }

        public CarTypeParkingLot setLotSize(int lotSize) {
            this.lotSize = lotSize;
            return this;
        }
    }
    private CarTypeParkingLot bigLotSize;
    private CarTypeParkingLot mediumLotSize;
    private CarTypeParkingLot smallLotSize;

    private Map<Integer, List<Integer>> parkedCars;

    public ParkingSystem(int big, int medium, int small) {
        this.bigLotSize = CarTypeParkingLot.Big.setLotSize(big);
        this.mediumLotSize = CarTypeParkingLot.Medium.setLotSize(medium);
        this.smallLotSize = CarTypeParkingLot.Small.setLotSize(small);
        this.parkedCars = new HashMap<>();
        parkedCars.put(CarTypeParkingLot.Big.carType, new ArrayList<>());
        parkedCars.put(CarTypeParkingLot.Medium.carType, new ArrayList<>());
        parkedCars.put(CarTypeParkingLot.Small.carType, new ArrayList<>());
    }

    public boolean addCar(int carType) {
        if(parkedCars.get(carType) != null
                && parkedCars.get(carType).size() < CarTypeParkingLot.map.get(carType).lotSize) {
            return parkedCars.get(carType).add(1);
        }
        return false;
    }

    public static void main(String[] args) {
        ParkingSystem parkingSystem = new ParkingSystem(1, 1, 0);
        System.out.println("add big = " + parkingSystem.addCar(1));;
        System.out.println("add medium = " + parkingSystem.addCar(2));;
        System.out.println("add small = " + parkingSystem.addCar(3));;
    }
}
