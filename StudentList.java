class Node{
    int id;
    String name;
    long number;
    String dpt;
    Node next;
    Node(int id,String name,long number,String dpt){
        this.id=id;
        this.name=name;
        this.number=number;
        this.dpt=dpt;
        this.next=null;
    }
}
class LinkedlistFnc{
    Node head;
    Node traverse(){
        Node tmp=head;
        while (tmp.next!=null) {
            tmp=tmp.next;
        }
        return tmp;
    }
    void insertNode(int id,String name,long number,String dpt){
        Node newNode=new Node(id,name,number,dpt);
        if(head==null){
            head=newNode;
        }
        else{
            traverse().next=newNode;
        }
    }
    void insertFirst(int id,String name,long number,String dpt){
        Node newNode=new Node(id, name, number, dpt);
        newNode.next=head;
        head=newNode;
    }
    void insertMiddle(int id,String name,long number,String dpt,String after){
        Node newNode=new Node(id, name, number, dpt);
        Node tmp=head;
        while(!tmp.name.equals(after) && tmp.next!=null){
            tmp=tmp.next;
        }
        newNode.next=tmp.next;
        tmp.next=newNode;
    }
    void search(String name){
        Node tmp=head;
        while(tmp.next!=null){
            if(tmp.name.equals(name)){
                System.out.println("_______________________________"+"\nName : "+tmp.name+"\nRoll No : "+tmp.id+"\nNumber : "+tmp.number+"\nDepartment : "+tmp.dpt+"\n_______________________________");
            }
            tmp=tmp.next;
        }
    }
    void search(int id){
        Node tmp=head;
        while(tmp.id!=id && tmp.next!=null){
            tmp=tmp.next;
        }
        System.out.println("_______________________________"+"\nName : "+tmp.name+"\nRoll No : "+tmp.id+"\nNumber : "+tmp.number+"\nDepartment : "+tmp.dpt+"\n_______________________________");
    }
    void update(int id,String name){
        Node tmp=head;
        while(tmp.id!=id && tmp.next!=null){
            tmp=tmp.next;
        }
        tmp.name=name;
    }
    void update(int id,Long number){
        Node tmp=head;
        while(tmp.id!=id && tmp!=null){
            tmp=tmp.next;
        }
        tmp.number=number;
    }
    void update(int id,String name,String dpt){
        Node tmp=head;
        while(tmp.id!=id && tmp!=null){
            tmp=tmp.next;
        }
        tmp.dpt=dpt;
    }
    void deleteFirst(){
        System.out.println("Deleted recored -> Name : "+head.name+", Id : "+head.id);
        head=head.next;
    }
    void deleteLast(){
        Node tmp=head;
        while(tmp.next.next!=null){
            tmp=tmp.next;
        }
        System.out.println("Deleted recored -> Name : "+tmp.next.name+", Id : "+tmp.next.id);
        tmp.next=null;
    }
    void deleteById(int id){
        Node tmp=head;
        while(tmp.next.id!=id && tmp.next!=null){
            tmp=tmp.next;
        }
        tmp.next=tmp.next.next;
    }
    void show(){
        Node tmp=head;
        while (tmp!=null) {
            System.out.println("_______________________________");
            System.out.println("Roll No: "+tmp.id+"\nName : "+tmp.name+"\nNumber : "+tmp.number+"\nDepartment : "+tmp.dpt);
            tmp=tmp.next;
        }
        System.out.println("----End of List----");
    }
}
public class StudentList {
    public static void main(String[] args) {
        LinkedlistFnc list=new LinkedlistFnc();
        list.head=null;
        list.insertNode(1, "Mukesh", 7894561231L, "AIDS");
        list.insertNode(2, "Nithi", 7894561232L, "AIDS");
        list.insertFirst(4, "Saravana", 7894561239L, "AIDS");
        list.insertFirst(3, "Saravana", 7894561238L, "AIDS");
        list.insertMiddle(5, "Subbu", 7894561326L, "ECE", "Mukesh");
        list.search("Saravana");
        list.search(2);
        list.update(1,"Mukesh","Civil");
        list.deleteFirst();
        list.deleteLast();
        list.deleteById(1);
        list.show();
    }
}
