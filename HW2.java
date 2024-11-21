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



 # Sample dataset (list of tuples)
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

def build_hierarchy_map(data):
    """
    Build a mapping of employee -> manager from the dataset.
    """
    return {row[EMPLOYEE_INDEX]: row[MANAGER_INDEX] for row in data}

def get_full_hierarchy(employee, hierarchy_map, cache=None):
    """
    Recursively find all managers for the given employee.
    Cache results to avoid redundant calculations.
    """
    if cache is None:
        cache = {}
    
    # Return cached result if already processed
    if employee in cache:
        return cache[employee]
    
    # Get the direct manager
    manager = hierarchy_map.get(employee)
    
    # If no manager exists, return an empty list
    if not manager:
        cache[employee] = []
        return []
    
    # Recursively find the hierarchy for the manager
    higher_hierarchy = get_full_hierarchy(manager, hierarchy_map, cache)
    
    # Combine the direct manager and the higher hierarchy
    full_hierarchy = [manager] + higher_hierarchy
    cache[employee] = full_hierarchy
    return full_hierarchy

def flatten_hierarchy(data):
    """
    Generate a flattened hierarchy for all employees.
    """
    hierarchy_map = build_hierarchy_map(data)
    flattened_hierarchy = []
    
    # Cache to store already computed hierarchies
    cache = {}
    
    # Build the flattened hierarchy for each employee
    for employee in hierarchy_map:
        full_hierarchy = get_full_hierarchy(employee, hierarchy_map, cache)
        for manager in full_hierarchy:
            flattened_hierarchy.append((manager, employee))
    
    return flattened_hierarchy

# Generate the flattened hierarchy
result = flatten_hierarchy(data)

# Print the flattened hierarchy
for relation in result:
    print(relation)
       
