# Word Frequency

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Write a bash script to calculate the frequency of each word in a text file `words.txt`.

For simplicity sake, you may assume:

- words.txt contains only lowercase characters and space ' ' characters.
- Each word must consist of lowercase characters only.
- Words are separated by one or more whitespace characters.

 **Example:** 

Assume that `words.txt` has the following content:

```
the day is sunny the the
the sunny is is

```

Your script should output the following, sorted by descending frequency:

```
the 4
is 3
sunny 2
day 1

```

 **Note:** 

- Don't worry about handling ties, it is guaranteed that each word's frequency count is unique.
- Could you write it in one-line using Unix pipes?

## Solution

**Language:** Bash  
**Runtime:** 72 ms (beats 77.84%)  
**Memory:** 3.8 MB (beats 26.27%)  
**Submitted:** 2026-10-11T12:10:29.101Z  

```sh
# Read from the file words.txt and output the word frequency list to stdout.

tr -s ' ' '\n' < words.txt | sort | uniq -c | sort -rn | awk '{print $2, $1}'

```

---

[View on LeetCode](https://leetcode.com/problems/word-frequency/)