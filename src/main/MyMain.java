package main;

import implementation.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree<Integer> tree=new MyBinarySearchTree<>();
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        Boolean result=tree.search(30);
        System.out.println(result);
    }
}
