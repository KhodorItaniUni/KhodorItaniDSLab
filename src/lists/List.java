package lists;

/**
 *
 * @author khodor
 */
public interface List {
    
        void Clear( );
    
                
	void Add( Object item);


	int Size();

        
        Object getElement( int index );
	
                
	Object Remove( );

	
	Object RemoveAt( int index );
        
       
        int indexOf(Object element);
}
