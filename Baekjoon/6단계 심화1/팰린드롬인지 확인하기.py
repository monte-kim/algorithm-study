word = input()
word_list = (list(word))
word_list.reverse()
result = list(word) == word_list
print(1 if result == True else 0)