Dit is mijn calculator die ik alleen gemaakt heb want ik had geen groepsgenoot (is herkansing). 
Repository: https://github.com/AVoorhoeve514/SDEProgram

Singleton Patroon:
Het Singleton-patroon zorgt ervoor dat er maar één instantie van een klasse is en dat je er overal makkelijk bij kunt. Bij mijn calculator-app betekent dit dat er maar één rekenmachine tegelijk bestaat. Dit voorkomt dat er onnodig meerdere exemplaren worden aangemaakt, wat super efficiënt is.

Decorator Patroon:
Dit patroon voegt extra functies toe aan de BasicCalculator zonder de originele code te veranderen. Bijvoorbeeld, de ScientificCalculatorDecorator bouwt voort op de basisrekenmachine door functies zoals machtsverheffen en wortels toe te voegen. Zo kan ik de calculator uitbreiden zonder alles om te gooien.

Observer Patroon:
Het Observer-patroon zorgt ervoor dat onderdelen van de app automatisch op de hoogte worden gebracht als er iets verandert in de rekenmachine, zoals na een nieuwe berekening. Hierdoor blijft alles in de app altijd up-to-date, zonder dat ik overal handmatig dingen moet aanpassen.

Command Patroon:
Met het Command-patroon worden berekeningen zoals optellen en aftrekken verpakt in aparte objecten. Dit maakt het super makkelijk om nieuwe functies toe te voegen, acties te loggen, of zelfs een undo/redo-systeem te maken. Alles is netjes georganiseerd.

Composite Patroon:
Het Composite-patroon wordt gebruikt om ingewikkelde wiskundige berekeningen te maken. Denk aan een expressie zoals (2 + 3) * 4, waarbij kleinere berekeningen worden gecombineerd tot iets groters. Mijn CompositeExpression regelt dit door individuele berekeningen (zoals optellen) samen te voegen. Hierdoor is het voor mij makkelijker en overzichtelijker.



Factory Method Patroon:
Met het Factory Method-patroon kun je objecten maken via een interface, terwijl een subklasse bepaalt welk type object precies gemaakt wordt. In mijn app doet de CalculatorFactory dit door verschillende soorten rekenmachines (zoals basic of wetenschappelijk) te maken. Hierdoor blijft de logica om ze te maken netjes op één plek.
