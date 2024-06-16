# # 1. Write a Python program to print the following string in a specific format (see the output).
# # Sample String : "Twinkle, twinkle, little star, How I wonder what you are! Up above the world so high, Like a diamond in the sky. Twinkle, twinkle, little star, How I wonder what you are"
# # Output :

# # Twinkle, twinkle, little star,
# # 	How I wonder what you are!
# # 		Up above the world so high,
# # 		Like a diamond in the sky.
# # Twinkle, twinkle, little star,
# # 	How I wonder what you are

# print("""
# Twinkle, twinkle, little star,
#         How I wonder what you are!
#                 Up above the world so high,
#                 Like a diamond in the sky.
# Twinkle, twinkle, little star,
#         How I wonder what you are
# """)
# print("Twinkle, twinkle, little star, \n\tHow I wonder what you are! \n\t\tUp above the world so high, \n\t\tLike a diamond in the sky. \nTwinkle, twinkle, little star, \n\tHow I wonder what you are!")

# print('-'*100)

# # 2. Write a Python program to find out what version of Python you are using.

# print("command line: python3 --version")

# import sys  # Import the sys module to access system-specific parameters and functions

# # Print the Python version to the console
# print("Python version")

# # Use the sys.version attribute to get the Python version and print it
# print(sys.version)

# # Print information about the Python version
# print("Version info.")

# # Use the sys.version_info attribute to get detailed version information and print it
# print(sys.version_info)

# import platform

# print(platform.python_version())

# print(f'platform.python_version() - {platform.python_version()}')

# print('-'*100)

# # 3. Write a Python program to display the current date and time.
# # Sample Output :
# # Current date and time :
# # 2014-07-05 14:34:14

# # Import the 'datetime' module to work with date and time
# import datetime

# # Get the current date and time
# now = datetime.datetime.now()

# # Create a datetime object representing the current date and time

# # Display a message indicating what is being printed
# print("Current date and time : ")

# # Print the current date and time in a specific format
# print(now.strftime("%Y-%m-%d %H:%M:%S"))

# # Use the 'strftime' method to format the datetime object as a string with the desired format

# print('-'*100)

# # 4. Write a Python program that calculates the area of a circle based on the radius entered by the user.
# # Sample Output :
# # r = 1.1
# # Area = 3.8013271108436504
# import math

# r = float(input('Enter the radius of the circle: '))

# area = math.pi * r * r

# print(f'radius = {r}, area = {area}')

# print('-'*100)

# # 5. Write a Python program that accepts the user's first and last name and prints them in reverse order with a space between them.

# first = input("Enter the first name: ")
# last = input('Enter the last name: ')

# print(f'{last} {first}')

# print('-'*100)

# # 6. Write a Python program that accepts a sequence of comma-separated numbers from the user and generates a list and a tuple of those numbers.
# # Sample data : 3, 5, 7, 23
# # Output :
# # List : ['3', ' 5', ' 7', ' 23']
# # Tuple : ('3', ' 5', ' 7', ' 23')

# sep_numbers = input('Enter comman separated numbers: ')

# list_nums = sep_numbers.split(',')
# print(f'List: {list_nums}')

# tup_nums = tuple(list_nums)
# print(f'Tuple: {tup_nums}')

# print('-'*100)

# # 7. Write a Python program that accepts a filename from the user and prints the extension of the file.
# # Sample filename : abc.java
# # Output : java

# filename = input('Enter the file name with extension: ')

# ext = filename.split('.')[1]

# print(f'file extension: {ext}')

# print('-'*100)

# # 8. Write a Python program to display the first and last colors from the following list.
# # color_list = ["Red","Green","White" ,"Black"]

# color_list = ["Red","Green","White" ,"Black"]

# print(f'{color_list[0]}, {color_list[-1]}')

# print('-'*100)

# # 9. Write a Python program to display the examination schedule. (extract the date from exam_st_date).
# # exam_st_date = (11, 12, 2014)
# # Sample Output : The examination will start from : 11 / 12 / 2014

# exam_st_date = (11, 12, 2014)

