package Prototype;
import java.util.ArrayList;
import java.util.List;

class Mobile implements Cloneable {
  private List<String> mobileList;

  public Mobile() {
    this.mobileList = new ArrayList<String>();
  }

  public Mobile(List<String> list) {
    this.mobileList = list;
  }

  public void insertData() {
    mobileList.add("Vivo T");
    mobileList.add("OnePlus Nord");
    mobileList.add("Redmi note 11 pro");
    mobileList.add("Iphone 13 pro max");
    mobileList.add("Poco f1");
  }

  public List<String> getMobileList() {
    return this.mobileList;
  }

  @Override
  public Object clone()  {
    List<String> tempList = new ArrayList<String>();

    for(String s : this.getMobileList()) {
      tempList.add(s);
    }

    return new Mobile(tempList);
  }
}

