/*
 * Copyright 2014, Michael T. Goodrich, Roberto Tamassia, Michael H. Goldwasser
 *
 * Developed for use with the book:
 *
 *    Data Structures and Algorithms in Java, Sixth Edition
 *    Michael T. Goodrich, Roberto Tamassia, and Michael H. Goldwasser
 *    John Wiley & Sons, 2014
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Modified by Laura Gross, Bridgewater State University
 * June, 2020
 * laura.gross@bridgew.edu
 */
package dsaj.design;

@SuppressWarnings({"unchecked"})
/*
 * Java includes support for writing generic classes and methods
 * that can operate on a variety of data types
 * while often avoiding the need for explicit casts.
 *
 * Below we see that the instance variables called first and second
 * are declared with generic type A and B, respectively.
 * (Notice that no explicit access modifier like private is specified for
 * first and second. The class member is *package private* if no explicit
 * access modifier is specified.
 *
 * Single-letter uppercase names are conventionally used (like A, B) for
 * generic classes.
 *
 * You can see the generic classes listed in the angle-bracket syntax
 * in the class header.
 */

public class Pair<A,B> {
  A first;
  B second;

  /* This constructor takes two parameters.
   * The parameter a is of generic type A.
   * The parameter b is of generic type B.
   */
  public Pair(A a, B b) {
    first = a;
    second = b;
  }

  public A getFirst() { return first; }

  public B getSecond() { return second;}

  public String toString() {
    return "[" + first + ", " + second + "]";
  }

  // Some client code for the Pair class
  public static void main(String[] args) {

    // Declare a reference variable bid as a Pair object.
    // Types String and Double replace the generics A and B in the declaration.
    Pair<String, Double> bid;
    // The explicit types for generic programming must be object types.

    // Instantiate a Pair object using new.
    // The reference variable bid is assigned to point to the Pair object.
    bid = new Pair<>("ORCL", 32.07);
    /* Notice we use empty brackets as syntax known as "the diamond",
     * and rely on type inference, in contrast to...
     */

    // I could also do in-line initialization
    Pair<String, Double> bid2 = new Pair<>("IBM", 25.21);
    // Compare the syntax with
    String name = "Laura";
    String name2 = new String("Omar");




    // ... using Java6 style without type inference:
    bid = new Pair<String,Double>("ORCL", 32.07);  // Give explicit types.

    Pair<String,Double>[] holdings; // Declare an array of Pairs called holdings.
    holdings = new Pair[10]; // Create the array with 10 elements (initially null).
    holdings[0] = new Pair<>("ORCL", 32.07);

    // Compare the syntax with
    int[] numberArray;
    numberArray = new int[12];
    // or
    // int[] numberArray = new int[12]; // Inline initialization

    for (int i=0; i < holdings.length; i++){
      System.out.println(holdings[i]);
    }
    for (Pair pair : holdings){
      System.out.println(pair);
    }
  }
  /* The paradigm of generics is versatile:
   * We can specify the formal type parameters A and B
   * when using the generic class as a type elsewhere in the program
   * (like in holdings).
   */
}
