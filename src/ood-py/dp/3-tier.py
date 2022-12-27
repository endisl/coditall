"""
presentation, business logic and data separation
"""

from typing import Dict, KeysView, Optional, Union


class Data:
    products = {
        'moto': {'price': 589.0, 'quantity': 20},
        'sams': {'price': 799.0, 'quantity': 50},
        'smart': {'price': 979.0, 'quantity': 10}
    }

    def __get__(self, obj, cls):
        print('(Fetching from Data Store)')
        return {'products': self.products}


class BusinessLogic:
    data = Data()

    def product_list(self) -> KeysView[str]:
        return self.data['products'].keys()

    def product_information(self, product: str) -> Optional[Dict[str, Union[int, float]]]:
        return self.data['products'].get(product, None)


class UI:

    def __init__(self) -> None:
        self.business_logic = BusinessLogic()

    def get_product_list(self) -> None:
        print('PRODUCT LIST:')
        for product in self.business_logic.product_list():
            print(product)
        print()

    def get_product_information(self, product: str) -> None:
        product_info = self.business_logic.product_information(product)

        if product_info:
            print('PRODUCT INFORMATION:')
            print(
                f"Name: {product.title()}, "
                + f"Price: {product_info.get('price', 0):.1f}, "
                + f"Quantity: {product_info.get('quantity', 0)}"
            )
        else:
            print(f"The product '{product}' does not exist in the records")


def main():
    """
    >>> ui = UI()
    >>> ui.get_product_list()
    PRODUCT LIST:
    (Fetching from Data Store)
    moto
    sams
    smart
    <BLANKLINE>

    >>> ui.get_product_information('moto')
    (Fetching from Data Store)
    PRODUCT INFORMATION:
    Name: Moto, Price: 589.0, Quantity: 20

    >>> ui.get_product_information('smart')
    (Fetching from Data Store)
    PRODUCT INFORMATION:
    Name: Smart, Price: 979.0, Quantity: 10

    >>> ui.get_product_information('nok')
    (Fetching from Data Store)
    The product 'nok' does not exist in the records
    """


if __name__ == '__main__':
    import doctest

    doctest.testmod()
