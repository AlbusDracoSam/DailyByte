# [Week - 4️⃣](https://github.com/AlbusDracoSam/DailyByte/tree/main/Week%20-%204%20Stacks%20%26%20Queues)

### 1. [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/) - Easy 🟢

This question is asked by **Google.**

Given a string only containing the following characters (, ), {, }, [, and ] return whether or not the opening and closing characters are in a valid order. 

    Ex: Given the following strings...
    
    "(){}[]", return true
    
    "(({[]}))", return true
    
    "{(})", return false


[Solution](https://github.com/AlbusDracoSam/DailyByte/blob/main/Week%20-%204%20Stacks%20%26%20Queues/1.%20Valid%20Parentheses.java)

***

### 2. [Backspace String Compare](https://leetcode.com/problems/backspace-string-compare/) - Easy 🟢

This question is asked by **Amazon.**

Given two strings s and t, which represents a sequence of keystrokes, where # denotes a backspace, return whether or not the sequences produce the same result. 

    Ex: Given the following strings...
    
    s = "ABC#", t = "CD##AB", return true'
    
    s = "como#pur#ter", t = "computer", return true
    
    s = "cof#dim#ng", t = "code", return false
    
[Solution](https://github.com/AlbusDracoSam/DailyByte/blob/main/Week%20-%204%20Stacks%20%26%20Queues/2.%20Backspace%20String%20Compare.java)

***

### 3. [Remove All Adjacent Duplicates In String](https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/) - Easy 🟢

This question is asked by **Facebook.**

Given a string s containing only lowercase letters, continuously remove adjacent characters that are the same and return the result. 

    Ex: Given the following strings...
    
    s = "abccba", return ""
    
    s = "foobar", return "fbar"
    
    s = "abccbefggfe", return "a"
    
[Solution](https://github.com/AlbusDracoSam/DailyByte/blob/main/Week%20-%204%20Stacks%20%26%20Queues/3.%20Remove%20All%20Adjacent%20Duplicates%20In%20String.java)

***

### 4. [Next Greater Element ii](https://leetcode.com/problems/next-greater-element-i/) - Easy 🟢

This question is asked by **Amazon.**

Given two arrays of numbers, where the first array is a subset of the second array, return an array containing all the next greater elements for each element in the first array, in the second array.

If there is no greater element for any element, output -1 for that number. 

    Ex: Given the following arrays…
        
    nums1 = [4,1,2], nums2 = [1,3,4,2], return [-1, 3, -1] because no element in nums2 is greater than 4, 3 is the first number in nums2 greater than 1, and no element in nums2 is greater than 2.
        
    nums1 = [2,4], nums2 = [1,2,3,4], return [3, -1] because 3 is the first greater element that occurs in nums2 after 2 and no element is greater than 4.


[Solution](https://github.com/AlbusDracoSam/DailyByte/blob/main/Week%20-%204%20Stacks%20%26%20Queues/4.%20Next%20Greater%20Element%20ii.java)
***

### 5. [Number of Recent calls](https://leetcode.com/problems/number-of-recent-calls/) - Easy 🟢

This question is asked by **Google.**

Create a class CallCounter that tracks the number of calls a client has made within the last 3 seconds.

Your class should contain one method, ping(int t) that receives the current timestamp (in milliseconds) of a new call being made and returns the number of calls made within the last 3 seconds. 


Note: you may assume that the time associated with each subsequent call to ping is strictly increasing. 

Ex: Given the following calls to ping…

    ping(1), return 1 (1 call within the last 3 seconds)
    
    ping(300), return 2 (2 calls within the last 3 seconds)
    
    ping(3000), return 3 (3 calls within the last 3 seconds)
    
    ping(3002), return 3 (3 calls within the last 3 seconds)
    
    ping(7000), return 1 (1 call within the last 3 seconds)
    
[Solution](https://github.com/AlbusDracoSam/DailyByte/blob/main/Week%20-%204%20Stacks%20%26%20Queues/5.%20Number%20of%20Recent%20Calls.java)

***

### 6. [Moving Average](https://leetcode.com/problems/moving-average-from-data-stream/) - Easy 🟢

This question is asked by **Microsoft.**

Design a class, MovingAverage, which contains a method, next that is responsible for returning the moving average from a stream of integers. 

Note: a moving average is the average of a subset of data at a given point in time. 

Ex: Given the following series of events...

    // i.e. the moving average has a capacity of 3.
    MovingAverage movingAverage = new MovingAverage(3);
    m.next(3) returns 3 because (3 / 1) = 3
    m.next(5) returns 4 because (3 + 5) / 2 = 4 
    m.next(7) = returns 5 because (3 + 5 + 7) / 3 = 5
    m.next(6) = returns 6 because (5 + 7 + 6) / 3 = 6

❗ **No Solution since paid version problem** ❗

***

### 7. [Implement Queue using Stack](https://leetcode.com/problems/implement-queue-using-stacks/) - Easy 🟢

Design a class to implement a stack using only a single queue.

Your class, QueueStack, should support the following stack methods: push() (adding an item), pop() (removing an item), peek() (returning the top value without removing it), and empty() (whether or not the stack is empty).

    Input
    ["MyQueue", "push", "push", "peek", "pop", "empty"]
    [[], [1], [2], [], [], []]
    
    Output
    [null, null, null, 1, 1, false]

    Explanation
    MyQueue myQueue = new MyQueue();
    myQueue.push(1); // queue is: [1]
    myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
    myQueue.peek(); // return 1
    myQueue.pop(); // return 1, queue is [2]
    myQueue.empty(); // return false

[Solution](https://github.com/AlbusDracoSam/DailyByte/blob/main/Week%20-%204%20Stacks%20%26%20Queues/7.%20Implement%20Queue%20using%20Stack.java)
***