# print(f'The examination will start from : {exam_st_date[0]} / {exam_st_date[1]} / {exam_st_date[2]}')
# print("The examination will start from : %i / %i / %i" % exam_st_date)

# print('-'*100)

# # 10. Write a Python program that accepts an integer (n) and computes the value of n+nn+nnn.
# # Sample value of n is 5
# # Expected Result : 615

# n = int(input('Enter the integer: '))

# print(f'Expected Result: {n + int(str(n) + str(n)) + int(str(n) + str(n) + str(n))}')
# print(f'Expected Result: {n * (1 + 11 + 111)}')

# n1 = int("%s" % n)          # Convert 'a' to an integer
# n2 = int("%s%s" % (n, n))   # Concatenate 'a' with itself and convert to an integer
# n3 = int("%s%s%s" % (n, n, n))  # Concatenate 'a' with itself twice and convert to an integer

# print(n1 + n2 + n3)

# print('-'*100)

# # 11. Write a Python program to print the documents (syntax, description etc.) of Python built-in function(s).
# # Sample function : abs()
# # Expected Result :
# # abs(number) -> number
# # Return the absolute value of the argument.

# print(abs.__doc__)

# print('-'*100)

# # 12. Write a Python program that prints the calendar for a given month and year.
# # Note : Use 'calendar' module.

# import calendar

# y = int(input('Enter the year: '))
# m = int(input('Enter the month: '))

# print(calendar.month(y, m))

# print('-'*100)

# # 13. Write a Python program to print the following 'here document'.
# # Sample string :
# # a string that you "don't" have to escape
# # This
# # is a ....... multi-line
# # heredoc string --------> example

# print("""a string that you "don't" have to escape
# This
# is a ....... multi-line
# heredoc string --------> example""")

# print('-'*100)

# # 14. Write a Python program to calculate the number of days between two dates.
# # Sample dates : (2014, 7, 2), (2014, 7, 11)
# # Expected output : 9 days

# from datetime import date

# f_date = date(2014, 7, 2)
# l_date = date(2014, 7, 11)

# period = l_date - f_date

# print(f'time difference: {period.days}')

# print('-'*100)

# # 15. Write a Python program to get the volume of a sphere with radius six.
# import math

# radius = 6

# volume = 4.0/3.0 * math.pi * radius**3

# print(f'volume of the sphere with radius {radius}: {volume}')

# print('-'*100)

# # 16. Write a Python program to calculate the difference between a given number and 17. If the number is greater than 17, return twice the absolute difference.

# a = int(input('Enter the number: '))

# result = None

# if a <= 17:
#     # result = 17 - a  # absolute means without sign(minus)
#     result = abs(a - 17)
# else:
#     result = (a - 17) * 2

# print(result)

# print('-'*100)

# # 17. Write a Python program to test whether a number is within 100 of 1000 or 2000.

# def near_thousand(a: int):
#     print(f'without abs function - {a} is within 100 of 1000 or 2000: {
#           900 <= a <= 1000 or 1900 <= a <= 2000}')
#     print(f'with abs function - {a} is within 100 of 1000 or 2000: {
#           abs(1000 - a) <= 100 or abs(2000 - a) <= 100}')


# near_thousand(1000)
# print()
# near_thousand(900)
# print()
# near_thousand(800)
# print()
# near_thousand(2200)

# print('-'*100)

# # 18. Write a Python program to calculate the sum of three given numbers. If the values are equal, return three times their sum.

# def sum_of_three_integers(a: int, b: int, c: int) -> int:
#     if a == b == c:
#         return 9 * a
#     return a+b+c


# print(sum_of_three_integers(6, 6, 6))
# print()
# print(sum_of_three_integers(10, 11, 23))

# print('-'*100)

# # 19. Write a Python program to get a newly-generated string from a given string where "Is" has been added to the front. Return the string unchanged if the given string already begins with "Is".

# def add_Is(s: str) -> str:
#     return s if s.startswith("Is") else "Is " + s


# print(add_Is("Is at front"))
# print(add_Is("added at front"))
# print(add_Is(""))

# print('-'*100)

# # 20. Write a Python program that returns a string that is n(non-negative integer) copies of a given string.

