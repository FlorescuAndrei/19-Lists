# 19-Lists
Array Lists, Vectors, Singly Liked Lists, Doubly Linked Lists, JDK LinkedList Class
  
ArrayList
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

  
  [BACK TO START PAGE](https://github.com/FlorescuAndrei/Start.git)
