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

    def __get__self(self, obj, klas):
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
                + f"Price: {product_info.get('price', 0):.2f}, "
                + f"Quantity: {product_info.get('quantity', 0)}, "
            )
        else:
            print(f"The product '{product}' does not exist in the records")
