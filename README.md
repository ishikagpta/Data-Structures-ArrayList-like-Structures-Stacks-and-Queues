# Data-Structures-ArrayList-like-Structures-Stacks-and-Queues
Project from CSS 143 UWB course

Summary

I built three classes that conform to the following interfaces. Used arrays in creating my classes (e.g., did not use the built-in ArrayList class when creating the ArrayList-like interface). Extended the sample driver below to completely test the FIFO nature of a Queue, the LIFO nature of a stack and the arbitrary insertsand removes in an ArrayList-like structure.

Sample Driver file posted named ArrayBasedDataStructuresDriver.java

ArrayList-like Interface:

void insert(Object, int index): Add the object at the specified index.

Object remove(int index): Remove and return the object at the specified index.

int size()

String toString()

boolean isEmpty()

int getIndexOf(Object): Returns -1 if not found

boolean equals(Object): Compare sizes and elements in the data structure.

Object get(int index): Returns the object at index specified.

Stack Interface (LIFO):

void push(Object)

Object pop()

int size()

String toString()

boolean isEmpty()

boolean equals(Object)

Queue Interface (FIFO):

void enqueue(Object)

Object dequeue()

int size()

String toString()
