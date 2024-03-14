## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).


Steps to add .jar file in the project:
1. Right click on the project
2. Select Build Path
3. Select Configure Build Path
4. Click on Libraries tab
5. Click on Add External JARs
6. Select the .jar file and click on Open
7. Click on Apply and Close
8. Now you can see the .jar file under Referenced Libraries
9. Now you can use the classes of the .jar file in your project
10. If you want to remove the .jar file, select the .jar file and click on Remove
11. Click on Apply and Close

> Project->Right click->build path->Add Library->User Library->click on user libraries->Created new library called oraclejar -> add external jar ->oracle8.12..