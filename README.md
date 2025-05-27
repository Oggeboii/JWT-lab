# Microservices Architecture with API Gateway and JWT Authentication

## Overview

This project implements a simple microservices architecture featuring:

- **Authorization Server** issuing JWT tokens on login
- **API Gateway** handling routing, authentication, and authorization
- Two protected microservices:
  - **RockBands Service** (returns random rock bands)
  - **SwedishPuns Service** (returns random Swedish puns)
---

## Components

### 1. Authorization Server
- Authenticates users with username/password.
- Issues JWT tokens containing user claims and scopes.

### 2. API Gateway
- Single entry point for external clients (exposed on port 8888).
- Validates JWT tokens on protected endpoints.
- Routes requests to appropriate microservices based on path.

### 3. RockBands Service
- Microservice that returns random rockbands

### 4. SwedishPuns Service
- Microservice that returns random Swedish puns


---

## Running the System with Docker Compose

### Prerequisites
- Docker and Docker Compose installed on your machine.

### Steps

1. **Build Docker images** for each service (Auth Server, API Gateway, RockBands, SwedishPuns, SPA) use ./mvnw clean spring-boot:build-image`).

2. **Start all services** by running:
   docker-compose file
3. The services will be available at:

API Gateway: http://localhost:8888

Authorization Server: http://localhost:9000

SPA (Frontend): http://localhost:5173

RockBands & SwedishPuns services are accessed through the gateway.
