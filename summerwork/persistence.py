"""
AP CSA Prerequisite Project
Persistence of a Number
Finished 7/31/2024
"""

###################### FUNCTIONS ######################

# function that calculates the persistence
    # of the desired number
def NumberProcessor (num, persistence):
    
    # cast from int to string
    numStr = str(num)

    # find number of places in user's number
    length = len(numStr)

    # if number has one digit left
    if length == 1:
        return persistence
    
    # if number has more than one digit
    else:
        # define product variable
        product = 1

        # loop through each digit of number
        for i in range(length):
            # take each digit
            digit_str = numStr[i: i+1]

            # cast from string to integer
            digit_int = int(digit_str)

            # multiply digit to the running product
            product *= digit_int
    
        # increment persistence count
        persistence += 1
        
        # recursion
        return NumberProcessor(product, persistence)

###################### MAIN PROGRAM ######################
# formatting 
line = "-----------------------------------"
bar = "            - - - - -"

print (line)
print ("Welcome to Persistence of a Number")

# ask user for number
print (line)
userInput = int(input("Enter desired number: "))
print (bar)

# call on function to calculate the persistence
persistence = str(NumberProcessor(userInput, 0))

# print the result 
print ("The persistence of ", userInput, " is ", persistence)
print (line)
