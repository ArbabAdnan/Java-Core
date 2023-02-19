package object_oop.statickeyword;

public class Friend {

	String name;
	static int numberOfFriend;
	
	Friend(String name){
		this.name=name;
		numberOfFriend++;
	}
	static void displayFriends() {
		System.out.println("You have "+numberOfFriend+" friends");
	}
}
