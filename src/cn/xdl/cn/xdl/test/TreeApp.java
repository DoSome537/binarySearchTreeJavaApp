package cn.xdl.cn.xdl.test;

import cn.xdl.bean.Node;
import cn.xdl.bean.Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TreeApp {

    public static void main(String[] args) throws IOException {
        int value;
        Tree theTree = new Tree();

        theTree.insert(50,1.5);
        theTree.insert(25,1.2);
        theTree.insert(55,1.56);
        theTree.insert(27,21.15);
        theTree.insert(23,41.5);
        theTree.insert(05,31.5);
        theTree.insert(56,12.5);
        theTree.insert(37,11.5);
        theTree.insert(57,11.5);
        theTree.insert(62,13.5);
        theTree.insert(45,1.57);
        theTree.insert(25,1.25);
        theTree.insert(36,1.57);
        while(true)
        {
            System.out.println("Enter first letter of show");
            System.out.println("insert, find, delete, or traverse");
            int choice = getChar();
            switch (choice)
            {
                case 's':
                    theTree.displayTree();
                    break;
                case 'i':
                    System.out.println("Enter value to insert:");
                    value = getInt();
                    theTree.insert(value,value+0.0);
                    break;
                case 'f':
                    System.out.println("Enter value to find");
                    value = getInt();
                    Node found = theTree.find(value);
                    if (found != null)
                    {
                        System.out.print("Found:");
                        found.displayNode();
                        System.out.println("\n");
                    }
                    else
                    {
                        System.out.println("Could not find");
                        System.out.println(value+"\n");
                    }

                    break;
                case 'd':
                    System.out.println("Enter value to  delete");
                    value = getInt();
                    boolean didDelete = theTree.delete(value);
                    if (didDelete)
                        System.out.println("Deleted:"+value+'\n');
                    else
                    {
                        System.out.println("Could not delete ");
                        System.out.println(value+"\n");
                    }
                    break;
                case 't':
                    System.out.println("Enter type 1,2 or 3");
                    value = getInt();
                    theTree.traverse(value);
                    break;
                default:
                    System.out.println("Invalid entry\n");

            }
        }
    }

    public static  String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    public static char getChar() throws IOException {
        String s = getString();
        return  s.charAt(0);
    }

    public static  int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }
}
