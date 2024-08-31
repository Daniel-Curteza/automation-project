package courses.oop3;

import courses.oop2.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int [] values = {1,5,7};
        //System.out.println(values[2]);

        Shape[] shapes = {
                new Square(),
                new Triangle(),
                new Circle()
        };

        Shape[] sh2 = new Shape[5];
        sh2[0] = new Circle(5);
        sh2[0].setColor("blue");

        Circle[] circ2 = {new Circle(1), new Circle(2)};
//        circ2[0].printCircle();

 //       for (Circle s : circ2){
   //         s.printShape();
     //   }

        List l = new ArrayList();
        l.add("Ana");
        l.add("are");
        l.add("mere");
        //System.out.println(l);

        ArrayList<String> myList2 = new ArrayList<>();
        myList2.add("java");

        ArrayList<String> myList = new ArrayList<>();
        myList.add("oldy");
        myList.add(1, "Dany");
        myList.addAll(myList2);

    //    Iterator it = myList.iterator();
     //   while (it.hasNext()){
        //    System.out.println(it.next());
    //    }

        HashSet<String> hashSet1 = new HashSet<>();
        hashSet1.add("oldy");
        hashSet1.add("oldy");
    //    System.out.println(hashSet1.size());

        hashSet1.addAll(myList);
        //Utils.printList(hashSet1);

        HashMap<Integer, String> myHashmap = new HashMap<>();
        myHashmap.put(1, "Oldy");
        myHashmap.put(2, "Java");
        myHashmap.put(3, "Intelli");
        String text = "Ana are mere si pere si caise si coacaze. Este sezonul, deci vor fi foarte gustoase!";
        Utils.printMap(Utils.countCharsInText(text));


        System.out.println(Browsers.CHROME);
    }
}
