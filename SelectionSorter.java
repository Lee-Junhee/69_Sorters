/**
  Implement an insertion sort, in the Sorters structure
 */
import java.util.ArrayList;

public class SelectionSorter extends Sorter {

    /**
      Construct an instance to process the user's data
     */
    public SelectionSorter(  ArrayList< String> usersData) {
      super(usersData);
      //mySort();  
      // your code here, if necessary
    }
    

    /**
      sort the user's data, implementing selection sort
      */
    
    /*
      precondition(s): a list of elements
      synopsis: Run select for positions 0 through n–2 in the list.
      postcondition(s): a sorted list of elements
    */
    public void mySort() {
        for(int numSorted = 0;
            numSorted < elements.size() - 1;
            select(numSorted++)){
              System.out.println(debug(numSorted));
            }
    }

    /*
      precondition(s): a list of elements, the first n elements are sorted
      synopsis: Find the smallest value in the unsorted region.
                Swap it with the first value in the unsorted region.
      postcondition(s): a list of elements, the first n + 1 elements are sorted
    */
    public void select(int startAt) {
        int dweebIndex;
        for(int indexToCompare = (dweebIndex = startAt) + 1;
            indexToCompare < elements.size();
            indexToCompare++){
                if(elements.get(dweebIndex).compareTo(elements.get(indexToCompare)) > 0) {
                    dweebIndex = indexToCompare;
                }
            }
        elements.set(startAt, elements.set(dweebIndex, elements.get(startAt)));
    }

}