# def repeat_str(s: str, n: int) -> str:
#     # for loop way
#     # result = ""
#     # for i in range(n):
#         # result = result + s # s = s + s

#     # return result

#     return s * n


# print(repeat_str("ajith", 10))

# print('-'*100)

# # 21. Write a Python program that determines whether a given number (accepted from the user) is even or odd, and prints an appropriate message to the user.

# n = int(input("Enter the integer: "))


# def is_even_or_add() -> str:
#     return "is even" if n % 2 == 0 else "is odd"


# print(f'{n} {is_even_or_add()}')

# print('-'*100)

# # 22. Write a Python program to count the number 4 in a given list.

# lst: list = [1, 2, 3, 4, 5, 4, 6, 4, 8]
# elm: int = 4


# def count_list_elm(l: list, e: int) -> int:
#     # with for loop
#     count: int = 0
#     for i in l:
#         if i == e:
#             count = count + 1
#     return count


# print(f'{elm} is {count_list_elm(lst, elm)} times in the list')

# print('-'*100)

# # 23. Write a Python program to get n(non-negative integer) copies of the first 2 characters of a given string. Return n copies of the whole string if the length is less than 2.

# def n_copies_str(s: str, n: int) -> str:
#     return s * n if len(s) < 2 else s[0:2] * n


# print(n_copies_str("ajith", 5))
# print(n_copies_str("a", 3))

# print('-'*100)

# # 24. Write a Python program to test whether a passed letter is a vowel or not .

# vowels = ['a', 'e', 'i', 'o', 'u']

# letter = input("Enter the letter: ")

# if letter in vowels:
#     print(f"{letter} is vowel")
# else:
#     print(f"{letter} is not vowel")

# print('-'*100)

# # 25. Write a Python program that checks whether a specified value is contained within a group of values.
# # Test Data:
# # 3 -> [1, 5, 8, 3]: True
# # -1 -> [1, 5, 8, 3]: False

# def checkelement(el: int, li: list):
#     print(f"{el} is in {li}") if el in li else print(f"{el} is not in {li}")

# li1 = [1, 5, 8, 3]

# checkelement(3, li1)
# checkelement(-1, li1)

# print('-'*100)

# # 26. Write a Python program to create a histogram from a given list of integers.

# li = [2, 3, 6, 5]


# def histogram(li: list):
#     for el in li:
#         print('*' * el)


# histogram(li)

# print('-'*100)

# # 27. Write a Python program that concatenates all elements in a list into a string and returns it.

# li = [1, 5, 12, 2]
# s = ""

# for el in li:
#     s += str(el)

# print(f"combined string with for loop: {s}")

# li = [str(el) for el in li]

# s2 = "".join(li)

# print(f"combined with join: {s2}")

# print('-'*100)

# # 28. Write a Python program to print all even numbers from a given list of numbers in the same order and stop printing any after 237 in the sequence.

# numbers = [
#     386, 462, 47, 418, 907, 344, 236, 375, 823, 566, 597, 978, 328, 615, 953, 345,
#     399, 162, 758, 219, 918, 237, 412, 566, 826, 248, 866, 950, 626, 949, 687, 217,
#     815, 67, 104, 58, 512, 24, 892, 894, 767, 553, 81, 379, 843, 831, 445, 742, 717,
#     958, 743, 527
# ]

# for el in numbers:
#     if el == 237:
#         print(el)
#         break
#     elif el % 2 == 0:
#         print(el)

# print('-'*100)

# # 29. Write a Python program that prints out all colors from color_list_1 that are not present in color_list_2.
# # Test Data:
# # color_list_1 = set(["White", "Black", "Red"])
# # color_list_2 = set(["Red", "Green"])
# # Expected Output:
# # {'Black', 'White'}

# color_list_1 = set(["White", "Black", "Red"])
# color_list_2 = set(["Red", "Green"])

# color_list_intersection = {
#     color for color in color_list_1 if color not in color_list_2}
# print(color_list_intersection)

# for color in color_list_1:
#     if color not in color_list_2:
#         print(color)

# print(color_list_1.difference(color_list_2))
# print(color_list_1 - color_list_2)

# print('-'*100)

