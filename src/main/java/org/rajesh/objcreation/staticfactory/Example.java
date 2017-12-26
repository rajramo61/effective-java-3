package org.rajesh.objcreation.staticfactory;


/**
 * <h2>Item-1</h2>
 * <ul>
 *      <li><strong>Advantages</strong></li>
 * </ul>
 * <ul>
 *      <li>One advantage of static factory methods is that, unlike constructors, they have names.</li>
 *      <li>A second advantage of static factory methods is that, unlike constructors,
 *      they are not required to create a new object each time they are invoked. E.g. instance-controlled classes
 *      based similar to Flyweight pattern</li>
 *      <li>A third advantage of static factory methods is that, unlike constructors,
 *      they can return an object of any subtype of their return type. E.g. interface-based frameworks</li>
 *      <li>A fourth advantage of static factories is that the class of the returned object can vary from call to call
 *      as a function of the input parameters.</li>
 *      <li>A fifth advantage of static factories is that the class of the returned object need not exist
 *      when the class containing the method is written. E.g. service provider frameworks (JDBC)</li>
 *</ul>
 *<ul>
 *      <li><strong>Disadvantages</strong></li>
 *</ul>
 * <ul>
 *      <li>The main limitation of providing only static factory methods is that classes
 *      without public or protected constructors cannot be subclassed.</li>
 *      <li>A second shortcoming of static factory methods is that they are hard for programmers to find.</li>
 *</ul>
 *
 * public BigInteger(int bitLength, int certainty, Random rnd)
 * The constructor above is confusing as the user of this may confuse to pass what value for two integer fields.
 * Especially, user might be unsure about what value to pass for certainty.
 * JDK provides public static BigInteger probablePrime(int bitLength, Random rnd) to overcome this situation.
 */

public class Example {

    /**
     * Similar to Flyweight pattern, it reduces the storage cost of objects.
     * It can greatly improve the performance if equivalent objects are requested often and especially
     * they are expensive to create.
     * @param b accepts a boolean value
     * @return returns boolean based on input without storing it.
     */
    public static boolean valueOf(boolean b){

        return b ? Boolean.TRUE : Boolean.FALSE;
    }




}
