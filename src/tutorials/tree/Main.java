package tutorials.tree;

public class Main {

    public static void main(String[] args) {

        TreeNode drinks = new TreeNode("Drinks");

        //child of drinks
        TreeNode hot = new TreeNode("Hot");
        TreeNode cold = new TreeNode("Cold");

        //child of hot drinks
        TreeNode tea = new TreeNode("Tea");
        TreeNode coffee = new TreeNode("Coffee");


        //child of cold drinks
        TreeNode wine = new TreeNode("Wine");
        TreeNode beer = new TreeNode("Beer ");



        drinks.addChild(hot);
        drinks.addChild(cold);

        hot.addChild(tea);
        hot.addChild(coffee);

        cold.addChild(wine);
        cold.addChild(beer);


        System.out.println(drinks.print(0));

    }
}
