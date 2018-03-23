'''
    Example of dictionary, and user input in Python3
'''

day = int(input("Please enter the day that you were born: "))
month = int(input("Please enter the month that you were born (using integer): "))
year = int(input("Please enter the year that you were born: "))

months = {1 : "Jan", 2 : "Feb", 3 : "Mar", 4 : "Apr", 5 : "May", 6 : "Jun",
           7: "Jul", 8: "Aug", 9 : "Sep", 10 : "Oct", 11 : "Nov", 12 : "Dec"}

print ("You were born in %s %d, %d" % (months [month], day, year))