# # 30. Write a Python program that will accept the base and height of a triangle and compute its area.

# def triarea(b: int, h: int) -> int:
#     return 1/2 * b * h

# print(triarea(3, 5))

# print('-'*100)

# # 31. Write a Python program that computes the greatest common divisor(GCD) of two positive integers.

# from datetime import datetime


# def gcd_hcf(a: int, b: int) -> int:
#     start_time = datetime.now()
#     c = min(a, b)

#     gcd = 1

#     for i in range(1, c):
#         if a % i == 0 and b % i == 0:
#             gcd = i

#     end_time = datetime.now()
#     print(f"gcd_hcf execution time: {(end_time - start_time).total_seconds() * 10**3}")
#     return gcd


# def gcd_efficient(a: int, b: int) -> int:
#     start_time = datetime.now()
#     c = max(a, b)

#     if (a > b and a % b == 0):
#         return b
#     elif (a < b and b % a == 0):
#         return a

#     gcd = 1

#     for i in range(int(c / 2), 0, -1):
#         if a % i == 0 and b % i == 0:
#             gcd = i
#             break

#     end_time = datetime.now()
#     print(f"gcd_efficient execution time: {(end_time - start_time).total_seconds() * 10**3}")
#     return gcd


# print(gcd_hcf(336, 360))

# print(gcd_efficient(336, 360))

# print('-'*100)

# # 32. Write a Python program to find the least common multiple(LCM) of two positive integers.

# def lcm(a: int, b: int) -> int:
#     c = min(a, b)

#     if a == b:
#         return a

#     while True:
#         if c % a == 0 and c % b == 0:
#             break
#         c += 1

#     return c


# print(lcm(4, 6))
# print(lcm(15, 17))

# print('-'*100)

# # 33. Write a Python program to sum three given integers. However, if two values are equal, the sum will be zero.

# def sum_of_int(a: int, b: int, c: int) -> int:
#     if a == b or a == c or b == c:
#         return 0

#     return a + b + c


# print(sum_of_int(2, 1, 2))
# print(sum_of_int(1, 2, 3))

# print('-'*100)

# # 34. Write a Python program to sum two given integers. However, if the sum is between 15 and 20 it will return 20.

# def sum_of_two(a: int, b: int) -> int:
#     sum = a + b

#     # if 15 <= sum < 20:
#     #     return 20

#     if sum in range(15, 20):
#         return 20

#     return sum


# print(sum_of_two(10, 6))
# print(sum_of_two(10, 12))

# print('-'*100)

# # 35. Write a Python program that returns true if the two given integer values are equal or their sum or difference is 5.

# def test_num5(a: int, b: int) -> int:
#     if a == b:
#         return True

#     sum = a + b
#     dif = abs(a - b)

#     return sum == 5 or dif == 5


# print(test_num5(7, 7))
# print(test_num5(1, 4))
# print(test_num5(1, 3))
# print(test_num5(2, 6))
# print(test_num5(4, 9))

# print('-'*100)

# # 36. Write a Python program to add two objects if both objects are integers.

# def sum_of_obj(a: object, b: object):
#     # if type(a) == int or type(b) == int:
#     #     return a + b

#     if not isinstance(a, int) and not isinstance(b, int):
#         return "arguments must be intergers"

#     return a + b


# print(sum_of_obj(2, 5))
# print(sum_of_obj("2", "5"))

# print('-'*100)

# # 37. Write a Python program that displays your name, age, and address on three different lines.

# persons: list[dict] = [
#     {
#         'name': "ajith",
#         "age": 32,
#         "address": "tampa, fl"
#     }
# ]


# def print_person(persons: list[dict]) -> None:
#     print("function: print_person")
#     for person in persons:
#         print(f"name: {person['name']}")
#         print(f"age: {person.get('age')}")
#         print(f"address: {person['address']}")
#     print('----------')


# def person_details(name: str, age: int, address: str) -> None:
#     print("function: separate_lines")
#     print(name)
#     print(age)
#     print(address)

#     print("Name: {}\nAge: {}\nAddress: {}".format(name, age, address))
#     print(f"Name: {name}\nAge: {age}\nAddress: {address}")
#     print('-----------')


