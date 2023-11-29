package Arraylist;
import java.util.*;
//. Write a Java program to shuffle elements in an array list
public class Shuffle_ArrayList{
        public static void main(String[] args)
        {
            List<String> ArrayList_shuf = new ArrayList<String>();
            ArrayList_shuf.add("Black");
            ArrayList_shuf.add("Blue");
            ArrayList_shuf.add("Green");
            ArrayList_shuf.add("Orange");
            ArrayList_shuf.add("Pink");
            ArrayList_shuf.add("Purple");
            ArrayList_shuf.add("White");
            ArrayList_shuf.add("Yellow");

            System.out.println("Before Shuffling :" + ArrayList_shuf);
            Collections.shuffle(ArrayList_shuf);
            System.out.println("After Shuffling :" + ArrayList_shuf);
        }
    }

