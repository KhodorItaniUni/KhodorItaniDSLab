package lists;
import java.util.Arrays;
/**
 *
 * @author khodor
 */
public class ArrayList implements List {

    private Object[ ] theArray;    
    private int theSize;
    private static final int ICAPACITY = 10;
  
 
    public ArrayList( )
    {
        Clear( );
    }
    
    
    public ArrayList(int arraySize)
    {
    	theArray =  new Object[ arraySize ];
    	this.theSize = 0;
    }
    
    
    @Override
    public void Clear( )
    {
        theSize = 0;
        theArray =  new Object[ ICAPACITY ];
    }
    
  
    @Override
    public int Size( )
    {
        return theSize;
    }
    
    
    public Object getElement( int index )
    {
        if( index < 0 || index >= Size( ) )
            throw new ArrayIndexOutOfBoundsException( "Index " + index + "; size " + Size( ) );
    
        return theArray[ index ];    
    }
        
    
    @Override
    public int indexOf(Object element) {
         for (int i = 0; i < theSize; i++) {
             if(theArray[i].equals(element))
             {
                 return i;
             }
         }
         return -1;
     }
    
    
    
   
    @Override
    public void Add( Object item )
    {
        if( theArray.length == Size( ) )
         {
             theArray = Arrays.copyOf(theArray, theArray.length + ICAPACITY );
         }
        
        theArray[ theSize++ ] = item; 
    }

   
    
    
    @Override
    public  Object Remove( )
    {
    	if (Size() < 1)
    		throw new RuntimeException();
    		
        Object removedItem = theArray[ theSize-1 ];
        
        theSize--;    
        
        return removedItem;
    }
    
    
    @Override
    public  Object RemoveAt( int index )
    {
          Object removedItem = theArray[ index ];
        
        for( int i = index; i < Size( ) - 1; i++ )
        	theArray[ i ] = theArray[ i + 1 ];
        theSize--;    
        
        return removedItem;
    }
   
   
    
    public void Print()
    {
    	System.out.print("Index  : \t");
    	for(int i=0; i<theSize; i++)
    		System.out.print((i) + "\t");
    	
    	System.out.print("\nElement:\t");
    	
    	for(int i=0; i<theSize; i++)
    		System.out.print(theArray[i] + "\t");
    	
    	System.out.println("\n");
    }
    
   


	public boolean isEmpty()
	{
		return theSize < 1;
	}
}
