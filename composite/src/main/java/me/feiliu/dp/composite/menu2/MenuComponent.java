package me.feiliu.dp.composite.menu2;

public abstract class MenuComponent {
    /**
     * 组合模式
     *
     * @author guisu
     * @version 1.0
     * 组合模式:树形菜单
     *
     * 将对象组合成树形结构以表示"部分-整体"的层次结构,使得客户对单个对象和复合对象的使用具有一致性
     */
    /**
     * 抽象构件角色（component）
     */
    public void add(MenuComponent menuComponent) {

    }

    public void remove(MenuComponent menuComponent) {

    }

    public abstract String getName();

    public String getUrl() {
        return null;
    }

    public abstract void displayOperation(String prefix);
}
