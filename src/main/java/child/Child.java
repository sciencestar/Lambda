package child;

import bean.Person;
import father.Father;

public class Child extends Father implements Person {

    public void func1(int i) {
        System.out.println("BBBBBBBBBB");
    }

    @Override
    public void func2() {
        System.out.println("重写父类方法.............");
    }

    @Override
    public void say() {
        System.out.println("子类重写的方法.........");
    }

    public void say(String name){
        System.out.println(name+" is sayIng........");
    }

    public void say(String name,Integer age){
        System.out.println(name+" is "+age+" 岁!");
    }

    @Override
    public void sayVoice() {
        System.out.println("儿子开始说话了...........");
    }
}
