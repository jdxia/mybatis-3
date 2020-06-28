package org.apache.ibatis.test.pojo;


import java.util.Objects;

public class User {
  private Integer id;
  private String username;
  private String address;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(id, user.id) &&
      Objects.equals(username, user.username) &&
      Objects.equals(address, user.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, username, address);
  }

  @Override
  public String toString() {
    return "User{" +
      "id=" + id +
      ", username='" + username + '\'' +
      ", address='" + address + '\'' +
      '}';
  }
}
