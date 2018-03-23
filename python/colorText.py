'''
    author: Matheus Barros Pereira

    Print text with different colors

    Prerequesites:
        pip3
        termcolor

'''

from termcolor import colored

name = input('Enter your name: ')
age = int(input('Enter your age: '))
print ("Hello, " + colored(name, "red", "on_white") + ". You are " + colored(age, "white", "on_red"))
