from datetime import datetime

# Sample personnel data
personnel_data = [
    {'First Name': 'John', 'Last Name': 'Doe', 'Role': 'Supervisor', 'Area': 'Area1', 
     'Start Date': '2023-01-01', 'End Date': '2023-06-30'},
    {'First Name': 'John', 'Last Name': 'Doe', 'Role': 'Manager', 'Area': 'Area1', 
     'Start Date': '2023-07-01', 'End Date': None},  # Current role
    {'First Name': 'Jane', 'Last Name': 'Smith', 'Role': 'Technician', 'Area': 'Area2', 
     'Start Date': '2022-05-01', 'End Date': '2023-05-31'}
]

# Sample audit data
audit_data = [
    {'First Name': 'John', 'Last Name': 'Doe', 'Audit Date': '2023-05-15'},
    {'First Name': 'John', 'Last Name': 'Doe', 'Audit Date': '2023-07-20'},
    {'First Name': 'Jane', 'Last Name': 'Smith', 'Audit Date': '2023-05-15'},
    {'First Name': 'Jane', 'Last Name': 'Smith', 'Audit Date': '2023-06-01'}
]

# Convert date strings to datetime objects for easy comparison
def parse_date(date_str):
    return datetime.strptime(date_str, '%Y-%m-%d') if date_str else None

for person in personnel_data:
    person['Start Date'] = parse_date(person['Start Date'])
    person['End Date'] = parse_date(person['End Date'])

for audit in audit_data:
    audit['Audit Date'] = parse_date(audit['Audit Date'])

# Function to find the correct role for each audit record
def assign_roles_to_audits(audits, personnel):
    for audit in audits:
        # Filter personnel data by matching names
        matching_personnel = [
            person for person in personnel
            if person['First Name'] == audit['First Name'] and
               person['Last Name'] == audit['Last Name']
        ]
        
        # Find the correct role based on audit date
        audit_role = None
        for person in matching_personnel:
            if person['Start Date'] <= audit['Audit Date'] and \
               (person['End Date'] is None or person['End Date'] >= audit['Audit Date']):
                audit_role = person['Role']
                break  # Stop once the correct role is found

        # Assign the role to the audit record
        audit['Role'] = audit_role
    
    return audits

# Assign roles to the audit data
audit_data_with_roles = assign_roles_to_audits(audit_data, personnel_data)

# Output the results
for audit in audit_data_with_roles:
    print(audit)
