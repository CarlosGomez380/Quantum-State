# Quantum-State

This library introduces the basic mathematical description of a quantum physical system. 

It shows two simple examples, to illustrate the basic machinery:

- A particle conﬁned to a set of discrete positions on a line 
- A single-particle spin system
 

## How to install:
First at all, check out java and maven are downloaded and installed in your PC.
Then clone this repository with the command ­

```git clone[repository's link]­``` 

![clone](https://user-images.githubusercontent.com/53835467/66263790-6113c980-e7be-11e9-83ad-63c8567fd10c.PNG)

in the path that you want to save it.
Afterwards, compile and install it with the next commands

­```mvn package­```

![package](https://user-images.githubusercontent.com/53835467/66263795-6a9d3180-e7be-11e9-9b50-d6b7282dc017.PNG)


## Execute tests:
For executing testd follow the command

```mvn test```

![Test](https://user-images.githubusercontent.com/53835467/66263801-77ba2080-e7be-11e9-8d18-c2fbe1cbeb22.PNG)

## Quantum State Functions:

1. Find Position

``` Let assume that now the state vector is ```
``` ψ=[−3−i,−2i, i,2] ```

``` We are gonna calculate the probability that our particle can be found at position x2 ```

``` The norm of|ψ| is ```
``` |ψ|= √((−3−i)^2 +(-2i)^2 +(i)^2 +(2)^2) =4.3589 ```

``` The probability is ```
``` (i)^2/(4.3589)^2 =0.052624 ```


2. Amplitud

``` Let calculate the amplitude of thetransition from ψ=[1,−i]T to φ =[i,1]T ```

``` The norm of both vectors is √2. ```

``` Inner product ﬁrst: φ|ψ= [−i,1][1,−i]T =− 2i ```

``` And then divide it by the product of their norm ```

``` −2i/(√2∗√2) = −i ```

## Some tests:

![FindPos](https://user-images.githubusercontent.com/53835467/66263806-83a5e280-e7be-11e9-8742-a6a84f53f54d.PNG)

![Amplitud](https://user-images.githubusercontent.com/53835467/66263811-8b658700-e7be-11e9-9459-fa9d2358c89a.PNG)

## Executing tests - Results:

![Tests](https://user-images.githubusercontent.com/53835467/66263814-928c9500-e7be-11e9-83e6-2ae5c16a6922.PNG)
