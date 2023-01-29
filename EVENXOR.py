a,num = [],0
while len(a) < 1000:
	if(bin(num).count('1') % 2 == 0):
		a.append(num)
	num += 1

for test_cases in range(int(input())):
	n=int(input())
	for i in range(n):
		print(a[i],sep="",end=" ")
	print()