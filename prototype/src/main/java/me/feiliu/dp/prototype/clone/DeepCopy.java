package me.feiliu.dp.prototype.clone;

class Professor implements Cloneable {

    String name;

    int age;

    Professor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Object clone() {
        Object o = null;
        try {
            o = super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.toString());
        }
        return o;
    }
}

class Student implements Cloneable {

    String name;

    int age;

    Professor p;

    Student(String name, int age, Professor p) {
        this.name = name;
        this.age = age;
        this.p = p;
    }

    public Object clone() {
        Student o = null;
        try {
            o = (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.toString());
        }
        o.p = (Professor) p.clone();
        return o;
    }
}

public class DeepCopy {

    public static void main(String args[]) {
        long t1 = System.currentTimeMillis();
        Professor p = new Professor("wangwu", 50);
        Student s1 = new Student("zhangsan", 18, p);
        Student s2 = (Student) s1.clone();
        s2.p.name = "lisi";
        s2.p.age = 30;
        System.out.println("name=" + s1.p.name + "," + "age=" + s1.p.age);// 学生1的教授不改变。
        System.out.println(s1.name == s2.name);
        System.out.println(s2.name);
        System.out.println(s2.age);
        s2.name = "hahaha";
        s2.age = 20;
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s1.name);
        System.out.println(s1.age);
    }
}
