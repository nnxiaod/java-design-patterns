package me.feiliu.dp.composite.menu;

import java.util.ArrayList;
import java.util.List;

/**
 * http://www.cnblogs.com/zxj159/p/3484432.html
 */
public class Menu {

    public static void main(String[] args) {
        //定义所有的组合对象
        Component root = new Composite("服装");
        Component c1 = new Composite("男装");
        Component c2 = new Composite("女装");
        //定义所有的叶子对象
        Component leaf1 = new Leaf("衬衣");
        Component leaf2 = new Leaf("夹克");
        Component leaf3 = new Leaf("裙子");
        Component leaf4 = new Leaf("套装");
        //按照树的结构来组合组合对象和叶子对象
        root.AddChild(c1);
        root.AddChild(c2);

        c1.AddChild(leaf1);
        c1.AddChild(leaf2);

        c2.AddChild(leaf3);
        c2.AddChild(leaf4);

        //调用根对象的输出功能来输出整棵树
        root.PrintStruct("");

    }
}

abstract class Component {

    public abstract void PrintStruct(String preStr);

    public void AddChild(Component component) {
    }

    public void RemoveChild(Component component) {
    }
}

class Leaf extends Component {

    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    public void PrintStruct(String preStr) {
        System.out.println(preStr + "-" + name);
    }
}

class Composite extends Component {

    private String name = null;

    private List<Component> childComponents = null;

    public Composite(String name) {
        this.name = name;
    }

    public void PrintStruct(String preStr) {
        System.out.println(preStr + "+" + name);
        if (childComponents != null) {
            preStr += "  ";
            for (Component c : childComponents) {
                c.PrintStruct(preStr);
            }
        }
    }

    public void AddChild(Component component) {
        if (childComponents == null) {
            childComponents = new ArrayList<Component>();
        }
        childComponents.add(component);
    }

    public void RemoveChild(Component component) {
        if (childComponents == null) {
            childComponents = new ArrayList<Component>();
        }
        childComponents.remove(component);
    }
}
