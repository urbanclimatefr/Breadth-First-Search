# Breadth-First Search

Implement the graph search version of breadth-first search (as described in AIMA Chapter 3 Section 3.4.1) in Java to solve the small problem described below. The implementation does not need to be a generic breadth-first search, it can be specific to this problem. In particular, a state may be represented with a single integer, and the expansion of a node can be implemented with a simple look-up table, indexed by an integer s and containing a list of integers (representing the states adjacent to s).

The problem scenario is the vacuum world. The diagram of all 8 states is shown below. Each state has a number in red. You will need to represent the states and transitions shown in the diagram in your program in some form. For example, state 1 expands to states 1, 2 and 3 (by the actions Left, Right and Suck).
