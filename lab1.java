"""
This Prefect task function processes three datasets: a personal dataset, a leaves dataset, and an audits dataset.  
It generates a list of rows where, for each person, a row is created for each month and year, containing:  
- The number of audits completed.  
- The number of audits targeted.  

Additionally, the function calculates qualification status totals and percentages for the past three years, broken down by month, year, and roles.  

Args:  
    personal_dataset (list[dict]): A list of dictionaries containing personal data for individuals.  
    leaves_dataset (list[dict]): A list of dictionaries containing leave data for individuals.  
    audits_dataset (list[dict]): A list of dictionaries containing audit data.  

Returns:  
    tuple: A tuple containing three lists of dictionaries:  
        1. A list of all completed and targeted audits for each person by month and year.  
        2. A list of audits that meet the criteria for being classified as "completed."  
        3. A list of qualification statuses, including totals and percentages for each year, month, and role for the past three years.  
"""





""
This Prefect task function processes three datasets: a personal dataset, a leaves dataset, and an audits dataset.  
It generates a list of rows where, for each person, a row is created for each month and year, containing:  
- The number of audits completed.  
- The number of audits targeted.  

Args:  
    personal_dataset (list[dict]): A list of dictionaries containing personal data for individuals.  
    leaves_dataset (list[dict]): A list of dictionaries containing leave data for individuals.  
    audits_dataset (list[dict]): A list of dictionaries containing audit data.  

Returns:  
    tuple: A tuple containing three lists of dictionaries:  
        1. A list of all completed and targeted audits for each person by month and year.  
        2. A list of audits that meet the criteria for being classified as "completed."  
        3. A list of qualification statuses for each person by month and year.  
"""






// ***********************************************
//  BaseConvert.java
//
//  Converts base 10 numbers to another base
//  (at most 4 digits in the other base).  The
//  base 10 number and the base are input.
//***********************************************
import java.util.Scanner;
public class lab1
{
public static void main (String[] args)
{
int base; // the new base
int base10Num; // the number in base 10 intmaxNumber; //themaximumnumberthatwillfit
               // in 4 digits in the new base
int place0; // digit in the 1's (base^0) place
int place1;
int place2;
int place3;
//digit in the base^1 place
//digit in the base^2 place
//digit in the base^3 place
String baseBNum = new String (""); // the number in the new base
Scanner scan = new Scanner(System.in);
// read in the base 10 number and the base
System.out.println();
System.out.println ("Base Conversion Program");
System.out.println() ;
System.out.print ("Please enter a base (2-9): ");
base = scan.nextInt();
//Compute the maximum base 10 number that will fit in 4 digits
//in the new base and tell the user what range the number they
//want to convert must be in
System.out.print ("Please enter a base 10 number to convert: ");
base10Num = scan.nextInt();
// Do the conversion (see notes in lab)
//Print the result (see notes in lab)
}
}
}
909206



1. Maintenance and Repair (Already Have)
Purpose: Track spending on equipment repairs, spare parts, preventive maintenance, and service contracts.
Breakdown:
Labor costs (internal/external)
Parts/materials
Service contracts (e.g., HVAC, instrumentation calibration)
2. Capital Expenditure (CapEx) POs
Purpose: Monitor investments in long-term assets like new equipment, facility expansions, or upgrades.
Breakdown:
Equipment purchases (e.g., bioreactors, chromatography systems)
Construction and renovation costs
Installation and commissioning costs
3. Operational Expenditure (OpEx) POs
Purpose: Track day-to-day operational costs outside of maintenance.
Breakdown:
Consumables (e.g., filters, culture media, reagents)
Utilities (e.g., water, electricity, gas)
Cleaning supplies and chemicals
4. Quality and Compliance-Related POs
Purpose: Ensure tracking of spending on quality assurance and regulatory compliance activities.
Breakdown:
Audits and inspections
Calibration and validation services
Laboratory consumables and testing kits
5. Facility Management POs
Purpose: Capture costs associated with the upkeep of the manufacturing site.
Breakdown:
Security services
Waste management (e.g., biohazard disposal)
Landscaping and custodial services
6. IT and Software POs
Purpose: Include expenses related to the technology infrastructure.
Breakdown:
Enterprise software licenses (e.g., ERP, LIMS, MES)
Equipment (e.g., servers, laptops)
Cloud and data storage costs
7. R&D POs (If Applicable)
Purpose: Track spending on research and development within the facility.
Breakdown:
Lab equipment
Pilot plant costs
R&D-specific consumables
8. Third-Party Services POs
Purpose: Capture costs related to outsourcing and professional services.
Breakdown:
Consulting services
Contract manufacturing
Legal and regulatory services
9. Safety and Training POs
Purpose: Track spending on workplace safety and employee training.
Breakdown:
PPE (Personal Protective Equipment)
Safety equipment maintenance (e.g., eyewash stations, fire extinguishers)
Training programs and certifications
10. Contingency/Emergency Spending POs
Purpose: Highlight unplanned expenditures.
Breakdown:
Emergency repairs
Supply chain disruptions (e.g., expedited shipping)
How to Structure the Dashboard:
Pages to Include:

Overview:
Total spend by category (CapEx, OpEx, etc.)
Trends over time
Maintenance Spending:
Breakdown by equipment, work order type
Planned vs. unplanned maintenance
Operational Expenses:
Consumables by type
Utility costs trend
CapEx Projects:
Project budgets vs. actuals
Spending by phase (procurement, installation, etc.)
Quality & Compliance:
Costs associated with audits, lab supplies
Savings Opportunities:
Areas of over-budgeting
Spend by vendor (to identify consolidation opportunities)

