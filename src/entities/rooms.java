package entities;

public class rooms {

	private String name;
	private int room_number;
	private String email;

public rooms(String name, int room_number, String email) {
	this.name = name;
	this.room_number = room_number;
	this.email = email;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getRoom_number() {
	return room_number;
}

public void setRoom_number(int room_number) {
	this.room_number = room_number;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}
public String toString() {
return name + ", " + email;
}
}