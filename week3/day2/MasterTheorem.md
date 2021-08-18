T(n) = aT(n/b) + f(n), where, <br>
n = size of input <br>
a = number of subproblems in the recursion <br>
n/b = size of each subproblem. All subproblems are assumed 
     to have the same size. <br>
f(n) = cost of the work done outside the recursive call, 
      which includes the cost of dividing the problem and
      cost of merging the solutions <br>

Here, a ≥ 1 and b > 1 are constants, and f(n) is an asymptotically positive function. <br>

**Master Theorem**

![Master Theorem](https://gateoverflow.in/?qa=blob&qa_blobid=14627523198062236936)

***problem1:*** T(n) = 3T(n/2) + n^2