package org.zqs.xml;


/**
 * @author Mr_class_zhan
 *
 */


public class Contact {
  @Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + ", age=" + age
				+ ", phone=" + phone + ", email=" + email + ", qq=" + qq + "]";
	}
private String id; 
  private String name; 
  private String age; 
  private String phone; 
  private String email; 
  private String qq;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getQq() {
	return qq;
}
public void setQq(String qq) {
	this.qq = qq;
} 
  
}
