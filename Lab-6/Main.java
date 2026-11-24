import java.util.HashMap;

class Main {
  public static void main(String[] args) {
    // Use the instructions in Blackboard or instructions.md to complete Lab 6
    
    MyMap<String, Integer> creditHours = new MyHashMap<>();
    creditHours.put("IT-1025", 3);
    creditHours.put("IT-1050", 3);
    creditHours.put("IT-1150", 3);
    creditHours.put("IT-2310", 3);
    creditHours.put("IT-2320", 4);
    creditHours.put("IT-2351", 4);
    creditHours.put("IT-2650", 4);
    creditHours.put("IT-2660", 4);
    creditHours.put("IT-2030", 4);

    System.out.println("Is there IT-1025: " + creditHours.containsKey("IT-1025"));
    System.out.println("Is there IT-2110: " + creditHours.containsKey("IT-2110"));

    System.out.println(creditHours.entrySet());

    creditHours.remove("IT-2030");
    creditHours.remove("IT-1150");
    
    if(!creditHours.containsKey("IT-2030")) {
      System.out.println("IT-2030 was successfully removed from hashmap");
    }
    else { System.out.println("IT-2030 was not removed"); }
    
    if(!creditHours.containsKey("IT-1150")) {
      System.out.println("IT-1150 was successfully removed from hashmap");
    }
    else { System.out.println("IT-1150 was not removed"); }

    System.out.println(creditHours);

    for (String key : creditHours.keySet()) {
      Integer value = creditHours.get(key);
      System.out.print(value + " ");
    }
    System.out.println();
  }
}