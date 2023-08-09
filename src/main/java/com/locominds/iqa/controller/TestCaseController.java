package com.locominds.iqa.controller;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.locominds.iqa.entity.TestCase;
import com.locominds.iqa.repository.TestCaseRepository;
@RestController
@RequestMapping("/api/testCase")
public class TestCaseController {
	
	@Autowired
	private TestCaseRepository testCaseRepository;
	
	
	@PostMapping("/uploadFile")
	public ResponseEntity<?> uploadFile(@RequestParam("file") MultipartFile file) throws IOException {
		int count=0;
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(file.getInputStream());
		
		int numberOfSheet = workbook.getNumberOfSheets();
		for (int i = 0; i < numberOfSheet; i++) {
            // Getting the Sheet at index i
            Sheet sheet = workbook.getSheetAt(i);
            System.out.println("=> " + sheet.getSheetName());
            // Create a DataFormatter to format and get each cell's value as String
            DataFormatter dataFormatter = new DataFormatter();
            // 1. You can obtain a rowIterator and columnIterator and iterate over them
            System.out.println("Iterating over Rows and Columns using Iterator");
            Iterator<Row> rowIterator = sheet.rowIterator();
            while (rowIterator.hasNext()) {
            	StringBuffer totalRow=new StringBuffer();
            	count++;
                Row row = rowIterator.next();
                // Now let's iterate over the columns of the current row
                Iterator<Cell> cellIterator = row.cellIterator();
                if(count>1) {
                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();
                    String cellValue = dataFormatter.formatCellValue(cell);
                    totalRow.append(cellValue+"#");
               //     System.out.print(cellValue + "\t");
                }
                System.out.println();
             String str=totalRow.toString();
             String array[] = str.split("#");
             for(int j=0; j<1; j++) {
          
                 
                 TestCase testCase=new TestCase();
                 testCase.setTestCaseName(array[j]);
                 testCase.setVersion(array[j+1]);
                 testCase.setUserStory(array[j+2]);
                 testCase.setModule(array[j+3]);
                 testCase.setLabels(array[j+4]);
                 testCase.setType(array[j+5]);
                 testCaseRepository.save(testCase);
              }
            }}
            return ResponseEntity.status(HttpStatus.OK).body("imported successfully");
		}
		

		return ResponseEntity.status(HttpStatus.OK).body("imported successfully");
		

	}
	
	
	@GetMapping("/getTestCase")
	public List<TestCase> getTestCase() {

		return testCaseRepository.findAll();

	}

}
