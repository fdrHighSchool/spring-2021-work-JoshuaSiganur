import java.util.*;

class Main { //super_arrayDriver.java
  public static void main(String[] args) {
    inventory user1 = new inventory(9);
    user1.gainThing(64);

    System.out.println(user1);
    user1.gainThing(16);
    System.out.println(user1);
    user1.gainThing(4);
    user1.gainThing(12);
    user1.gainThing(19);
    System.out.println(user1);
    user1.discardThing(0);
    System.out.println(user1);
    user1.discardThing(2);
    System.out.println(user1);
  }
}
