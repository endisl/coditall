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
