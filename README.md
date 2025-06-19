# FILE-HANDLING-UTILITY

COMPANY:CODTECH IT SOLUTIONS

NAME:MULA SAMEERA

INTERN ID:CT04DN836

DOMAIN:JAVA PROGRAMMING

DURATION:4 WEEKS

MENTOR:NEELA SANTHOSH

##DESCRIPTION##

Description of the FileHandling Java Program
The FileHandling class in Java demonstrates how to perform basic file operations such as writing, reading, and modifying text files using standard Java I/O libraries. It is a console-based program designed to allow users to interact with a file (file.txt) in a simple, menu-driven way. This type of program is especially useful for understanding file manipulation in Java, which is a core topic in many programming curricula and real-world applications.

**Features:

1. Write user input to a file

2. Read and display the contents of a file

3. Modify (find and replace) text inside the file

4. Interactive menu system

5. Easy to understand and extend

** Structure and Core Components:

The program is structured into one main class named FileHandling, containing the main method and three key static methods:

1.writeToFile(Scanner scanner)

2.readFromFile()

3.modifyFile(String target, String replacement)

Each method serves a distinct purpose related to file handling. A Scanner object is used to receive user input from the console. The program uses Java’s FileWriter, FileReader, BufferedWriter, and standard exception handling techniques (try-catch) to ensure smooth file operations.

##1. Writing to a File:

The writeToFile method allows the user to input multiple lines of text into the console, which are then written to file.txt. This is done using a BufferedWriter for efficient writing. The loop continues until the user enters a blank line, at which point the writing process is stopped and the file is saved. The method also confirms to the user that the file was written successfully or displays an appropriate error if something goes wrong.

##2. Reading from a File:

The readFromFile method uses a FileReader to read the contents of file.txt character by character. This content is then printed on the console. Reading character-by-character is a straightforward method to demonstrate file reading, though in large-scale applications, buffered or line-based reading might be preferred for performance. The purpose here is to provide an easily understandable way of seeing what has been saved in the file after writing or modification.

##3. Modifying File Contents:

The modifyFile method is a bit more advanced than the others. It reads the entire content of the file into a StringBuilder, then uses the String.replace() method to substitute all occurrences of a target word with a replacement. This kind of word-level modification is useful for tasks like correcting typos, updating data, or content transformation. After modification, the new content is written back to the same file using a FileWriter.

 ***Menu-Driven Interface:
 
In the main method, a do-while loop presents the user with a text-based menu. This loop continues until the user chooses to exit. Based on the user's choice, the program will call the appropriate method. This structure makes the program interactive and easy to use even for beginners.

#The menu options include:

1.Write to the file

2.Read from the file

3.Modify file content

4.Exit

This menu runs in a loop, allowing users to perform multiple actions during one program run. The use of Scanner makes it interactive and user-friendly, as users can input data, choices, and modification parameters directly from the console.

***Use Cases and Benefits:

This program is ideal for:

1.Learning the fundamentals of file input/output in Java.

2.Creating small file-based utilities or tools.

3.Teaching how to structure interactive Java applications with user input.

4.Demonstrating how to use exception handling with file streams.

5.It also serves as a foundation for more complex file handling systems such as logging mechanisms, data processors, text-based configuration editors, and more.

##How to Run:

1.Compile the program:

javac FileHandling.java

2.Run the program:

java FileHandling

