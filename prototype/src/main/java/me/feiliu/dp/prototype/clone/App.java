package me.feiliu.dp.prototype.clone;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        Project p1 = new Project("p1", "p1_aim");
        Project p2 = new Project("p2", "p2_aim");

//        System.out.println(p1 == p2);
//        System.out.println(p1.getName() == p2.getName());

        List<Project> pl1 = new ArrayList<>();
        pl1.add(p1);

        List<Project> pl2 = new ArrayList<>();
        pl2.add(p2);

        Resume r1 = new Resume("r1", pl1);
        Resume r2 = new Resume(r1);

//        System.out.println(r1 == r2);
//        System.out.println(r1.getProjectList() == r2.getProjectList());
//        System.out.println(r1.getName() == r2.getName());
//        System.out.println(r1.getProjectList());
//        System.out.println(r2.getProjectList());
//        r2.setProjectList(pl2);
//        System.out.println(r1.getProjectList());
//        System.out.println(r2.getProjectList());

        Resume r3 = r1.clone();
        System.out.println(r1 == r3);
        System.out.println(r1.getProjectList() == r3.getProjectList());
        System.out.println(r1.getName() == r3.getName());
        System.out.println(r1.getProjectList());
        System.out.println(r3.getProjectList());
        System.out.println(r1.getProjectList().get(0).getName());
        r3.getProjectList().get(0).setName("p3");
        System.out.println(r1.getProjectList());
        System.out.println(r3.getProjectList());
        System.out.println(r1.getProjectList().get(0).getName());
    }
}
