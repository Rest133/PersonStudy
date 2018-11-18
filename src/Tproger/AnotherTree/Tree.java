package Tproger.AnotherTree;

import Java_8_Gerbert_Shildt.Chapter1.BoxWeight;

class Tree {
    private Node root;

    public Tree() {
        root = null;
    }

    public Node find(int key) {
        Node current = root;
        while (current.iData != key) {
            if (key < current.iData) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }
            if (current == null) {
                return null;
            }
        }
        return current;
    }

    public void insert(int id, double dd) {
        Node newNode = new Node();
        newNode.iData = id;
        newNode.dData = dd;
        if (root == null) root = newNode;
        else {
            Node current = root;
            Node parent;

            while (true) { //внутренний выход из цикла
                parent = current;
                if (id < current.iData) {
                    current = current.leftChild;
                    if (current == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if (current == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }


    public boolean delete(int key) {
        Node current = root;
        Node parent = root;
        Boolean isLeftChild = true;

        while (current.iData != key) {
            parent = current;
            if (key < current.iData) {
                isLeftChild = true;
                current = current.leftChild;
            } else {
                isLeftChild = false;
                current = current.rightChild;
            }
            if (current == null) {
                return false;
            }

            //--------------------

            if (current.leftChild == null && current.rightChild == null) {
                if (current == root) root = null;
                else if (isLeftChild) parent.leftChild = null;
                else parent.rightChild = null;
            }
            //------------------
            else if (current.rightChild == null) {
                if (current == root) root = current.rightChild;
                else if (isLeftChild) {
                    parent.leftChild = current.rightChild;
                } else {
                    parent.rightChild = current.rightChild;
                }
            } else {
                Node successor = getSuccessor(current);
                if (current == root) root = successor;
                else if (isLeftChild) parent.leftChild = successor;
                else parent.rightChild = successor;
            }

        }
        return true;
    }

    private Node getSuccessor(Node delNode) {
        Node successorParent = delNode;
        Node successor = delNode;
        Node current = delNode.rightChild;
        while (current != null) {
            successor = current;
            current = current.leftChild;
        }

        if (successor != delNode.rightChild) {
            successorParent.leftChild = successor.rightChild;
            successor.rightChild = delNode.rightChild;
        }
        return successor;
    }

    private Node<T> getReplacementNode(Node<T> replaceNode) {
        Node<T> replacementParent = replaceNode;
        Node<T> replacement = replaceNode;
        Node<T> focusNode = replaceNode.right;

        while (focusNode != null) {
            replacementParent = replacement;
            replacement = focusNode;
            focusNode = focusNode.left;
        }

        if (replacement != replaceNode.right) {
            replacementParent.left = replacement.right;
            replacement.right = replaceNode.right;
        }

        return replacement;
    }


}
