# Host-Based-CSV-Comparison-Tool
Java-based tool that compares two structured CSV datasets using name as a primary key and identifies mismatched, missing, or inconsistent records.

Designed to simulate structured log or asset comparison workflows, where datasets must be correlated to detect discrepancies.

How It Works
	•	Reads two CSV files
	•	Parses records into memory
	•	Maps entries by name
	•	Compares attributes
	•	Outputs discrepancies

Sample output:
""" Mismatched Record Names:
Hostname1
Hostname2
Hostname3 """
