package myfitness;

/**
 * Interface demonstrating an abstract method for Task 3c.
 */
public interface Payable {
    /**
     * Calculates the bootcamp fee.
     * @param numberOfClasses The number of classes the member is enrolling in.
     * @param isNewCustomer True if the member is a new customer.
     * @return The calculated fee.
     */
    double calculateBootcampFee(int numberOfClasses, boolean isNewCustomer);
}
