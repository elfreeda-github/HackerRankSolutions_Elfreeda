# HackerRankSolutions_Elfreeda
Java project code solutions for practiced HackerRank Questions

CountOfParanthesesPair ---- Java code with only one function
//logic of the code
- increment the openbrackets variable for every open bracket found in the string
- increment the closedbrackets only when previously atleast one open bracket was found and decrement the count of openBrackets by one
- finally return the closedBrackets as this is the actual number of valid parantheses

SortedArrayFrequencyCount ---- Java code with only one function
//logic of the code
- Create a Set out of the input array to get distinct values from the input array
- Iterate through the Set and get Frequency with help of Collections.frequency add it to the new Array List as string
- Print the result array
