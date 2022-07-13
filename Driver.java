import java.util.ArrayList;

public class Driver{

public static LinkedList Intersection(LinkedList firstHead, LinkedList secondHead){
    
    LinkedList first = firstHead;

    while(first != null){
        LinkedList second = secondHead;
        while(second != null){
            if(first == second){
                return first;
            }else{
                second = second.nextNode;
            }
            first = first.nextNode;
        }
    }
    return null;
}

public static LinkedList LoopDetection(LinkedList head){

    ArrayList<LinkedList> nodes = new ArrayList<>();

    LinkedList pointer = head;

    while(pointer != null){
        if(nodes.contains(pointer)){
            return pointer;
        } else {
            nodes.add(pointer);
            pointer = pointer.nextNode;
        }
    }
    return null;

}

public static void main(String[] args){

    //Create first LinkedList starting from the tail

    LinkedList fifth = new LinkedList(5);
    LinkedList fourth = new LinkedList(4, fifth);
    LinkedList third = new LinkedList(3, fourth);
    LinkedList second = new LinkedList(2, third);
    LinkedList head = new LinkedList(1, second);

    //Create second LinkedList starting from the tail

    LinkedList five = new LinkedList(5); // essentially an isolated node, can be disregarded or treated as list3
    LinkedList four = new LinkedList(4, fifth); // Pointing to other list, to check by reference.
    LinkedList three = new LinkedList(3, four);
    LinkedList two = new LinkedList(2, three);
    LinkedList otherHead = new LinkedList(1, two);


    LinkedList resultIntr = Intersection(head, otherHead);
    System.out.println("Intersection at Node: "+ resultIntr.val);


    //Lets make a circularly dependant list

    LinkedList echo = new LinkedList(5);
    LinkedList delta = new LinkedList(4,echo);
    LinkedList charlie = new LinkedList(3, delta);
    LinkedList beta = new LinkedList(2, charlie);
    LinkedList alpha = new LinkedList(1, beta);

    //Setting the looping condition
    echo.setNextNode(charlie);

    LinkedList loopNode = LoopDetection(alpha);

    System.out.println("The List is Looped at node # : "+ loopNode.val);







}




}