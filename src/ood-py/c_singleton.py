class SingletonMeta(type):
    _instances = {}

    def __call__(cls, *args, **kwds):
        if cls not in cls._instances:
            instance = super().__call__(*args, **kwds)
            cls._instances[cls] = instance
        return cls._instances


class Singleton(metaclass=SingletonMeta):
    def some_business_logic(self):
        """
        """


if __name__ == "__main__":

    s1 = Singleton()
    s2 = Singleton()

    if id(s1) == id(s2):
        print("Singleton works, both variables contain the same instance.", id(s1), id(s2))
    else:
        print("singleton failed, variables contain different instances.")
