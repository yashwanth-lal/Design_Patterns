package Proxy;
public class Driver {

    public static void main(String[] args) throws Exception {
        System.out.println();
        OperationTheatreEntry visitor = new OperationTheatreEntryProxy("prakash", "null");
        visitor.entry("visitor");
//
//        OperationTheatreEntry watchman = new OperationTheatreEntryProxy("raju", "null");
//        watchman.entry("watchman");


//        OperationTheatreEntry staff = new OperationTheatreEntryProxy("Staff", "staff@123");
//        staff.entry("doctor");

    }

}
