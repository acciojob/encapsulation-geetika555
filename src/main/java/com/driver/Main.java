package com.driver;

public class Main {
  public static void main(String[] args) {
    RWOnly obj = new RWOnly();
    obj.setA(5);
    System.out.println(obj.getA());
  }
}