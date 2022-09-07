
/*
 * 
 * lesson 11
 * intro to collection classes
 *
 *  https://www.youtube.com/watch?v=IEqvmsqjpT0
 * 
 * arraylist
 */

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Thread;




public class Lesson11 {
    public static void main(String[] args) {
        
        xxx111();
        spacer();

        xxx222();
        spacer();

        xxx333();
        spacer();

        xxx444();
        spacer();

        xxx555();
        spacer();
    }

    static void xxx111() {
        // ArrayList arrL1;

        // arrL1 = new ArrayList();

        // ArrayList arrL2 = new ArrayList();


        ArrayList<String> arrL3 = new ArrayList<String>();
        arrL3.add("jennifer lawrence");
        arrL3.add("emma stone");
        arrL3.add("angelina jolie");
        arrL3.add("scarlet johansson");
        arrL3.add("anya taylor joy");

        // adding item to specific index:
        arrL3.add(2, "anne hathaway");

        // printing arraylist:
        for(int i = 0; i < arrL3.size(); i++) {
            System.out.println(i + " " + arrL3.get(i));
        }
        arrL3.add(0, "brad pitt");
        for(int i = 0; i < arrL3.size(); i++) {
            System.out.println(i + " " + arrL3.get(i));
        }
    }

    static void xxx222() {
        ArrayList<String> names = new ArrayList<String>();
        names.add("jennifer lawrence");
        names.add("emma stone");
        names.add("angelina jolie");
        names.add("scarlet johansson");
        names.add("anya taylor joy");

        // remove item
        names.remove(4);

        for(int i = 0; i < names.size(); i++) {
            System.out.println(i + " " + names.get(i));
        } 

    }

    static void xxx333() {
        ArrayList<String> names = new ArrayList<String>();
        names.add("jennifer lawrence");
        names.add("emma stone");
        names.add("angelina jolie");
        names.add("scarlet johansson");
        names.add("anya taylor joy");

        // remove range
        // names.removeRange(2,3);
        names.subList(2, 3).clear();

        for(int i = 0; i < names.size(); i++) {
            System.out.println(i + " " + names.get(i));
        } 

        System.out.println(names);

        for (String i : names) {
            System.out.println(i);
        }
    }

    static void xxx444() {
        ArrayList<String> names = new ArrayList<String>();
        names.add("jennifer lawrence");
        names.add("emma stone");
        names.add("angelina jolie");
        names.add("scarlet johansson");
        names.add("anya taylor joy");

        //using iterator
        Iterator individualItems = names.iterator();
        while(individualItems.hasNext()) {
            System.out.println(individualItems.next());
        }

    }


    static void xxx555() {

        ArrayList<String> names = new ArrayList<String>();
        names.add("jennifer lawrence");
        names.add("emma stone");
        names.add("angelina jolie");
        names.add("scarlet johansson");
        names.add("anya taylor joy");

        // creating arraylist without stating the type of values
        ArrayList nameCopy = new ArrayList();
        ArrayList nameBackup = new ArrayList();

        nameCopy.addAll(names);

        System.out.println(nameCopy);

        String paulYoung = "paul young";
        names.add(paulYoung);

        if(names.contains(paulYoung)) {
            System.out.println("paul is here");
        }
    }

    // pause: https://youtu.be/IEqvmsqjpT0?t=539

    /* ************************************************** */
    /* ************************************************** */
    static void spacer() {
        System.out.println(" ");
        System.out.println("###############################################");
        System.out.println("###############################################");
        System.out.println(" ");
    }


}

// https://www.pinkvilla.com/entertainment/hollywood/most-popular-actresses-1169988