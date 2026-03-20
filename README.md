# 🚀 Toastmasters Production Backend

## 📌 Overview

This is a **Spring Boot backend application** designed to manage Toastmasters-related data such as users, sessions, and activities.  
It exposes REST APIs that can be consumed by a frontend (e.g., React) or external systems.

---

## 🧱 Tech Stack

- Java 21+
- Spring Boot 3.x
- Spring Security (JWT / OAuth2 Resource Server)
- Spring Data JPA (Hibernate)
- MySQL (production) / H2 (local)
- Gradle
- Docker

---

## 📂 Project Structure
# 🚀 Toastmasters Production Backend

## 📌 Overview

This is a **Spring Boot backend application** designed to manage Toastmasters-related data such as users, sessions, and activities.  
It exposes REST APIs that can be consumed by a frontend (e.g., React) or external systems.

---

## 🧱 Tech Stack

- Java 21+
- Spring Boot 3.x
- Spring Security (JWT / OAuth2 Resource Server)
- Spring Data JPA (Hibernate)
- MySQL (production) / H2 (local)
- Gradle
- Docker

---

## 📂 Project Structure
src/main/java
├── controller → REST APIs
├── service → Business logic
├── repository → Database layer
├── entity → JPA entities
└── config → Security & app configuration

src/main/resources
├── application.yml
├── data.sql (optional seed data)


---

## ⚙️ Prerequisites

Ensure you have the following installed:

- Java 21+
- Gradle 8+
- Docker (optional, for container run)
- MySQL (optional, for production-like setup)

---

# 🖥️ Running the Application (Manual)

## 1️⃣ Clone the Repository

```bash
git clone <your-repo-url>
cd toastmasters-production-backend


---

## ⚙️ Prerequisites

Ensure you have the following installed:

- Java 21+
- Gradle 8+
- Docker (optional, for container run)
- MySQL (optional, for production-like setup)

---

# 🖥️ Running the Application (Manual)

## 1️⃣ Clone the Repository

```bash
git clone <your-repo-url>
cd toastmasters-production-backend

./gradlew clean build
./gradlew bootRun

