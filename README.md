#  AI-Powered Fitness App (Microservices Architecture)

##  Overview
AI-Powered Fitness App is a **scalable backend system** designed using Microservices Architecture to provide **personalized fitness tracking, activity monitoring, and AI-driven recommendations**.

This project demonstrates **real-world backend engineering concepts** including service decomposition, centralized configuration, API gateway routing, and scalable system design.

---

## Key Features

-  **User Management Service**
  - User registration & profile management

-  **Activity Tracking Service**
  - Log workouts, track fitness activities

-  **Config Server**
  - Centralized configuration management across services

-  **API Gateway**
  - Single entry point for all microservices
  - Routing and request handling

-  **Authentication**
  - Integrated with **Keycloak** for JWT-based security

-  **AI Integration**
  - Personalized workout recommendations via AI Service
  - Integration with Google Gemini for AI insights

---

##  Architecture

This project follows a **Microservices Architecture**:

- Each service runs independently
- Services communicate via REST APIs
- Centralized configuration using Config Server
- API Gateway handles routing
- Eureka used for service discovery
- Kafka handles asynchronous messaging between services

![Architecture Diagram](architecture.png)

**Flow:**
```text
Client (Postman/Frontend)
        ↓
      API Gateway
        ↓
  ┌──────────────┐
  │   Microservices│
  │ User & Activity│
  └──────────────┘
        ↓
      AI Service → Google Gemini
        ↓
     Databases (MongoDB / PostgreSQL)﻿# AI Powered Fitness App
