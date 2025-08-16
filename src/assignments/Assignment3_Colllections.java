package assignments;

import java.util.LinkedHashMap;
import java.util.Map;

public class Assignment3_Colllections {

public static void main(String[] args) {
		Map <String, String> StudentMAP1 = new LinkedHashMap <String, String>();
		
		// TODO Auto-generated method stub
        StudentMAP1.put("Name", "JohnDoe");
        StudentMAP1.put("Age", "Twenty");
        StudentMAP1.put("Gender", "male");
        StudentMAP1.put("Roll Number", "SBA12345");
        StudentMAP1.put("Grade", "A++");
        StudentMAP1.put("Major", "ComputerScience");
        StudentMAP1.put("GPA", "A3.8");
        StudentMAP1.put("Email", "John@example");
        StudentMAP1.put("PAN Number", "SDF6543210");
        StudentMAP1.put("Name", "Jane Smith");
        
        Map <String, String> StudentMAP2 = new LinkedHashMap <String, String>();
        
        StudentMAP2.put("Name", "Jane Smith");
        StudentMAP2.put("Age", "Twenty One");
        StudentMAP2.put("Gender", "female");
        StudentMAP2.put("Roll Number", "SBA12346");
        StudentMAP2.put("Grade", "B+");
        StudentMAP2.put("Major", "mathematics");
        StudentMAP2.put("GPA", "A3.5");
        StudentMAP2.put("Email", "Jane@example");
        StudentMAP2.put("PAN Number", "REW6543211");
        
        Map <String, String> StudentMAP3 = new LinkedHashMap <String, String>();
        
        StudentMAP3.put("Name", "MikeBrown");
        StudentMAP3.put("Age", "Twenty Two");
        StudentMAP3.put("Gender", "male");
        StudentMAP3.put("Roll Number", "SBA12347");
        StudentMAP3.put("Grade", "A+");
        StudentMAP3.put("Major", "Physics");
        StudentMAP3.put("GPA", "A3.9");
        StudentMAP3.put("Email", "mike@example");
        StudentMAP3.put("PAN Number", "TYR6543212");
       
        Map <String, String> EmpMAP1 = new LinkedHashMap <String, String>();
        
        EmpMAP1.put("ID","E001");
        EmpMAP1.put("Name", "Alice Green");
        EmpMAP1.put("Age", "Thirty");
        EmpMAP1.put("Gender", "Female");
        EmpMAP1.put("Department", "Engineering");
        EmpMAP1.put("Position", "Software Engineer");
        EmpMAP1.put("Salary", "75k Pounds");
        EmpMAP1.put("Email", "alice@example.com");
        EmpMAP1.put("Age", "SDF6543210");
        
        Map <String, String> EmpMAP2 = new LinkedHashMap <String, String>();
        
        EmpMAP2.put("ID","E002");
        EmpMAP2.put("Name", "Bob Johnson");
        EmpMAP2.put("Age", "ThirtyFive");
        EmpMAP2.put("Gender", "male");
        EmpMAP2.put("Department", "Marketing");
        EmpMAP2.put("Position", "Software Engineer");
        EmpMAP2.put("Salary", "85k Pounds");
        EmpMAP2.put("Email", "bob@example.com");
        EmpMAP2.put("Age", "REW6543211");
        
        Map <String, String> EmpMAP3 = new LinkedHashMap <String, String>();
        
        EmpMAP3.put("ID","E003");
        EmpMAP3.put("Name", "Carol White");
        EmpMAP3.put("Age", "Twenty Eight");
        EmpMAP3.put("Gender", "Female");
        EmpMAP3.put("Department", "Sales");
        EmpMAP3.put("Position", "Sales Executive");
        EmpMAP3.put("Salary", "65k Pounds");
        EmpMAP3.put("Email", "carol@example.com");
        EmpMAP3.put("Age", "TYR6543212");
        
        Map <String, String> ProductMAP1 = new LinkedHashMap <String, String>();
        
        ProductMAP1 .put("ProID", "P001");
        ProductMAP1.put("Name", "Laptop");
        ProductMAP1.put("Category", "Electronics");
        ProductMAP1.put("Price", "12k Pounds");
        ProductMAP1.put("Stock Quantity", "Not Available");
        ProductMAP1.put("Supplier", "Tech Supplies");
        ProductMAP1.put("Warranty", "2 years");
        ProductMAP1.put("Rating", "4.5 Stars");
        ProductMAP1.put("Manufacturing Date", "Aug 2023");
        ProductMAP1.put("Expiry Date", "Aug 2028");
        
        Map <String, String> ProductMAP2 = new LinkedHashMap <String, String>();
        
        ProductMAP2.put("ProID", "P002");
        ProductMAP2.put("Name", "Desk Chair");
        ProductMAP2.put("Category", "Electronics");
        ProductMAP2.put("Price", "150k Pounds");
        ProductMAP2.put("Stock Quantity", "Two");
        ProductMAP2.put("Supplier", "Office Depot");
        ProductMAP2.put("Warranty", "1 year");
        ProductMAP2.put("Rating", "4 Stars");
        ProductMAP2.put("Manufacturing Date", "Sep 2024");
        ProductMAP2.put("Expiry Date", "N/A");
        
        Map <String, String> ProductMAP3 = new LinkedHashMap <String, String>();
        
        ProductMAP3.put("ProID", "P003");
        ProductMAP3.put("Name", "Coffee Maker");
        ProductMAP3.put("Category", "Kitchen");
        ProductMAP3.put("Price", "75 Pounds");
        ProductMAP3.put("Stock Quantity", "Two Hundred");
        ProductMAP3.put("Supplier", "Kitchen World");
        ProductMAP3.put("Warranty", "6 months");
        ProductMAP3.put("Rating", "4.2 Stars");
        ProductMAP3.put("Manufacturing Date", "Jan 2025");
        ProductMAP3.put("Expiry Date", "Jan 2027");
        
        System.out.println("Student details:" + StudentMAP3);
        System.out.println("Emp details:" + EmpMAP3);
        System.out.println("Product details:" + ProductMAP2.get("Supplier"));
        
        
        
        
	}

}
