package com.example.seven;

public class RvData {
    private String name;
    private String name1;
    private String name2;
   public RvData(String name,String name1,String name2) {
       this.name=name;
       this.name1=name1;
       this.name2=name2;
   }
   public void  setName(String name) {
       this.name1=name;
   }

    public String getName() {
        return name;
    }

public void setName1(String name1) {
    this.name1=name1;
}
public  void setName2(String name2) {
       this.name2=name2;
}

    public String getName1() {
        return name1;
    }

    public String getName2() {
        return name2;
    }
}
