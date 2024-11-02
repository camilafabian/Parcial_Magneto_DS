# Parcial1_Magneto_DS
# DETECCIÓN DE MUTANTES
## Nivel 1: Creación del Método 'isMutant'

- Esta funcion **isMutant(String[] dna)** determina si la secuencia de ADN es de un **mutante**.

## Nivel 2: API REST para la Detección de Mutantes

1. **Crear la API REST**:
    - Esta API está diseñada para detectar si un humano es mutante mediante una secuencia de ADN.

2. **Hostear la API**:
    - La API se encuentra hospedada en Render.
    - [Acceso al Deploy](https://parcial-magneto-ds.onrender.com/swagger-ui/index.html)


3. **Endpoint del Servicio**:
    - El servicio para verificar si un humano es mutante se puede acceder en el siguiente endpoint:
      ```
      POST http://localhost:8080/mutant
      ```

4. **Formato de la Solicitud**:
    - La solicitud debe enviarse en formato JSON con el siguiente formato:
      ```json
      {
        "dna": ["CGAATG", "TGCAGC", "TGTTAT", "AGGGAA", "CCTACC", "TGTCAC"]
      }
      ```

5. **Respuestas**:
    - Si el ADN es de un mutante, se devuelve un código HTTP **200 OK**.
    - Si el ADN pertenece a un humano, se devuelve un código HTTP **403 Forbidden**.

---

## Nivel 3: Integración de Base de Datos y Estadísticas

1. **Integración de H2**:
    - Se ha anexado una base de datos H2 para almacenar los ADN verificados. Se permite un solo registro por ADN.

2. **Endpoint de Estadísticas**:
    - Un servicio adicional para exponer estadísticas de verificaciones de ADN:
      ```
      GET http://localhost:8080/stats
      ```

3. **Formato de Respuesta de Estadísticas**:
    - La respuesta devuelve un JSON con el siguiente formato:
      ```json
      {
        "count_mutant_dna": 4,
        "count_human_dna": 1,
        "ratio": 4
      }
      ```

4. **Requisitos de Escalabilidad**:
    - La API está diseñada para manejar fluctuaciones agresivas de tráfico, con un rango estimado de entre 100 y 1 millón de peticiones por segundo.

5. **Pruebas Automáticas**:
    - Se implementaron pruebas automáticas con una cobertura de código superior al **80%**.

---

## Adjuntos

- **Contenido del PDF ajunto con el nombre: 'Parcial1_DS_CamilaFabian''**:
    - Los resultados obtenidos de las pruebas de carga con JMeter y Junit.
    - Los resultados de las pruebas automáticas y la cobertura de código con JaCoCo.
    - El Diagrama de Secuencia.
