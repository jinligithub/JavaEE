package com.spring;

public class UserInfo {
    private String name;
    private String password;
    private String address;

    public String getName() {
        return name;
    }

    /**
     * DI
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    //consturct

    public UserInfo(String name, String password, String address) {
        this.name = name;
        this.password = password;
        this.address = address;
    }


//    public UserInfo(){
//
//    }

    public String  sayHello(){
        return "hello"+this.name+this.password+this.address;
    }
}
