package Prototype;

import java.util.List;

public class Main {


        public static void main(String[] args) throws CloneNotSupportedException {
            Mobile a = new Mobile();
            a.insertData();

            Mobile b = (Mobile) a.clone();
            List<String> list = b.getMobileList();

            list.add("Asus rog 2");

            System.out.println(a.getMobileList());
            System.out.println("added Asus rog 2");
            System.out.println(list);

            b.getMobileList().remove("OnePlus Nord");
            System.out.println("removed OnePlus Nord");
            System.out.println(list);

            System.out.println(a.getMobileList());
        }


}
