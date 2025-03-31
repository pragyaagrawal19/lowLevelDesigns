public class MyNode {
    public int value;
    public MyNode next;

    public MyNode(){}
    public MyNode(int value){
        this.value=value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }
}
