public class LinkedList {
    protected Lecture head;
    protected Lecture tail;

    protected int Size = 0;

    public LinkedList() {
        head = null;
        tail = null;
    }

    /**
     * getting the right node by it's index
     * 
     * @param index ranking of the node
     * @return Lecture the node
     */
    public Lecture get(int index) {
        Lecture pointer = head;
        System.out.println(pointer.next);
        if (index == 0) {
            return head;
        } else if (index == Size - 1) {
            return tail;
        } else if (index < Size && index > 0) {
            for (int i = 0; i < index; i++) {
                pointer = pointer.next;
            }
            return pointer;
        } else {
            System.out.println("invalid index");
            return null;
        }
    }

    /**
     * adding a node as the head of the linked list
     * 
     * @param lc the node will be added
     */
    public void addToFirst(Lecture lc) {
        if (isNotEmpty()) {
            lc.next = head;
            head = lc;
        } else {
            // if empty, making a new
            head = lc;
            tail = lc;
        }
        Size++;
    }

    /**
     * adding a node as the tail of the linked list
     * 
     * @param lc the node will be added
     */
    public void addToTail(Lecture lc) {
        if (isNotEmpty()) {
            tail.next = lc;
            tail = lc;
        } else {
            head = lc;
            tail = lc;
        }
        Size++;
    }

    /**
     * adding a node by its index
     * 
     * @param index ranking of the node
     * @param lc    the node will be added
     */
    public void add(int index, Lecture lc) {
        if (isNotEmpty()) {
            if (index == 0) {
                addToFirst(lc);
            } else {
                Lecture pointer1 = head;
                Lecture pointer2 = null;
                int current_index = 0;

                // getting the right node
                while (pointer1 != null && current_index < index) {
                    pointer2 = pointer1;
                    pointer1 = pointer1.next;
                    current_index++;
                }
                if (pointer2 == null) {
                    // means index is the last index
                    tail.next = lc;
                    tail = lc;
                } else {
                    // we are adding the node about middle
                    // in the index we want there is pointer1 and in the index -1 there is pointer2
                    lc.next = pointer1;
                    pointer1.next = lc;
                }
            }
        } else {
            head = lc;
            tail = lc;
        }
        Size++;
    }

    public void removeFirst() {
        if (isNotEmpty()) {
            if (head == tail) {
                // only one node
                head = null;
                tail = null;
            } else {
                head = head.next;
            }
            Size--;
        }
    }

    /**
     * removing the last node of the linked list
     */

    public void removeTail() {
        if (isNotEmpty()) {
            if (head == tail) {
                // only one node
                head = null;
                tail = null;
            } else {
                Lecture pointer = head;
                // making the pointer right before tail
                while (pointer.next != tail) {
                    pointer = pointer.next;
                }
                // cutting the connection between tail and the pointer
                pointer.next = null;
                // making the pointer new tail
                tail = pointer;

            }
            Size--;
        }

    }

    /**
     * removing the desired node by its index
     * 
     * @param index the ranking of the node
     */
    public void remove(int index) {
        if (isNotEmpty()) {
            if (head == tail) {
                // only one node
                head = null;
                tail = null;
            } else {
                if (index == 0) {
                    // means we want to remove first
                    removeFirst();
                } else {
                    Lecture pointer1 = head;
                    Lecture pointer2 = null;
                    int current_index = 0;
                    // getting the right node
                    while (pointer1.next != null && current_index < index) {
                        pointer2 = pointer1;
                        pointer1 = pointer1.next;
                        current_index++;
                    }
                    if (pointer1 == tail) {
                        // means we want to delete last node
                        removeTail();
                    } else {
                        pointer2.next = pointer1.next;
                    }
                }
            }
            Size--;
        }
    }

    /**
     * Checking if the linked list is empty
     * 
     * @return boolean returns true if not empty otherwise false
     */
    public boolean isNotEmpty() {
        if (head != null) {
            // is not empty
            return true;
        } else {
            // is empty
            return false;
        }
    }

    /**
     * returning how many node the linked list has
     * 
     * @return int number of nodes this linked list has
     */
    public int size() {
        return Size;
    }

    // turning the whole linked list to Sting type
    public String toString() {
        Lecture pointer = head;
        String wholeList = "[";

        while (pointer != null) {
            wholeList += pointer.toString() + ", ";
            pointer = pointer.next;
        }

        wholeList += "]";

        return wholeList;
    }

}