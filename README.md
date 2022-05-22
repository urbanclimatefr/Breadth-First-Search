# Breadth-First Search

Implement the graph search version of breadth-first search (as described in AIMA Chapter 3 Section 3.4.1) in Java to solve the small problem described below. The implementation does not need to be a generic breadth-first search, it can be specific to this problem. In particular, a state may be represented with a single integer, and the expansion of a node can be implemented with a simple look-up table, indexed by an integer s and containing a list of integers (representing the states adjacent to s).

The problem scenario is the vacuum world. The diagram of all 8 states is shown below. Each state has a number in red. You will need to represent the states and transitions shown in the diagram in your program in some form. For example, state 1 expands to states 1, 2 and 3 (by the actions Left, Right and Suck).

Note:  AIMA refers to Artificial Intelligence: A Modern Approach, by Stuart Russell and Peter Norvig 

![image](https://user-images.githubusercontent.com/60503179/169688495-def48632-72a4-4e7b-9b32-e3e6e1da0f34.png)
Fig. 1. State diagram. 
The initial state is state 1, and the goal states are 7 and 8.

