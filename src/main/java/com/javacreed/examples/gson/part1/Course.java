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

import java.util.List;

public class Course {

  private Subject subject;
  private Address address;
  private Tutor tutor;
  private List<Student> sudents;

  public Address getAddress() {
    return address;
  }

  public Subject getSubject() {
    return subject;
  }

  public List<Student> getSudents() {
    return sudents;
  }

  public Tutor getTutor() {
    return tutor;
  }

  public void setAddress(final Address address) {
    this.address = address;
  }

  public void setSubject(final Subject subject) {
    this.subject = subject;
  }

  public void setSudents(final List<Student> sudents) {
    this.sudents = sudents;
  }

  public void setTutor(final Tutor tutor) {
    this.tutor = tutor;
  }

  @Override
  public String toString() {
    return "Course [subject=" + subject + ", address=" + address + ", tutor=" + tutor + ", sudents=" + sudents + "]";
  }

}
