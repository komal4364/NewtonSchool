**Asymptotic Analysis:**
<p>The efficiency of an algorithm depends on the amount of time, storage and other resources <br>
required to execute the algorithm. The efficiency is measured with the help of asymptotic notations.</p>

<p>An algorithm may not have the same performance for different types of inputs. <br>
With the increase in the input size, the performance will change. </p>

The study of change in performance of the algorithm with the change in the 
order of the input size is defined as asymptotic analysis.

**Asymptotic Notations:**

Asymptotic notations are the mathematical notations used to describe the running time of an 
algorithm when the input tends towards a particular value or a limiting value.

***For example:*** In bubble sort, when the input array is already sorted, 
the time taken by the algorithm is linear i.e. the best case.

But, when the input array is in reverse condition, the algorithm takes 
the maximum time (quadratic) to sort the elements i.e. the worst case.

When the input array is neither sorted nor in reverse order, 
then it takes average time. These durations are denoted using asymptotic notations.

There are mainly three asymptotic notations:

1. Big-O notation (Worst Case)
2. Omega notation (Best Case)
3. Theta notation (Average Case)

**Big-O notation (Worst Case)(O-notation)**

![O notation](https://cdn.programiz.com/sites/tutorial2program/files/big0.png)

O(g(n)) = { f(n): there exist positive constants c and n0 such that 0 ≤ f(n) ≤ cg(n) for all n ≥ n0 }


**Omega Notation (Best Case) (Ω-notation)**

![Omega notation](https://cdn.programiz.com/sites/tutorial2program/files/omega.png)

Ω(g(n)) = { f(n): there exist positive constants c and n0 such that 0 ≤ cg(n) ≤ f(n) for all n ≥ n0 }


**Theta Notation (Average Case) (Θ-notation)**

![Theta Notation](https://cdn.programiz.com/sites/tutorial2program/files/theta.png)

Θ(g(n)) = { f(n): there exist positive constants c1, c2 and n0 such that 0 ≤ c1g(n) ≤ f(n) ≤ c2g(n) for all n ≥ n0 }



**General TimeComplexities**
<p>1 < logn < n < nlogn < n^2 < n^c < 2^n < n^n </p>

<p> f(n) = 2n^2+3n+10 </p>
<p> f(n) = n^2logn+n </p>
<p> f(n) = n! </p>