/*
 * 
 * timeline: https://youtu.be/jUcAyZ5OUm0?t=381 
 * 
 * 
 */


package BroCode;

public class Xxx222 {
    public static void main(String[] args) {
        System.out.println("Xxx222.main()");

        Player player1 = new Player();
        Enemy enemy1 = new Enemy();
        Item item1 = new Item();
        Tree tree1 = new Tree();

        draw(player1);
        draw(enemy1);
        draw(item1);
        draw(tree1);
    }

    public static <TTT> void draw(TTT input) {
        // input.draw();
        // ^error, di ko alam paano i-repair
    }
    
}

class Player {
    public void draw() {
        System.out.println("Player draw()");
    }
}

class Enemy {
    public void draw() {
        System.out.println("Enemy draw()");
    }
}

class Item {
    public void draw() {
        System.out.println("Item draw()");
    }
}

class Tree {
    public void draw() {
        System.out.println("Tree draw()");
    }
}