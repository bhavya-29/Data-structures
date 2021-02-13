class Queue{
	int que[];
	final int Max = 40;
	int front,rear;
	public Queue(){
		que = new int[Max];
		front = rear =0;	
	}
	public void enqueue(int process){
		if(!isQueueFull()){
			que[rear++] = process;
		}
		else{
			System.out.println("Full ---");
		}
	}
	public int dequeue(){
		if(!isQueueEmpty()){
			int v = que[front++];
			return(v);
		}
		else
			return(-999);
	}
	public boolean isQueueEmpty(){
		return (front==rear)?true:false;
	}
	public boolean isQueueFull(){
		return (rear==Max)?true:false;
	}
}
public class RoundRobinQueue{
	public static void main(String[] args){
		int bursttime[] = {7,4,5,8};
		int timeQuantum = 2;
		Queue q = new Queue();
		for(int i=0;i<4;i++)
			q.enqueue(i);
		while(!q.isQueueEmpty()){
			int pid = q.dequeue();
			System.out.print("P"+pid+" ");
			bursttime[pid]-=timeQuantum;
			if(bursttime[pid]>0)
				q.enqueue(pid);
		}
	}
}
