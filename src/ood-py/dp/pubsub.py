"""
publisher-subscriber pattern
"""

from __future__ import annotations


class Provider:
    def __init__(self) -> None:
        self.msg_queue = []
        self.subscribers = {}

    def notify(self, msg: str) -> None:
        self.msg_queue.append(msg)

    def subscribe(self, msg: str, subscriber: Subscriber) -> None:
        self.subscribers.setdefault(msg, []).append(subscriber)

    def unsubscribe(self, msg: str, subscriber: Subscriber) -> None:
        self.subscribers[msg].remove(subscriber)

    def update(self) -> None:
        for msg in self.msg_queue:
            for sub in self.subscribers.get(msg, []):
                sub.run(msg)
        self.msg_queue = []


class Publisher:
    def __init__(self, msg_center: Provider) -> None:
        self.provider = msg_center

    def publish(self, msg: str) -> None:
        self.provider.notify(msg)


class Subscriber:
    def __init__(self, name: str, msg_center: Provider) -> None:
        self.name = name
        self.provider = msg_center

    def subscribe(self, msg: str) -> None:
        self.provider.subscribe(msg, self)

    def unsubscribe(self, msg: str) -> None:
        self.provider.unsubscribe(msg, self)

    def run(self, msg: str) -> None:
        print(f'{self.name} got {msg}')


def main():
    """
    >>> message_center = Provider()

    >>> tv5 = Publisher(message_center)

    >>> john = Subscriber('john', message_center)
    >>> john.subscribe('movie')
    >>> jane = Subscriber('jane', message_center)
    >>> jane.subscribe('music')
    >>> babe = Subscriber('joe', message_center)
    >>> babe.subscribe('cartoon')
    >>> royon = Subscriber('royon', message_center)
    >>> royon.subscribe('movie')
    >>> royon.unsubscribe('movie')

    >>> tv5.publish('movie')
    >>> tv5.publish('ads')
    >>> tv5.publish('music')
    >>> tv5.publish('cartoon')
    >>> tv5.publish('movie')
    >>> tv5.publish('movie')
    >>> tv5.publish('blank')
    >>> tv5.publish('music')

    >>> message_center.update()
    john got movie
    jane got music
    joe got cartoon
    john got movie
    john got movie
    jane got music
    """


if __name__ == '__main__':
    import doctest

    doctest.testmod()
