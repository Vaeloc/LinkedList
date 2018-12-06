
public class InterviewPrep
{
    public static void main(String[] args)
    {
        // Create linked list
        LinkedList numbers = new LinkedList();

        // Append numbers to the list
        numbers.append(1);
        numbers.append(2);
        numbers.append(3);

        // Add 0 to the front of the list
        numbers.prepend(0);

        // Test the contains() method
        System.out.println("Does numbers contain 0? " + numbers.contains(0));
        System.out.println("Does numbers contain 1? " + numbers.contains(1));
        System.out.println("Does numbers contain 2? " + numbers.contains(2));
        System.out.println("Does numbers contain 3? " + numbers.contains(3));
        System.out.println("Does numbers contain 50? " + numbers.contains(50));

        // Delete the node with the value 0
        numbers.deleteWithValue(0);

        // Verify that 0 has been deleted
        System.out.println("Does numbers contain 0? " + numbers.contains(0));

        // Test the get() method
        System.out.println(numbers.get(1));
    }
}

