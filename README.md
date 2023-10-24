# API de Validación de Nombre de Usuario

Esta API, desarrollada con Spring Boot 3.1.4 y JDK 17, proporciona un servicio de validación de nombres de usuario. Permite verificar si un nombre de usuario dado coincide con "Usuario1" o "Usuario2" y devuelve un valor booleano (`true` o `false`) según la coincidencia.

## Uso

### Endpoint de Validación de Usuario

Para validar un nombre de usuario, puedes usar una herramienta como Postman. Aquí tienes los pasos para probar el endpoint:

1. Abre Postman.

2. Crea una nueva solicitud:

   - Método HTTP: `GET`
   - URL: `http://localhost:8080/validar-usuario/{nombreUsuario}`

   Reemplaza `{nombreUsuario}` con el nombre de usuario que deseas verificar.

3. Haz clic en el botón "Send" para enviar la solicitud.

**Ejemplo de Solicitud en Postman:**

![Ejemplo de Solicitud en Postman](https://example.com/path/to/screenshot.png)

**Respuesta Esperada:**

La API retornará directamente `true` si el nombre de usuario coincide con "Usuario1" o "Usuario2", o `false` en caso contrario.

## Instalación

Sigue estos pasos para clonar y configurar el proyecto en tu entorno local:

1. Clona el repositorio desde GitHub:

```shell
git clone https://github.com/tuusuario/nombre-de-usuario-api.git
```
Abre el proyecto en tu entorno de desarrollo preferido. Asegúrate de tener Spring Boot 3.1.4 y JDK 17 instalados.

## Ejecución

Ejecuta la aplicación con el siguiente comando:

```shell
mvn spring-boot:run


La API estará disponible en http://localhost:8080.
Autor

Este proyecto ha sido desarrollado por Tu Nombre.
