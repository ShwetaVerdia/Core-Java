package classworkitujava;

import java.applet.*;
import java.awt.*;

// all methods use binary search in ordered array class
// to run this program: C>java OrderedApp
////////////////////////////////////////////////////////////////
class OrdArray
   {
   private long[] a;                 // ref to array a
   private int nElems;               // number of data items
   //-----------------------------------------------------------
   public OrdArray(int max)          // constructor
      {
      a = new long[max];             // create array
      nElems = 0;
      }
   //-----------------------------------------------------------
   public int size()
      { return nElems; }
   //-----------------------------------------------------------
   public int locate(long searchKey)
      {
      int lowerBound = 0;
      int upperBound = nElems-1;
      int curIn;

      while(true)
         {
         curIn = (lowerBound + upperBound ) / 2;  // middle
         if(a[curIn]==searchKey)       // is it there?
            return curIn;              // yes, return index
         else if(lowerBound > upperBound)  // bounds crossed?
            return lowerBound;             // yes,
         else                              // divide range
            {
            if(a[curIn] < searchKey)
               lowerBound = curIn + 1; // it's in upper half
            else
               upperBound = curIn - 1; // it's in lower half
            }  // end else divide range
         }  // end while
      }  // end locate()
   //-----------------------------------------------------------
   public int find(long searchKey)
      {
      int j = locate(searchKey);     // get location
      if( a[j] == searchKey  )       // is it there?
         return j;                   // yes, return location
      else                           // no,
         return nElems;              // return array size
      }  // end find()
   //-----------------------------------------------------------
   public void insert(long value)    // put element into array
      {
      int j = locate(value);         // get location
      for(int k=nElems; k>j; k--)    // move bigger ones up
         a[k] = a[k-1];
      a[j] = value;                  // insert it
      nElems++;                      // increment size
      }  // end insert()
   //-----------------------------------------------------------
   public boolean delete(long searchKey)
      {
      int j = locate(searchKey);     // get location
      if( a[j] != searchKey )        // is it there?
         return false;               // no
      else
         {                           // yes
         for(int k=j; k<nElems; k++) // move bigger ones down
            a[k] = a[k+1];
         nElems--;                   // decrement size
         return true;
         }
      }  // end delete()
   //-----------------------------------------------------------
   public void display()             // displays array contents
      {
      for(int j=0; j<nElems; j++)       // for each element,
         System.out.print(a[j] + " ");  // display it
      System.out.println("");
      }
   //-----------------------------------------------------------
   }  // end class OrdArray
////////////////////////////////////////////////////////////////
public class OrderedApp
   {
   public static void main(String[] args)
      {
      int maxSize = 100;             // array size
      OrdArray arr;                  // reference to array
      arr = new OrdArray(maxSize);   // create the array
      int searchKey;

      arr.insert(77);                // insert 10 items
      arr.insert(99);
      arr.insert(44);
      arr.insert(55);
      arr.insert(22);
      arr.insert(88);
      arr.insert(11);
      arr.insert(00);
      arr.insert(66);
      arr.insert(33);

      arr.display();

      searchKey = 55;

      if( arr.find( searchKey) != arr.size() )
         System.out.println("Found " + searchKey);
      else
         System.out.println("Can't find " + searchKey);

      if( arr.delete(searchKey) == true )
         System.out.println("Deleted " + searchKey);
      else
         System.out.println("Can't find " + searchKey);

      searchKey = 56;

      if( arr.find(searchKey) != arr.size() )
         System.out.println("Found " + searchKey);
      else
         System.out.println("Can't find " + searchKey);

      if( arr.delete(searchKey) == true )
         System.out.println("Deleted " + searchKey);
      else
         System.out.println("Can't delete " + searchKey);

      arr.display();
      }  // end main()
   }  // end class OrderedApp
