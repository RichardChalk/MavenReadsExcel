package com.example;

public class Customer {
  private int customerID;
  private String firstName;
  private String lastName;
  private String phoneNumber;

  // Konstruktor
  public Customer(int customerID, String firstName, String lastName,
      String phoneNumber) {
    this.customerID = customerID;
    this.firstName = firstName;
    this.lastName = lastName;
    this.phoneNumber = phoneNumber;
  }

  // Getters och Setters
  public int getCustomerID() {
    return customerID;
  }

  public void setCustomerID(int customerID) {
    this.customerID = customerID;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  // toString-metod för att skriva ut objektet lätt
  @Override
  public String toString() {
    return "Customer{" +
        "customerID=" + customerID +
        ", firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", phoneNumber='" + phoneNumber + '\'' +
        '}';
  }
}
