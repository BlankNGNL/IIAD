
package Week_4_Boom;
import Week_4_Queue.ListQueue;

import javax.xml.soap.Node;

// Klasse voor een knoop voor een binaire Week_4_Boom
public class BKnoop<E> {
    private BKnoop<E> parent, leftChild, rightChild;
    private E userObject;
    public static final int LEFT = 0;
    public static final int RIGHT = 1;

    // Constructors
    public BKnoop() {
        this(null);
    }

    public BKnoop(E userObject) {
        parent = null;
        leftChild = null;
        rightChild = null;
        this.userObject = userObject;
    }

    // Methoden
    public void add(BKnoop<E> newChild) {
        if (leftChild == null)
            insert(newChild, LEFT);
        else if (rightChild == null)
            insert(newChild, RIGHT);
        else
            throw new IllegalArgumentException(
                    "Meer dan 2 kinderen");
    }

    public E get() {
        return userObject;
    }

    public BKnoop<E> getLeftChild() {
        return leftChild;
    }

    public BKnoop<E> getRightChild() {
        return rightChild;
    }

    public BKnoop<E> getParent() {
        return parent;
    }

    public void insert(BKnoop<E> newChild, int childIndex) {
        if (isAncestor(newChild))
            throw new IllegalArgumentException(
                    "Nieuw kind is voorouder");
        if (childIndex != LEFT &&
                childIndex != RIGHT)
            throw new IllegalArgumentException(
                    "Index moet 0 of 1 zijn");

        if (newChild != null) {
            BKnoop<E> oldParent = newChild.getParent();
            if (oldParent != null)
                oldParent.remove(newChild);
        }

        newChild.parent = this;
        if (childIndex == LEFT)
            leftChild = newChild;
        else
            rightChild = newChild;
    }

    public boolean isChild(BKnoop<E> aNode) {
        return aNode == null ?
                false :
                aNode.getParent() == this;
    }

    public boolean isAncestor(BKnoop<E> aNode) {
        BKnoop<E> ancestor = this;
        while (ancestor != null && ancestor != aNode)
            ancestor = ancestor.getParent();
        return ancestor != null;
    }

    public void remove(BKnoop<E> aChild) {
        if (aChild == null)
            throw new IllegalArgumentException(
                    "Argument is null");

        if (!isChild(aChild))
            throw new IllegalArgumentException(
                    "Argument is geen kind");

        if (aChild == leftChild) {
            leftChild.parent = null;
            leftChild = null;
        } else {
            rightChild.parent = null;
            rightChild = null;
        }
    }

    public String toString() {
        return userObject.toString();
    }

    public void printPreOrder(BKnoop<E> node) {
        System.out.print(node.userObject + " ");

        if (node.getLeftChild() != null)
            printPreOrder(node.getLeftChild());
        if (node.getRightChild() != null)
            printPreOrder(node.getRightChild());
    }

    public void printPostOrder(BKnoop<E> node) {
        if (node.getLeftChild() != null)
            printPostOrder(node.getLeftChild());
        if (node.getRightChild() != null)
            printPostOrder(node.getRightChild());
        System.out.print(node.userObject + " ");
    }

    public void printInOrder(BKnoop<E> node) {
        if (node.getLeftChild() != null) {
            printInOrder(node.getLeftChild());
        }
        System.out.print(node.userObject + " ");

        if (node.getRightChild() != null) {
            printInOrder(node.getRightChild());
        }
    }

    public int aantalKnopen() {
        int knopen = 1;

        if (leftChild != null)
            knopen += leftChild.aantalKnopen();

        if (rightChild != null)
            knopen += rightChild.aantalKnopen();

        return knopen;
    }

    public int aantalBlad() {
        if (leftChild == null && rightChild == null) {
            return 1;
        }
        int count = 0;
        if (leftChild != null)
            count += leftChild.aantalBlad();
        if (rightChild != null)
            count += rightChild.aantalBlad();
        return count;
    }

    public int diepte(BKnoop<E> node) {
        if (node == null) {
            return 0;
        }
        int maxleft = diepte(node.leftChild);
        int maxright = diepte(node.rightChild);

        if (maxleft > maxright) {
            return maxleft + 1;
        } else {
            return maxright + 1;
        }
    }

    public void printTree(BKnoop<E> node, ListQueue queue) {
        //        if (node == null)
//            return;
//        q.enqueue(node);
//        while (!q.isEmpty()) {
//            BKnoop<E> n = (BKnoop<E>) q.dequeue();
//            System.out.print(" " + n.userObject);
//            if (n.leftChild != null)
//                q.enqueue(n.leftChild);
//            if (n.rightChild != null)
//                q.enqueue(n.rightChild);
//        }


//        Queue<BKnoop> q = new LinkedList<BKnoop>();
//        if (node == null)
//            return;
//        q.add(node);
//        while (!q.isEmpty()) {
//            BKnoop<E> n = (BKnoop<E>) q.remove();
//            System.out.print(" " + n.userObject);
//            if (n.leftChild != null)
//                q.add(n.leftChild);
//            if (n.rightChild != null)
//                q.add(n.rightChild);
//        }


//        Queue<BKnoop> currentLevel = new LinkedList<>();
//        Queue<BKnoop> nextLevel = new LinkedList<>();
//
//        currentLevel.add(this);
//
//        while (!currentLevel.isEmpty()) {
//            Iterator<BKnoop> currentLevelIter = currentLevel.iterator();
//            while (currentLevelIter.hasNext()) {
//                BKnoop currentNode = currentLevelIter.next();
//                if (currentNode.getLeftChild() != null) {
//                    nextLevel.add(currentNode.getLeftChild());
//                }
//                if (currentNode.getRightChild() != null) {
//                    nextLevel.add(currentNode.getRightChild());
//                }
//                System.out.print(currentNode + " ");
//            }
//            System.out.println();
//            currentLevel = nextLevel;
//            nextLevel = new LinkedList<>();
//
//        }

    }
}