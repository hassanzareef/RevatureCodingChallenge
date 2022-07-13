public class LinkedList{

public int val;
public LinkedList nextNode;

public LinkedList(int val, LinkedList nextNode){
    this.val = val;
    this.nextNode = nextNode;
}

public LinkedList(int val){
    this.val = val;
    this.nextNode = null;
}

public void setNextNode(LinkedList nextNode){
    this.nextNode = nextNode;
}


}