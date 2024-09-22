package linearlist;

public class Run {
  public static void main(String[] args) {
    // addFirst();
    // addLast();
    testGeneral();

  }

  public static void testGeneral() {
    linkedList<Integer> list = new linkedList<>();
    list.addFirst(2);
    list.addFirst(1);

    list.addLast(4);
    list.addLast(5);
    list.add(2, 3);
    System.out.println("Element: " + list.searchByPosition(2));

    System.out.println(list);

  }

  public static void addLast() {
    linkedList<Integer> list = new linkedList<>();

    System.out.println();
    list.addLast(2);
    System.out.print(list.toString());
    list.addLast(3);

    System.out.print(list.toString());

  }

  public static void addFirst() {
    linkedList<Integer> list = new linkedList<>();

    System.out.println();

    list.addFirst(1);

    System.out.print(list.toString());
  }

}
