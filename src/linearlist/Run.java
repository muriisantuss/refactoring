package linearlist;

public class Run {
  public static void main(String[] args) {
    addFirst();
    addLast();

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
