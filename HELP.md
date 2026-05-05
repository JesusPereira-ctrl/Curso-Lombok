# Curso de Lombok

Este repositorio cuenta con lo visto de un curso de Lombok de udemy para reducir el codigo bilerplate y hacer el codigo
mas legible

## Anotaciones Importantes

- @Slf4j: Esta sirve para que lombok genere una variable log con Logger dejandola a nuestra disponibilidad para agregar
  logs en nuestra aplicacion

- @Getter: genera los getter de nuestra clase

- @Setter: genera los setter de nuestra clase

- @RequiredArgsConstructor: crea un constructor con los parametros de los atributos final

- @AllArgsConstructor: crea un constructor con todos los atributos

- @NoArgsConstructor: crea un constructor vacio

- @ToString: genera el toString de manera automatica, tambien podemos usar @ToString.Exclude para excluir campos

- @Builder: aplicar el patron builder en la clase

- @EqualsAndHashCode: genera el equals y el hashcode para la comparacion, usar @EqualsAndHashCode.Exclude para excluir
  campos

- @Value: esta anotacion de lombok hace que una clase sea inmutable, creando un constructor con todos los paramtros y
  sus getter sin setter

- @Data: agrega el @ToString, @EqualsAndHashCode, @Getter, @Setter y @RequiredArgsConstructor en una sola anotacion