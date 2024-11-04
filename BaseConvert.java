# Count completed audits for the specific year and month
            completed_audits_count = sum(
                1 for audit in audit_data
                if audit['observerName'] == full_name and
                   parse_date(audit['Audit Date']).year == year and
                   parse_date(audit['Audit Date']).month == month
            )
