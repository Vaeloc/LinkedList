public class LinkedList
{
    // The first node in the list
    Node head;

    public void append(int data)
    {
        // List is empty so create the first node
        if (head == null)
        {
            head = new Node(data);
            return;
        }

        // Move to the end of the list
        Node current = head;
        while (current.next != null)
        {
            current = current.next;
        }

        // Create a new node after the last node
        current.next = new Node(data);
    }

    // Add a new node at the front of the list
    public void prepend(int data)
    {
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    // Delete a node with a given value
    public void deleteWithValue(int data)
    {
        if (head == null) return;
        if (head.data == data)
        {
            head = head.next;
        }

        Node current = head;
        while (current.next != null)
        {
            if (current.next.data == data)
            {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    // Checks if given data exists in list
    public boolean contains(int data)
    {
        if (head == null) return false;

        Node current = head;

        while (current != null)
        {
            if (current.data == data) return true;
            current = current.next;
        }
        return false;
    }

    // Return the value at the given position of the list
    public int get(int index)
    {
        int counter = 0;
        Node current = head;

        if (index == 0) return head.data;

        while (counter < index)
        {
            current = current.next;
            counter++;
        }
        return current.data;
    }
}
