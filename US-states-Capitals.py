# Create dictionary d1 for storing all state names (and corresponding capitals) with Alphabetical letter A
d1 = {'Alabama':'Montgomery', 'Alaska': 'Juneau', 'Arizona':'Phoenix', 'Arkansas': 'Little Rock'}

# Update the dictionary with new key value pairs
d1.update({'California': 'Sacramento', 'Colorado':'Denver' , 'Connecticut': 'Hartford'})

# Create a new dictionary d2 with states for Alphabetical letters F, G , H and I

d2={'Delaware':'Dover', 'Florida':'Tallahassee', 'Georgia':'Atlanta', 'Hawaii':'Honolulu', 'Idaho': 'Boise' , \
    'Illinois':'Springfield', 'Indiana':'Indianapolis' , 'Iowa':'Des Moines' }

# Just to check the key values, in this case the state names - use the following statement
#print (d2.keys())

# Value names associated with keys in a particular dictionary can be accessed using the following

#print (d2.values())

# Now, Merge dictionary d2 with d1

d1.update(d2)

#print (d1)

# Create a new bigger dictionary now with all remaining state names

d3={'Kansas':'Topeka', 'Kentucky':'Frankfort', 'Lousiana':'Baton Rouge' , 'Maine':'Augusta', 'Maryland':'Annapolis' ,\
    'Massachusetts': 'Boston', 'Michigan': 'Lansing', 'Minnesota':'Saint Paul', 'Mississippi':'Jackson' , \
    'Missouri':'Jefferson City' , 'Montana':'Helena', 'Nebraska': 'Lincoln', 'Nevada':'Carson City' , \
    'New Hampshire': 'Concord', 'New Jersey':'Trenton', 'New Mexico':'Santa Fe', 'New York': 'Albany', \
    'North Carolina':'Raleigh', 'North Dakota':'Bismarck', 'Ohio':'Columbus', 'Olklahoma':'Oklahoma City', \
    'Oregon':'Salem', 'Pennsylvania':'Harrisburg', 'Rhode Island':'Providence', 'South Carolina':'Columbia', \
    'South Dakota':'Pierre', 'Tennessee':'Nashville', 'Texas':'Austin', 'Utah':'Salt Lake City', \
    'Vermont':'Montpelier', 'Virgina':'Richmond', 'Washington':'Olympia', 'West Virginia':'Charleston', \
    'Wisconsin':'Madison', 'Wyoming':'Cheyenne'}

#Merge the new bigger dictionary d3 with the original dictionary d1
d1.update(d3)
#Following statement shows how to iterate through a dictionary
# For each state name (key ) in the dictionary, print the capital city name (value)

#for key in d1.keys():
 #   print (key, "--------",  d1[key])

# Another way to iterate a dictionary using the items() function
 
#for key,value in d1.items():
 #   print (value, "Is the Capital City of ", key)

# Process user input accepting state name and print out the matching city name

state_name = input("Please Enter U.S state for which you intend to know the Capital City of:  \n ")
if state_name in d1.keys():
    print (d1[state_name])
else:
    print ("Name doesn't exist, Please try again")


