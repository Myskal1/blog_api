# Blog Management API

This project is a RESTful Blog Management API built using Spring Boot. The application allows users to manage blogs, posts, and comments with CRUD operations and features robust error handling and authentication.

## Overview

The Blog Management API provides endpoints to:
- Manage blog entities (create, read, update, delete)
- Manage post entities within blogs
- Handle comments for posts


---

## Features

- **CRUD Operations**: Create, Read, Update, Delete for blogs, posts, and comments.
- **Error Handling**: Graceful responses for common errors like `EntityNotFoundException`.
- **Database Integration**: Persistent data storage using PostgreSQL.
- **Authentication**: Ready for integration with JWT or Basic Auth.

---

## Prerequisites

To run this project locally, ensure you have:
1. **Java 17** or later
2. **Maven**
3. **PostgreSQL** installed and configured
4. A tool like **Postman** to test the API

---

## Endpoints

### Blog Endpoints
| HTTP Method | Endpoint                | Description                     |
|-------------|-------------------------|---------------------------------|
| POST        | `/api/blogs`            | Create a new blog               |
| GET         | `/api/blogs`            | Retrieve all blogs              |
| GET         | `/api/blogs/{id}`       | Retrieve a blog by its ID       |
| PUT         | `/api/blogs/{id}`       | Update an existing blog         |
| DELETE      | `/api/blogs/{id}`       | Delete a blog                   |

### Post Endpoints
| HTTP Method | Endpoint                | Description                     |
|-------------|-------------------------|---------------------------------|
| POST        | `/api/posts`            | Create a new post               |
| GET         | `/api/posts`            | Retrieve all posts              |
| GET         | `/api/posts/{postId}`   | Retrieve a post by its ID       |
| DELETE      | `/api/posts/{postId}`   | Delete a post                   |
| PUT         | `/api/posts/{postId}`   | Update a post                   |

### Comment Endpoints
| HTTP Method | Endpoint                      | Description                          |
|-------------|-------------------------------|--------------------------------------|
| POST        | `/api/comments/create`        | Create a comment for a post          |
| GET         | `/api/comments/postId/{id}`   | Retrieve comments for a specific post|
| DELETE      | `/api/comments/{commentId}`   | Delete a comment                     |
| PUT         | `/api/comments/{commentId}`   | Update a comment                     |

---







