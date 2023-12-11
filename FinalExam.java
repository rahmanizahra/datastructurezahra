package finalExam;

public class FinalExam {
	// CREATE A QUEUE WITH MAXIMUM 6 TASK
	final static int MAX = 6;
	static String stringArray[] = new String[MAX];
	static int front = 0;
	static int rear = -1;
	static int itemCount = 0;
	//DEFINE A METHOD TO PEEK THE FIRST ITEM IN THE QUEUE
	public static String peek(){
	   return stringArray[front];
	}
	public static boolean isEmpty(){
	   return itemCount == 0;
	}
	public static boolean isFull(){
	   return itemCount == MAX;
	}
	public static int size(){
	   return itemCount;
	}
	public static void insert(String data){
	   if(!isFull()) {
	      if(rear == MAX-1) {
	         rear = -1;
	      }
	      stringArray[++rear] = data;
	      itemCount++;
	   }
	}
	public static String removeData(){
	   String data = stringArray[front++];
	   if(front == MAX) {
	      front = 0;
	   }
	   itemCount--;
	   return data;
	}
	
	public static void clear() {
		if(isEmpty()) {
			 System.out.print( "The Queue is empty ");
			 return;
		}
		for(int i=0;i<stringArray.length;i++) {
			removeData();
		}
		
	}
	public static void main(String[] args) {
		
		 /* insert 6 items */
		   insert("First task");
		   insert("Second task");
		   insert("Third task");
		   insert("Forth task");
		   insert("Fifth task");
		   insert("Sixth task");
		   System.out.print("Printer size: " + size());
		   System.out.print("\nQueue: ");
		   for(int i = 0; i < MAX; i++){
		       System.out.print(stringArray[i] + " ");
		   }
		   if(isFull()) {
		      System.out.print("\nQueue is full!");
		   }

		   // remove one item
		   String num = removeData();
		   System.out.print("\nElement removed: " + num);
		   System.out.print("\nQueue size after deletion: " + size());
		   System.out.print("\nElement at front: " + peek());
     	   clear();
           System.out.print(stringArray);

	}

}
