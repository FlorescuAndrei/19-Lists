# 19-Lists
Array Lists, Vectors, Singly Linked Lists, Doubly Linked Lists, JDK LinkedList Class
  
**ArrayList**
  -  Resizable-array implementation of the List interface.  
  -  An ArrayList is backed by an array. To obtain that array  call .toArray() method.  
  -  Has methods that let you work with the list items so you don’t have to work directly on the array.
  -  An Element of the ArrayList is not aware about other elements, it only have an index.  

  - Is good:   
    -  for random access if you have the index;  
    -  for iterating over the items in the list.
  - Is NOT good:
    - for accessing an item in the list when you do not know the index.  
    - for inserting, replacing, deleting,  items in any position other than the end. The elements will be shifting around.
    
add(item)  -> add item at the end of the list	&emsp; &emsp;   	O(1)  
set(int index, item) -> add (replace) an item at the specify location. &emsp;   	O(1)  
add(int index, item) -> add item at the specify location and shift all other. &emsp;    	O(n)  
  


**Vectors**  

Vectors are the same as ArrayLists but are syncronized, thread safe.  
 
 
**LinkedLists**  

Sequential list of objects.  
Each item is aware of another item, contains a link (store a reference).   
The linked list itself is the data structure, there is nothing that backing it. Array are not involved. 
A Linked List can continue to grow without having to be resize contrary to Array List.
A Linked List need more memory for un item then Array List because it have to store the extra field link.


**Singly Linked Lists**   

-  Each item contains a link to the next item.  
-  First item is the Had. Last node point to null.  
-  Single Linked List is best use when you want to insert and remove items from the front O(1) constant time. Otherwise you have to traverse the list O(n) linear operation.  

Circular linked list is a type of Singly Linked List where the last item point to the head. Advantage is that you can traverse the entire list starting at any node.




  
  [BACK TO START PAGE](https://github.com/FlorescuAndrei/Start.git)
