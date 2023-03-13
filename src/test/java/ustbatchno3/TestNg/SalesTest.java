package ustbatchno3.TestNg;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class SalesTest {
      @Test
      public void Construction(){
    	  int expected =2000;
    	  
    	  Constructionsales p1=new Constructionsales("Hyderabad", 2000, 900);
    	  String city="hyderabad";
    	  List<Constructionsales> details=Arrays.asList(p1);
    	  int ch=1,sq=1;
    	  
    	  assertEquals(expected, SalesMain.construction(details, ch, city, sq));
    	  ch=2;
    	  
    	  expected=900;
    	  assertEquals(expected, SalesMain.construction(details, ch, city, sq));
    	  
      }
}
