package me.feiliu.dp.prototype.clone;

public class Project {
    private String name;
    private String aim;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAim() {
        return aim;
    }

    public void setAim(String aim) {
        this.aim = aim;
    }

    public Project() {

    }

    public Project(String name, String aim) {
        this.name = name;
        this.aim = aim;
    }

    public Project(Project p) {
        this.name = p.getName();
        this.aim = p.getAim();
    }
}
