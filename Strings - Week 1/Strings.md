### Strings, What are they?

In programming, strings are data types that store sequences of characters. Depending on the language you’re using, strings may or may not be immutable.

In Java specifically, strings are immutable. This is to help ensure things like security, synchronization, and caching.

Because strings are immutable, when you modify a string, it creates an entirely new string.

This is important to know, especially during technical interviews, as repeatedly modifying a string could degrade your runtime.

If you do need to constantly modify a string during an interview question, consider using a StringBuilder, which is mutable.

*** 

### String Methods to Know for Interviews

Strings are arguably the most commonly used data type throughout programming, and as a result, will be used extensively during interviews.

Whether the problem relates to strings directly and manipulating them, or you simply need to store intermediary information to solve the problem at hand, you should familiarize yourself with strings and their available methods.

Some of the most common string methods you’ll use during interviews are the following:


### .toCharArray()

By invoking .toCharArray() on a string, its character array representation will be returned. 

Converting a string to a character array can be helpful in scenarios where you need to modify characters within your string, for example swapping two characters.

    String abc = "abc";
    char[] characters = abc.toCharArray();
    char temp = characters[0];
    characters[0] = characters[2];
    characters[2] = temp;
    // prints "cba"
    System.out.println(new String(characters));
    
*** 


### .indexOf()
Invoking indexOf() on a string and passing a character or a string as a parameter will return the index at which the specified character or string first occurs.

This can be helpful in quickly determining whether or not a specific character or substring exists within the string in question.

If the specified substring does not exist, .indexOf() will return -1.

    String computer = "computer";
    // index will store 0
    int index = computer.indexOf('c');

    // index will store -1
    index = computer.indexOf('a');

    // index will store 3
    index = computer.indexOf("puter");
    
***


### .split()

Calling split returns a string array, splitting the string by the specified delimiter.

For example, calling .split(“ “) will split the string by a space. The split method can be useful for problems where you’re required to parse a string or larger text before solving the problem.


    String name = "The Daily Byte"
    // words will contain ["The", "Daily", "Byte"]
    String[] words = name.split(" ");
 

