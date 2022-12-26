from typing import Dict


class Borg:
    _shared_state: Dict[str, str] = {}

    def __init__(self) -> None:
        self.__dict__ = self._shared_state


class MyBorg(Borg):
    def __init__(self, state: str = None) -> None:
        super().__init__()
        if state:
            self.state = state
        else:
            if not hasattr(self, 'state'):
                self.state = 'Init'

    def __str__(self) -> str:
        return self.state


def main():
    """
    >>> rm1 = MyBorg()
    >>> rm2 = MyBorg()

    >>> rm1.state = 'Idle'
    >>> rm2.state = 'Running'

    >>> print('rm1 : {0}'.format(rm1))
    rm1 : Running
    >>> print('rm2 : {0}'.format(rm2))
    rm2 : Running
    """


if __name__ == '__main__':
    import doctest

    doctest.testmod()
