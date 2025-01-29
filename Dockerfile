# Usa una imagen base de Java
FROM openjdk:11-jre-slim

# Establece el directorio de trabajo
WORKDIR /app

# Copia el archivo JAR generado al contenedor
COPY target/universal/play-test-1.0-SNAPSHOT/bin/play-test /app/

# Expone el puerto en el que Play Framework corre
EXPOSE 9000

# Comando para ejecutar la aplicación
CMD ["./play-test", "-Dplay.http.port=9000"]
