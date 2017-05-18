package me.feiliu.dp.composite.menu2;

/**
 * 树叶构件角色(Leaf)
 */
public class ItemLeaf extends MenuComponent {

    private String name;
    private String url;

    public ItemLeaf(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public void displayOperation(String prefix) {
        System.out.println(prefix + "<a href=\"" + this.url + "\">" + this.name + "</a>");
    }

    public String getName() {
        return this.name;
    }
}
