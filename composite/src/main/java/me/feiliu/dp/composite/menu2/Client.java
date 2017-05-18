package me.feiliu.dp.composite.menu2;

/**
 * http://blog.csdn.net/hguisu/article/details/7530783#
 */
public class Client {

    public static void main(String[] args) {
        MenuComposite subMenu1 = new MenuComposite("submenu1");
        MenuComposite subMenu2 = new MenuComposite("submenu2");
        MenuComposite subMenu3 = new MenuComposite("submenu3");

        MenuComposite subMenu4 = new MenuComposite("submenu4");
        MenuComposite subMenu5 = new MenuComposite("submenu5");
        /*
        $item1 = new ItemLeaf("sohu","www.163.com");
        $item2 = new ItemLeaf("sina","www.sina.com");

        $subMenu4 = new MenuComposite("submenu4");
        $subMenu1->add($subMenu4);

        $subMenu4->add($item1);
        $subMenu4->add($item2);
        */
        ItemLeaf item3 = new ItemLeaf("baidu", "www.baidu.com");
        ItemLeaf item4 = new ItemLeaf("google", "www.google.com");
        subMenu2.add(item3);
        subMenu2.add(item4);

        MenuComposite allMenu = new MenuComposite("AllMenu");
        allMenu.add(subMenu1);
        allMenu.add(subMenu2);
        allMenu.add(subMenu3);
        subMenu3.add(subMenu4);
        subMenu4.add(subMenu5);
        allMenu.displayOperation("");
    }
}
