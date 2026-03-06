# Campus Plant Lovers

## Project Description
Campus Plant Lovers is a web application that connects students and enthusiasts who are passionate about plants. Users can share their plant collections, ask questions, and collaborate on plant care tips. The platform encourages users to engage with nature and helps them to learn more about different plant species.

## Installation Instructions
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/campus-plant-lovers.git
   cd campus-plant-lovers
   ```
2. Install dependencies:
   ```bash
   npm install
   ```

## Database Setup
1. Install MongoDB on your machine.
2. Create a new database called `plant_lovers`.
3. Add the necessary collections (`users`, `plants`, `tips`) using the following scripts:
   ```javascript
   use plant_lovers;
   db.createCollection("users");
   db.createCollection("plants");
   db.createCollection("tips");
   ```

## API Endpoints
- `GET /api/plants` - Retrieve a list of all plants
- `POST /api/plants` - Add a new plant to the collection
- `GET /api/plants/:id` - Retrieve a specific plant by ID
- `PUT /api/plants/:id` - Update a specific plant by ID
- `DELETE /api/plants/:id` - Delete a specific plant by ID

## Quick Start Guide
1. Start the development server:
   ```bash
   npm start
   ```
2. Open your browser and navigate to `http://localhost:3000`.
3. Create an account or log in to start sharing your plant collection!

## License
This project is licensed under the MIT License.