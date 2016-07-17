import java.math.BigInteger;

/**
 * Created by madroid on 17-07-2016.
 */
public class BinaryTree {
    Node root;
    public void addNode(int key,String name){
        Node newNode= new Node(key,name);
        if(root == null) {
            root = newNode;
        }else{
            Node focusNode=root;
            Node parent;

            while(true){
                parent = focusNode;

                if(key < focusNode.key){
                    focusNode=focusNode.left;
                }
                if (focusNode == null){
                    parent.left=newNode;
                    return;
                }else {
                        focusNode=focusNode.right;
                        if(focusNode == null){
                            parent.right=newNode;
                            return;
                        }
                }
            }
        }
    }
    public void inOrder(Node focusNode){
        if(focusNode !=null){
            inOrder(focusNode.left);
            System.out.println(focusNode.key);
            inOrder(focusNode.right);
        }
    }

    public static void main(String args[]){
        BinaryTree b = new BinaryTree();
        b.addNode(25,"A");
        b.addNode(26,"B");
        b.addNode(246,"C");
        b.addNode(262,"D");
        b.addNode(266,"E");
        b.addNode(2,"R");
        b.addNode(296,"T");
        b.inOrder(b.root);
    }

}

class Node{
    int key;
    String name;
    Node left,right;
    Node(int key, String name){
        this.key=key;
        this.name=name;
    }

    public String tostring(){
        return name+"has the key"+key;
    }

}