# print_person(persons)

# person_details("ajji", 33, "bridle club")

# print('-'*100)

# # 38. Write a Python program to solve(x + y) * (x + y).
# # Test Data: x = 4, y = 3
# # Expected Output: (4 + 3) ^ 2) = 49

# def power(x: int, y: int, pow: int) -> int:
#     sum = x + y

#     return sum**pow


# print(power(3, 4, 2))

# print('-'*100)

# # 39. Write a Python program to compute the future value of a specified principal amount, rate of interest, and number of years.
# # Test Data: amt = 10000, int = 3.5, years = 7
# # Expected Output: 12722.79

# def compound_interest(p: float, r: float, t: int) -> float:
#     return p * (1 + (r / 100))**t


# print(round(compound_interest(10000, 3.5, 7), 2))

# print('-'*100)

# # 40. Write a Python program to calculate the distance between the points(x1, y1) and (x2, y2).

# import math

# p1: list[float] = [4, 0]
# p2: list[float] = [6, 6]

# p3: list[float] = [2, 3]
# p4: list[float] = [4, 5]


# def points_distance(pt1: list[int], pt2: list[int]) -> float:
#     return math.sqrt((pt2[0]-pt1[0])**2 + (pt2[1]-pt1[1])**2)


# print(points_distance(p1, p2))
# print(points_distance(p3, p4))

# print('-'*100)

# # 41. Write a Python program to check whether a file exists.
#
# import os
#
# print(f"current path: {os.getcwd()}")
# print(f"gitignore file exists: {os.path.isfile("../../../../../.gitignore")}")
# print(f"Interview.iml file exists: {os.path.exists("../../../../../Interview.iml")}")
#
# with open("../../../../../.gitignore") as f:
#     try:
#         f.close()
#         print("File Found")
#     except FileNotFoundError:
#         print("File Not Found")
#
# # 42. Write a Python program to determine if a Python shell is executing in 32bit or 64bit mode on OS.
#
# # Import the 'platform' and 'struct' modules.
# import platform
# import struct
#
# # Use the 'architecture' function from the 'platform' module to get the bit architecture (32-bit or 64-bit) of the current platform.
# # The [0] index retrieves the first element of the result, which is the architecture string.
# architecture = platform.architecture()[0]
#
# # Print the bit architecture string, which will be "32bit" or "64bit."
# print(architecture)
#
# # Use the 'calcsize' function from the 'struct' module to determine the size (in bytes) of the C int type for the current platform.
# # The format string "P" is used to represent the C void pointer type, and multiplying it by 8 gives the size in bits.
# # The result will be 32 for 32-bit platforms and 64 for 64-bit platforms.
# print(struct.calcsize("P") * 8)
#
# # 43. Write a Python program to get OS name, platform and release information.
#
# import os
# import platform
# import sys
# import sysconfig
#
# print("os.name                     ", os.name)
# print("sys.platform                ", sys.platform)
# print("platform.system()           ", platform.system())
# print("sysconfig.get_platform()    ", sysconfig.get_platform())
# print("platform.machine()          ", platform.machine())
# print("platform.architecture()     ", platform.architecture())
#
# # 44. Write a Python program to locate Python site packages.
#
# import site
#
# # site.getsitepackages(): Return a list containing all global site-packages directories.
# print(site.getsitepackages())
#
# # 45. Write a Python program that calls an external command.
#
# from subprocess import call
#
# # Use the 'call' function to execute the "ls -l" command.
# # This command lists the files and directories in the current directory with details.
# call(["ls", "-l"])
#
# import os
#
# # Use 'os.system(command)' to execute the 'ls -l' command in the system's shell.
# # This command lists the files and directories in the current directory and prints the result.
# print(f"os.system('ls -l'): {os.system('ls -l')}")
#
# import psutil
#
# # Use 'psutil.cpu_count()' to get the number of available CPU cores.
# # This function returns the number of logical CPU cores in the system.
# print(f"psutil.cpu_count(): {psutil.cpu_count()}")

# 46. Write a Python program to retrieve the path and name of the file currently being executed.

import os

print("Current File Name: ", os.path.realpath(__file__))
