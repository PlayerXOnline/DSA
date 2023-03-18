class Stack
{
    int St[], top, size;
    public Stack(int limit)
    {
        size=limit;
        St=new int[size];
        top=-1;
    }
    int pop()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
            return(-999);
        }
        else
        {
            top--;
            return(St[top]);
        }
    }
    void push(int val)
    {
        if(top==size-1)
        {
            System.out.println("StackOverflowError");
        }
        else
        {
            top++;
            St[top]=val;
        }
    }    
}