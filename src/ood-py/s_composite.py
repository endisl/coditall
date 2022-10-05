from __future__ import annotations
from abc import ABC, abstractmethod
from typing import List


class Component(ABC):

    def parent(self) -> Component:
        return self._parent
