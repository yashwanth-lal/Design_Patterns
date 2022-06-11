package Proxy;
interface OperationTheatreEntry{
  public void entry(String person) throws Exception;
}

class OperationTheatreEntryImpl implements OperationTheatreEntry{

  @Override
  public void entry(String person) throws Exception {
    System.out.println("hello " + person+" you can go inside the operation theatre");
  }
  
}

class OperationTheatreEntryProxy implements OperationTheatreEntry{
  boolean ifStaff;
  OperationTheatreEntryImpl OTEntry;
  
  public OperationTheatreEntryProxy(String name, String ID) {
    if(name == "Staff" && ID == "staff@123") {
      ifStaff = true;
    }
    OTEntry = new OperationTheatreEntryImpl();
  }

  @Override
  public void entry(String person) throws Exception {
    if(ifStaff) {
      OTEntry.entry(person);
    } else {
      if(person.equals("visitor") || person.equals("watchman")) {
        throw new Exception("hello "+person+" others are not allowed inside the operation theatre");
      }
    }
  }
}

