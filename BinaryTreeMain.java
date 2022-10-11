package binsrytreemain;

import java.util.Random;


public class BinsryTreeMain {

    public static void main(String[] args) {
        Random rand = new Random();
        TreeRoot tree = new TreeRoot();
        /**
         * ADD ROOT *
         */
        tree.add(10);

        /**
         * ADD NODES*
         */
        tree.add(5);
        tree.add(15);
        tree.add(12);
        tree.add(16);
        tree.add(1);
        tree.add(2);

        /**
         * POST ORDER *
         */
        System.out.print("Post Order:  ");
        tree.postOrder(tree.root);
        System.out.println("");
        /**
         * BREAD TRAVEL*
         */
        System.out.print("Bread-In-Search:  ");
        tree.breadTravel();
        System.out.println();
        /*
        DELETE
         */
    //  tree.delete();
    }

}
