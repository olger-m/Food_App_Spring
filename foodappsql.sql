create database foodapp ;
use foodapp;
CREATE TABLE `food` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `cook_time` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT 'John Snow',
  `favorite` bit(1) NOT NULL,
  `imageUrl` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `origins` varchar(255) DEFAULT NULL,
  `price` double NOT NULL,
  `star` double DEFAULT NULL,
  `tags` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO food (name, description, price, favorite, star, tags, image_url, cook_Time, origins) VALUES
('Strawberry Cake', 'Golden-brown cake, velvety frosting, and fresh strawberries. Layers of rich chocolate and vanilla. A visual delight with swirls and chocolate shavings. Perfect for dessert lovers.', 4.5, 0, NULL, NULL, 'https://images.unsplash.com/photo-1565958011703-44f9829ba187?w=400&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxleHBsb3JlLWZlZWR8N3x8fGVufDB8fHx8fA%3D%3D', '40', NULL),
('Food Bowl', 'A vibrant food bowl featuring fresh veggies, tender proteins, and flavorful grains for a delicious and balanced meal.', 5.5, 0, NULL, NULL, 'https://images.unsplash.com/photo-1546069901-ba9599a7e63c?q=80&w=1000&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxleHBsb3JlLWZlZWR8Mnx8fGVufDB8fHx8fA%3D%3D', '10', NULL),
('Banana Pancake', 'Fluffy and golden pancakes, a breakfast classic. Served hot, drizzled with syrup, and ready to melt in your mouth.', 5.8, 0, NULL, NULL, 'https://images.unsplash.com/photo-1567620905732-2d1ec7ab7445?w=400&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxleHBsb3JlLWZlZWR8NHx8fGVufDB8fHx8fA%3D%3D', '20', NULL),
('Primavera Salad', 'Fresh and crisp salad, a medley of vibrant greens, juicy tomatoes, and crunchy cucumbers. Tossed with a zesty dressing for a refreshing burst of flavor.', 5.3, 0, NULL, NULL, 'https://images.unsplash.com/photo-1540189549336-e6e99c3679fe?w=400&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxleHBsb3JlLWZlZWR8NXx8fGVufDB8fHx8fA%3D%3D', '15', NULL),
('French Toast', 'Slices of bread, dipped in a rich egg batter, and cooked to golden perfection. French toast, a breakfast delight, served warm with a dusting of powdered sugar and a drizzle of maple syrup.', 4.3, 0, NULL, NULL, 'https://images.unsplash.com/photo-1484723091739-30a097e8f929?w=400&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxleHBsb3JlLWZlZWR8MTJ8fHxlbnwwfHx8fHw%3D', '25', NULL),
('Fruit Bowl', 'Fruit and veggie pâté: a savory blend of freshness, sweetness, and earthy goodness. Ideal for a wholesome, flavorful addition to your dishes.', 4.3, 0, NULL, NULL, 'https://images.unsplash.com/photo-1512621776951-a57141f2eefd?w=400&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxleHBsb3JlLWZlZWR8MTF8fHxlbnwwfHx8fHw%3D', '12', NULL),
('Avocado Toast', 'Eggs and avocado toast: a simple, delicious fusion of creamy avocado and perfectly cooked eggs on toasted bread. A nutritious and satisfying breakfast or brunch option.', 4.2, 0, NULL, NULL, 'https://images.unsplash.com/photo-1482049016688-2d3e1b311543?w=400&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxleHBsb3JlLWZlZWR8OXx8fGVufDB8fHx8fA%3D%3D', '18', NULL),
('Meatballs', 'Savory meatballs: seasoned and perfectly cooked, offering a burst of flavor in every bite. Ideal for a hearty meal or tasty appetizer.', 4.1, 0, NULL, NULL, 'https://images.unsplash.com/photo-1529042410759-befb1204b468?w=400&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxleHBsb3JlLWZlZWR8MjF8fHxlbnwwfHx8fHw%3D', '23', NULL);
