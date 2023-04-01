#include<stdio.h>
#include<stdlib.h>
typedef struct node
{
  struct node *previous;
  int data;
  struct node *next;
}node;
void create();
void display();
void insertAtPosition(int);
node *head = NULL;
void main()
{
  int position;
  printf("\nLet us Create Double linked list\n");
  create();
    printf("Enter the position you want insert the new node at : ");
    scanf("%d",&position);
    insertAtPosition(position);
    printf("\nDouble linked list is");
    display();
}
void create()
{
  node *temp,*t;
  int x,ch;
  do
  {
    t = (node *)malloc(sizeof(node));
    printf("Enter data part");
    scanf("%d",&x);
    t->data = x;
    t->next = NULL;
    if(head == NULL)
    {
    head = t;
    t->previous = NULL;
    temp = head;  
    }
    else
    {
       temp->next = t;
     (temp->next)->previous = temp;
     temp = temp->next;  
    }
    printf("\n Do you want to create new node. Press 1 to Ctu 0 to stop");
    scanf("%d",&ch);
}
while(ch!=0);
}
void display()
{
  node *temp = head;
  while(temp!= NULL)
  {
    printf("\nAddress of current node is %x",temp);
    printf("\nData Part  of current node is %d",temp->data);
    printf("\nAddress of Previous node is node is %x",temp->previous);
    printf("\nAddress of Next node is %x",temp->next);
    temp = temp->next;
  }
}   
void insertAtPosition(int pos)
{
  node *t,*temp;
  int x,i=1;
  
  if(pos == 1)
  {
    t = (node *)malloc(sizeof(node));
    printf("Enter the data : ");
    scanf("%d",&x);
    t->data = x;
    t->previous = NULL;
    head->previous = t;
    (head->previous)->next = head;
    head = t;
  }
  else
  {
    temp = head;
        
    while(temp != NULL)
    {
             
      if(pos == i+1)
      break;
      
      else
      {
        i++;
        temp = temp->next;
      }
    }
    
    if(temp == NULL)
    printf("Insertion of node at this position is not possible!!");
    
    else
    {
      t = (node *)malloc(sizeof(node));
      printf("Enter data : ");
      scanf("%d",&x);
      
      t->data = x;
      t->previous = temp;
      t->next = temp->next;       
      temp->next = t;
      (t->next)->previous = t;
    }
  }
}       