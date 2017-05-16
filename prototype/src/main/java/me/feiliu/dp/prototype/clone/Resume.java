package me.feiliu.dp.prototype.clone;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Resume implements Cloneable {
    private String name;
    private List<Project> projectList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Project> getProjectList() {
        return projectList;
    }

    public void setProjectList(List<Project> projectList) {
        this.projectList = projectList;
    }

    public Resume() {

    }

    public Resume(String name, List<Project> projectList) {
        this.name = name;
        this.projectList = projectList;
    }

//    public Resume(Resume resume) {
//        this.name = resume.getName();
//        this.projectList = resume.getProjectList();
//    }

    public Resume(Resume resume) {
        this(resume.getName(), resume.getProjectList());
    }

    @Override
    protected Resume clone() {
        Resume resume = new Resume();
        resume.setName(new String(this.getName()));
        List<Project> pl = new ArrayList<>();
        pl.addAll(this.getProjectList());
        resume.setProjectList(pl);
        return resume;
    }
}
