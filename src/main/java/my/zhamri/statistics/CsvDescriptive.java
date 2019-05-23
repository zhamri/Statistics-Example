package my.zhamri.statistics;

import com.opencsv.CSVReader;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Example of Descriptive Statistics from CSV file
 */
public class CsvDescriptive {
    public static void main(String args[]) throws IOException {

        /**
         * Reading the CSV File
         * Delimiter is comma
         * Start reading from line 1
         */
        CSVReader csvReader = new CSVReader(new FileReader("src/main/resources/Employee.csv"), ',', '"', 1);

        //employeeDetails stores the values current line
        String[] employeeDetails = null;

        //Create List for holding Employee objects
        List<Employee> empList = new ArrayList<Employee>();

        while ((employeeDetails = csvReader.readNext()) != null) {

            //Save the employee details in Employee object
            Employee employee = new Employee(Integer.parseInt(employeeDetails[0].trim()),
                    employeeDetails[1], employeeDetails[2],
                    Integer.parseInt(employeeDetails[3]));
            empList.add(employee);
        }

        DescriptiveStatistics ds = new DescriptiveStatistics();

        //Add Salary to statistics
        for (Employee emp : empList) {
            ds.addValue(emp.getSalary());
            System.out.println(emp.getEmpId() + "   " + emp.getFirstName() + "   "
                    + emp.getLastName() + "   " + emp.getSalary());
        }

        System.out.println();
        System.out.println("Mean: " + ds.getMean());
        System.out.println("Median: " + ds.getPercentile(50));
        System.out.println("StdDev: " + ds.getStandardDeviation());
        System.out.println("Min: " + ds.getMin());
        System.out.println("Max: " + ds.getMax());
        System.out.println("Sum: " + ds.getSum());
    }
}
