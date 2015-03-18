/*
 * #%L
 * Gson Context Example
 * %%
 * Copyright (C) 2012 - 2015 Java Creed
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package com.javacreed.examples.gson.part1;

public class Address {

  private String room;
  private String unit;
  private String street;
  private String town;
  private String country;
  private String postCode;

  public String getCountry() {
    return country;
  }

  public String getPostCode() {
    return postCode;
  }

  public String getRoom() {
    return room;
  }

  public String getStreet() {
    return street;
  }

  public String getTown() {
    return town;
  }

  public String getUnit() {
    return unit;
  }

  public void setCountry(final String country) {
    this.country = country;
  }

  public void setPostCode(final String postCode) {
    this.postCode = postCode;
  }

  public void setRoom(final String room) {
    this.room = room;
  }

  public void setStreet(final String street) {
    this.street = street;
  }

  public void setTown(final String town) {
    this.town = town;
  }

  public void setUnit(final String unit) {
    this.unit = unit;
  }

  @Override
  public String toString() {
    return "Address [room=" + room + ", unit=" + unit + ", street=" + street + ", town=" + town + ", country="
        + country + ", postCode=" + postCode + "]";
  }

}
