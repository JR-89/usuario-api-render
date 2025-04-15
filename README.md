# 📦 API REST - CRUD de Usuarios (Spring Boot)

Este proyecto es una API RESTful desarrollada con Spring Boot que permite gestionar usuarios mediante operaciones CRUD (Crear, Leer, Actualizar y Eliminar).

---

## 🚀 Endpoints

| Método | URL                             | Descripción              |
|--------|----------------------------------|--------------------------|
| GET    | `/usuarios`                     | Lista todos los usuarios |
| POST   | `/usuarios`                     | Crea un nuevo usuario    |
| PUT    | `/usuarios/{id}`                | Edita un usuario         |
| DELETE | `/usuarios/{id}`                | Elimina un usuario       |

---

## ⚙️ Tecnologías

- Java 17
- Spring Boot
- Spring Data JPA
- H2 (base de datos en memoria)
- Maven
- Docker (opcional)

---

## 🛠️ Cómo ejecutar

```bash
./mvnw spring-boot:run
