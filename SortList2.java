public class SortList {

    public void sortList() {
        Node node1 = null, node2= null;
        int holder;
            for(node1 = head; node1.next != null; node1 = node1.next)
            {
                for(node2 = node1.next; node2 != null; node2 = node2.next)
                {
                    if(node1.value > node2.value) {
                        holder = node1.value;
                        node1.value = node2.value;
                        node2.value = holder;
                    }
                }
            }
        }
    }

