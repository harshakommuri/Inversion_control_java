# Inversion_control_java
This file contains basic codes to understand the IOC, Dependency, usage of beans.
Basically in this project we are trying to get two mobile features: a)Model, b)Color using spring framework.
In this project, 1.first I created all jar files from spring initilizer.
2. then I created one interface with Mobiles name and two classes OnePlus and IPhone to give model type.
3. we then created configuration class for beans. All the objects will be decleared in Configuration class.
4. then we created spring bean container in main method, which helps to get all onjects from configuration class.
5. To understand dependency injection, we have created another class caller Color, which contails the color methods of phones.
6. And we inject the dependences in OnePlus and IPhone class, we create contructors dependency type as well(note: we can use setter dependency as well).
7. Finally we call methods of classes in main class without creating there objects but with help of beans.

Note: Bean-> bean is a Simple java object.
https://www.youtube.com/watch?v=8DEonl-iqhY&list=PLRJtSNuz7dL4qWXP-PrboOHk9kmJPMf7b&index=2
