package com.trade.ThreadSafe;

public class Pojo {
    public static String STUDENT;
    private Integer id;
    private String name;
    private Integer age;
    private UnsageSequence unsafeSequence;

    public Pojo(UnsageSequence unsafeSequence) {
        this.unsafeSequence = unsafeSequence;
    }

    public Integer getId() {
        if(id == 2){
            return id++;
        }
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age++;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public int unsafeMethods(){
        return unsafeSequence.getNext();
    }
}
