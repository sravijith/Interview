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

# print("--------------------------------------------------------------------")

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

# print('-----------------------------------------------------------')

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

# print('--------------------------------------------------------------')

# # 4. Write a Python program that calculates the area of a circle based on the radius entered by the user.
# # Sample Output :
# # r = 1.1
# # Area = 3.8013271108436504
# import math

# r = float(input('Enter the radius of the circle: '))

# area = math.pi * r * r

# print(f'radius = {r}, area = {area}')

# print('----------------------------------------------------------------')

# # 5. Write a Python program that accepts the user's first and last name and prints them in reverse order with a space between them.

# first = input("Enter the first name: ")
# last = input('Enter the last name: ')

# print(f'{last} {first}')

# print('---------------------------------------------------------------------')

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

# print('----------------------------------------------------------------------')

# # 7. Write a Python program that accepts a filename from the user and prints the extension of the file.
# # Sample filename : abc.java
# # Output : java

# filename = input('Enter the file name with extension: ')

# ext = filename.split('.')[1]

# print(f'file extension: {ext}')

# print('------------------------------------------------------------------------')

# # 8. Write a Python program to display the first and last colors from the following list.
# # color_list = ["Red","Green","White" ,"Black"]

# color_list = ["Red","Green","White" ,"Black"]

# print(f'{color_list[0]}, {color_list[-1]}')

# print('------------------------------------------------------------------------------')

# # 9. Write a Python program to display the examination schedule. (extract the date from exam_st_date).
# # exam_st_date = (11, 12, 2014)
# # Sample Output : The examination will start from : 11 / 12 / 2014

# exam_st_date = (11, 12, 2014)

# print(f'The examination will start from : {exam_st_date[0]} / {exam_st_date[1]} / {exam_st_date[2]}')
# print("The examination will start from : %i / %i / %i" % exam_st_date)

# print('----------------------------------------------------------------------------------')

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

# print('-------------------------------------------------------------------------------------------')

# 11. Write a Python program to print the documents (syntax, description etc.) of Python built-in function(s).
# Sample function : abs()
# Expected Result :
# abs(number) -> number
# Return the absolute value of the argument.


