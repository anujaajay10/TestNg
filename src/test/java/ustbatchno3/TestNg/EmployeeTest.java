package ustbatchno3.TestNg;
import org.testng.Assert;
import org.testng.annotations.Test;


	public class EmployeeTest{
		@Test
		
		public void testforEmployee()
		{
			Employee e=new Employee("anuja",23,"java");
			Assert.assertEquals(e.getName(),"anuja");
		}
	}