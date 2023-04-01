sot(A,ub,lb)
{
    if(lb<ub)
    {
        loc=portition(A,lb,ub)
        quick_sort(A,lb,loc-1)
        quick_sort(A,loc+1,ub)
    }
partition(A,lb,ub)
{
    
}
}