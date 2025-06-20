
## DIAGRAMA UML ##

Integrantes:
- Alonso Lagos
- Benjamin Urrea
- Francisca Aguayo


Modelo de clases generado en plantuml.

![TP11RiCW44Ntd6AMhIfVeEh2bRhffghQN61ii4K231g6R1BVFOxbI2J1ivm7d_Tfao1Bzav5x0yu6l2aZICuAGNpz0vJWb_3YGBEIrYdWK2-O_CE_y8sZ0N0Q9opcYg8ipnjts0qyhE4lRpMwUUQkCN_iZoWgRJVCNQuHqryLy0cZFK2Gwo_yxtSsBGSOXLvIiB8NoYKh](https://github.com/user-attachments/assets/3c5acd84-5101-44ca-9e7d-5ff848bd24c1)


Código que se utilizo para generarla:

@startuml
package modelo {

    class Persona {
        - nombre: String
        - apellido: String
        - rut: String
        + getNombre(): String
        + getApellido(): String
        + getRut(): String
    }

    class Trabajador {
        - isapre: String
        - afp: String
        + getIsapre(): String
        + getAfp(): String
        + mostrarDatos(): void
    }

    Persona <|-- Trabajador
}
@enduml
