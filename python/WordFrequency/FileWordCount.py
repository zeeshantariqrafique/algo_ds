import sys
import re
import os
from collections import defaultdict

#Generator function to return each word from file
def read_input(file):
    list = re.findall(r'\w+',file)
    for word in list:
        yield word


def main(separator='\t'):
    d = defaultdict(int)
    data = read_input(open('WordFrequency\data.txt', 'r').read())
    
    for word in data:
        if word.isalpha():
            d[word.lower()] += 1
    for count_tuple in d.items():
        print ('%s%s%d' % (count_tuple[0], separator, count_tuple[1]))

if __name__ == "__main__":
    main()