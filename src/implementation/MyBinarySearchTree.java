package implementation;

import myinterface.BinarySearchTreeADT;


public class MyBinarySearchTree<E extends Comparable<E>> implements BinarySearchTreeADT<E> {
    //complete this class
    private implementation.Node<E> root;
    public Boolean isempty(){
        return root==null;
    }

    @Override
    public void insert(E data) {
        Node<E> n=new Node<>(data);
        if(isempty()){
            root=n;
        }
        else{
            Node<E> temp=root;
            Node<E> parent=null;
            while(temp!=null){
                parent=temp;
                if(data.compareTo(temp.getData())<=0){
                    temp=temp.getLeft();
                }
                else{
                    temp=temp.getRight();
                }
            }

            if(data.compareTo(parent.getData())<=0){
                parent.setLeft(n);
            }
            else{
                parent.setRight(n);
            }

        }
    }

    @Override
    public boolean search(E searchElement) {
        boolean response=false;
        Node<E> temp = root;
        while(temp!=null){
            if(searchElement.compareTo(temp.getData())==0){
                response=true;
                break;
            }
            else if(searchElement.compareTo(temp.getData())<0){
                temp=temp.getLeft();
            }
            else{
                temp=temp.getRight();
            }
        }
        return response;
    }

    @Override
    public void inOrder(Node<E> node) {
        if(node!=null){
            inOrder(node.getLeft());
            System.out.println(node.getData()+",");
            inOrder(node.getRight());
        }
    }

    @Override
    public void preOrder(Node<E> node) {
        if(node!=null){
            System.out.print(node.getData()+",");
            preOrder(node.getLeft());
            preOrder(node.getRight());
        }
    }

    @Override
    public void postOrder(Node<E> node) {
        if(node!=null){
            postOrder(node.getLeft());
            postOrder(node.getRight());
        System.out.println(node.getData()+",");
        }

    }

    @Override
    public void reverseInOrder(Node<E> node) {
        if(node!=null){
            reverseInOrder(node.getRight());
            System.out.println(node.getData()+",");

            reverseInOrder(node.getLeft());
        }
    }

    @Override
    public void delete(E data) {

    }

    @Override
    public int height(Node<E> node) {
        return 0;
    }
}
