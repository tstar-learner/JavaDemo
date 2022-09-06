package com.Test;

public class Main{
    public static void main(String[] args) {
        Person person=new Person();
        person.send(new Email());
        person.send(new Weixin());
    }
}

interface Interface1 {
    String send();
}

class Email implements Interface1{

    @Override
    public String send() {
        return "邮件信息";
    }
}

class Weixin implements Interface1{

    @Override
    public String send() {
        return "微信信息";
    }
}

class Person{
    public void send(Interface1 interface1){
        System.out.println(interface1.send());
    }
}
