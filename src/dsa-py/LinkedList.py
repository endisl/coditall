class node:
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = next


class linked_list:
    def __init__(self):
        self.head = None

    def add_at_front(self, data):
        self.head = node(data=data, next=self.head)

    def is_empty(self):
        return self.head is None

    def add_at_end(self, data):
        if not self.head:
            self.head = node(data=data)
            return
        curr = self.head
        while curr.next:
            curr = curr.next
        curr.next = node(data=data)

    def delete_node(self, key):
        curr = self.head
        prev = None
        while curr and curr.data != key:
            prev = curr
            curr = curr.next
        if prev is None:
            self.head = curr.next
        elif curr:
            prev.next = curr.next
            curr.next = None

    def get_last_node(self):
        temp = self.head
        while (temp.next is not None):
            temp = temp.next
        return temp.data

    def print_list(self):
        node = self.head
        while (node is not None):
            print(node.data, end=" => ")
            node = node.next


s = linked_list()
print(s.is_empty())
s.add_at_front(10)
s.print_list()
print()
s.add_at_end(15)
s.print_list()
print()
s.add_at_end(20)
s.print_list()
print()
s.add_at_front(25)
s.print_list()
print()
print(s.get_last_node())
s.delete_node(20)
s.print_list()
