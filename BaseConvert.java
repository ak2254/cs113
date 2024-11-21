FirstDayOfMonth = 
DATE(
    VALUE(RIGHT([MonthYear], 4)), 
    SWITCH(LEFT([MonthYear], FIND(" ", [MonthYear]) - 1),
        "January", 1,
        "February", 2,
        "March", 3,
        "April", 4,
        "May", 5,
        "June", 6,
        "July", 7,
        "August", 8,
        "September", 9,
        "October", 10,
        "November", 11,
        "December", 12
    ),
    1
)
# Sample dataset
data = {
    "Anjali": "Nick",
    "Nick": "Chris",
    "Chris": None
}

# Function to find the top-level manager for an employee
def get_all_managers(employee, hierarchy):
    managers = []
    while employee and employee in hierarchy:
        employee = hierarchy[employee]
        if employee:
            managers.append(employee)
    return managers

# Generate the desired output
result = []
for employee in data.keys():
    all_managers = get_all_managers(employee, data)
    for manager in all_managers:
        result.append({"Manager": manager, "Employee": employee})

# Print the results
for relation in result:
    print(relation)


