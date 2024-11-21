package lab1;

public class HW2 {

}


# Sample dataset (list of tuples with more columns)
data = [
    ("Anjali", "Nick", "Department1", "RoleA"),
    ("Nick", "Chris", "Department2", "RoleB"),
    ("Chris", None, "Department3", "RoleC"),
    ("Raj", "Chris", "Department4", "RoleD"),
    ("Meera", "Raj", "Department5", "RoleE"),
]

# Indices for employee and manager in the tuple
EMPLOYEE_INDEX = 0
MANAGER_INDEX = 1

def build_hierarchy(data):
    # Step 1: Create a mapping of employee to manager
    employee_manager_map = {row[EMPLOYEE_INDEX]: row[MANAGER_INDEX] for row in data}

    # Step 2: Find all managers for each employee
    hierarchy = {}
    for employee in employee_manager_map:
        managers = []
        current_manager = employee_manager_map[employee]
        while current_manager:  # Traverse up the hierarchy
            managers.append(current_manager)
            current_manager = employee_manager_map.get(current_manager)
        hierarchy[employee] = managers

    return hierarchy

# Generate the hierarchy
hierarchy = build_hierarchy(data)

# Convert hierarchy to a list of manager-employee relationships
result = []
for employee, managers in hierarchy.items():
    for manager in managers:
        result.append((manager, employee))

# Print the relationships
for relation in result:
    print(relation)

