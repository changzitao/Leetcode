【题目描述】

定义 *f*(*x*) 为字符串 s 中不同的字符数量，例如f(*a**b**c*)=3、*f*(*T**T**T**T**T*)=1 或*f*(*T**x**T**x**y**T**x**T**x*)=3。

给定一个字符串 *s*，将它分成两个非空子串 *a* 和 *b*，使得 *f*(*a*)+*f*(*b*) 是可能的最大值，请你计算该最大值。

【输入格式】

第一行，包含一个整数 *T*，表示输入包含 *T* 组数据，每组数据：



- 第一行，包含一个整数 *n*，表示字符串 *s* 的长度；
- 第二行，包含一个字符串 *s*。



保证字符串 *s* 只包含大小写字母和数字字符，且区分大小写。

【输出格式】

对于每组数据，输出一行，包含一个整数，表示 *f*(*a*)+*f*(*b*) 的最大值，其中 *a*+*b*=*s*。

输入#1

```
2
2
aa
7
abcabcd
```



输出#1

```
2
7
```


【输入输出样例#2】

输入#2

```
3
5
aaaaa
10
paiumoment
4
aazz
```



输出#2

```
2
10
3
```


【输入输出样例#3】

输入#3

```
5
3
Txx
5
xxxyX
9
00230abca
6
TTTTTT
4
0a0a
```

复制

输出#3


```
3
4
7
2
4
```
数据范围】

对 60% 的数据保证：1≤*T*≤100,2≤*n*≤800。



对 100% 的数据保证：1≤*T*≤10^4,2≤*n*≤2×10^5，保证同一组数据中所有的 *n* 之和不超过 2×10^5。

