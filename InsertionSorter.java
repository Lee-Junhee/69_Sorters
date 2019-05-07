/**
  Implement an insertion sort, in the Sorters structure
 */
import java.util.ArrayList;

public class InsertionSorter extends Sorter {

    /**
      Construct an instance to process the user's data
     */
    public InsertionSorter(  ArrayList< String> usersData) {
      super(usersData);
      //mySort();  
      // your code here, if necessary
    }
    

    /**
      sort the user's data, implementing insertion sort
      insertionSort based off work from Piazza@404, work by Si Liang Lei
      */
    public void mySort() {
      for(int elementToInsert = 1;
        elementToInsert < elements.size();
        insert(elementToInsert++)){
          System.out.println(debug(elementToInsert - 1));
        }
    }

    private void insert(int numSorted) {
      String valueToInsert = elements.get(numSorted);
      int indexToCompare;
      for(indexToCompare = numSorted - 1;
          indexToCompare > -1;
          indexToCompare--) {
            if(valueToInsert.compareTo(elements.get(indexToCompare)) < 0) {
              elements.set(indexToCompare + 1, elements.get(indexToCompare));
            }else {
              elements.set(indexToCompare + 1, valueToInsert);
              break;
            }
          }
      if (indexToCompare < 0) {
        elements.set(0, valueToInsert);
      }
    }
}
