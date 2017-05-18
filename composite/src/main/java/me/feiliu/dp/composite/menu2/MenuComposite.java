package me.feiliu.dp.composite.menu2;

import java.util.ArrayList;
import java.util.List;

/**
 * 树枝构件角色（Composite）
 */
public class MenuComposite extends MenuComponent {

    private List<MenuComponent> items = new ArrayList<MenuComponent>();
    private String name;

    public MenuComposite(String name) {
        this.name = name;
    }

    public void add(MenuComponent component) {
        items.add(component);
    }

    public void remove(MenuComponent component) {
        items.remove(component);
    }

    public List<MenuComponent> getItems() {
        return this.items;
    }

    public void displayOperation(String prefix) {
        System.out.println(prefix + name);

        if (items.size() > 0) {
            prefix += "    ";
            for (MenuComponent component : items) {
                component.displayOperation(prefix);
            }
        }

    }

    public String getName() {
        return this.name;
    }
}
