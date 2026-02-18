# Nemeterial – Gestor de Materiales Corporativos

Aplicación para la gestión de préstamo y devolución de material en una empresa (vehículos, móviles, cámaras, drones, llaves, etc.).

## Tecnologías

- **Frontend móvil**: Android (Kotlin/Java) – carpeta `app-android`
- **Backend**: Spring Boot (Java + Gradle Kotlin DSL) – carpeta `spring-boot/backend-api`
- **Base de datos**: MySQL + SQLite – carpeta `database`
- **Documentación**: diagramas y resumen – carpeta `docs`

## Flujo principal de la aplicación

1. Pantalla de Inicio → Autenticación del usuario
2. Menú principal:
   - Retirada de material
   - Ubicación de material
   - Devolución de material (con validación de estado/incidentes)
   - Usuario (configuración de perfil)
   - Salir

Ver diagrama de flujo completo en:  
[`docs/Resumen aplicacion.pdf`](docs/Resumen%20aplicacion.pdf) o la imagen adjunta.

## Cómo ejecutar (local)

**Backend**
```bash
cd spring-boot/backend-api
./gradlew bootRun
