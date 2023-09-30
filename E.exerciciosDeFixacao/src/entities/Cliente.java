package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
	
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private String name;
	private String email;
	private Date birthDate;
	
	public Cliente(String name, String email, Date birthDate) {
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBirthdate() {
		return birthDate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthDate = birthdate;
	}
	

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name+"\n");
		sb.append(sdf.format(birthDate)+"\n");
		sb.append(email);
		return sb.toString(); //name + "(" + sdf.format(birthDate) + ")" + email;
	}

}
