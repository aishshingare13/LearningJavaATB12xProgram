package ex_Lab27_Collection_Framework.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab251_Set {
    public static void main(String[] args) {
        Set hs = new HashSet();
        Set lhs = new LinkedHashSet();
        Set ts = new TreeSet();

        hs.add("Aishwarya");
        hs.add("Aishwarya");
        hs.add("aishwarya");
        hs.add("dishwarya");
        System.out.println(hs);

    }
}
