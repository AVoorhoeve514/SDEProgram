Dit is mijn software design program, ik heb deze alleen gemaakt omdat ik dit nog moet herkansen van vorig jaar.

Repository:https://github.com/AVoorhoeve514/SDEProgram


Singleton Patroon:
Garandeert dat een klasse slechts één instantie heeft en biedt een wereldwijde toegangspunt ernaar. 
Toegepast op de Calculator-klasse, zorgt het ervoor dat er slechts één instantie van de rekenmachine 
is in de applicatie, waardoor het efficiënt is en het onnodig maken van redundante instanties wordt vermeden.

Factory Method Patroon: 
Definieert een interface voor het maken van objecten, maar laat subklassen beslissen welke klasse 
geïnstantieerd moet worden. Geïmplementeerd in CalculatorFactory, maakt het de creatie van verschillende 
soorten rekenmachines mogelijk (bijv. basis, wetenschappelijk) en houdt het de instantiatie-logica ingekapseld.

Decorator Patroon: 
Verbetert het gedrag van de BasicCalculator door dynamisch toevoegen van functies. 
De ScientificCalculatorDecorator versiert een basisrekenmachine door wetenschappelijke 
rekenfunctionaliteit toe te voegen zonder de bestaande code te wijzigen.

Composite Patroon: 
Representeert wiskundige expressies als een combinatie van basisberekeningen. 
De CompositeExpression maakt het mogelijk om complexe expressies te creëren door bladknopen 
(BasicCalculation) te combineren. Dit patroon vereenvoudigt de clientcode door individuele berekeningen 
en samengestelde expressies uniform te behandelen.

Command Patroon: 
Het Command-patroon in de rekenmachine-applicatie maakt het mogelijk om berekeningsoperaties 
(zoals optellen, aftrekken) in commando-objecten te encapsuleren. 
Dit maakt het gemakkelijk om nieuwe operaties toe te voegen, acties te loggen of functionaliteit voor ongedaan 
maken/herstellen te implementeren.

Observer Patroon: 
Het Observer-patroon wordt gebruikt om verschillende componenten van de applicatie bij te werken wanneer
de staat van de rekenmachine verandert (bijv. bij het uitvoeren van een nieuwe berekening). 
Het zorgt ervoor dat alle geïnteresseerde componenten (waarnemers) in sync worden 
gehouden met de staat van de rekenmachine.