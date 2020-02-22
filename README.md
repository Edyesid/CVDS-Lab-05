# Laboratorio 5
 
Revise el resultado obtenido. ¿Qué codigo de error sale?, revise el significado del mismo en la lista de códigos de estado HTTP.

400 Bad Request
El servidor no procesará la solicitud, porque no puede, o no debe, debido a algo que es percibido como un error del cliente (ej: solicitud malformada, sintaxis errónea, etc). La solicitud contiene sintaxis errónea y no debería repetirse.

¿Qué otros códigos de error existen?, ¿En qué caso se manejarán?

1xx: Respuestas informativas

2xx: Peticiones correctas

3xx: Redirecciones

4xx: Errores del cliente

5xx: Errores de servidor

## Peticiones

GET
El método GET  solicita una representación de un recurso específico. Las peticiones que usan el método GET sólo deben recuperar datos.
HEAD
El método HEAD pide una respuesta idéntica a la de una petición GET, pero sin el cuerpo de la respuesta.
POST
El método POST se utiliza para enviar una entidad a un recurso en específico, causando a menudo un cambio en el estado o efectos secundarios en el servidor.
PUT
El modo PUT reemplaza todas las representaciones actuales del recurso de destino con la carga útil de la petición.

DELETE
El método DELETE borra un recurso en específico.
CONNECT
El método CONNECT establece un túnel hacia el servidor identificado por el recurso.

OPTIONS
El método OPTIONS es utilizado para describir las opciones de comunicación para el recurso de destino.
TRACE
El método TRACE  realiza una prueba de bucle de retorno de mensaje a lo largo de la ruta al recurso de destino.

PATCH
El método PATCH  es utilizado para aplicar modificaciones parciales a un recurso.


-v, --verbose Hacer que la operación sea más comunicativa

 -i, --include Incluir encabezados de respuesta de protocolo en la salida
 
puerto tcp/ip: 8080

Bibliografia

https://developer.mozilla.org/es/docs/Web/HTTP/Methods


