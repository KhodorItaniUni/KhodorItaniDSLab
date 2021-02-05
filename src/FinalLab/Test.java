
package FinalLab;


public class Test {

    
    public static void main(String[] args) {
        
         ArrayList testArray = new ArrayList();
        
        testArray.add(5);  testArray.add(7);  testArray.add(3);  testArray.add(4);
          testArray.add(1);  testArray.add(8);   testArray.add(6);  testArray.add(2); 
         PrintSortedUsingBST( testArray);
         
        System.out.println("Ascending Order" + testArray.PrintSortedUsingBST(testArray));
      
    }

    
    
}
