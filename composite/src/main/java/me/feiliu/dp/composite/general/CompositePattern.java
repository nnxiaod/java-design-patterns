package me.feiliu.dp.composite.general;

import java.util.ArrayList;
import java.util.List;

/**
 * http://www.cnblogs.com/zxj159/p/3484432.html
 */
public class CompositePattern {

    public static void main(String[] args) {
        //定义多个Composite对象
        Component root = new Composite();
        Component c1 = new Composite();
        Component c2 = new Composite();
        //定义多个叶子对象
        Component leaf1 = new Leaf();
        Component leaf2 = new Leaf();
        Component leaf3 = new Leaf();

        //组和成为树形的对象结构
        root.AddChild(c1);
        root.AddChild(c2);
        root.AddChild(leaf1);

        c1.AddChild(leaf2);
        c2.AddChild(leaf3);

        //操作Component对象
        Component o = root.GetChildren(1);
        System.out.println(o);
    }
}

// 抽象的组件对象，为组合中的对象声明接口，实现接口的缺省行为
abstract class Component {

    // 示意方法，子组件对象可能有的功能方法
    public abstract void SomeOperation();

    // 向组合对象中加入组件对象
    public void AddChild(Component component) {
    }

    // 从组合对象中移出某个组件对象
    public void RemoveChild(Component component) {

    }

    // 返回某个索引对应的组件对象
    public Component GetChildren(int index) {
        return null;
    }
}

/// 叶子对象，叶子对象不再包含其它子对象
class Leaf extends Component {

    /// <summary>
    /// 示意方法，叶子对象可能有自己的功能方法
    /// </summary>
    public void SomeOperation() {
        // do something
    }
}

// 组合对象，通常需要存储子对象，定义有子部件的部件行为，
// 并实现在Component里面定义的与子部件有关的操作
class Composite extends Component {

    /// 用来存储组合对象中包含的子组件对象
    private List<Component> childComponents;

    /// 示意方法，通常在里面需要实现递归的调用
    public void SomeOperation() {
        if (childComponents != null) {
            for (Component c : childComponents) {
                //递归的进行子组件相应方法的调用
                c.SomeOperation();
            }
        }
    }

    public void AddChild(Component component) {
        //延迟初始化
        if (childComponents == null) {
            childComponents = new ArrayList<Component>();
        }
        childComponents.add(component);
    }

    public void RemoveChild(Component component) {
        if (childComponents != null) {
            childComponents.remove(component);
        }
    }

    public Component GetChildren(int index) {
        if (childComponents != null) {
            if (index >= 0 && index < childComponents.size()) {
                return childComponents.get(index);
            }
        }
        return null;
    }
}
