package com.vij.batch;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;


public class ReportFieldSetMapper implements FieldSetMapper<Report> {
	
	
    public  Report mapFieldSet(FieldSet fieldSet) throws BindException {

        Report report = new Report();
       
        report.setDate(fieldSet.readDate("date","MM/dd/yyyy HH:mm"));       
        report.setImpressions(fieldSet.readString ("impressions"));
        report.setClicks(fieldSet.readString("clicks"));
        report.setEarning(fieldSet.readString("earning"));
        
        return report;

    }

}
