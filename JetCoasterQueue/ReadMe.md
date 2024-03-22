_This code was written for a school assignment_


Jet Coaster Queue
==================
Long queues are forming in front of the Jet Coaster, the most popular toy of Luna Park. Visitors who want to ride the Jet Coaster form a queue at the entrance of the Jet Coaster after buying their tickets. Each time a limited number of visitors can ride the Jet Coaster. Therefore, the park management wants to install a queue management system to ensure that visitors can ride in a fair order.


##### Assignment
Write a Java program to manage the Jet Coaster queue. Your program should simulate a queue structure that will manage visitors who want to ride the Jet Coaster. Visitors are added to the queue along with their names, and a certain number of visitors are picked up from the front of the queue on each Jet Coaster run.

##### Features
- Create a VisitorTail class for the queue structure. This class should have methods to add visitors to the queue, remove them from the queue and show the current state of the queue.
- Visitors should be represented using the Visitor class. Each visitor should have a unique name information.
- A maximum of N visitors can ride the Jet Coaster each time. This number should be defined as a constant at the beginning of the program.
- The program should take the visitor names from the user, add them to the queue and remove N visitors from the front of the queue each Jet Coaster ride.
- When the queue is empty or the user does not want to add more visitors, the program should terminate.