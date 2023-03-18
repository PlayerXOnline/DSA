class Queue
{
    int size,front,rear,Q[];
    public Queue(int limit)
    {
        size=limit;
        Q=new int[size];
        front=rear=-1;
    }
    void insert(int val)
    {
        if(front==-1&& rear==-1)
        {
            front++;
            rear++;
            Q[rear]=val;
        }
        else
        if(rear==size-1)
        {
            System.out.println("Queue Overflow");
        }
        else
        {
            rear++;
            Q[rear]=val;
        }
    }
    int delete()
    {
        if(front==-1 && rear==-1)
        {
            System.out.println("Underflow");
            return(-999);
        }
        else 
        if(rear==front)
        {
            int val=Q[front];
            front=-1;
            rear=-1;
            return(val);
        }
        else
        {
            int temp=Q[front];
            front++;
            return(temp);
        }
    }
}