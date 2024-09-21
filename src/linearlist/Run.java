package linearlist;

public class Run {
  public static void main(String[] args) {
    add();

  }

  public static void add() {
    linkedList<Integer> list = new linkedList<>();

    System.out.println();
    System.out.println("First element: " + list.add(1));
    System.out.println("Second element: " + list.add(2));
    System.out.println("Third element: " + list.add(3));
    System.out.println();
    
    System.out.print(list.toString());

  }
}
