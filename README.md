# ShortJobFirst

The ShortJobFirst class uses a MyQueueLinked object to store a queue of Job objects. The setReadyQ method adds a Job to the readyQ queue in a way that maintains the order of the jobs based on their size. The displayRQ method iterates over the elements in the readyQ queue and prints out information about each Job object using the jobDisplayFormat method. This code could be used to simulate a scheduling algorithm that prioritizes short jobs over longer ones.

This code defines a class named ShortJobFirst that contains several static methods. The jobDisplayFormat method takes in a Job object and prints out some information about it in a specific format. The displayRQ method iterates over the elements in a MyQueueLinked object called readyQ and prints out information about each Job object using the jobDisplayFormat method. The setReadyQ method takes in a Job object and adds it to the readyQ queue in a specific way. Finally, the main method creates an array of Job objects and adds each one to the readyQ queue using the setReadyQ method. It then displays the contents of the readyQ queue using the displayRQ method.

<img src="https://6a6feeae-6e2b-49df-9ed4-2480d42a5083.id.repl.co/images/p3.png"/>
