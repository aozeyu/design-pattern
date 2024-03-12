package org.example.singleton;

/**
 * @author yaozeyu
 */
public class Main {
  public static void main(String[] args) {
    Hotel hotel = new Hotel();
    Customer customer = new Customer(hotel);
    customer.bookWakeService();
  }
}
