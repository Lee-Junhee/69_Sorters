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
      sort the user's data, implementing insertion sort
      insertionSort based off work from Piazza@404, work by Si Liang Lei
      */
    public void mySort() {
        for(int numSorted = 0;
            numSorted < elements.size() - 1;
            select(numSorted++)){
              System.out.println(debug());
            }
    }

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
