# Online Store Project

This Java project implements an online shop system comprising various classes to facilitate the management of users, products, shopping carts, orders, payment methods, discount coupons, and administrative functionalities. Below is a brief overview of each class:

## Class Descriptions:

### User
- Represents a user of the online shop. Contains information such as name, email, address, orderHistory, birth date.

### Product
- Represents a product available in the online shop. Contains details such as name, stock, price and category.

### ShoppingCart
- Manages the items added by a user for purchase. Allows adding and removing items.

### Order
- Represents an order placed by a user. Contains information about the items ordered, total price and the time order was placed.

### PaymentMethod
- Represents the chosen payment method of a user. Includes options such as credit card, PayPal, etc.

### DiscountCoupon
- Represents a discount coupon that can be applied to orders. Contains details such as code, percentage discount.

### AdminUser
- Inherits from the User class and represents an administrator of the online shop. Has additional privileges for managing products, users and generate reports.

### Report
- Generates a balance sheet within the online shop. Provides insights into sales.

### OrdersManagementServices
- Manages all the orders placed in the shop. Includes functionalities for viewing and updating orders.

### ProductManagementService
- Manages all the products available in the shop. Includes functionalities for adding, removing, updating product details.
