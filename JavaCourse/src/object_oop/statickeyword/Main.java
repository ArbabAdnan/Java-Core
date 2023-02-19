package object_oop.statickeyword;

public class Main {

	public static void main(String[] args) {
		// static = modifier , a single copy of a variable/method is created and shared
		//  					the class "owns" the static member

		Friend friend =new Friend("ernie");
		Friend friend1 =new Friend("petric");
		Friend friend3=new Friend("spong");
		
		Friend.displayFriends();
	}

}
