# Data-Structure-And-Algorithm-Master-Class

```
-------------------------------Links------------------------
1. Recursion :
    Recusion is a technique to solve a problem by breaking it down into smaller and smaller sub-problems.
    It is use the stack[LIFO] to solve the problem.
    
    Space Efficient : Recursion : NOT , Iteartive : YES
    Time Efficient : Recursion : NOT , Iteartive : YES
    Easy to implement : Recursion : YES , Iteartive : NOT
    
    ![image](https://user-images.githubusercontent.com/70557643/172533202-6c963ec0-b9dc-426e-b605-9326bffe65ed.png)
    
    // write tutorials.recursion in 3 steps 
    Step1: Recursiev case - the flow
    n! = n* (n-1)* (n-2)* ...* 2 *1 --> n! = n* (n-1)!
    Step2: Base case - the termination condition
        -0!=1
        -1!=1
        0!=1
        
    Step3: Recursive call - the process of calling the function
    
    // write fibbonaci in 3 steps
    0,1,1,2,3,5,8,13,21,34,55,89.........................
    Step1: Recursiev case - the flow
     5 = 3+2 ----> f(n) = f(n-1) + f(n-2)
     
    Step 2 : Base case - the stopping criterion
         0 and 1 
    Step 3 : Unintentional case - the constraint
        fibonnaci(-1) ?? 
        fibonnaci(1.5) ??
        
    
    ## Some coomon problems
    1. Fibonacci --> fibonacci(n) = fibonacci(n-1) + fibonacci(n-2)
    2. Factorial --> factorial(n) = n* factorial(n-1)
    3. Reverse Char --> reverseChar(str) = str[::-1]
    4. sum Of Digits --> n%10 + sumOfDigits(n/10)
    5. Power of integer  --> base * power(base,exp-1)
    6. GCD --> gcd(a,b) = gcd(b,a%b)
    

   
  problem practive: https://leetcode.com/explore/learn/card/tutorials.recursion-i/250/principle-of-tutorials.recursion/1439/
 
 
 
 ```
