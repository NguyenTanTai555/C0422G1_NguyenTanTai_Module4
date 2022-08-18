package com.codegym.model;

public class Medical {
    private int medicalId;
    private String name;
    private String yearOfBirth;
    private String gender;
    private String nationality;
    private String id;
    private String information;
    private String vehicleId;
    private String seats;
    private int startDay;
    private int startMonth;
    private int startYear;
    private int endDay;
    private int endMonth;
    private int endYear;
    private String destinationArrived;

    public Medical() {
    }

    public Medical(int medicalId, String name, String yearOfBirth, String gender,
                   String nationality, String id, String information, String vehicleId,
                   String seats, int startDay, int startMonth, int startYear,
                   int endDay, int endMonth, int endYear, String destinationArrived) {
        this.medicalId = medicalId;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
        this.nationality = nationality;
        this.id = id;
        this.information = information;
        this.vehicleId = vehicleId;
        this.seats = seats;
        this.startDay = startDay;
        this.startMonth = startMonth;
        this.startYear = startYear;
        this.endDay = endDay;
        this.endMonth = endMonth;
        this.endYear = endYear;
        this.destinationArrived = destinationArrived;
    }

    public Medical(String name, String yearOfBirth, String gender,
                   String nationality, String id, String information,
                   String vehicleId, String seats, int startDay, int startMonth,
                   int startYear, int endDay, int endMonth, int endYear, String destinationArrived) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
        this.nationality = nationality;
        this.id = id;
        this.information = information;
        this.vehicleId = vehicleId;
        this.seats = seats;
        this.startDay = startDay;
        this.startMonth = startMonth;
        this.startYear = startYear;
        this.endDay = endDay;
        this.endMonth = endMonth;
        this.endYear = endYear;
        this.destinationArrived = destinationArrived;
    }

    public int getMedicalId() {
        return medicalId;
    }

    public void setMedicalId(int medicalId) {
        this.medicalId = medicalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public int getStartDay() {
        return startDay;
    }

    public void setStartDay(int startDay) {
        this.startDay = startDay;
    }

    public int getStartMonth() {
        return startMonth;
    }

    public void setStartMonth(int startMonth) {
        this.startMonth = startMonth;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public int getEndDay() {
        return endDay;
    }

    public void setEndDay(int endDay) {
        this.endDay = endDay;
    }

    public int getEndMonth() {
        return endMonth;
    }

    public void setEndMonth(int endMonth) {
        this.endMonth = endMonth;
    }

    public int getEndYear() {
        return endYear;
    }

    public void setEndYear(int endYear) {
        this.endYear = endYear;
    }

    public String getDestinationArrived() {
        return destinationArrived;
    }

    public void setDestinationArrived(String destinationArrived) {
        this.destinationArrived = destinationArrived;
    }
}
