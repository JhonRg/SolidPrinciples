Principios SOLID:
Referencias:
Los Principios SOLID explicados ¡Con ejemplos! 100% PRÁCTICO (youtube.com)

S (Single Responsability Principle / Principio de responsabilidad única
	Una clase debe tener una, y solo una, razón para cambiar. En otras palabras, una clase debe estar enfocada en una sola tarea o responsabilidad.
	Un buen análisis de las entidades y su comportamiento será necesario para confirmar el cumplimiento de este principio.

O (Open Closed Principle/ Abierto-Cerrado)
	Las entidades de software deben estar abiertas para la extensión, pero cerradas para la modificación.
	En otras palabras, la nueva funcionalidad debe crearse sin modificar el código existente.
	La herencia y el polimorfismo nos ayudarán a respetar dicho principio.
	
L (Liskov Substitution Principle/ Principio de sustitución de Liskov)
	El principio de sustitución de Liskov establece que los objetos de una clase hija deben poder sustituir a los objetos de su clase padre sin alterar el comportamiento esperado del programa.
	En otras palabras las subclases deben ser sustituibles por sus superclases.
	La herencia múltiple de interfaces será por tanto la piedra angular a la hora de explotar este principio.

I (Interface Segregation Principle/ Principio de segregación de Interfaces)
	El principio de segregación de interfaces establece que los clientes no deberían depender de grandes interfaces que no utilizan.
	En lugar de tener una gran interfaz, es mejor crear interfaces más pequeñas y específicas.
	
D ( Dependency Inversion Principle / Principio de Inversión de Dependencias )
	El principio de inversión de Dependencias establece que los módulos de alto nivel no deben depender de módulos de bajo nivel. Ambos niveles deben depende de abstracciones.
	Además las abstracciones no deben depender de los detalles, si no que los detalles deben depende de las abstracciones.
